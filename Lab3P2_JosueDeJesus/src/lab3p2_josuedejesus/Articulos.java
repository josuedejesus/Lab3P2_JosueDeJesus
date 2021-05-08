/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3p2_josuedejesus;

/**
 *
 * @author josue
 */
public class Articulos 
{
    String serie;
    int precio;
    String color;
    String garantia;

    public Articulos() 
    {
        super();
    }

    public Articulos(String serie, int precio, String color, String garantia) {
        this.serie = serie;
        this.precio = precio;
        this.color = color;
        this.garantia = garantia;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getGarantia() {
        return garantia;
    }

    public void setGarantia(String garantia) {
        this.garantia = garantia;
    }
    
    
}
