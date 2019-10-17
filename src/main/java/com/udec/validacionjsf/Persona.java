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
    
//  @Pattern(regexp="MM/dd/yyyy")
    private Date fecha;
    
    @Pattern(regexp = "\\$?\\€?[0-9]+" ,message = "* Moneda no valida")
    private String moneda;
    
    @Size(min=1, max=10, message = "* Maximo 10 caracteres")
    private String maximo;
    
    @Pattern(regexp = "/?[0-9]+/?[0-9]+/?[0-9]+" ,message = "* Fecha invalida") 
    private String fecha2;
    
    /**
     * Constructor de la Clase Persona
     * @param nombre Variable la cual valida que no sea vacio
     * @param minimo Varable la cual valida que halla al menos 5 caracteres
     * @param email Variable la cual valida que el campo sea tipo email
     * @param mayor Variable la cual valida que el campo sea mayor a 18
     * @param entero Variable la cual valida que el campo sea tipo entero
     * @param flotante Variable la cual valida que el campo sea tipo flotante
     * @param fecha Variable la cual valida que el campo sea tipo fecha
     * @param moneda Variable la cual valida que el campo sea tipo moneda Euro o Peso
     * @param maximo Variable la cual valida que halla menos de 10 caracteres
     */
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
    
    /**
     * Get variable Nombre
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Set variable nombre
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * get variable minimo
     * @return 
     */
    public String getMinimo() {
        return minimo;
    }
    
    /**
     * set variable minimo
     * @param minimo 
     */
    public void setMinimo(String minimo) {
        this.minimo = minimo;
    }
    
    /**
     * get variable email
     * @return 
     */
    public String getEmail() {
        return email;
    }
    
    /**
     * set variable email
     * @param email 
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
    /**
     * get variable mayor
     * @return 
     */
    public int getMayor() {
        return mayor;
    }
    
    /**
     * set variable mayor
     * @param mayor 
     */
    public void setMayor(int mayor) {
        this.mayor = mayor;
    }
    
    /**
     * get variable entero
     * @return 
     */
    public int getEntero() {
        return entero;
    }
    
    /**
     * set variable entero
     * @param entero 
     */
    public void setEntero(int entero) {
        this.entero = entero;
    }
    
    /**
     * get variable flotante
     * @return 
     */
    public double getFlotante() {
        return flotante;
    }
    
    /**
     * set variable flotante
     * @param flotante 
     */
    public void setFlotante(double flotante) {
        this.flotante = flotante;
    }
    
    /**
     * get variable fecha
     * @return 
     */
    public Date getFecha() {
        return fecha;
    }
    
    /**
     * set variable fecha
     * @param fecha 
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    /**
     * get variable moneda
     * @return 
     */
    public String getMoneda() {
        return moneda;
    }
    
    /**
     * set variable moneda
     * @param moneda 
     */
    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }
    
    /**
     * get variable maximo
     * @return 
     */
    public String getMaximo() {
        return maximo;
    }
    
    /**
     * set variable maximo
     * @param maximo 
     */
    public void setMaximo(String maximo) {
        this.maximo = maximo;
    }
    
    /**
     * gett variable fecha2
     * @return 
     */
    public String getFecha2() {
        return fecha2;
    }
    
    /**
     * set variable fecha2
     * @param fecha2 
     */
    public void setFecha2(String fecha2) {
        this.fecha2 = fecha2;
    }
    
    /**
     * Contructor vacio clase Persona
     */
    public Persona() {
    }
    
    
    
}
