/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Logica.Avion;
import Vista.VistaAgregaAvion;

/**
 *
 * @author Anthony
 */
public class ModeloAgregaAvion {

    VistaAgregaAvion vistaAgregaAvion;
    public Avion getAvion() {
        String identificador = this.vistaAgregaAvion.getCampoIdentificador().getText();               
        String ruta = this.vistaAgregaAvion.getCampoRuta().getSelectedItem().toString();
        String horario = this.vistaAgregaAvion.getCampoHorario().getText();      
        String tipo = this.vistaAgregaAvion.getCampoTipo().getText(); 
        String año = this.vistaAgregaAvion.getCampoAnno().getText() ;        
        String modelo =  this.vistaAgregaAvion.getCampoModelo().getText();
        String marca  = this.vistaAgregaAvion.getCampoMarca().getText();        
        int  cantAsientos = Integer.parseInt(this.vistaAgregaAvion.getCampoCantAsientos().getText()) ;
        Avion elAvion = new Avion(identificador, ruta, horario, tipo, año, modelo, marca, cantAsientos);
        

        return elAvion;
     }
    
    public void setVista(VistaAgregaAvion vistaAgregaAvion){
        this.vistaAgregaAvion = vistaAgregaAvion;
    }
}
