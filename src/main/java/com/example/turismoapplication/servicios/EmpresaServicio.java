package com.example.turismoapplication.servicios;

import com.example.turismoapplication.modelos.Empresa;
import com.example.turismoapplication.repositorios.EmpresaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EmpresaServicio {

    @Autowired
    EmpresaRepositorio empresaRepositorio;
    public Empresa registrarEmpresa(Empresa datosARegistrar) throws Exception {
    try{

    }catch (Exception error){

    }
    }

    public Empresa modificarEmpresa(Integer id,Empresa datosAModificar) throws Exception{
    return null;
    }

    public Empresa buscarEmpresaPorId(Integer id) throws Exception{
        return null;
    }

    public List<Empresa> buscarTodasEmpresas() throws Exception{
        return null;
    }

    public boolean eliminarEmpresa(Integer id)throws Exception{
        return true;
    }
}
