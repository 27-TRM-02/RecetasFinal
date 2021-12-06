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
    public static SAXMetodos saxMetodos = new SAXMetodos();
    public static DOMMetodos domMetodos = new DOMMetodos();
    public static JAXBMetodos jaxbMetodos = new JAXBMetodos();
    public static XPATHMetodos xpathMetodos = new XPATHMetodos();
    public static addRecetaWindow addReceta = new addRecetaWindow();

    public MainWindow() {
        initComponents();
        desactivaBotones();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        consultasButtonGroup = new javax.swing.ButtonGroup();
        modificarButtonGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        mostrarSaxButton = new javax.swing.JButton();
        jScrollPane = new javax.swing.JScrollPane();
        textAreaDatos = new javax.swing.JTextArea();
        estadoLabel = new javax.swing.JLabel();
        nuevaRecetaButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        consultaText = new javax.swing.JTextField();
        nombreButton = new javax.swing.JRadioButton();
        elaboracionButton = new javax.swing.JRadioButton();
        tipoButton = new javax.swing.JRadioButton();
        caloriasButton = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        consultaButton = new javax.swing.JButton();
        nuevoText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        idText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        nombreModButton = new javax.swing.JRadioButton();
        tipoModButton = new javax.swing.JRadioButton();
        tiempoModButton = new javax.swing.JRadioButton();
        dificultadModButton = new javax.swing.JRadioButton();
        modificarButton = new javax.swing.JButton();
        jMenuBar = new javax.swing.JMenuBar();
        MenuFicheros = new javax.swing.JMenu();
        MenuAbrirXML = new javax.swing.JMenuItem();
        MenuSaveXML = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setDoubleBuffered(false);
        jPanel1.setFocusable(false);
        jPanel1.setOpaque(false);
        jPanel1.setRequestFocusEnabled(false);
        jPanel1.setVerifyInputWhenFocusTarget(false);

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

        estadoLabel.setFont(new java.awt.Font("Ubuntu", 2, 14)); // NOI18N
        estadoLabel.setText("SELECCIONA FICHERO XML");

        nuevaRecetaButton.setBackground(new java.awt.Color(1, 1, 1));
        nuevaRecetaButton.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
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

        consultaText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaTextActionPerformed(evt);
            }
        });

        consultasButtonGroup.add(nombreButton);
        nombreButton.setText("Por Nombre");

        consultasButtonGroup.add(elaboracionButton);
        elaboracionButton.setText("Por Elaboración");

        consultasButtonGroup.add(tipoButton);
        tipoButton.setText("Por Tipo");

        consultasButtonGroup.add(caloriasButton);
        caloriasButton.setText("Por Calorias");

        jLabel5.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Buscar por:");

        consultaButton.setBackground(new java.awt.Color(1, 1, 1));
        consultaButton.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        consultaButton.setForeground(new java.awt.Color(254, 254, 254));
        consultaButton.setText("BUSCAR");
        consultaButton.setBorder(new javax.swing.border.MatteBorder(null));
        consultaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel3.setText("NUEVO:");

        jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel4.setText("ID:");

        modificarButtonGroup.add(nombreModButton);
        nombreModButton.setText("Cambiar NOMBRE por su ID");
        nombreModButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreModButtonActionPerformed(evt);
            }
        });

        modificarButtonGroup.add(tipoModButton);
        tipoModButton.setText("Cambiar TIPO por su ID");

        modificarButtonGroup.add(tiempoModButton);
        tiempoModButton.setText("Cambiar TIEMPO por ID ");

        modificarButtonGroup.add(dificultadModButton);
        dificultadModButton.setText("Cambiar DIFICULTAD por su ID");

        modificarButton.setBackground(new java.awt.Color(1, 1, 1));
        modificarButton.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        modificarButton.setForeground(new java.awt.Color(254, 254, 254));
        modificarButton.setText("MODIFICAR");
        modificarButton.setBorder(new javax.swing.border.MatteBorder(null));
        modificarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                    .addComponent(mostrarSaxButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(estadoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nuevaRecetaButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(elaboracionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombreButton, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(caloriasButton, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tipoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(consultaButton, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                            .addComponent(consultaText)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dificultadModButton)
                            .addComponent(tipoModButton))
                        .addGap(18, 18, 18)
                        .addComponent(modificarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(nombreModButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tiempoModButton)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(idText, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nuevoText, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(mostrarSaxButton, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nombreButton, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(elaboracionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(consultaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tipoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(caloriasButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(consultaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nuevoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tiempoModButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombreModButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(tipoModButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dificultadModButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(modificarButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(18, Short.MAX_VALUE))
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
        MenuSaveXML.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuSaveXMLActionPerformed(evt);
            }
        });
        MenuFicheros.add(MenuSaveXML);

        jMenuBar.add(MenuFicheros);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            modificarButton.setEnabled(true);
            MenuSaveXML.setVisible(true);
        } else {
            estadoLabel.setText("No se ha podido abrir");
        }
    }//GEN-LAST:event_MenuAbrirXMLActionPerformed

    public static int abrirDatos() {
        try {
            domMetodos.abrir_XML_DOM(recetasFile);
            xpathMetodos.abrir_XML_XPATH(recetasFile);
            saxMetodos.abrir_XML_SAX(recetasFile);
            jaxbMetodos.abrir_XML_JAXB(recetasFile);
            return 0;
        } catch (Exception e) {
            return -1;
        }
    }

    private void mostrarSaxButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarSaxButtonActionPerformed
        textAreaDatos.setText(saxMetodos.recorrerSAX());
    }//GEN-LAST:event_mostrarSaxButtonActionPerformed

    private void nuevaRecetaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevaRecetaButtonActionPerformed
        addReceta.setVisible(true);
    }//GEN-LAST:event_nuevaRecetaButtonActionPerformed

    private void consultaTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_consultaTextActionPerformed

    private void consultaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaButtonActionPerformed
        // TODO add your handling code here:
        if (nombreButton.isSelected()) {
            textAreaDatos.setText(xpathMetodos.consultaNombre(consultaText.getText()));
        } else if (tipoButton.isSelected()) {
            textAreaDatos.setText(xpathMetodos.consultaTipo(consultaText.getText()));
        } else if (elaboracionButton.isSelected()) {
            textAreaDatos.setText(xpathMetodos.consultaElaboracion(consultaText.getText()));
        } else if (caloriasButton.isSelected()) {
            textAreaDatos.setText(xpathMetodos.consultaCalorias(consultaText.getText()));
        }
    }//GEN-LAST:event_consultaButtonActionPerformed

    private void nombreModButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreModButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreModButtonActionPerformed

    private void modificarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarButtonActionPerformed
        // TODO add your handling code here:
        String id = idText.getText();
        String nuevo = nuevoText.getText();
        if (nombreModButton.isSelected()) {
            jaxbMetodos.cambiarNombre(id, nuevo);
        } else if (tipoModButton.isSelected()) {
            jaxbMetodos.cambiarTipo(id, nuevo);
        } else if (dificultadModButton.isSelected()) {
            jaxbMetodos.cambiarDificultad(id, nuevo);
        } else if (tiempoModButton.isSelected()) {
            jaxbMetodos.cambiarTiempo(id, nuevo);
        }
        jaxbMetodos.guardarToXML(recetasFile);

        domMetodos.abrir_XML_DOM(recetasFile);
        saxMetodos.abrir_XML_SAX(recetasFile);
        xpathMetodos.abrir_XML_XPATH(recetasFile);
        jaxbMetodos.abrir_XML_JAXB(recetasFile);

        textAreaDatos.setText(saxMetodos.recorrerSAX());
    }//GEN-LAST:event_modificarButtonActionPerformed

    private void MenuSaveXMLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuSaveXMLActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.showSaveDialog(this);
        int res = jaxbMetodos.guardarToXML(fileChooser.getSelectedFile());
        if (res == 0) {
            recetasFile = fileChooser.getSelectedFile();
            estadoLabel.setText("Se ha guardado correctamente");
        } else if (res == -1) {
            estadoLabel.setText("No se ha podido guardar");
        }
    }//GEN-LAST:event_MenuSaveXMLActionPerformed

    private void desactivaBotones() {
        mostrarSaxButton.setEnabled(false);
        nuevaRecetaButton.setEnabled(false);
        consultaButton.setEnabled(false);
        modificarButton.setEnabled(false);
        MenuSaveXML.setVisible(false);
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
    private javax.swing.JTextField consultaText;
    private javax.swing.ButtonGroup consultasButtonGroup;
    private javax.swing.JRadioButton dificultadModButton;
    private javax.swing.JRadioButton elaboracionButton;
    private javax.swing.JLabel estadoLabel;
    private javax.swing.JTextField idText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JButton modificarButton;
    private javax.swing.ButtonGroup modificarButtonGroup;
    private javax.swing.JButton mostrarSaxButton;
    private javax.swing.JRadioButton nombreButton;
    private javax.swing.JRadioButton nombreModButton;
    private javax.swing.JButton nuevaRecetaButton;
    private javax.swing.JTextField nuevoText;
    private javax.swing.JTextArea textAreaDatos;
    private javax.swing.JRadioButton tiempoModButton;
    private javax.swing.JRadioButton tipoButton;
    private javax.swing.JRadioButton tipoModButton;
    // End of variables declaration//GEN-END:variables
}
