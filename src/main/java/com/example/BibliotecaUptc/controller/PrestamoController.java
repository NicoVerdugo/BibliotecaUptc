package com.example.BibliotecaUptc.controller;

import com.example.BibliotecaUptc.model.Prestamo;
import com.example.BibliotecaUptc.service.PrestamoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/prestamos")
public class PrestamoController {

    private final PrestamoService service;

    public PrestamoController(PrestamoService service) {
        this.service = service;
    }

    @GetMapping
    public List<Prestamo> getAll() {
        return service.findAll();
    }

    @GetMapping("/vencidos")
    public List<Prestamo> getVencidos() {
        return service.getVencidos();
    }

    @PostMapping
    public Prestamo create(@RequestBody Prestamo prestamo) {
        return service.save(prestamo);
    }
}