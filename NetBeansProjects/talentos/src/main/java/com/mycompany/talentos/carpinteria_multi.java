/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.talentos;

/**
 *
 * @author aospinam
 */
public class carpinteria_multi extends carpinteria {
    
    boolean multidimensional;
    
    public carpinteria_multi(String TipoMadera,int cantidad,String Herramienta,int tiempo){
        super(TipoMadera,cantidad, Herramienta,tiempo);
        this.multidimensional=multidimensional;
    }
    
    
    
    
    @Override
    public int cortar(String TipoMadera, int cantidad){
    
       int tiempo = super.cortar(TipoMadera, cantidad);
       return tiempo/2;
    }
    
}
