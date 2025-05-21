package com.example.BibliotecaUptc.repository;

import com.example.BibliotecaUptc.model.Prestamo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface PrestamoRepository extends JpaRepository<Prestamo, Long> {
    List<Prestamo> findByDevueltoFalseAndFechaDevolucionBefore(LocalDate fecha);
}