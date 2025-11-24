/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Secundarios;

/**
 *
 * @author Alvaro
 */
public class Medicamento {
    private String nombre, marca;
    private int frecuencia, duracion;
    private double dosis;

    public Medicamento(String nombre, String marca, int frecuencia, int duracion, double dosis) {
        this.nombre = nombre;
        this.marca = marca;
        this.frecuencia = frecuencia;
        this.duracion = duracion;
        this.dosis = dosis;
    }

    public String getNombre() {
        return nombre;
    }
    
    
}
