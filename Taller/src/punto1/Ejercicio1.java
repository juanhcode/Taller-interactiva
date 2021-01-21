/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Sumar un valor
        //Sacar residuo
        // mover la posicion del numero
        
        String mensaje;
        String mensaje1;
        
        String cifrado = "";
        Scanner consola = new Scanner(System.in);
        System.out.println("digite numero para cifrar: ");
        mensaje = consola.nextLine();
        
        for(int i = 0; i < mensaje.length();i++){
            int aux = mensaje.charAt(i) - '0';
            aux += 8;
            aux %= 9;
            cifrado += aux;
            
        }
        mensaje = cifrado.charAt(2) + "";
        mensaje += cifrado.charAt(3) + "";
        mensaje += cifrado.charAt(0) + "";
        mensaje += cifrado.charAt(1) + "";
        System.out.println("numero cifrado: " + mensaje);
        
        
        System.out.println("digite numero para Descifrar: ");
        mensaje1 = consola.nextLine();
        for(int i = 0; i < mensaje1.length();i++){
            int aux = mensaje1.charAt(i) - '0';
            aux -= 8;
            aux += 9;
            cifrado += aux;
            
        }
        mensaje1 = cifrado.charAt(0) + "";
        mensaje1 += cifrado.charAt(1) + "";
        mensaje1 += cifrado.charAt(2) + "";
        mensaje1 += cifrado.charAt(3) + "";
        System.out.println("numero cifrado: " + mensaje1);
       
        
    }
    
}
