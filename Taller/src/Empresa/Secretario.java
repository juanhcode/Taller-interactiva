/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empresa;

import Empresa.Empleado;

/**
 *
 * @author Asus
 */
public class Secretario extends Empleado {

    private String despacho;
    private int numero_fax;

    public Secretario(String despacho, int numero_fax, String nombre, String apellido, String cc, String direccion,
            String anios_antiguedad, String telefono, int salario, String supervisor) 
    {
        super(nombre, apellido, cc, direccion, anios_antiguedad, telefono, salario, supervisor);
        this.despacho = despacho;
        this.numero_fax = numero_fax;
    }

    public String getDespacho() {
        return despacho;
    }

    public void setDespacho(String despacho) {
        this.despacho = despacho;
    }

    public int getNumero_fax() {
        return numero_fax;
    }

    public void setNumero_fax(int numero_fax) {
        this.numero_fax = numero_fax;
    }

}
