package com.example.turismoapplication.repositorios;

import com.example.turismoapplication.modelos.Empresa;
import com.example.turismoapplication.servicios.EmpresaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/empresas")
public class EmpresaControlador {

    @Autowired
    EmpresaServicio empresaServicio;

    @PostMapping
    public ResponseEntity<?> registrarEmpresa(@RequestBody Empresa datosEmpresa){
    return null;
    }

    @PutMapping
    public ResponseEntity<?> modificarEmpresa(@RequestBody Empresa datosNuevosEmpresa,@PathVariable Integer idEmpresa){
    return null;
    }

    @GetMapping
    public ResponseEntity<?> buscarUnaEmpresa(@PathVariable Integer id){
        return null;
    }

    @GetMapping
    public ResponseEntity<?> buscarTodasEmpresas(){
        return null;
    }

    @DeleteMapping
    public  ResponseEntity<?> eliminarEmpresa(@PathVariable Integer id){
        return null;
    }
}
