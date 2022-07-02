/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author aospinam
 */
package com.mycompany.biblioteca;

public class ClienteBanco {
    String Nombre;
    int Edad;
    char Sexo;
    String Dni;
    float IngresosMensuales;
    String Dirección;
    String Ciudad;
    String Telefono;
    float Score;
    String EstadoCivil;
    int TipoCuenta; //1 corriente, 2 ahorros
    String Email;
    
    public ClienteBanco(String nombre, int edad,char sexo,String dni,float ingresosmensuales,
            String dirección,String ciudad,String tel,float sc,String estadocivil, int tc)
    {
        this.Nombre=nombre;
        this.Edad = edad;
        this.Sexo= sexo;
        this.Dni = dni;
        this.IngresosMensuales=ingresosmensuales;
        this.Dirección=dirección;
        this.Ciudad=ciudad;
        this.Telefono=tel;
        this.Score=sc;
        this.EstadoCivil=estadocivil;
        this.TipoCuenta=tc;
    }    
    
    public ClienteBanco(String Dni, String Email, String Ciudad){
    this.Dni=Dni;
    this.Email=Email;
    this.Ciudad=Ciudad;
    }
    
    public float getScore(){
    return Score;    
    }
}

