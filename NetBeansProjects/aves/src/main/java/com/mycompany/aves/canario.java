/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aves;

/**
 *
 * @author aospinam
 */
public class canario extends ave  implements acciones{

    private String color;

    public canario(String Color, float ta, float av, float v) {
        this.color = Color;
        this.tamañoalas = ta;
        this.alturavuelo = av;
        this.velocidad = v;
    }

    public String getcolor() {
        return this.color;
    }

    public float gettamañoalas() {
        return this.tamañoalas;
    }

    public float getaltura() {
        return this.alturavuelo;
    }

    public float getvelocidad() {
        return this.velocidad;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void alimentarse() {
            if(1==1){
        System.out.println("1 es igual a 1");
    }
    }

    @Override
    public void calcularalcance() {
        
        
    }

    @Override
    public String Descripción(){

        return "Comer";
    }

    
}
