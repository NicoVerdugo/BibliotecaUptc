package com.example.BibliotecaUptc.controller;

import com.example.BibliotecaUptc.model.RecursoBibliografico;
import com.example.BibliotecaUptc.service.RecursoBibliograficoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/recursos")
public class RecursoBibliograficoController {

    private final RecursoBibliograficoService service;

    public RecursoBibliograficoController(RecursoBibliograficoService service) {
        this.service = service;
    }

    @GetMapping
    public List<RecursoBibliografico> getAll() {
        return service.findAll();
    }

    @PostMapping
    public RecursoBibliografico create(@RequestBody RecursoBibliografico recurso) {
        return service.save(recurso);
    }
}
