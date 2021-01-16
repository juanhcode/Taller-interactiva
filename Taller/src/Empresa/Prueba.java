/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empresa;

import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author Usuario
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Objetos
        Scanner consola = new Scanner(System.in);
        System.out.println("Introduzca la cantidad de años transcurridos");
        int anio_transcurridos = consola.nextInt();
        if (anio_transcurridos > 0) {
            salarioAumentadoSecretario(anio_transcurridos);
        } else {
            System.out.println("Año incorrecto");
        }
    }

    public static void salarioAumentadoSecretario(int anio_transcurrido) {
        Secretario secretario1 = new Secretario("despacho", 4, "Emanuel", "Benjumea", "100690554", "Calle 32", "1", "3138134783", 5000, "Supervisor");
        Secretario secretario = new Secretario("Emanuel", "Benjumea", "1006490", "Calle 21", "313812312", 5000);
        secretario.incrementarSalario(calcularSalario(0.05, anio_transcurrido, secretario.getSalario()));
        secretario.imprimirDatosPersonales();// Muestra Datos personas con el puesto y salario modificado
        //secretario1.incrementarSalario(calcularSalario(0.05, anio_transcurrido, secretario.getSalario()));
        //secretario1.imprimirInformacionCompleta();// Muestra Informacion Completa y salario modificado

        Carro carro1 = new Carro("K4564", "Kia", "2021");
        Vendedor vendedor1 = new Vendedor("315340", "Tecnologia", 20, carro1, "Sebastian", "Cifuentes", "34534", "Calle 21", "1", "34343", 4000, "Juan");
        Vendedor vendedor = new Vendedor("Sebastian", "Cifuentes", "1345323", "Calle 22", "3212321", 4000, "Tecnologia");
        vendedor.incrementarSalario(calcularSalario(0.1, anio_transcurrido, vendedor.getSalario()));
        vendedor.imprimirDatosPersonales();
        //vendedor1.incrementarSalario(calcularSalario(0.1,anio_transcurrido, vendedor.getSalario()));
        //vendedor1.imprimirInformacionCOmpleta(); //Muestra Informacion Completa y salario modificado

        Carro carro = new Carro("K4G5", "Audi", "2022");  
        Vector<String> cedulas = new Vector(1, 1);
        cedulas.add(vendedor.getCc());//Se guardan las cedulas de los vendedores
        cedulas.add(vendedor1.getCc());
        for (int i = 0; i < cedulas.size(); i++) {
            System.out.println("C.C" + cedulas.get(i));
        }
        JefeDeZona jefedezona1 = new JefeDeZona("05", "1006-490", cedulas, carro, "Juan", "Hoyos", "1006490554", "Carrera 33", "1", "3124545", 7500, "Juan");
        JefeDeZona jefedezona = new JefeDeZona("Juan", "Hoyos", "1345643", "calle 21", "31232", 4503,"0550");
        //jefedezona1.incrementarSalario(calcularSalario(0.2, anio_transcurrido, jefedezona.getSalario()));
        //jefedezona1.imprimirInformacionCompleta(); //Muestra Informacion Completa y salario modificado
        jefedezona.incrementarSalario(calcularSalario(0.2, anio_transcurrido, jefedezona.getSalario()));
        jefedezona.imprimirDatosPersonales();
    }

    public static double calcularSalario(double porcentaje, int anio_transcurrido, double salario) {
        double almacena, aumento = 0;
        double resultado = 0;
        for (int i = 0; i <= anio_transcurrido; i++) {
            almacena = i * porcentaje;
            aumento = salario * almacena;
            resultado = aumento + salario;
        }
        return resultado;
    }
}
