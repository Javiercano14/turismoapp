package com.example.turismoapplication.utiles;

public class EmpresaValidacion {

    public Boolean validarNombre(String nombre) throws Exception{

        if(nombre.length()>30){
           throw new Exception("Longitud de caracteres invalidos");
        }else{
            return true;
        }
    }
}
