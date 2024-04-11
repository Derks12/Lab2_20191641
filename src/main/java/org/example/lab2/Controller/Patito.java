package org.example.lab2.Controller;

import java.util.ArrayList;

public class Patito {
    private String numFilas;
    private String numColumnas;
    private ArrayList<String> posIniciales;
    private int cantFotos;

    public String getNumFilas() {
        return numFilas;
    }

    public void setNumFilas(String numFilas) {
        this.numFilas = numFilas;
    }

    public String getNumColumnas() {
        return numColumnas;
    }

    public void setNumColumnas(String numColumnas) {
        this.numColumnas = numColumnas;
    }

    public ArrayList<String> getPosIniciales() {
        return posIniciales;
    }

    public void setPosIniciales(ArrayList<String> posIniciales) {
        this.posIniciales = posIniciales;
    }

    public int getCantFotos() {
        return cantFotos;
    }

    public void setCantFotos(int cantFotos) {
        this.cantFotos = cantFotos;
    }
}
