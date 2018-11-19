/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import AccesoADatos.GlobalException;
import AccesoADatos.NoDataException;
import AccesoADatos.ServicioAvion;
import Modelo.ModeloAgregaAvion;
import Vista.VistaAgregaAvion;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;

/**
 *
 * @author Fernando
 */
public class ControlAgregaAvion extends AbstractController {

    public ControlAgregaAvion(ModeloAgregaAvion modeloAgregaAvion, VistaAgregaAvion vistaAgregaAvion) {
        this.modeloAgregaAvion = modeloAgregaAvion;
        this.vistaAgregaAvion = vistaAgregaAvion;
        this.vistaAgregaAvion.setController(this);
        this.modeloAgregaAvion.setVista(vistaAgregaAvion);
    }

    ModeloAgregaAvion modeloAgregaAvion;
    VistaAgregaAvion vistaAgregaAvion;
    
 
    @Override
    public void actionPerformed(ActionEvent e) {
              
        JButton btn = (JButton)e.getSource();
        
        if(btn.getText().equalsIgnoreCase("Guardar")) {
            ServicioAvion servicioAvion = new ServicioAvion();
            try {
                servicioAvion.insertarAvion(modeloAgregaAvion.getAvion());
            } catch (GlobalException ex) {
                Logger.getLogger(ControlAgregaAvion.class.getName()).log(Level.SEVERE, null, ex);
            } catch (NoDataException ex) {
                Logger.getLogger(ControlAgregaAvion.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        }
        
     }

    @Override
    public void mouseClicked(MouseEvent e) {
     }

    @Override
    public void mousePressed(MouseEvent e) {
     }

    @Override
    public void mouseReleased(MouseEvent e) {
     }

    @Override
    public void mouseEntered(MouseEvent e) {
     }

    @Override
    public void mouseExited(MouseEvent e) {
     }

    @Override
    public void keyTyped(KeyEvent e) {
     }

    @Override
    public void keyPressed(KeyEvent e) {
     }

    @Override
    public void keyReleased(KeyEvent e) {
     }

    @Override
    public void windowOpened(WindowEvent we) {
     }

    @Override
    public void windowDeactivated(WindowEvent we) {
     }

    @Override
    public void windowActivated(WindowEvent we) {
     }

    @Override
    public void windowDeiconified(WindowEvent we) {
     }

    @Override
    public void windowIconified(WindowEvent we) {
     }

    @Override
    public void windowClosed(WindowEvent we) {
     }

    @Override
    public void windowClosing(WindowEvent we) {
     }

    @Override
    public void mostrarVista() {
     }

    @Override
    public void ocultarVista() {
     }

    @Override
    public void cerrarVista() {
     }
    
}
