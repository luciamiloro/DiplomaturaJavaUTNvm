/*
Escribir el algoritmo que, a partir de la cantidad de bancos de un aula y
la  cantidad  de alumnosinscriptos  para  un  curso,  permita  determinar
si alcanzan  los  bancos  existentes.
De  no  ser  así,  informar además  cuantos bancos sería necesario agregar.
El usuario deberá ingresar por teclado tanto la cantidad  de  bancos
que  tiene  el  aula,  como  la  cantidad  de  alumnos inscriptos para
el curso.
*/

package com.company;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        //inicializo las variables:
        Integer cantBancosAula;
        Integer cantAlumInscriptos;
        Integer bancosFaltantes;

        // importo scanner, ingreso datos y los leo por consola
        Scanner cantidad = new Scanner(System.in);

        // Mostrar mensaje en pantalla y lo asigno a la variable de linea 18
        System.out.println("Ingrese la cantidad de bancos disponibles en el aula:");
        cantBancosAula = cantidad.nextInt();

        System.out.println("Ingrese la cantidad de alumnos inscriptos al cursado: ");
        cantAlumInscriptos = cantidad.nextInt();

        if ( cantBancosAula >= cantAlumInscriptos ) {
            System.out.println("Los bancos del aula son suficientes");
        } else {
            bancosFaltantes = cantAlumInscriptos - cantBancosAula;
            System.out.println("La cantidad de bancos faltantes es: " + bancosFaltantes);

        }


    }


}
