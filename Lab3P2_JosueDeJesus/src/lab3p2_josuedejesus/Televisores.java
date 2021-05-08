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
public class Televisores extends Articulos
{
    double pantalla;
    String smart;
    String marca;
    int conexiones;
    double grosor;

    public Televisores() 
    {
        super();
    }

    public Televisores(double pantalla, String smart, String marca, int conexiones, double grosor, String serie, int precio, String color, String garantia) {
        super(serie, precio, color, garantia);
        this.pantalla = pantalla;
        this.smart = smart;
        this.marca = marca;
        this.conexiones = conexiones;
        this.grosor = grosor;
    }

    public double getPantalla() {
        return pantalla;
    }

    public void setPantalla(double pantalla) {
        this.pantalla = pantalla;
    }

    public String getSmart() {
        return smart;
    }

    public void setSmart(String smart) {
        this.smart = smart;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getConexiones() {
        return conexiones;
    }

    public void setConexiones(int conexiones) {
        this.conexiones = conexiones;
    }

    public double getGrosor() {
        return grosor;
    }

    public void setGrosor(double grosor) {
        this.grosor = grosor;
    }

    @Override
    public String toString() {
        return super.toString()+"Televisores{" + "pantalla=" + pantalla + ", smart=" + smart + ", marca=" + marca + ", conexiones=" + conexiones + ", grosor=" + grosor + '}';
    }
    
     
}
