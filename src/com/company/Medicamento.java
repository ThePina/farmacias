package com.company;

public class Medicamento {
    int precio;
    String nombre;
    String precentacion;
    Farmacia farmacia;
    Medicamento(String nombre, int precio, String precentacion, Farmacia farmacia){
        this.nombre=nombre;
        this.precio=precio;
        this.precentacion=precentacion;
        this.farmacia=farmacia;

    }

}
