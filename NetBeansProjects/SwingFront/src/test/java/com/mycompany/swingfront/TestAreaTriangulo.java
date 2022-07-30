/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.swingfront;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import org.junit.Test;

/**
 *
 * @author aospinam
 */
public class TestAreaTriangulo {
    
    AreaTriangulo triangulotest;
    
   @Test
   public void testAreapositiva(){
       triangulotest = new AreaTriangulo(5,2);
       
       assertEquals(5, triangulotest.calcularArea(),0.0000001);
   }
    
    @Test(expected=IllegalArgumentException.class)
    public void testAreaCero(){
    triangulotest= new AreaTriangulo(5,0);
    
    assertEquals(0, triangulotest.calcularArea(),0.0000001);

    }
    
    @Test(expected=IllegalArgumentException.class)
    public void testNegativo(){
    triangulotest = new AreaTriangulo(-2,-4);
    
    triangulotest.calcularArea();
        
    }
}
