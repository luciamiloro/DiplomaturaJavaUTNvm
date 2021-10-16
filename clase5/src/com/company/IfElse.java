package com.company;

import java.util.Scanner;

public class IfElse {

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
        if (numeroIngresado == 1){
            System.out.println("El mes ingresado es Enero (1)");
        } else if (numeroIngresado == 2){
            System.out.println("El mes ingresado es Febrero (2)");
        } else if (numeroIngresado == 3){
            System.out.println("El mes ingresado es Marzo (3)");
        }else if (numeroIngresado == 4){
            System.out.println("El mes ingresado es Abril (4)");
        }else if (numeroIngresado == 5){
            System.out.println("El mes ingresado es Mayo (5)");
        }else if (numeroIngresado == 6){
            System.out.println("El mes ingresado es Junio (6)");
        }else if (numeroIngresado == 7){
            System.out.println("El mes ingresado es Julio (7)");
        }else if (numeroIngresado == 8){
            System.out.println("El mes ingresado es Agosto (8)");
        }else if (numeroIngresado == 9){
            System.out.println("El mes ingresado es Septiembre (9)");
        }else if (numeroIngresado == 10){
            System.out.println("El mes ingresado es Octubre (10)");
        }else if (numeroIngresado == 11){
            System.out.println("El mes ingresado es Noviembre (11)");
        }else if (numeroIngresado == 12){
            System.out.println("El mes ingresado es Diciembre (12)");
        }else{
            System.out.println("El numero ingresado no corresponde a ningun mes");
        }
    }
}
