/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.swingfront;

/**
 *
 * @author aospinam
 */
public class AreaTriangulo extends Geometria {
    
    
    float base;
    float altura;
        
    public AreaTriangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }
    
    public float calcularArea(float base, float altura){
        
        return (this.base*this.altura)/2;
    }
    
    
        public float calcularArea(){
        
        return (this.base*this.altura)/2;
    }
    
    
}
