# Reto Java 1

El primer ejercicio consistia en sumar los multiplos de 3 y 5 pero numero que no son de ambos, esto ademas de tener en cuenta que se solicita un numero maximo para la suma un tope maximo por asi decirlo.

El segundo punto consiste validar contraseñas alli uso arreglos donde guardo los caracteres que comparo con la cadena para verificar que existan en ella almenos una vez.


Ademas tenemos una sueccion fubonaccio pasada de python a Java.

![](./img/imagen_1.png)

```py
    a,b = 0, 1
    for _ in range(10):
        print(a,end=" ")
        a,b = b,a+b
    print()
```

```java
    int a = 0;
    int b = 1;
    int aux = b;
    for(int i = 0; i<10;i++){
        System.out.print(a+" ");
        aux = a+b;
        a = b;
        b = aux;
    }
    System.out.println();
```

Este codigo es una sucesion fubonacci la cual su secuencia consiste en que se toma
los dos valores anteriores y se suman y se pone de siguiente.

El codigo es escrito en python asigna los dos valores que comienza esta cadena 0,1
luego con un for limita la cantidad de numeros sumads e imprimidos y prosigue con la secuencia
la cual en python se hace lo que llamanos una asignacion doble, para ello. a sera b, luebo b sera la suma de a y b

## Lenguajes usados
* java
* XML (pom.xml => para maven)

## IDE
* Visual Studio Code

