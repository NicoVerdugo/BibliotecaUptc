package com.example.BibliotecaUptc.service;

import com.example.BibliotecaUptc.model.RecursoBibliografico;
import com.example.BibliotecaUptc.repository.RecursoBibliograficoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecursoBibliograficoService {
    private final RecursoBibliograficoRepository repository;

    public RecursoBibliograficoService(RecursoBibliograficoRepository repository) {
        this.repository = repository;
    }

    public List<RecursoBibliografico> findAll() {
        return repository.findAll();
    }

    public RecursoBibliografico save(RecursoBibliografico recurso) {
        return repository.save(recurso);
    }
}