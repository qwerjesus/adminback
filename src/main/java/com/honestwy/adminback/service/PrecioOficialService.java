package com.honestwy.adminback.service;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.honestwy.adminback.dto.PrecioOficial;
import com.honestwy.adminback.dto.PrecioOficialRequestDTO;
import com.honestwy.adminback.dto.PrecioOficialResponseDTO;
import com.honestwy.adminback.repositorie.PrecioOficialRepository;

@Service
public class PrecioOficialService {

    private final PrecioOficialRepository repo;

    public PrecioOficialService(PrecioOficialRepository repo) {
        this.repo = repo;
    }

    // REGISTRAR
    public void registrar(PrecioOficialRequestDTO dto) {

        PrecioOficial p = new PrecioOficial();
        p.setId(UUID.randomUUID().toString());
        p.setNombre(dto.getNombre());
        p.setDescripcion(dto.getDescripcion());
        p.setCategoria(dto.getCategoria());
        p.setSubcategoria(dto.getSubcategoria());
        p.setUnidad(dto.getUnidad());
        p.setPrecioMaximo(dto.getPrecioMaximo());
        p.setPrecioReferencia(dto.getPrecioReferencia());
        p.setPrecioReferencia(dto.getPrecioReferencia());
        p.setActivo(dto.getActivo() != null ? dto.getActivo() : true);
        p.setFoto(dto.getFoto());
        p.setMoneda(dto.getMoneda() != null ? dto.getMoneda() : "COP");
        p.setFuente(dto.getFuente());
        p.setFechaCreacion(LocalDate.now().toString());

        repo.save(p);
    }

    // LISTAR
    public List<PrecioOficialResponseDTO> listar() throws Exception {
        return repo.findAll()
                .stream()
                .map(this::toResponseDTO)
                .toList();
    }

    // ACTUALIZAR
    public void actualizar(String id, PrecioOficialRequestDTO dto) {

        Map<String, Object> updates = new HashMap<>();

        if (dto.getNombre() != null)
            updates.put("nombre", dto.getNombre());
        if (dto.getDescripcion() != null)
            updates.put("descripcion", dto.getDescripcion());
        if (dto.getCategoria() != null)
            updates.put("categoria", dto.getCategoria());
        if (dto.getSubcategoria() != null)
            updates.put("subcategoria", dto.getSubcategoria());
        if (dto.getUnidad() != null)
            updates.put("unidad", dto.getUnidad());
        if (dto.getPrecioMaximo() != null)
            updates.put("precioMaximo", dto.getPrecioMaximo());
        if (dto.getPrecioReferencia() != null)
            updates.put("precioReferencia", dto.getPrecioReferencia());
        if (dto.getPrecioReferencia() != null)
            updates.put("precioReferencia", dto.getPrecioReferencia());
        if (dto.getActivo() != null)
            updates.put("activo", dto.getActivo());
        if (dto.getFoto() != null)
            updates.put("foto", dto.getFoto());
        if (dto.getMoneda() != null)
            updates.put("moneda", dto.getMoneda());
        if (dto.getFuente() != null)
            updates.put("fuente", dto.getFuente());

        repo.update(id, updates);
    }

    // ELIMINAR
    public void eliminar(String id) {
        repo.delete(id);
    }

    private PrecioOficialResponseDTO toResponseDTO(PrecioOficial p) {
        PrecioOficialResponseDTO dto = new PrecioOficialResponseDTO();
        dto.setId(p.getId());
        dto.setNombre(p.getNombre());
        dto.setDescripcion(p.getDescripcion());
        dto.setCategoria(p.getCategoria());
        dto.setSubcategoria(p.getSubcategoria());
        dto.setUnidad(p.getUnidad());
        dto.setPrecioMaximo(p.getPrecioMaximo());
        dto.setPrecioReferencia(p.getPrecioReferencia());
        dto.setActivo(p.getActivo());
        dto.setFoto(p.getFoto());
        dto.setMoneda(p.getMoneda());
        dto.setFuente(p.getFuente());
        dto.setFechaCreacion(p.getFechaCreacion());
        return dto;
    }
}