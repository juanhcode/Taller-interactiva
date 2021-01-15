/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empresa;

/**
 *
 * @author Asus
 */
public class jefedezona extends Empleado {
    private String codigo_oficina;
    private String cc_secretario ;
    private int lista;

    public jefedezona(String codigo_oficina, String cc_secretario, int lista, String nombre, String apellido, String cc, String direccion, String anios_antiguedad, String telefono, int salario, String supervisor) {
        super(nombre, apellido, cc, direccion, anios_antiguedad, telefono, salario, supervisor);
        this.codigo_oficina = codigo_oficina;
        this.cc_secretario = cc_secretario;
        this.lista = lista;
    }

    public String getCodigo_oficina() {
        return codigo_oficina;
    }

    public void setCodigo_oficina(String codigo_oficina) {
        this.codigo_oficina = codigo_oficina;
    }

    public String getCc_secretario() {
        return cc_secretario;
    }

    public void setCc_secretario(String cc_secretario) {
        this.cc_secretario = cc_secretario;
    }

    public int getLista() {
        return lista;
    }

    public void setLista(int lista) {
        this.lista = lista;
    }
    
            
    
    
}
