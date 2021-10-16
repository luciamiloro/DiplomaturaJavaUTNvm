package com.company;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {

        // Mostrar mensaje en pantalla
        System.out.println("Ingrese un mes (de 1 a 12):");

        // inicializo variable
        int numeroIngresado;

        // Creacion de un objeto Scanner sobre la consola (System.in)--> leer el contenido ingresado por consola
        Scanner numeroElegido = new Scanner(System.in);

        // Cuando el usuario da entrada numerica por teclado debemos llamar al metodo .nextInt() sobre el objeto Scanner
        numeroIngresado = numeroElegido.nextInt();

        // Condiciones
        switch(numeroIngresado){
            case 1:
                System.out.println("El mes ingresado es Enero (1)");
                break;
            case 2:
                System.out.println("El mes ingresado es Febrero (2)");
                break;
            case 3:
                System.out.println("El mes ingresado es Marzo (3)");
                break;
            case 4:
                System.out.println("El mes ingresado es Abril (4)");
                break;
            case 5:
                System.out.println("El mes ingresado es Mayo (5)");
                break;
            case 6:
                System.out.println("El mes ingresado es Junio (6)");
                break;
            case 7:
                System.out.println("El mes ingresado es Julio (7)");
                break;
            case 8:
                System.out.println("El mes ingresado es Agosto (8)");
                break;
            case 9:
                System.out.println("El mes ingresado es Septiembre (9)");
                break;
            case 10:
                System.out.println("El mes ingresado es Octubre (10)");
                break;
            case 11:
                System.out.println("El mes ingresado es Noviembre (11)");
                break;
            case 12:
                System.out.println("El mes ingresado es Diciembre (12)");
                break;
            default:
            System.out.println("El numero ingresado no corresponde a ningun mes");
        }
        System.out.println("salimos del switch y finaliza la ejecucion del programa");
    }
}
