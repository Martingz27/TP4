/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.dominio;

import java.io.Serializable;

/**
 *
 * @author Usuario
 */
public class Temperatura implements Serializable {
 
    
    public double calcularTemperatura(double grado, int opcion){
        double c=0;
       if (opcion==1){
       c=grado;
       }
       else{
           if (opcion==2){
           c=grado+ 273.15;
           }
           else{
                if(opcion==3){
                    c=(grado* 1.8)+32;
                }
                              
           }
       }
        return c;
    }
}
