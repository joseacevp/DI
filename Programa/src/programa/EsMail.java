/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author josea
 */
public class EsMail {

    public boolean esMail(String email) {
        
        boolean resultado;
        
          
          // Patrón para validar el email
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
 
        // El email a validar
       
 
        Matcher mather = pattern.matcher(email);
 
        if (mather.find() == true) {
            resultado=true;
            System.out.println("El email ingresado es válido.");
            return resultado;
        } else {
            resultado=false;
            System.out.println("El email ingresado es NO es válido.");
           
        } 
        
        
        return resultado;
    }

}
