/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reloj;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author josea
 */
public class Alarma implements Serializable
{

    private Date horaAlarma;
    private boolean activa;

    public Alarma(Date horaActual, boolean activa) {
        this.horaAlarma = horaActual;
        this.activa = activa;
    }

    public Date getHoraAlarma() {
        return horaAlarma;
    }

    public void setHoraAlarma(Date horaActual) {
        this.horaAlarma = horaActual;
    }

    public boolean isActiva() {
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }
    
}
