package aplicacion.controlador.beans.forms;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import aplicacion.modelo.dominio.Temperatura;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Usuario
 */
@ManagedBean
@ViewScoped
public class temperaturaFormBean {
    private int opcion;
    private double grado;
    private Temperatura temperatura;

    /**
     * Creates a new instance of temperaturaFormBean
     * @return 
     */
    
  public double calcularTemperatura(){
      return temperatura.calcularTemperatura(grado,opcion);
  }
    
    
    public temperaturaFormBean() {
        temperatura=new Temperatura();
    }

    public double getGrado() {
        return grado;
    }

    public void setGrado(double grado) {
        this.grado = grado;
    }

    public int getOpcion() {
        return opcion;
    }

    public void setOpcion(int opcion) {
        this.opcion = opcion;
    }
    

    public Temperatura getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Temperatura temperatura) {
        this.temperatura = temperatura;
    }
    
    
    
}
