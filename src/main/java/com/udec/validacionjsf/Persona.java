/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.validacionjsf;

import java.io.Serializable;
import java.util.Date;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.validation.Validator;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
/**
 *
 * @author SuperUs
 */
@Named(value = "persona")
@Dependent
public class Persona implements Serializable{
    
    @NotNull
    @Size(min=1, max=2000, message = "* No puede ser nulo")
    private String nombre;
    @Size(min=5, max=2000, message = "* Minimo 5 caracteres")
    private String minimo;
    @Pattern(regexp = "[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-zA-Z0-9]+", message = "* Correo no Valido")
    private String email;
    @Min(18)
    private int mayor;
    @Digits(integer=10, fraction=0, message = "* Solo numeros Enteros")
    private int entero;
    @Digits(integer=10, fraction=2, message = "* Solo numeros Enteros")
    private double flotante;
    @Pattern(regexp="MM/dd/yyyy")
    private Date fecha;
    @Pattern(regexp = "\\$?\\€?[0-9]+" ,message = "* Moneda no valida")
    private String moneda;
    @Size(min=1, max=10, message = "* Maximo 10 caracteres")
    private String maximo;

    public Persona(String nombre, String minimo, String email, int mayor, int entero, double flotante, Date fecha, String moneda, String maximo) {
        this.nombre = nombre;
        this.minimo = minimo;
        this.email = email;
        this.mayor = mayor;
        this.entero = entero;
        this.flotante = flotante;
        this.fecha = fecha;
        this.moneda = moneda;
        this.maximo = maximo;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMinimo() {
        return minimo;
    }

    public void setMinimo(String minimo) {
        this.minimo = minimo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getMayor() {
        return mayor;
    }

    public void setMayor(int mayor) {
        this.mayor = mayor;
    }

    public int getEntero() {
        return entero;
    }

    public void setEntero(int entero) {
        this.entero = entero;
    }

    public double getFlotante() {
        return flotante;
    }

    public void setFlotante(double flotante) {
        this.flotante = flotante;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public String getMaximo() {
        return maximo;
    }

    public void setMaximo(String maximo) {
        this.maximo = maximo;
    }
    
    public Persona() {
    }
    
    
    
}
