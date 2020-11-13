/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_luisflores;

/**
 *
 * @author Luis Carlos Flores
 */
public class Persona {
    protected String nombre;
    protected int edad;
    protected String sexo;
    protected Armas arma;

    public Persona() {
    }

    public Persona(String nombre, int edad, String sexo, Armas arma) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.arma = arma;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Armas getArma() {
        return arma;
    }

    public void setArma(Armas arma) {
        this.arma = arma;
    }

    @Override
    public String toString() {
        return ""+ nombre ;
    }
    
}
