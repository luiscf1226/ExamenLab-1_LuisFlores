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
public class Armas {
    private String tipo;
    private double damage;

    public Armas() {
    }

    public Armas(String tipo, double damage) {
        this.tipo = tipo;
        this.damage = damage;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    @Override
    public String toString() {
        return " "+ tipo ;
    }
    
    
}
