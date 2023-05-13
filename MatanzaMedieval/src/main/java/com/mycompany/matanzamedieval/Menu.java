/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.matanzamedieval;

import Archivos.Archivos;
import Archivos.Ranking;
import Inventario.Inventario;
import Tableros.GeneracionTablero;
import Tableros.SeleccionTableros;
import Tienda.Tienda;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author carlo
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    
    private Componentes componentes;
    public Menu() {
        initComponents();
        Archivos archivos = new Archivos();
        try {
            //Se cargarán los datos anteriores si existen
            this.componentes = archivos.iniciarComponentes();
            componentes.setOro(componentes.getOro()+1000);
        } catch (IOException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnPartida = new javax.swing.JButton();
        btnTienda = new javax.swing.JButton();
        btnTablero = new javax.swing.JButton();
        btnInventario = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnRanking = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(600, 500));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPartida.setBackground(new java.awt.Color(102, 0, 0));
        btnPartida.setFont(new java.awt.Font("Dutch801 Rm BT", 0, 12)); // NOI18N
        btnPartida.setForeground(new java.awt.Color(255, 255, 255));
        btnPartida.setText("Partida");
        btnPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPartidaActionPerformed(evt);
            }
        });
        jPanel1.add(btnPartida, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 100, -1));

        btnTienda.setBackground(new java.awt.Color(102, 0, 0));
        btnTienda.setFont(new java.awt.Font("Dutch801 Rm BT", 0, 12)); // NOI18N
        btnTienda.setForeground(new java.awt.Color(255, 255, 255));
        btnTienda.setText("Tienda");
        btnTienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTiendaActionPerformed(evt);
            }
        });
        jPanel1.add(btnTienda, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 100, -1));

        btnTablero.setBackground(new java.awt.Color(102, 0, 0));
        btnTablero.setFont(new java.awt.Font("Dutch801 Rm BT", 0, 12)); // NOI18N
        btnTablero.setForeground(new java.awt.Color(255, 255, 255));
        btnTablero.setText("Tablero");
        btnTablero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTableroActionPerformed(evt);
            }
        });
        jPanel1.add(btnTablero, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 100, -1));

        btnInventario.setBackground(new java.awt.Color(102, 0, 0));
        btnInventario.setFont(new java.awt.Font("Dutch801 Rm BT", 0, 12)); // NOI18N
        btnInventario.setForeground(new java.awt.Color(255, 255, 255));
        btnInventario.setText("Inventario");
        btnInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInventarioActionPerformed(evt);
            }
        });
        jPanel1.add(btnInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 100, -1));

        btnSalir.setBackground(new java.awt.Color(102, 0, 0));
        btnSalir.setFont(new java.awt.Font("Dutch801 Rm BT", 0, 12)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 460, 100, -1));

        btnRanking.setBackground(new java.awt.Color(102, 0, 0));
        btnRanking.setFont(new java.awt.Font("Dutch801 Rm BT", 0, 12)); // NOI18N
        btnRanking.setForeground(new java.awt.Color(255, 255, 255));
        btnRanking.setText("Ranking");
        btnRanking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRankingActionPerformed(evt);
            }
        });
        jPanel1.add(btnRanking, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, 100, -1));

        lblTitulo.setFont(new java.awt.Font("Dutch801 XBd BT", 1, 36)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 0, 0));
        lblTitulo.setText("MATANZA MEDIEVAL");
        jPanel1.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, -1, -1));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.jpeg"))); // NOI18N
        jPanel1.add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTiendaActionPerformed
        Tienda tienda = new Tienda(componentes, this);
        tienda.setLocationRelativeTo(null);
        tienda.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnTiendaActionPerformed

    private void btnTableroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTableroActionPerformed
        GeneracionTablero generacionTableros = new GeneracionTablero(componentes, this);
        generacionTableros.setLocationRelativeTo(null);
        generacionTableros.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnTableroActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        Archivos archivos = new Archivos();
        archivos.guardarComponentes(componentes);
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPartidaActionPerformed
        SeleccionTableros seleccionTableros = new SeleccionTableros(componentes, this);
        seleccionTableros.setLocationRelativeTo(null);
        seleccionTableros.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnPartidaActionPerformed

    private void btnInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInventarioActionPerformed
        Inventario inventario = new Inventario(componentes, this);
        inventario.setLocationRelativeTo(null);
        inventario.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnInventarioActionPerformed

    private void btnRankingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRankingActionPerformed
        Ranking ranking = new Ranking(this);
        ranking.setLocationRelativeTo(null);
        ranking.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRankingActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInventario;
    private javax.swing.JButton btnPartida;
    private javax.swing.JButton btnRanking;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnTablero;
    private javax.swing.JButton btnTienda;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
