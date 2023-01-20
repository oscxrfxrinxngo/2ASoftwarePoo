/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.intsuperior.modelo;

import java.util.Date;

/**
 *
 * @author Dxnny
 */
public class Directivo extends Persona{
    private String categoria;
    private int idDirectivo;

    public Directivo() {
    }

    public Directivo(String categoria, int idDirectivo, String cedula, String nombre1, String nombre2, String apellido1, String apellido2, Date fechaNacimiento, String direccion, String emil, String telefono) {
        super(cedula, nombre1, nombre2, apellido1, apellido2, fechaNacimiento, direccion, emil, telefono);
        this.categoria = categoria;
        this.idDirectivo = idDirectivo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getIdDirectivo() {
        return idDirectivo;
    }

    public void setIdDirectivo(int idDirectivo) {
        this.idDirectivo = idDirectivo;
    }
    
    
    
    
}
