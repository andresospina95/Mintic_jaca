/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.talentos;

/**
 *
 * @author aospinam
 */
public class carpinteria {
    String TipoMadera;
    int cantidad;
    String Herramienta;
    int tiempo;
    
    public carpinteria(String TipoMadera, int cantidad, String Herramienta, int tiempo){
        this.TipoMadera=TipoMadera;
        this.cantidad=cantidad;
        this.Herramienta=Herramienta;
        this.tiempo=tiempo;
    }
    
    public int cortar(String TipoMadera, int cantidad){
        if(TipoMadera=="Roble"){
            tiempo= 20*cantidad;
            
        }
        else{
             tiempo= 10*cantidad;
        
        }
       return tiempo;
    }
}

