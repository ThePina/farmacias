package com.company;
import javax.sound.midi.spi.SoundbankReader;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> baseDatos=new ArrayList();
        baseDatos.add("src/com/company/bdf1.txt");
        baseDatos.add("src/com/company/bdf2.txt");
        baseDatos.add("src/com/company/bdf3.txt");
        Lector lector = new Lector();
        String medicamento= "paracetamol";
        ArrayList<Medicamento> medicamentos= new ArrayList();

        System.out.println("buscar parecetamol en las bases de datos-----------------");
        medicamentos=lector.extractor(baseDatos,medicamento);
        for (Medicamento medi:medicamentos) {
            System.out.println(medi.nombre+" "+medi.precio+" "+medi.precentacion+" "+medi.farmacia.nombre+" "+medi.farmacia.direccion+" "+medi.farmacia.comuna+" "+medi.farmacia.region);
        }


        medicamentos=lector.filtrosVarios(medicamentos,0,"comprimido");
        System.out.println(".......filtro de solo comprimidos..............");
        for (Medicamento medi:medicamentos) {
            System.out.println(medi.nombre+" "+medi.precio+" "+medi.precentacion+" "+medi.farmacia.nombre+" "+medi.farmacia.direccion+" "+medi.farmacia.comuna+" "+medi.farmacia.region);
        }
    }
}
