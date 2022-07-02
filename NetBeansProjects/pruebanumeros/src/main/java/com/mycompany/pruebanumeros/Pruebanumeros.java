/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.pruebanumeros;

/**
 *
 * @author aospinam
 */
public class Pruebanumeros {

    public static void main(String[] args) {

       float valor1=7;
       float valor2=2;
       float resultado;
       //suma
       resultado= valor1+valor2;
       System.out.println(resultado);
       
       //resta 
       resultado= valor1-valor2;
       System.out.println(resultado);
       
       //multiplicación
       resultado= valor1*valor2;
       System.out.println(resultado);
       
       // división
       resultado= valor1/valor2;
       System.out.println(resultado);
       
       //residuo
       resultado= valor1%valor2;
       System.out.println(resultado);
       
       
       // concatenación de caracteres
       String nombre ="Maria";
       String apellido ="Perez";
       String nombrecompleto;
       
       nombrecompleto = nombre + " " +apellido;
       System.out.println(nombrecompleto);
       
       
       //incrementales
       int i=1;
       ++i;
       System.out.println(i);
       
       // comparaciones
       
       int num1=1;
       int num2=2;
       
       if(num1==num2){
       System.out.println("numeros son iguales");
       }
       
       if(num1!=num2){
       System.out.println("numeros son diferentes");
       
       }

     //  >=
       //        <=
         //      <
           //    >
           
           
          if (num1==num2 || num1!=num2){
          System.out.println("alguna de las condiciones se cumple");
          } 

    }
}
