/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Modelo.ModeloAgregarUsuario;
import Vista.VistaAgregaUsuario;
import Vista.VistaSeccionPublica;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;
import javax.swing.JButton;

/**
 *
 * @author Fernando
 */
public class ControlAgregaUsuario  extends AbstractController{

    ModeloAgregarUsuario modeloAgregarUsuario;
    VistaAgregaUsuario vistaAgregaUsuario;
    
    ControlAgregaUsuario(ModeloAgregarUsuario modeloAgregarUsuario, VistaAgregaUsuario vistaAgregaUsuario) {
        this.modeloAgregarUsuario = modeloAgregarUsuario;
        this.vistaAgregaUsuario = vistaAgregaUsuario;
        this.vistaAgregaUsuario.setController(this);
    }
    
    
    VistaSeccionPublica vistaPublica;
    //ControlSeccionPublica controlSeccionPublica;
    

    @Override
    public void actionPerformed(ActionEvent e) {
        
        JButton btn = (JButton)e.getSource();
        
//        if(btn.getText().equalsIgnoreCase("btnGuardar")) {
//            
//        }
        
        if(btn.getText().equalsIgnoreCase("btnCancelar")) {
            vistaPublica = new VistaSeccionPublica();
            ControlSeccionPublica controlSeccionPublica = new ControlSeccionPublica(vistaPublica);
            vistaAgregaUsuario.setVisible(false);
            vistaPublica.setVisible(true);        
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
