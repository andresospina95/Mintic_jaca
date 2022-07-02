/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.biblioteca;

/**
 *
 * @author aospinam
 */
public class PQRS {
    
    String Radicado;
    String DniCliente;
    int Tipologia; //1 pregunta, 2 queja, 3 reclamo, 4 sugerencia
    
    
    public PQRS(String Radicado, int Tipologia, String Dni){
    this.Radicado=Radicado;
    this.Tipologia=Tipologia;
    this.DniCliente= Dni;
    
    }
    
   
    public void getPQRS(){
        
    System.out.println(this.Radicado);
    }
}
