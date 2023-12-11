package com.ejemplo.reto1;

import javax.swing.JOptionPane;

public class Punto2 {
    public static void main(String[] args) {

        while (true) {
            String password = JOptionPane.showInputDialog("Ingrese su contraseña: ");
            if(validatePassword(password)){
                JOptionPane.showMessageDialog(null, "Contraseña es valida");
                break;
            }else{
                JOptionPane.showMessageDialog(null, "Contraseña no es valida");
            }
        }

    }

    public static boolean validatePassword(String password){
        char[] mayusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        char[] minusculas = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        char[] simbolos = "!@#$%^&*".toCharArray();
        boolean mayus = false;
        boolean minus = false;
        boolean simbol = false;
        if(password.length()>=8){
            for(int i=0;i<password.length();i++){
                for(int j = 0;j<mayusculas.length;j++){
                    if(password.charAt(i) == mayusculas[j]){
                        mayus =true;
                        break;
                    }
                }
            }

            for(int i=0;i<password.length();i++){
                for(int j = 0;j<minusculas.length;j++){
                    if(password.charAt(i) == minusculas[j]){
                        minus = true;
                        break;
                    }
                }
            }
            for(int i=0;i<password.length();i++){
                for(int j = 0;j<simbolos.length;j++){
                    if(password.charAt(i) == simbolos[j]){
                        simbol =true;
                        break;
                    }
                }
            }
            if(mayus && minus && simbol){
                return true;
            }
        }
        return false;
    }
}
