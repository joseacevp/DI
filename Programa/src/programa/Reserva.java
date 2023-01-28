/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programa;

import java.util.Date;

/**
 *
 * @author josea
 */
public class Reserva {

    private String nombre;
    private String telefono;
    private Date fecha;
    private String t_evento;
    private String t_comida;
    private boolean cheff;
    private int asistentes;
    private int jornadas;
    private int habitaciones;
    private String email;

    public Reserva() {
    }

    public Reserva(String nombre, String telefono, Date fecha, String t_evento, String t_comida, boolean cheff, int asistentes, int jornadas, int habitaciones, String email) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.fecha = fecha;
        this.t_evento = t_evento;
        this.t_comida = t_comida;
        this.cheff = cheff;
        this.asistentes = asistentes;
        this.jornadas = jornadas;
        this.habitaciones = habitaciones;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Reserva{" + "nombre=" + nombre 
                + ", telefono=" + telefono 
                + ", email=" + email 
                + ", fecha=" + fecha 
                + ", t_evento=" + t_evento 
                + ", t_comida=" + t_comida 
                + ", cheff=" + cheff 
                + ", asistentes=" + asistentes
                + ", jornadas=" + jornadas 
                + ", habitaciones=" + habitaciones
                + '}';
    }

   
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getT_evento() {
        return t_evento;
    }

    public void setT_evento(String t_evento) {
        this.t_evento = t_evento;
    }

    public String getT_comida() {
        return t_comida;
    }

    public void setT_comida(String t_comida) {
        this.t_comida = t_comida;
    }

    public boolean isCheff() {
        return cheff;
    }

    public void setCheff(boolean cheff) {
        this.cheff = cheff;
    }

    public int getAsistentes() {
        return asistentes;
    }

    public void setAsistentes(int asistentes) {
        this.asistentes = asistentes;
    }

    public int getJornadas() {
        return jornadas;
    }

    public void setJornadas(int jornadas) {
        this.jornadas = jornadas;
    }

    public int getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(int habitaciones) {
        this.habitaciones = habitaciones;
    }

   
    
}
