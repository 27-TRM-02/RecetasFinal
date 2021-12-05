/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jFrames;

import java.io.File;
import javax.swing.JFileChooser;
import methods.DOMMetodos;
import methods.JAXBMetodos;
import methods.SAXMetodos;
import methods.XPATHMetodos;

/**
 *
 * @author trm
 */
public class MainWindow extends javax.swing.JFrame {

    public static File recetasFile;
    private static SAXMetodos saxMetodos = new SAXMetodos();
    private static DOMMetodos domMetodos = new DOMMetodos();
    private static JAXBMetodos jaxbMetodos = new JAXBMetodos();
    private static XPATHMetodos xpathMetodos = new XPATHMetodos();
    private static addRecetaWindow addReceta = new addRecetaWindow();

    public MainWindow() {
        initComponents();
        desactivaBotones();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        consultasButtonGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        mostrarSaxButton = new javax.swing.JButton();
        jScrollPane = new javax.swing.JScrollPane();
        textAreaDatos = new javax.swing.JTextArea();
        estadoLabel = new javax.swing.JLabel();
        nuevaRecetaButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        tipoButton = new javax.swing.JRadioButton();
        ingredienteButton = new javax.swing.JRadioButton();
        elaboracionButton = new javax.swing.JRadioButton();
        caloriasButton = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        consultaButton = new javax.swing.JButton();
        jMenuBar = new javax.swing.JMenuBar();
        MenuFicheros = new javax.swing.JMenu();
        MenuAbrirXML = new javax.swing.JMenuItem();
        MenuSaveXML = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mostrarSaxButton.setBackground(new java.awt.Color(1, 1, 1));
        mostrarSaxButton.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        mostrarSaxButton.setForeground(new java.awt.Color(254, 254, 254));
        mostrarSaxButton.setText("MOSTRAR con SAX");
        mostrarSaxButton.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        mostrarSaxButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarSaxButtonActionPerformed(evt);
            }
        });

        textAreaDatos.setColumns(20);
        textAreaDatos.setRows(5);
        jScrollPane.setViewportView(textAreaDatos);

        nuevaRecetaButton.setBackground(new java.awt.Color(1, 1, 1));
        nuevaRecetaButton.setForeground(new java.awt.Color(254, 254, 254));
        nuevaRecetaButton.setText("Nueva Receta");
        nuevaRecetaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevaRecetaButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CONSULTAS");

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("MODIFICAR");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        consultasButtonGroup.add(tipoButton);
        tipoButton.setText("Tipo");

        consultasButtonGroup.add(ingredienteButton);
        ingredienteButton.setText("Ingrediente");

        consultasButtonGroup.add(elaboracionButton);
        elaboracionButton.setText("Elaboración");

        consultasButtonGroup.add(caloriasButton);
        caloriasButton.setText("Calorias");

        jLabel5.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Buscar por:");

        consultaButton.setBackground(new java.awt.Color(1, 1, 1));
        consultaButton.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        consultaButton.setForeground(new java.awt.Color(254, 254, 254));
        consultaButton.setText("BUSCAR");
        consultaButton.setBorder(new javax.swing.border.MatteBorder(null));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(mostrarSaxButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                    .addComponent(estadoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nuevaRecetaButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ingredienteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tipoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(caloriasButton, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(elaboracionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(consultaButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nuevaRecetaButton, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(estadoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tipoButton, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ingredienteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(elaboracionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(caloriasButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(consultaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2))
                    .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mostrarSaxButton, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                .addContainerGap())
        );

        MenuFicheros.setText("Ficheros XML");

        MenuAbrirXML.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        MenuAbrirXML.setText("Abrir XML");
        MenuAbrirXML.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAbrirXMLActionPerformed(evt);
            }
        });
        MenuFicheros.add(MenuAbrirXML);

        MenuSaveXML.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        MenuSaveXML.setText("Guardar XML");
        MenuFicheros.add(MenuSaveXML);

        jMenuBar.add(MenuFicheros);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuAbrirXMLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAbrirXMLActionPerformed
        JFileChooser saveXML = new JFileChooser();
        saveXML.showSaveDialog(this);
        recetasFile = saveXML.getSelectedFile();
        int domRes = domMetodos.abrir_XML_DOM(recetasFile);
        int saxRes = saxMetodos.abrir_XML_SAX(recetasFile);
        int jaxbRes = jaxbMetodos.abrir_XML_JAXB(recetasFile);
        int xpathRes = xpathMetodos.abrir_XML_XPATH(recetasFile);
        if (saxRes == 0 && domRes == 0 && jaxbRes == 0 && xpathRes == 0) {
            estadoLabel.setText("Se ha abierto correctamente");
            // Activamos los botones
            nuevaRecetaButton.setEnabled(true);
            mostrarSaxButton.setEnabled(true);
            consultaButton.setEnabled(true);
        } else {
            estadoLabel.setText("No se ha podido abrir");
        }
    }//GEN-LAST:event_MenuAbrirXMLActionPerformed

    private void mostrarSaxButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarSaxButtonActionPerformed
       textAreaDatos.setText(saxMetodos.recorrerSAX());
    }//GEN-LAST:event_mostrarSaxButtonActionPerformed

    private void nuevaRecetaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevaRecetaButtonActionPerformed
        addReceta.setVisible(true);
    }//GEN-LAST:event_nuevaRecetaButtonActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void desactivaBotones() {
        mostrarSaxButton.setEnabled(false);
        nuevaRecetaButton.setEnabled(false);
        consultaButton.setEnabled(false);
    }

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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuAbrirXML;
    private javax.swing.JMenu MenuFicheros;
    private javax.swing.JMenuItem MenuSaveXML;
    private javax.swing.JRadioButton caloriasButton;
    private javax.swing.JButton consultaButton;
    private javax.swing.ButtonGroup consultasButtonGroup;
    private javax.swing.JRadioButton elaboracionButton;
    private javax.swing.JLabel estadoLabel;
    private javax.swing.JRadioButton ingredienteButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton mostrarSaxButton;
    private javax.swing.JButton nuevaRecetaButton;
    private javax.swing.JTextArea textAreaDatos;
    private javax.swing.JRadioButton tipoButton;
    // End of variables declaration//GEN-END:variables
}
