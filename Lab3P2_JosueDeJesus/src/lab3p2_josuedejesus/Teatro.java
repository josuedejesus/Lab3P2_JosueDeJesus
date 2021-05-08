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
public class Teatro 
{
    int altavoces;
    int discos;
    String bluray;
    String limpieza;
    String lector;

    public Teatro() {
    }

    public Teatro(int altavoces, int discos, String bluray, String limpieza, String lector) {
        this.altavoces = altavoces;
        this.discos = discos;
        this.bluray = bluray;
        this.limpieza = limpieza;
        this.lector = lector;
    }

    public int getAltavoces() {
        return altavoces;
    }

    public void setAltavoces(int altavoces) {
        this.altavoces = altavoces;
    }

    public int getDiscos() {
        return discos;
    }

    public void setDiscos(int discos) {
        this.discos = discos;
    }

    public String getBluray() {
        return bluray;
    }

    public void setBluray(String bluray) {
        this.bluray = bluray;
    }

    public String getLimpieza() {
        return limpieza;
    }

    public void setLimpieza(String limpieza) {
        this.limpieza = limpieza;
    }

    public String getLector() {
        return lector;
    }

    public void setLector(String lector) {
        this.lector = lector;
    }

    @Override
    public String toString() {
        return "Teatro{" + "altavoces=" + altavoces + ", discos=" + discos + ", bluray=" + bluray + ", limpieza=" + limpieza + ", lector=" + lector + '}';
    }

    
}
