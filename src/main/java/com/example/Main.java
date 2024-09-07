package com.example;

import java.util.Scanner;

public class Main {
 

         public static void main(String[] args) {
    Scanner usuario = new Scanner(System.in);

    System.out.println("Ingrese la cantidad de la compra: ");

            double cantidadCompra = usuario.nextDouble();

            int puntosAcumulados = (int) (cantidadCompra / 10);

            System.out.println("puntos acumulados: " + puntosAcumulados);


           String nivelFidelizacion;

        if (puntosAcumulados > 1000) {
            nivelFidelizacion = "Platino";
        } else if (puntosAcumulados >= 501 ) {
            nivelFidelizacion = "Oro";
        } else if (puntosAcumulados >= 101 ) {
            nivelFidelizacion = "Plata";
        } else {
            nivelFidelizacion = "Bronce";
        }

        System.out.println("Puntos acumulados: " + puntosAcumulados);
        System.out.println("Nivel de fidelización: " + nivelFidelizacion);

        if (nivelFidelizacion.equals("Oro") || nivelFidelizacion.equals("Platino")) {
            System.out.println("Tienes un 10% de descuento");
            
        }

        if (nivelFidelizacion.equals("Platino")) {
            System.out.println("Felicidades tienes un cupon para cualquier producto por ser platino");
            
        }

        usuario.close();
        
    }
}


                                                         