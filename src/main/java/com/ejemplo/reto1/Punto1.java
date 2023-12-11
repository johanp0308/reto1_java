package com.ejemplo.reto1;


import javax.swing.JOptionPane;

public class Punto1 {
    public static void main(String[] args) {
        try{
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero mayor para ayudar la suma:"));
            int total = sumaEnterosMultiplos(numero);
            JOptionPane.showMessageDialog(null,"El valor de la suma de su numeros enteros multiplos de 3 ó 5 es: "+total);
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Error el valor no es un numero: "+ex);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error: "+ex);
        }
    }

    public static int sumaEnterosMultiplos(int numeroMayor){
        int suma = 0;
        for(int i = numeroMayor-1;i>0;i--){
            if((i%3 == 0 && !(i%5==0)) || (i%5 == 0 && !(i%3==0))){
                suma+=i;
                
            }
        }
        return suma;
    }
}