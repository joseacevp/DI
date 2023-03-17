/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa;

/**
 *
 * @author josea
 */
public class EsNumero {

    public boolean esNumero(String numero) {

        boolean resultado;

        resultado = (numero != null && numero.matches("[0-9]+"));
       // System.out.println(resultado);
        //System.out.println(numero);

        return resultado;
    }
}
