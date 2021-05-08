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
public class Sonido 
{
    int altavoces;
    int potencia;
    int aux;
    int discos;
    int usb;

    public Sonido() {
    }

    public Sonido(int altavoces, int potencia, int aux, int discos, int usb) {
        this.altavoces = altavoces;
        this.potencia = potencia;
        this.aux = aux;
        this.discos = discos;
        this.usb = usb;
    }

    public int getAltavoces() {
        return altavoces;
    }

    public void setAltavoces(int altavoces) {
        this.altavoces = altavoces;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getAux() {
        return aux;
    }

    public void setAux(int aux) {
        this.aux = aux;
    }

    public int getDiscos() {
        return discos;
    }

    public void setDiscos(int discos) {
        this.discos = discos;
    }

    public int getUsb() {
        return usb;
    }

    public void setUsb(int usb) {
        this.usb = usb;
    }

    @Override
    public String toString() {
        return "Sonido{" + "altavoces=" + altavoces + ", potencia=" + potencia + ", aux=" + aux + ", discos=" + discos + ", usb=" + usb + '}';
    }
    
    
}
