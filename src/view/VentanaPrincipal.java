/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.Constantes;
import controller.ConstantesGraficos;
import controller.Launcher;

import javax.swing.*;
import javax.swing.border.TitledBorder;

/**
 *
 * @author fernando
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
        establecerColores();
    }

    /**
     * Este metodo permite establecer los colores de la interfaz
     */
    private void establecerColores() {
        getContentPane().setBackground(Constantes.BACKGROUND_COLOR);
        label1.setBackground(Constantes.BACKGROUND_COLOR);
        panelTiempo.setBackground(Constantes.BACKGROUND_COLOR);
        panelHumedad.setBackground(Constantes.BACKGROUND_COLOR);
        btnTiempoBarras.setBackground(Constantes.RED_BUTTON_COLOR);
        btnTiempoLineas.setBackground(Constantes.RED_BUTTON_COLOR);
        btnTiempoDispersion.setBackground(Constantes.RED_BUTTON_COLOR);
        btnTiempoPuntos.setBackground(Constantes.RED_BUTTON_COLOR);
        btnHumedadBarras.setBackground(Constantes.BLUE_BUTTON_COLOR);
        btnHumedadLineas.setBackground(Constantes.BLUE_BUTTON_COLOR);
        btnHumedadPuntos.setBackground(Constantes.BLUE_BUTTON_COLOR);
        btnHumedadDispersion.setBackground(Constantes.BLUE_BUTTON_COLOR);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        panelHumedad = new javax.swing.JPanel();
        btnHumedadLineas = new javax.swing.JButton();
        btnHumedadPuntos = new javax.swing.JButton();
        btnHumedadDispersion = new javax.swing.JButton();
        btnHumedadBarras = new javax.swing.JButton();
        panelTiempo = new javax.swing.JPanel();
        btnTiempoBarras = new javax.swing.JButton();
        btnTiempoLineas = new javax.swing.JButton();
        btnTiempoDispersion = new javax.swing.JButton();
        btnTiempoPuntos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        label1.setText("Analisis del tiempo");

        btnHumedadLineas.setText("Grafico de Lineas");
        btnHumedadLineas.setFont(Constantes.BTN_FONT);
        btnHumedadLineas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHumedadLineasActionPerformed(evt);
            }
        });

        btnHumedadPuntos.setText("Grafico de puntos");
        btnHumedadPuntos.setFont(Constantes.BTN_FONT);
        btnHumedadPuntos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHumedadPuntosActionPerformed(evt);
            }
        });

        btnHumedadDispersion.setText("Grafico de dispersion");
        btnHumedadDispersion.setFont(Constantes.BTN_FONT);
        btnHumedadDispersion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHumedadDispersionActionPerformed(evt);
            }
        });

        btnHumedadBarras.setText("Grafico de barras");
        btnHumedadBarras.setFont(Constantes.BTN_FONT);
        btnHumedadBarras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHumedadBarrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelHumedadLayout = new javax.swing.GroupLayout(panelHumedad);
        panelHumedad.setLayout(panelHumedadLayout);
        panelHumedadLayout.setHorizontalGroup(
            panelHumedadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHumedadLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelHumedadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnHumedadBarras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnHumedadLineas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                    .addComponent(btnHumedadDispersion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                    .addComponent(btnHumedadPuntos, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelHumedadLayout.setVerticalGroup(
            panelHumedadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHumedadLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnHumedadBarras, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnHumedadLineas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnHumedadPuntos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnHumedadDispersion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        btnTiempoBarras.setText("Grafico de barras");
        btnTiempoBarras.setFont(Constantes.BTN_FONT);
        btnTiempoBarras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTiempoBarrasActionPerformed(evt);
            }
        });

        btnTiempoLineas.setText("Grafico de lineas");
        btnTiempoLineas.setFont(Constantes.BTN_FONT);
        btnTiempoLineas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTiempoLineasActionPerformed(evt);
            }
        });

        btnTiempoDispersion.setText("Grafico de dispersion");
        btnTiempoDispersion.setFont(Constantes.BTN_FONT);
        btnTiempoDispersion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTiempoDispersionActionPerformed(evt);
            }
        });

        btnTiempoPuntos.setText("Grafico de puntos");
        btnTiempoPuntos.setFont(Constantes.BTN_FONT);
        btnTiempoPuntos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTiempoPuntosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelTiempoLayout = new javax.swing.GroupLayout(panelTiempo);
        panelTiempo.setLayout(panelTiempoLayout);
        panelTiempoLayout.setHorizontalGroup(
            panelTiempoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTiempoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTiempoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTiempoBarras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTiempoLineas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                    .addComponent(btnTiempoDispersion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                    .addComponent(btnTiempoPuntos, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelTiempoLayout.setVerticalGroup(
            panelTiempoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTiempoLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(btnTiempoBarras, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnTiempoLineas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnTiempoPuntos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnTiempoDispersion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelHumedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelTiempo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelHumedad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelTiempo.setBorder(new TitledBorder("Temperatura"));
        panelHumedad.setBorder(new TitledBorder("Humedad"));
        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTiempoBarrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTiempoBarrasActionPerformed
        boolean resultado = Launcher.Launch(ConstantesGraficos.GRAFICO_TEMPERATURA,ConstantesGraficos.GRAFICO_DE_BARRAS);
        if(!resultado){
            JOptionPane.showMessageDialog(null,"Error al mostrar el grafico","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnTiempoBarrasActionPerformed

    private void btnTiempoLineasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTiempoLineasActionPerformed
        boolean resultado = Launcher.Launch(ConstantesGraficos.GRAFICO_TEMPERATURA,ConstantesGraficos.GRAFICO_DE_LINEAS);
        if(!resultado){
            JOptionPane.showMessageDialog(null,"Error al mostrar el grafico","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnTiempoLineasActionPerformed

    private void btnTiempoDispersionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTiempoPuntosActionPerformed
        boolean resultado = Launcher.Launch(ConstantesGraficos.GRAFICO_TEMPERATURA,ConstantesGraficos.GRAFICO_DE_DISPERION);
        if(!resultado){
            JOptionPane.showMessageDialog(null,"Error al mostrar el grafico","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnTiempoPuntosActionPerformed

    private void btnTiempoPuntosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTiempoDispersionActionPerformed
        boolean resultado = Launcher.Launch(ConstantesGraficos.GRAFICO_TEMPERATURA,ConstantesGraficos.GRAFICO_DE_PUNTOS);
        if(!resultado){
            JOptionPane.showMessageDialog(null,"Error al mostrar el grafico","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnTiempoDispersionActionPerformed

    private void btnHumedadBarrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHumedadBarrasActionPerformed
        boolean resultado = Launcher.Launch(ConstantesGraficos.GRAFICO_HUMEDAD,ConstantesGraficos.GRAFICO_DE_BARRAS);
        if(!resultado){
            JOptionPane.showMessageDialog(null,"Error al mostrar el grafico","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnHumedadBarrasActionPerformed

    private void btnHumedadLineasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHumedadLineasActionPerformed
        boolean resultado = Launcher.Launch(ConstantesGraficos.GRAFICO_HUMEDAD,ConstantesGraficos.GRAFICO_DE_LINEAS);
        if(!resultado){
            JOptionPane.showMessageDialog(null,"Error al mostrar el grafico","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnHumedadLineasActionPerformed

    private void btnHumedadPuntosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHumedadPuntosActionPerformed
        boolean resultado = Launcher.Launch(ConstantesGraficos.GRAFICO_HUMEDAD,ConstantesGraficos.GRAFICO_DE_PUNTOS);
        if(!resultado){
            JOptionPane.showMessageDialog(null,"Error al mostrar el grafico","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnHumedadPuntosActionPerformed

    private void btnHumedadDispersionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHumedadDispersionActionPerformed
        boolean resultado = Launcher.Launch(ConstantesGraficos.GRAFICO_HUMEDAD,ConstantesGraficos.GRAFICO_DE_DISPERION);
        if(!resultado){
            JOptionPane.showMessageDialog(null,"Error al mostrar el grafico","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnHumedadDispersionActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHumedadBarras;
    private javax.swing.JButton btnHumedadDispersion;
    private javax.swing.JButton btnHumedadLineas;
    private javax.swing.JButton btnHumedadPuntos;
    private javax.swing.JButton btnTiempoBarras;
    private javax.swing.JButton btnTiempoPuntos;
    private javax.swing.JButton btnTiempoLineas;
    private javax.swing.JButton btnTiempoDispersion;
    private java.awt.Label label1;
    private javax.swing.JPanel panelHumedad;
    private javax.swing.JPanel panelTiempo;
    // End of variables declaration//GEN-END:variables
}