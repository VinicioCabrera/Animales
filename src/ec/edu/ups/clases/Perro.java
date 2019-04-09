/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

import ec.edu.ups.prueba.Acciones;

/**
 *
 * @author Estudiante
 */
public class Perro extends Animal implements Acciones  {

    public Perro(String nombre, int edad, double peso, String sexo) {
        super(nombre, edad, peso, sexo);
    }

    @Override
    public void comer() {
        System.out.println("El perro: "+this.getNombre());
    }

    @Override
    public void dormir() {
       System.out.println("El perro: "+this.getNombre());
    }

    @Override
    public void moverse() {
        System.out.println("El perro: "+this.getNombre());
    }

    @Override
    public void jugar() {
        System.out.println("El perro: "+this.getNombre());
    }

    @Override
    public void reproducirce() {
        System.out.println("El perro: "+this.getNombre());
    }
   
    
}
