package com.honestwy.adminback.service;

import java.time.LocalDate;
import java.util.UUID;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.honestwy.adminback.dto.Admin;
import com.honestwy.adminback.dto.AdminLoginDTO;
import com.honestwy.adminback.dto.AdminRegisterDTO;
import com.honestwy.adminback.repositorie.AdminRepository;

@Service
public class AuthService {

    private final AdminRepository repo;
    private final PasswordEncoder encoder;
    private final JwtService jwtService;

    public AuthService(
            AdminRepository repo,
            PasswordEncoder encoder,
            JwtService jwtService) {
        this.repo = repo;
        this.encoder = encoder;
        this.jwtService = jwtService;
    }

    // REGISTRO
    public void register(AdminRegisterDTO dto) throws Exception {

        if (repo.findByEmail(dto.getEmail()).isPresent()) {
            throw new RuntimeException("El admin ya existe");
        }

        Admin admin = new Admin();
        admin.setId(UUID.randomUUID().toString());
        admin.setEmail(dto.getEmail());
        admin.setPassword(encoder.encode(dto.getPassword()));
        admin.setActivo(true);
        admin.setFechaCreacion(new java.util.Date());

        repo.save(admin);
    }

    // LOGIN
    public String login(AdminLoginDTO dto) throws Exception {

        Admin admin = repo.findByEmail(dto.getEmail())
                .orElseThrow(() -> new RuntimeException("Credenciales inválidas"));

        if (!admin.getActivo()) {
            throw new RuntimeException("Admin deshabilitado");
        }

        if (!encoder.matches(dto.getPassword(), admin.getPassword())) {
            throw new RuntimeException("Credenciales inválidas");
        }

        return jwtService.generateToken(admin.getEmail());
    }
}
