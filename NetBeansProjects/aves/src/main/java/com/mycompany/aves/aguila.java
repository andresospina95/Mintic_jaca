/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aves;

/**
 *
 * @author aospinam
 */
public class aguila extends ave {
    //atributo
    private String ColorCabeza;
    
    //constructor
    public aguila(float ta, float av, float v, String colorcabeza){
    this.tamañoalas=ta;
    this.alturavuelo=av;
    this.velocidad=v;
    this.ColorCabeza=colorcabeza;
    
    }
    //metodo
    
    public void cazar(){
        System.out.println("Esta cazando");
    }
    
    // metodo
    public void planear(){
        System.out.println("el aguila esta planeando");
    }
    
    //getter
    public float getvelocidad(){
    return this.velocidad;
    }
    
    public String getcolorcabeza(){
    return this.ColorCabeza;
    }
    
    //setters
    public void setalturavuelo(float av){
    this.alturavuelo=av;
    }
    
        @Override
    public String Descripción(){
    
        System.out.println("cazar primer");
        return "comer";
    }
}
