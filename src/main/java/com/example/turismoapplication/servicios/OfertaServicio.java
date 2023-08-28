package com.example.turismoapplication.servicios;

import com.example.turismoapplication.modelos.Oferta;
import com.example.turismoapplication.repositorios.OfertaRepositorio;
import com.example.turismoapplication.utiles.OfertaValidacion;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class OfertaServicio {

    @Autowired
    OfertaRepositorio ofertaRepositorio;

    @Autowired
    OfertaValidacion ofertaValidacion;

    public Oferta registrarOferta(Oferta datosARegistrar) throws Exception {
        try{

            return( this.ofertaRepositorio.save(datosARegistrar));

        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }


    public Oferta modificarOferta(Integer id,Oferta datosAModificar) throws Exception{
        return null;
    }

    public Oferta buscarOfertaPorId(Integer id) throws Exception{
        return null;
    }

    public List<Oferta> buscarTodasOfertas() throws Exception{
        return null;
    }

    public boolean eliminarOfertas(Integer id)throws Exception{
        return true;
    }
}
