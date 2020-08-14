package com.alejandro.app;

import com.alejandro.domain.CuentaBancaria;
import com.alejandro.domain.Persona;

public class App {
    public static void main(String[] args) {
        Persona alejandro = new Persona();

        alejandro.nombre = "Alejandro Ramírez";

        CuentaBancaria cuentaDeAlejo = new CuentaBancaria();
        CuentaBancaria otraCuenta = new CuentaBancaria();

        cuentaDeAlejo.tipoCuenta = 'A';
        cuentaDeAlejo.numero = "1235";
        cuentaDeAlejo.propietario = alejandro;

        otraCuenta.tipoCuenta = 'A';
        otraCuenta.numero = "9876";
        otraCuenta.propietario = alejandro;

        System.out.println("El propietario de la cuenta " + cuentaDeAlejo.numero + " es "
                            + cuentaDeAlejo.propietario.nombre);

        System.out.println("El saldo antes de consignar es " + cuentaDeAlejo.saldo);
        cuentaDeAlejo.consignar(300000);
        System.out.println("El saldo después de consignar es " + cuentaDeAlejo.saldo);
        cuentaDeAlejo.retirar(120000);
        System.out.println("El saldo después de retirar es " + cuentaDeAlejo.saldo);

        cuentaDeAlejo.transferir(otraCuenta, 80000);
        System.out.println("El saldo después de transferir de mi cuenta es " + cuentaDeAlejo.saldo);
        System.out.println("El saldo después de transferir de otra cuenta es " + otraCuenta.saldo);

    }
}
