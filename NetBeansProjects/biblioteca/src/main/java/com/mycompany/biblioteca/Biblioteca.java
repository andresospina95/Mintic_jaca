/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.biblioteca;

/**
 *
 * @author aospinam
 */
public class Biblioteca {

    public static void main(String[] args) {

        
    ClienteBanco cliente = new ClienteBanco("pedro",50,'M',"1456743",1500000f,"cra 56b #36-67", "cali",
            "+573113857609",75f,"casado",1);
    
    
    ClienteBanco cliente1= new ClienteBanco("1456743","pedro@gmail.com","cali");
    
    String Rad = cliente1.Ciudad +' '+ cliente1.Dni;
    PQRS ReclamoCliente = new PQRS(Rad,2,cliente1.Dni);
    ReclamoCliente.getPQRS();
    
    
    }
}
