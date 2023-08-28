package com.example.turismoapplication.repositorios;

import com.example.turismoapplication.modelos.Oferta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OfertaRepositorio extends JpaRepository<Oferta,Integer> {
}
