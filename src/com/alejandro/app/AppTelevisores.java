package com.alejandro.app;

import com.alejandro.tvdomain.Televisor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppTelevisores {
    public static void main(String[] args) {
        Televisor tv = new Televisor();

//        short variableControl = 1;
//
//        do {
//            System.out.println("El valor es " + variableControl);
//            variableControl++;
//        } while (variableControl < 1);

        List<Integer> numeros = Arrays.asList(1, 5, 8, 14, 10);

//        numeros.add(17);

        numeros.forEach(x -> System.out.println("El valor es de " + x));

        ArrayList<Televisor> televisores = new ArrayList<>();
        televisores.add(tv);

        // TODO Explorar todo lo que tenga Televisor y jugar con la clase ArrayList
    }
}
