/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

/**
 *
 * @author Estudiante
 */
public class Animal {
 private String nombre;
 private int edad;
private double peso;
private String sexo;

    public Animal() {
    }

    public Animal(String nombre, int edad, double peso, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.sexo = sexo;
    }
public void setNombre(String nombre){
    this.nombre=nombre;
}
public String getNombre(){
    return this.nombre;
}
public void setEdad(int edad){
    this.edad=edad;
}
public int getEdad(){
    return this.edad;
}
public void setpeso(double peso){
    this.peso=peso;
}
public double getPeso(){
    return this.peso;
}
public void setSexo(String sexo){
    this.sexo=sexo;
}
public String getSexo(){
    return this.sexo;
}
}
