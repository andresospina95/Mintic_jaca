/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.swingfront;

/**
 *
 * @author aospinam
 */
public abstract class Geometria {
    
    float area;
    float perimetro;
    
    
    public float getArea(){
        return this.area;
    }
    
    public void setArea(float area){
    this.area=area;
    }
    
        public float getPerimetro(){
        return this.perimetro;
    }
    
    public void setPerimetro(float per){
    this.perimetro=per;
    }
    
}
