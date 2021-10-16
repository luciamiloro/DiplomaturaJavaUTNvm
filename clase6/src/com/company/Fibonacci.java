package com.company;

public class Fibonacci {
    public static void main(String[] args) {

        //mis dos primeros numeros son estáticos , no se calculan sumando anteriores
        int n1 = 0;
        int n2= 1;
        System.out.println(n1);
        System.out.println(n2);

        for( int i = 2; i < 10; i++) {
            int n3 = n2 + n1;
            System.out.println(n3);
            //En este punto ya tenemos el valor de 1
            n1 = n2;  //n1 es 1
            n2 = n3;
        }
    }

}
