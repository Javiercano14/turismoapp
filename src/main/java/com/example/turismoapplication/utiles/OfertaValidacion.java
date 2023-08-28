package com.example.turismoapplication.utiles;

public class OfertaValidacion {

    public Boolean validarNombre(String nombre) throws Exception{

        if(nombre.length()>30){
            throw new Exception("Longitud de caracteres invalidos");
        }else{
            return true;
        }
    }
}
