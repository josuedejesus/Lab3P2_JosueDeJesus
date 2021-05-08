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
public class Consolas 
{
    String marca;
    int almacenamiento;
    int controles;
    int accesorios;
    String tarjeta;

    public Consolas() 
    {
        super();
    }

    public Consolas(String marca, int almacenamiento, int controles, int accesorios, String tarjeta) {
        this.marca = marca;
        this.almacenamiento = almacenamiento;
        this.controles = controles;
        this.accesorios = accesorios;
        this.tarjeta = tarjeta;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public int getControles() {
        return controles;
    }

    public void setControles(int controles) {
        this.controles = controles;
    }

    public int getAccesorios() {
        return accesorios;
    }

    public void setAccesorios(int accesorios) {
        this.accesorios = accesorios;
    }

    public String getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(String tarjeta) {
        this.tarjeta = tarjeta;
    }

    @Override
    public String toString() {
        return "Consolas{" + "marca=" + marca + ", almacenamiento=" + almacenamiento + ", controles=" + controles + ", accesorios=" + accesorios + ", tarjeta=" + tarjeta + '}';
    }

    
}
