/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejercicio1restaurante.Odontologo.Models;

import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class paciente {
    private int id;
    private int dni;
    private String nombre;
    private String apellido;
    private LocalDate fecha;

    public paciente() {
    }

    public paciente(int id, int dni, String nombre, String apellido, LocalDate fecha) {
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha = fecha;
    }

    
        
}
