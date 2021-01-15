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
        String mensaje;
        String cifrado = "";
        Scanner consola = new Scanner(System.in);
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
        System.out.println("codigo encriptado: " + mensaje);
        
        for(int i = 0; i < mensaje.length();i++){
            int aux = mensaje.charAt(i) - '0';
            aux += 8;
            aux %= 9;
            cifrado += aux;
            
        }
    }
    
}
