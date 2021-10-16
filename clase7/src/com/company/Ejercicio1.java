/*
Indicar si un número ingresado es par o impar
Algoritmo NumeroPar
    Entero numero
    Escribir 'Ingrese un numero:'
    Leer numero
    Si numero MOD2 == 0 Entonces
      Escribir numero,' es par'
    SiNo
      Escribir numero,' no es par '
    FinSi
FinAlgoritmo
 */

package com.company;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        //Declaro variable:
        Integer numero;

        // importo scanner, ingreso datos y los leo por consola
        Scanner numeroElegido = new Scanner(System.in);

        // Mostrar mensaje en pantalla y lo asigno a la variable de linea 23
        System.out.println("Ingrese un numero:");
        numero = numeroElegido.nextInt();

        //defino la condicion mediante if else
        if (numero % 2 == 0){
            System.out.println("El nro elegido: "+ numero +" es par");
        }else{
            System.out.println("El nro elegido: "+ numero +" es impar");
        }

    }
}
