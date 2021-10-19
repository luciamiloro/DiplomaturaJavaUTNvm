/*
Diseñar  un  algoritmo  que  permita  aplicar  un  descuento  del  10%  al
monto total de una compra si la forma de pago empleada es de contado.
El usuario deberá ingresar el monto de la compra realizada y la forma de pago
utilizada. Si es contado, deberá aplicar el descuento, sino se deberá mostrar
un mensaje informando que para dicha forma de pago no tiene  descuento
*/
package com.company;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        // Declarar variables:
        double montoTotal;
        String formaDePago;
        double montoConDescuento;

        // importo scanner, ingreso datos y los leo por consola
        Scanner monto = new Scanner(System.in);

        // Pido monto y forma de pago y asigno a variables
        System.out.println("Ingrese monto total de la compra: ");
        montoTotal = monto.nextInt();

        System.out.println("Ingrese forma de pago (contado/otro): ");
        formaDePago = monto.next();

        //condicion para muestro mensaje acorde a la forma de pago
        if (formaDePago.equals("contado") ){
            montoConDescuento = montoTotal * 0.9;
            System.out.println("El monto Total con descuento aplicado por forma de pago alcontado, es de:" + montoConDescuento + "pesos");
        }else{
            System.out.println("La forma de pago ingresada no tiene descuento asociado");
        }
    }



}
