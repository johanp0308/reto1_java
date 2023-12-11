package com.ejemplo.reto1;

import java.util.Random;

import javax.swing.JOptionPane;

public class Punto3 {
    
    public static void main(String[] args) {
        try{
            System.out.println("hola");
            int cantida = Integer.parseInt(JOptionPane.showInputDialog("Porfavor ingrese el tamaño de la contraseña: "));
            boolean mayus = (Integer.parseInt(JOptionPane.showInputDialog("Desea mayusculas:\n 1.Si.\n2.No")) == 1) ? true : false;
            boolean simbol = (Integer.parseInt(JOptionPane.showInputDialog("Desea simnolos:\n 1.Si.\n2.No")) == 1) ? true : false;
            boolean numero = (Integer.parseInt(JOptionPane.showInputDialog("Desea numeros:\n 1.Si.\n2.No")) == 1) ? true : false;

            String password = generatePassword(cantida, mayus, numero, simbol);

            JOptionPane.showMessageDialog(null,"Su contraseña es: "+password);
            
        }catch(NumberFormatException ex){

        }catch(Exception ex){

        }
    }

    public static String generatePassword(int longitud, boolean mayus, boolean numero, boolean simbol){
        Random random = new Random();
        char[] simbolos = "!\"#$%&'()*+,-./".toCharArray();
        char[] letras = "abcdefghijklmnopqrstuvABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        char[] numeros = "1234567890".toCharArray();
        String newPassword = "";
        for(int i=0;i<longitud;i++){
            if(mayus && numero && simbol){
                int opc = random.nextInt(3);
                switch (opc) {
                    case 0:
                        int posLetra = random.nextInt(letras.length);
                        newPassword += letras[posLetra];
                        break;
                    case 1:
                        int posNumero = random.nextInt(numeros.length);
                        newPassword += numeros[posNumero];
                        break;
                    case 2:
                        int posSimbol = random.nextInt(simbolos.length);
                        newPassword += simbolos[posSimbol];
                        break;
                    default:
                        break;
                }
            }else if (mayus && numero && !simbol) {
                int opc = random.nextInt(2);
                switch (opc) {
                    case 0:
                        int posLetra = random.nextInt(letras.length);
                        newPassword += letras[posLetra];
                        break;
                    case 1:
                        int posNumero = random.nextInt(numeros.length);
                        newPassword += numeros[posNumero];
                        break;
                    default:
                        break;
                }
            }else if (simbol && numero && !mayus) {
                int opc = random.nextInt(3);
                switch (opc) {
                    case 0:
                        int posLetra = random.nextInt(letras.length);
                        newPassword += String.valueOf(letras[posLetra]).toLowerCase();
                        break;
                    case 1:
                        int posNumero = random.nextInt(numeros.length);
                        newPassword += numeros[posNumero];
                        break;
                    case 2:
                        int posSimbol = random.nextInt(simbolos.length);
                        newPassword += simbolos[posSimbol];
                        break;
                    default:
                        break;
                }
            }else if (simbol && mayus && !numero) {
                int opc = random.nextInt(2);
                switch (opc) {
                    case 0:
                        int posLetra = random.nextInt(letras.length);
                        newPassword += letras[posLetra];
                        break;
                    case 1:
                        int posSimbol = random.nextInt(simbolos.length);
                        newPassword += simbolos[posSimbol];
                        break;
                    default:
                        break;
                }
            }else{
                return "";
            }
        }
        System.out.println(newPassword);
        return newPassword;
    }
}
