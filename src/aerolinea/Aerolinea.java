/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aerolinea;

import Control.ControlSeccionPublica;
import Modelo.ModeloSeccionPublica;
import Vista.VistaSeccionPublica;

/**
 *
 * @author Fernando
 */
public class Aerolinea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        VistaSeccionPublica vistaSeccionPublica = new VistaSeccionPublica();
        ModeloSeccionPublica modeloSeccionPublica = new ModeloSeccionPublica();
        ControlSeccionPublica controlSeccionPublica = new ControlSeccionPublica(vistaSeccionPublica /*, modeloSeccionPublica*/);
        
        vistaSeccionPublica.setVisible(true);
                
    }
    
}
