package com.honestwy.adminback.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.honestwy.adminback.dto.PrecioOficialRequestDTO;
import com.honestwy.adminback.dto.PrecioOficialResponseDTO;
import com.honestwy.adminback.service.PrecioOficialService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/admin/precios-oficiales")
public class PrecioOficialController {

    private final PrecioOficialService service;

    public PrecioOficialController(PrecioOficialService service) {
        this.service = service;
    }

    // REGISTRAR
    @PostMapping
    public ResponseEntity<Void> registrar(
            @Valid @RequestBody PrecioOficialRequestDTO dto) {
        service.registrar(dto);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    // LISTAR
    @GetMapping
    public List<PrecioOficialResponseDTO> listar() throws Exception {
        return service.listar();
    }

    // ACTUALIZAR
    @PutMapping("/{id}")
    public ResponseEntity<Void> actualizar(
            @PathVariable String id,
            @RequestBody PrecioOficialRequestDTO dto) {
        service.actualizar(id, dto);
        return ResponseEntity.noContent().build();
    }

    // ELIMINAR
    @org.springframework.web.bind.annotation.DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable String id) {
        service.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}
