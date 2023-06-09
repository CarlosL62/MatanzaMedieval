/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Tableros;

import Archivos.Archivos;
import com.mycompany.matanzamedieval.Componentes;
import com.mycompany.matanzamedieval.Menu;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author carlo
 */
public class GeneracionTablero extends javax.swing.JFrame {

    /**
     * Creates new form GeneracionTablero
     */
    
    private Componentes componentes;
    private Menu menu;
    public GeneracionTablero(Componentes componentes, Menu menu) {
        this.componentes = componentes;
        this.menu = menu;
        initComponents();
        txtAreaTextoTablero.setVisible(false);
        btnGuardarTablero.setVisible(false);
    }

    private GeneracionTablero() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
        btnGuardarTablero = new javax.swing.JButton();
        txtAreaTextoTablero = new javax.swing.JTextArea();
        pnlCreacion = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnCargarArchivo = new javax.swing.JButton();
        btnCrearTablero = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setSize(new java.awt.Dimension(600, 500));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnGuardarTablero.setText("Guardar Tablero");
        btnGuardarTablero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarTableroActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardarTablero, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 410, -1, -1));

        txtAreaTextoTablero.setColumns(20);
        txtAreaTextoTablero.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtAreaTextoTablero.setRows(5);
        txtAreaTextoTablero.setText("tablero id\ndimension 4X4\n~,T,~,T\n~,T,~,#\n~,T,~,#\n-,-,-,-");
        jPanel1.add(txtAreaTextoTablero, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 400, 400));

        jLabel1.setFont(new java.awt.Font("Dutch801 XBd BT", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("TABLEROS");

        btnCargarArchivo.setText("Cargar archivo");
        btnCargarArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarArchivoActionPerformed(evt);
            }
        });

        btnCrearTablero.setText("Crear tablero");
        btnCrearTablero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearTableroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCreacionLayout = new javax.swing.GroupLayout(pnlCreacion);
        pnlCreacion.setLayout(pnlCreacionLayout);
        pnlCreacionLayout.setHorizontalGroup(
            pnlCreacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCreacionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCreacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCargarArchivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCrearTablero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlCreacionLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlCreacionLayout.setVerticalGroup(
            pnlCreacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCreacionLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(btnCargarArchivo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCrearTablero)
                .addContainerGap(131, Short.MAX_VALUE))
        );

        jPanel1.add(pnlCreacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 150, 330));

        btnRegresar.setBackground(new java.awt.Color(102, 0, 0));
        btnRegresar.setFont(new java.awt.Font("Dutch801 XBd BT", 0, 14)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 460, 120, -1));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.jpeg"))); // NOI18N
        jPanel1.add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCargarArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarArchivoActionPerformed

        JFileChooser jFileChooser = new JFileChooser();
        FileNameExtensionFilter filtrado = new FileNameExtensionFilter("*TXT, TH", "txt", "th");
        jFileChooser.setFileFilter(filtrado);
        String ruta;
        int respuesta = jFileChooser.showOpenDialog(this);
        if (respuesta == JFileChooser.APPROVE_OPTION) {
            ruta = jFileChooser.getSelectedFile().getPath();

            System.out.println(ruta);
            Archivos archivoTablero = new Archivos();
            archivoTablero.iniciarArchivo(ruta, componentes);
            System.out.println(componentes.getTablerosCargados().obtenerSize());
            //tablerosGuardados.añadirTablero(archivoTablero);
            JOptionPane.showMessageDialog(this, "Archivo guardado con éxito", "Archivo guardado", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnCargarArchivoActionPerformed

    private void btnCrearTableroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearTableroActionPerformed
        txtAreaTextoTablero.setVisible(true);
        btnGuardarTablero.setVisible(true);
    }//GEN-LAST:event_btnCrearTableroActionPerformed

    private void btnGuardarTableroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarTableroActionPerformed

        String texto = txtAreaTextoTablero.getText();
        txtAreaTextoTablero.setVisible(true);
        System.out.println(texto);

        // Se crea un nuevo archivo y se inicia
        Archivos archivoTablero = new Archivos();
        archivoTablero.crearArchivo(texto, componentes);
        
        //tablerosGuardados.añadirTablero(archivoTablero);
        JOptionPane.showMessageDialog(this, "Archivo guardado con éxito", "Archivo guardado", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnGuardarTableroActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed

        menu.setLocationRelativeTo(null);
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

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
            java.util.logging.Logger.getLogger(GeneracionTablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GeneracionTablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GeneracionTablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GeneracionTablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GeneracionTablero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCargarArchivo;
    private javax.swing.JButton btnCrearTablero;
    private javax.swing.JButton btnGuardarTablero;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JPanel pnlCreacion;
    private javax.swing.JTextArea txtAreaTextoTablero;
    // End of variables declaration//GEN-END:variables
}
