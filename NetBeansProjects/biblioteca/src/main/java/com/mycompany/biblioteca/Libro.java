/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.biblioteca;

/**
 *
 * @author aospinam
 */
public class Libro {

    int CantidadPaginas;
    boolean pasta;

    public Libro(int CantidadPaginas, boolean Pasta){
        this.CantidadPaginas= CantidadPaginas;
        
        
    
    }
    
    
    public int CalcularPaginas() {
        return this.CantidadPaginas;
    }

    protected float CalcularPesoLibro() {
        if (this.pasta == true) {

            return this.CantidadPaginas * 0.5f + 0.5f;

        } else {
            return this.CantidadPaginas * 0.5f;

        }
    }
    
    
    
}

/*
public
private
protected

*/