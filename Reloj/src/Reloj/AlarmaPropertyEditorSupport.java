/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reloj;

import java.awt.Component;
import java.beans.*;
import java.util.Date;

/**
 *
 * @author josea
 */
public class AlarmaPropertyEditorSupport extends PropertyEditorSupport {

    private AlarmaPanel alarmaPanel = new AlarmaPanel();

    @Override
    public boolean supportsCustomEditor() {
        return true;

    }

    @Override
    public Component getCustomEditor() {
        return alarmaPanel;
    }

    @Override
    public String getJavaInitializationString() {
        Date horaAlarma = alarmaPanel.getSelectedValue().getHoraAlarma();
        boolean activa = alarmaPanel.getSelectedValue().isActiva();
        return "new Reloj.Alarma(new java.util.Date("+ horaAlarma.getTime()+"l)," + activa + ")";
    }
    @Override
    public Object getValue(){
        return alarmaPanel.getSelectedValue();
    }
    
}
