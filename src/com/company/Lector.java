package com.company;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Lector {
    //tipos de filtro 1(precio)
    public ArrayList<Medicamento> filtrarPrecio(ArrayList<Medicamento>medicamentos, int precioMenor, int precioMayor){
        ArrayList<Medicamento> listaFiltro= new ArrayList();
        for (Medicamento medi:medicamentos) {
            if(medi.precio>=precioMenor && medi.precio<=precioMayor){
                listaFiltro.add(medi);
            }
        }
        return listaFiltro;
    }

    public ArrayList<Medicamento> filtrosVarios(ArrayList<Medicamento>medicamentos, int tipoFiltro, String filtro){
        ArrayList<Medicamento> listaFiltro= new ArrayList();
        for (Medicamento medi:medicamentos) {
            //Precentacion
            if (tipoFiltro == 0) {
                if(medi.precentacion.contains(filtro)){
                    listaFiltro.add(medi);
                }
            }
            //nombre de la farmacia
            else if (tipoFiltro == 1) {
                if(medi.farmacia.nombre.contains(filtro)){
                    listaFiltro.add(medi);
                }
            }
            //direccion farmacia
            else if (tipoFiltro == 2) {
                if(medi.farmacia.direccion.contains(filtro)){
                    listaFiltro.add(medi);
                }
            }
            //comuna farmacia
            else if (tipoFiltro == 3) {
                if(medi.farmacia.comuna.contains(filtro)){
                    listaFiltro.add(medi);
                }
            }
            // region farmacia
            else if (tipoFiltro == 4) {
                if(medi.farmacia.region.contains(filtro)){
                    listaFiltro.add(medi);
                }
            }
        }
        return listaFiltro;
    }

    public ArrayList<Medicamento> extractor(ArrayList<String> basesDatos, String busqueda) {
        String datos[];
        Farmacia farmacia= null;


        ArrayList<Medicamento> medicamentos= new ArrayList();
        for (String base: basesDatos) {
            boolean primero=true;
            try {
                Scanner input = new Scanner(new File(base));
                while (input.hasNextLine()) {

                    String line = input.nextLine();
                    datos = line.split("-");
                    if (primero){
                        farmacia =new Farmacia(datos[0],datos[1],datos[2],datos[3]);
                        primero=false;

                    }
                    else{
                        if(datos[0].equals(busqueda)) {
                            medicamentos.add(new Medicamento(datos[0], Integer.parseInt(datos[1]), datos[2], farmacia));

                        }
                    }
                }
                input.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        return medicamentos;
    }
    public ArrayList<Medicamento> ordenar(ArrayList<Medicamento> medicamentos, int criterio) {
        //nombre;
        if(criterio==0){

        }
        //precentacion
        else if (criterio == 1) {

        }
        //nombre de la farmacia
        else if (criterio == 2) {

        }
        //direccion farmacia
        else if (criterio == 3) {

        }
        //comuna farmacia
        else if (criterio == 4) {

        }
        // region farmacia
        else if (criterio == 5) {

        }
        return medicamentos;
    }
}
