package com.alejandro.tvdomain;

public class Televisor {
    public String serial;
    public double peso;
    public String marca;
    public short canal;
    public byte volumen;
    public boolean prendido;

    public void prender() {
        prendido = true;
    }

    public void apagar() {
        prendido = false;
    }

    public short cambiarCanal(short nuevoCanal) {
        canal = nuevoCanal;
        return nuevoCanal;
    }

    public byte cambiarVolumen(byte nuevoVolumen) {
        if (nuevoVolumen > 0 && nuevoVolumen <= 100) {
            volumen = nuevoVolumen;
            return nuevoVolumen;
        } else {
            return volumen;
        }
    }
}
