package com.example.turismoapplication.repositorios;

import com.example.turismoapplication.modelos.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface EmpresaRepositorio extends JpaRepository<Empresa,Integer> {
}