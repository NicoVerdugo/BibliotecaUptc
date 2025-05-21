package com.example.BibliotecaUptc.repository;

import com.example.BibliotecaUptc.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}