/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.aves;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class Aves {

    public static void main(String[] args) {
        
       canario piolin = new canario("amarillo", 1.5f,40f, 30f);

//        System.out.println(piolin.getcolor());
//        System.out.println(piolin.gettamañoalas());
//        System.out.println(piolin.getaltura());
//        System.out.println(piolin.getvelocidad());
//        piolin.volar();
        
        aguila AguilaCalva = new aguila(2.0f,80f,20f,"Blanco");
        
//        int[] numeros = new int[5];
//        
//        int numero;
//        for(numero=0; numero<numeros.length;numero++){
//            System.out.println(numero);
//        }
        
        
        ArrayList<ave> misaves= new ArrayList<ave>();
        
        misaves.add(piolin);
        misaves.add(AguilaCalva);
        
        System.out.println(misaves.size());
        int i;
        int m;
        for(i=0; i< misaves.size();i++){
            
            System.out.println(misaves.get(i).Descripción());
            misaves.get(i).volar();
            
            
            System.out.println(misaves.get(i).getClass().getName());
            
            Method[] methods = misaves.get(i).getClass().getMethods();
            
            for(Method method:methods){
                
                String nombremetodo =method.getName();
                if(nombremetodo.contains("cazar")){
                    System.out.println("esta ave puede cazar");
                }

                
            }
            System.out.println("---------------");
                        System.out.println("---------------");

        }
            
        }
    }




