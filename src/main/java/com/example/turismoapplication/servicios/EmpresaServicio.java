package com.example.turismoapplication.servicios;

import com.example.turismoapplication.modelos.Empresa;
import com.example.turismoapplication.repositorios.EmpresaRepositorio;
import com.example.turismoapplication.utiles.EmpresaValidacion;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EmpresaServicio {

    @Autowired
    EmpresaRepositorio empresaRepositorio;

    @Autowired
    EmpresaValidacion empresaValidacion;
    public Empresa registrarEmpresa(Empresa datosARegistrar) throws Exception {
    try{

        if(!this.empresaValidacion.validarNombre(datosARegistrar.getNombre())){
            throw new Exception("error en el servicio");
        }

       return( this.empresaRepositorio.save(datosARegistrar));

    }catch (Exception error){
        throw new Exception(error.getMessage());
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
