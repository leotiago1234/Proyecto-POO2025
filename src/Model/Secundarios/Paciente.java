/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Secundarios;

/**
 *
 * @author Alvaro
 */
public class Paciente {
    private String dni, Nombres, Apellidos, fechaNacimiento, Sexo, telefono, contactoEmergancia; 

    public Paciente(String dni, String Nombres, String Apellidos, String fechaNacimiento, String Sexo, String telefono, String contactoEmergancia) {
        this.dni = dni;
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.Sexo = Sexo;
        this.telefono = telefono;
        this.contactoEmergancia = contactoEmergancia;
    }
    
    @Override
    public String toString() {
    return getNombres() + " - " + getDni();
    }

    public String getDni() {
        return dni;
    }

    public String getNombres() {
        return Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getSexo() {
        return Sexo;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getContactoEmergancia() {
        return contactoEmergancia;
    }

}
