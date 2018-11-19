/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Modelo.ModeloUsuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import Vista.VistaLogueo;
import AccesoADatos.ServicioLogin;
import Modelo.ModeloLogin;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


public class ControlLogueo implements MouseListener, ActionListener, KeyListener, WindowListener{

    private AbstractController controlador;;
    private ServicioLogin servicioLogin;
    private ModeloLogin modelo;
    private VistaLogueo vista;
    
    public ControlLogueo(ModeloLogin modelo, VistaLogueo vista){
        this.vista = vista;
        this.modelo = modelo;
        vista.setModelo(modelo);
        vista.setControlador(this);
        //servicioLogin = ServicioLogin.getServicioLogueo();
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
    public void actionPerformed(ActionEvent ae) {
        try {
            if (ae.getSource().getClass() == JButton.class) {
                JButton button = (JButton) ae.getSource();
                //instrucciones(button.getName());
            }
        } catch (Exception ex) {
            vista.mostrarMensaje(ex.getMessage());
        }

    }
    
//    public void instrucciones(String x) throws Exception {
//        try {
//            switch (x.toLowerCase()) {
//                case "ingresar": {
//                    if (vista.ftfId.getText().equals("")) {
//                        throw (new Exception("Debe ingresar un ID."));
//                    }
//                    if (vista.jtfPassword.getText().equals("")) {
//                        throw (new Exception("Debe ingresar una Contraseña."));
//                    }
//                    funcionario = servicioLogin.loginCliente(vista.ftfId.getText(), vista.jtfPassword.getText());
//                    if (funcionario == null) {
//                        throw (new Exception("¡No existe ningún funcionario con este ID: " + vista.ftfId.getText() + "!"));
//                    }
//                    instrucciones(funcionario.getPuesto());
//                    vista.mostrarMensaje("¡Bienvenido " + funcionario.getNombre() + '!');
//                }
//                break;
//               
//                case "salir": {
//                    System.exit(0);
//                }
//                break;
//                default: {}
//                break;
//            }
//        } catch (Exception ex) {
//            vista.mostrarMensaje(ex.getMessage());
//        }
//    }

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
    public void windowClosing(WindowEvent we) {
        controlador = null;
        vista = null;
    }

    @Override
    public void windowClosed(WindowEvent we) {
        controlador.cerrarVista();
        vista.setVisible(true);
    }

    @Override
    public void windowIconified(WindowEvent we) {
        
    }

    @Override
    public void windowDeiconified(WindowEvent we) {
        
    }

    @Override
    public void windowActivated(WindowEvent we) {
        
    }

    @Override
    public void windowDeactivated(WindowEvent we) {
        
    }
}
