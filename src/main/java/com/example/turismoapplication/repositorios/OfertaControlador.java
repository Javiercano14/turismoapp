package com.example.turismoapplication.repositorios;


import com.example.turismoapplication.modelos.Oferta;
import com.example.turismoapplication.servicios.OfertaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ofertas")
public class OfertaControlador {

    @Autowired
    OfertaServicio ofertaServicio;

    @PostMapping
    public ResponseEntity<?> registrarOferta(@RequestBody Oferta datosOferta){
        return null;
    }

    @PutMapping
    public ResponseEntity<?> modificarOferta(@RequestBody Oferta datosNuevosOferta, @PathVariable Integer idOferta ){
        return null;
    }

    @GetMapping
    public ResponseEntity<?> buscarUnaOferta(@PathVariable Integer id){
        return null;
    }

    @GetMapping
    public ResponseEntity<?> buscarTodasOfertas(){
        return null;
    }

    @DeleteMapping
    public  ResponseEntity<?> eliminarOferta(@PathVariable Integer id){
        return null;
    }
}
