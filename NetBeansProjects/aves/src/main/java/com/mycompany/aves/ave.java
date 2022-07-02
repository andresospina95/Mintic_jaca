/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aves;

public abstract class ave {
    float tamañoalas;
    float velocidad;
    float alturavuelo;
    
    public void volar(){
        System.out.println("Esta volando");
    }
    
    public void setAltura(float alturavuelo){
        this.alturavuelo=alturavuelo;
    }
    
}
