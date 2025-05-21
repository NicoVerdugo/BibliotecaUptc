package com.example.BibliotecaUptc.service;

import com.example.BibliotecaUptc.model.Prestamo;
import com.example.BibliotecaUptc.repository.PrestamoRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class PrestamoService {
    private final PrestamoRepository repository;

    public PrestamoService(PrestamoRepository repository) {
        this.repository = repository;
    }

    public List<Prestamo> findAll() {
        return repository.findAll();
    }

    public List<Prestamo> getVencidos() {
        return repository.findByDevueltoFalseAndFechaDevolucionBefore(LocalDate.now());
    }

    public Prestamo save(Prestamo prestamo) {
        return repository.save(prestamo);
    }
}