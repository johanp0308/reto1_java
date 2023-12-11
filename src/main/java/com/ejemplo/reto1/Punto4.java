package com.ejemplo.reto1;

public class Punto4 {
    

/*
 * 
 * a,b = 0, 1
 * for _ in range(10):
 *    print(a,end=" ")
 *    a,b = b,a+b
 * print()
 * 
 * Este codigo es una sucesion fubonacci la cual su secuencia consiste en que se toma
 * los dos valores anteriores y se suman y se pone de siguiente.
 * 
 * El codigo es escrito en python asigna los dos valores que comienza esta cadena 0,1
 * luego con un for limita la cantidad de numeros sumads e imprimidos y prosigue con la secuencia
 * la cual en python se hace lo que llamanos una asignacion doble, para ello. a sera b, luebo b sera la suma de a y b. 
 */

    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int aux = b;

        for(int i = 0; i<10;i++){
            System.out.println(a);
            aux = a+b;
            a = b;
            b = aux;
        }
    }
}
