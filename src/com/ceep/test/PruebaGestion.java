/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceep.test;
import com.ceep.domain.Vehiculo;

/**
 *
 * @author javip
 */
public class PruebaGestion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehiculo V1 = new Vehiculo("1245678-Z","Opel","Vectra","Rojo",1055.60,true);
        
        System.out.println(V1);
    }
    
}
