/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Control.ControlSeccionPublica;
import java.awt.event.ActionListener;

/**
 *
 * @author Fernando
 */
public class VistaSeccionPublica extends javax.swing.JFrame {

    /**
     * Creates new form SeccionPublic
     */
    public VistaSeccionPublica() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        btnBuscarVuelos = new javax.swing.JButton();
        btnCrearCuenta = new javax.swing.JButton();
        btnRegistrarse = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(850, 530));
        getContentPane().setLayout(null);

        btnBuscarVuelos.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btnBuscarVuelos.setText("Buscar Vuelos");
        btnBuscarVuelos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarVuelosActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscarVuelos);
        btnBuscarVuelos.setBounds(27, 21, 160, 31);

        btnCrearCuenta.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btnCrearCuenta.setText("Crear Cuenta");
        getContentPane().add(btnCrearCuenta);
        btnCrearCuenta.setBounds(514, 30, 160, 31);

        btnRegistrarse.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btnRegistrarse.setText("Registrarse");
        getContentPane().add(btnRegistrarse);
        btnRegistrarse.setBounds(680, 30, 130, 31);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/las-sorprendentes-razones-por-las-que-los-aviones-son-blancos.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 840, 470);

        jMenu1.setText("Páginas Informativas");

        jMenuItem3.setText("Referencias Institucionales");
        jMenu1.add(jMenuItem3);

        jMenuItem2.setText("Historia de la Empresa");
        jMenu1.add(jMenuItem2);

        jMenuItem4.setText("Contactenos");
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ayuda");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Salir");
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarVuelosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarVuelosActionPerformed
 
    }//GEN-LAST:event_btnBuscarVuelosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaSeccionPublica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaSeccionPublica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaSeccionPublica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaSeccionPublica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaSeccionPublica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarVuelos;
    private javax.swing.JButton btnCrearCuenta;
    private javax.swing.JButton btnRegistrarse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    // End of variables declaration//GEN-END:variables


    ControlSeccionPublica controlador;

    public void setControlador(ControlSeccionPublica aThis) {
        this.controlador = aThis;
        btnCrearCuenta.addActionListener(aThis);
        btnRegistrarse.addActionListener(aThis);
        btnBuscarVuelos.addActionListener(aThis);
    }

    
    
}
