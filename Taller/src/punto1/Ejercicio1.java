package punto1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        String mensaje;
        String cifrado = "";
        Scanner consola = new Scanner(System.in);
        System.out.println("digite numero para cifrar: ");
        mensaje = consola.nextLine();

        for (int i = 0; i < mensaje.length(); i++) {
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

        String mensaje2;
        String decifrado2 = "";
        Scanner consola2 = new Scanner(System.in);
        System.out.println("digite numero para decifrar: ");
        mensaje2 = consola2.nextLine();

        for (int i = 0; i < mensaje2.length(); i++) {
            int aux2 = mensaje2.charAt(i) - '0';

            int suma = aux2 + 8;
            int decodificado = aux2 + 9;
            int residuo = aux2 % 9;
            int decodificado2 = residuo + decodificado - suma;

            decifrado2 += String.valueOf(decodificado2);

        }

        mensaje2 = decifrado2.charAt(2) + "";
        mensaje2 += decifrado2.charAt(3) + "";
        mensaje2 += decifrado2.charAt(0) + "";
        mensaje2 += decifrado2.charAt(1) + "";
        System.out.println("numero decifrado: " + mensaje2);

    }

}
