/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.aves;

import java.util.ArrayList;

public class Aves {

    public static void main(String[] args) {
        
       canario piolin = new canario("amarillo", 1.5f,40f, 30f);

        System.out.println(piolin.getcolor());
        System.out.println(piolin.gettamañoalas());
        System.out.println(piolin.getaltura());
        System.out.println(piolin.getvelocidad());
        piolin.volar();
        
        ArrayList<ave> misaves;
        
        

    }
}
