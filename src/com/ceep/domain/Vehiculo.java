/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceep.domain;

/**
 *
 * @author javip
 */
public class Vehiculo {
    public String matricula;
    public String marca;
    public String modelo;
    public String color;
    public double tarifa;
    public boolean diaponible;

    public Vehiculo(String matricula, String marca, String modelo, String color, double tarifa, boolean diaponible) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tarifa = tarifa;
        this.diaponible = diaponible;
    }

    
    

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public void setDiaponible(boolean diaponible) {
        this.diaponible = diaponible;
    }

    
    
    
    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public double getTarifa() {
        return tarifa;
    }

    public boolean isDiaponible() {
        return diaponible;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", tarifa=" + tarifa + ", diaponible=" + diaponible + '}';
    }
    
    
    
}
