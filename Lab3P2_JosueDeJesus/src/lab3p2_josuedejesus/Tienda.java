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
public class Tienda {
    private String id;
    private String ubicacion;
    private int empleados;
    private int cajas;
    private String masVendido;
    private int articulos;

    public Tienda() {
    }

    public Tienda(String id, String ubicacion, int empleados, int cajas, String masVendido, int articulos) {
        this.id = id;
        this.ubicacion = ubicacion;
        this.empleados = empleados;
        this.cajas = cajas;
        this.masVendido = masVendido;
        this.articulos = articulos;
    }

    Tienda(String identificador, String ubicacion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getEmpleados() {
        return empleados;
    }

    public void setEmpleados(int empleados) {
        this.empleados = empleados;
    }

    public int getCajas() {
        return cajas;
    }

    public void setCajas(int cajas) {
        this.cajas = cajas;
    }

    public String getMasVendido() {
        return masVendido;
    }

    public void setMasVendido(String masVendido) {
        this.masVendido = masVendido;
    }

    public int getArticulos() {
        return articulos;
    }

    public void setArticulos(int articulos) {
        this.articulos = articulos;
    }

    @Override
    public String toString() {
        return "Tienda{" + "id=" + id + ", ubicacion=" + ubicacion + ", empleados=" + empleados + ", cajas=" + cajas + ", masVendido=" + masVendido + ", articulos=" + articulos + '}';
    }
    
    
}
