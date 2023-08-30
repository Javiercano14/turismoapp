package com.example.turismoapplication.servicios;


import com.example.turismoapplication.modelos.Oferta;
import com.example.turismoapplication.repositorios.OfertaRepositorio;
import com.example.turismoapplication.utiles.OfertaValidacion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
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
        try {

            Optional<Oferta> ofertaEncontrada = this.ofertaRepositorio.findById(id);
            Oferta ofertaQueExiste = ofertaEncontrada.get();

            ofertaQueExiste.setTitulo(datosAModificar.getTitulo());
            ofertaQueExiste.setDescripcion(datosAModificar.getDescripcion());

            return (this.ofertaRepositorio.save(ofertaQueExiste));

        } catch (Exception error) {
            throw new Exception(error.getMessage());

        }
    }

    public Oferta buscarOfertaPorId(Integer id) throws Exception{
        try{

            Optional<Oferta> ofertaOpcional=this.ofertaRepositorio.findById(id);

            return ofertaOpcional.get();

        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }

    public List<Oferta> buscarTodasOfertas() throws Exception{
        try{
            List<Oferta>listaOferta=this.ofertaRepositorio.findAll();
            return listaOferta;

        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }

    public boolean eliminarOfertas(Integer id)throws Exception {
        try {

            Optional<Oferta> ofertaOpcional = this.ofertaRepositorio.findById(id);
            return true;


        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }
}
