package Reloj;

import java.beans.*;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;



import javax.swing.JLabel;

/**
 * @author josea
 */
public class RelojBeans extends JLabel implements Serializable {

    private boolean formato24;
    private Alarma alarma;

    private SimpleDateFormat sdf24h = new SimpleDateFormat("HH:mm:ss");
    private SimpleDateFormat sdf12h = new SimpleDateFormat("hh: mm:ss a");

    private AlarmaListener alarmaListener;
    
         

   public RelojBeans()
    {//constructor sin parametros
    
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
          @Override
            public void run() {
                Date horaActual = new Date();
                if (formato24) {
                    setText(sdf24h.format(horaActual));
                } else {
                    setText(sdf12h.format(horaActual));
                }
                if (alarma != null) {
                    System.out.println(horaActual);
                    System.out.println(alarma.getHoraAlarma());
                    if (alarma.isActiva() && horasCoinciden(horaActual, alarma.getHoraAlarma())) {
                        if (alarmaListener != null) {
                            alarmaListener.suenaAlarma();
                        }
                    }
                }
            }

            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }, 0, 1000);
        
    }

    public Alarma getAlarma() {
        return alarma;
    }

    public void setAlarma(Alarma alarma) {
        this.alarma = alarma;
    }

    public boolean isFormato24() {
        return formato24;
    }

    public void setFormato24(boolean formato24) {
        this.formato24 = formato24;
    }
    
    public void addAlarmaListener(AlarmaListener alarmaListener){
        this.alarmaListener = alarmaListener;
    }
    
    private boolean horasCoinciden (Date horaActual, Date horaAlarma){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(horaActual);
        int horasActual,minActual,segActual,horasAlarma, minAlarma,segAlarma;
        horasActual= calendar.get(Calendar.HOUR_OF_DAY);
        minActual=calendar.get(Calendar.MINUTE);
        segActual=calendar.get(Calendar.SECOND);
        calendar.setTime(horaAlarma);
        horasAlarma=calendar.get(Calendar.HOUR_OF_DAY);
        minAlarma=calendar.get(Calendar.MINUTE);
        segAlarma=calendar.get(Calendar.SECOND);
        if (horasActual== horasAlarma && minActual == minAlarma && segActual== segAlarma)
        return true;
        else 
        return false;
        
    }
 }
