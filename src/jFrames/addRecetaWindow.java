
package jFrames;

import methods.DOMMetodos;

/**
 *
 * @author trm
 */
public class addRecetaWindow extends javax.swing.JFrame {

    static DOMMetodos domMetodos = new DOMMetodos();
    static MainWindow vPrincipal = new MainWindow();
    
    public addRecetaWindow() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        ing2Text = new javax.swing.JTextPane();
        ing8Label = new javax.swing.JLabel();
        jScrollPane23 = new javax.swing.JScrollPane();
        ing8Text = new javax.swing.JTextPane();
        cant8 = new javax.swing.JLabel();
        jScrollPane24 = new javax.swing.JScrollPane();
        cant8Text = new javax.swing.JTextPane();
        ing9Label = new javax.swing.JLabel();
        cant2 = new javax.swing.JLabel();
        jScrollPane25 = new javax.swing.JScrollPane();
        ing9Text = new javax.swing.JTextPane();
        jScrollPane12 = new javax.swing.JScrollPane();
        cant2Text = new javax.swing.JTextPane();
        ing5Label = new javax.swing.JLabel();
        ing3Label = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        ing3Text = new javax.swing.JTextPane();
        cant3 = new javax.swing.JLabel();
        jScrollPane14 = new javax.swing.JScrollPane();
        cant3Text = new javax.swing.JTextPane();
        jLabel4 = new javax.swing.JLabel();
        ing6Label = new javax.swing.JLabel();
        ing4Label = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        dificultadText = new javax.swing.JTextPane();
        jScrollPane19 = new javax.swing.JScrollPane();
        ing6Text = new javax.swing.JTextPane();
        jScrollPane17 = new javax.swing.JScrollPane();
        ing5Text = new javax.swing.JTextPane();
        cant9 = new javax.swing.JLabel();
        cant5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane18 = new javax.swing.JScrollPane();
        cant5Text = new javax.swing.JTextPane();
        jLabel3 = new javax.swing.JLabel();
        addRecetaButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        caloriasText = new javax.swing.JTextPane();
        scrollPane9 = new javax.swing.JScrollPane();
        cant9Text = new javax.swing.JTextPane();
        cant6 = new javax.swing.JLabel();
        jScrollPane20 = new javax.swing.JScrollPane();
        cant6Text = new javax.swing.JTextPane();
        jLabel6 = new javax.swing.JLabel();
        ing7Label = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tiempoText = new javax.swing.JTextPane();
        jScrollPane21 = new javax.swing.JScrollPane();
        ing7Text = new javax.swing.JTextPane();
        jLabel7 = new javax.swing.JLabel();
        cant7 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        elaboracionText = new javax.swing.JTextPane();
        jScrollPane22 = new javax.swing.JScrollPane();
        cant7Text = new javax.swing.JTextPane();
        jScrollPane15 = new javax.swing.JScrollPane();
        ing4Text = new javax.swing.JTextPane();
        cant4 = new javax.swing.JLabel();
        jScrollPane16 = new javax.swing.JScrollPane();
        cant4Text = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        nombreText = new javax.swing.JTextPane();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        ing1Text = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        tipoText = new javax.swing.JTextPane();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        cant1Text = new javax.swing.JTextPane();
        ing2Label = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane26 = new javax.swing.JScrollPane();
        idText = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane11.setFocusable(false);
        jScrollPane11.setViewportView(ing2Text);

        ing8Label.setText("Ingrediente:");
        ing8Label.setFocusable(false);

        jScrollPane23.setFocusable(false);
        jScrollPane23.setViewportView(ing8Text);

        cant8.setText("Cantidad:");
        cant8.setFocusable(false);

        jScrollPane24.setFocusable(false);
        jScrollPane24.setViewportView(cant8Text);

        ing9Label.setText("Ingrediente:");
        ing9Label.setFocusable(false);

        cant2.setText("Cantidad:");
        cant2.setFocusable(false);

        jScrollPane25.setFocusable(false);
        jScrollPane25.setViewportView(ing9Text);

        jScrollPane12.setFocusable(false);
        jScrollPane12.setViewportView(cant2Text);

        ing5Label.setText("Ingrediente:");
        ing5Label.setFocusable(false);

        ing3Label.setText("Ingrediente:");
        ing3Label.setFocusable(false);

        jScrollPane13.setFocusable(false);
        jScrollPane13.setViewportView(ing3Text);

        cant3.setText("Cantidad:");
        cant3.setFocusable(false);

        jScrollPane14.setFocusable(false);
        jScrollPane14.setViewportView(cant3Text);

        jLabel4.setText("Dificultad:");

        ing6Label.setText("Ingrediente:");
        ing6Label.setFocusable(false);

        ing4Label.setText("Ingrediente:");
        ing4Label.setFocusable(false);

        jScrollPane5.setViewportView(dificultadText);

        jScrollPane19.setFocusable(false);
        jScrollPane19.setViewportView(ing6Text);

        jScrollPane17.setFocusable(false);
        jScrollPane17.setViewportView(ing5Text);

        cant9.setText("Cantidad:");
        cant9.setFocusable(false);

        cant5.setText("Cantidad:");
        cant5.setFocusable(false);

        jLabel2.setText("Tipo:");

        jScrollPane18.setFocusable(false);
        jScrollPane18.setViewportView(cant5Text);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("INGREDIENTES (MAX  9)");
        jLabel3.setFocusable(false);

        addRecetaButton.setBackground(new java.awt.Color(1, 1, 1));
        addRecetaButton.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        addRecetaButton.setForeground(new java.awt.Color(254, 254, 254));
        addRecetaButton.setText("Añadir receta");
        addRecetaButton.setToolTipText("");
        addRecetaButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        addRecetaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRecetaButtonActionPerformed(evt);
            }
        });

        jLabel5.setText("Calorías:");

        jScrollPane6.setViewportView(caloriasText);

        scrollPane9.setFocusable(false);
        scrollPane9.setViewportView(cant9Text);

        cant6.setText("Cantidad:");
        cant6.setFocusable(false);

        jScrollPane20.setFocusable(false);
        jScrollPane20.setViewportView(cant6Text);

        jLabel6.setText("Tiempo:");

        ing7Label.setText("Ingrediente:");
        ing7Label.setFocusable(false);

        jScrollPane7.setViewportView(tiempoText);

        jScrollPane21.setFocusable(false);
        jScrollPane21.setViewportView(ing7Text);

        jLabel7.setText("Elaboración:");

        cant7.setText("Cantidad:");
        cant7.setFocusable(false);

        jScrollPane8.setViewportView(elaboracionText);

        jScrollPane22.setFocusable(false);
        jScrollPane22.setViewportView(cant7Text);

        jScrollPane15.setFocusable(false);
        jScrollPane15.setViewportView(ing4Text);

        cant4.setText("Cantidad:");
        cant4.setFocusable(false);

        jScrollPane16.setFocusable(false);
        jScrollPane16.setViewportView(cant4Text);

        jScrollPane3.setViewportView(nombreText);

        jLabel8.setFont(new java.awt.Font("Ubuntu Condensed", 1, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("NUEVA RECETA");

        jLabel1.setText("Nombre:");

        jScrollPane9.setFocusable(false);
        jScrollPane9.setViewportView(ing1Text);

        jScrollPane4.setViewportView(tipoText);

        jLabel9.setText("Ingrediente:");
        jLabel9.setFocusable(false);

        jLabel10.setText("Cantidad:");
        jLabel10.setFocusable(false);

        jScrollPane10.setFocusable(false);
        jScrollPane10.setViewportView(cant1Text);

        ing2Label.setText("Ingrediente:");
        ing2Label.setFocusable(false);

        jLabel11.setText("Id:");

        jScrollPane26.setViewportView(idText);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(addRecetaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(88, 88, 88)
                                .addComponent(jScrollPane26)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ing9Label, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                            .addComponent(ing8Label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ing7Label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ing6Label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane21, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                            .addComponent(jScrollPane19)
                            .addComponent(jScrollPane23)
                            .addComponent(jScrollPane25))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cant6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(cant7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cant9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cant8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(scrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                    .addComponent(jScrollPane22, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane24, javax.swing.GroupLayout.Alignment.TRAILING)))))
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel1)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                            .addComponent(jScrollPane3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(ing5Label, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                                    .addComponent(ing4Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ing3Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ing2Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane11, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jScrollPane17)
                                    .addComponent(jScrollPane15, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane13, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(cant5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane18, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(cant4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane16, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(cant3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane14, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cant2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane10)
                                            .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)))))
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                                    .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                            .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                            .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                            .addComponent(ing2Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cant2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                            .addComponent(jScrollPane13, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                            .addComponent(jScrollPane14, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                            .addComponent(ing3Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cant3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                            .addComponent(jScrollPane15, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                            .addComponent(jScrollPane16, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                            .addComponent(ing4Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cant4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                            .addComponent(jScrollPane17, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                            .addComponent(jScrollPane18, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                            .addComponent(ing5Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cant5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane19)
                    .addComponent(jScrollPane20)
                    .addComponent(ing6Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cant6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane26))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane21, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                            .addComponent(jScrollPane22, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                            .addComponent(ing7Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cant7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane23, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                            .addComponent(jScrollPane24, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                            .addComponent(ing8Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cant8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane25, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                            .addComponent(scrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                            .addComponent(ing9Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cant9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(addRecetaButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addRecetaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRecetaButtonActionPerformed
        // TODO add your handling code here:
        String id = idText.getText();
        String nombre = nombreText.getText();
        String tipo = tipoText.getText();
        String calorias = caloriasText.getText();
        String dificultad = dificultadText.getText();
        String tiempo = tiempoText.getText();
        String elaboracion = elaboracionText.getText();
        String[] cantidad = new String[9];
        if (!"".equals(cant1Text.getText())){
            cantidad[0] = cant1Text.getText();
        }
        if (!"".equals(cant2Text.getText())){
            cantidad[1] = cant2Text.getText();
        }
        if (!"".equals(cant3Text.getText())){
            cantidad[2] = cant3Text.getText();
        }
        if (!"".equals(cant4Text.getText())){
            cantidad[3] = cant4Text.getText();
        }
        if (!"".equals(cant5Text.getText())){
            cantidad[4] = cant5Text.getText();
        }
        if (!"".equals(cant6Text.getText())){
            cantidad[5] = cant6Text.getText();
        }
        if (!"".equals(cant7Text.getText())){
            cantidad[6] = cant7Text.getText();
        }
        if (!"".equals(cant8Text.getText())){
            cantidad[7] = cant8Text.getText();
        }
        if (!"".equals(cant9Text.getText())){
            cantidad[8] = cant9Text.getText();
        }

        String[] ingredientes = new String[9];
        if (!"".equals(ing1Text.getText())){
            ingredientes[0] = ing1Text.getText();
        }
        if (!"".equals(ing2Text.getText())){
            ingredientes[1] = ing2Text.getText();
        }
        if (!"".equals(ing3Text.getText())){
            ingredientes[2] = ing3Text.getText();
        }
        if (!"".equals(ing4Text.getText())){
            ingredientes[3] = ing4Text.getText();
        }
        if (!"".equals(ing5Text.getText())){
            ingredientes[4] = ing5Text.getText();
        }
        if (!"".equals(ing6Text.getText())){
            ingredientes[5] = ing6Text.getText();
        }
        if (!"".equals(ing7Text.getText())){
            ingredientes[6] = ing7Text.getText();
        }
        if (!"".equals(ing8Text.getText())){
            ingredientes[7] = ing8Text.getText();
        }
        if (!"".equals(ing9Text.getText())){
            ingredientes[8] = ing9Text.getText();
        }

        int res = MainWindow.domMetodos.addRecetaDOM(id, nombre, tipo, dificultad, calorias, tiempo, elaboracion, cantidad, ingredientes);
        
        if (res==0){
            MainWindow.domMetodos.guardarDOMcomoFile(MainWindow.recetasFile);
            
            MainWindow.domMetodos.abrir_XML_DOM(MainWindow.recetasFile);
            MainWindow.saxMetodos.abrir_XML_SAX(MainWindow.recetasFile);
            MainWindow.xpathMetodos.abrir_XML_XPATH(MainWindow.recetasFile);
            MainWindow.jaxbMetodos.abrir_XML_JAXB(MainWindow.recetasFile);
        }
        this.setVisible(false);
    }//GEN-LAST:event_addRecetaButtonActionPerformed

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
            java.util.logging.Logger.getLogger(addRecetaWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addRecetaWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addRecetaWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addRecetaWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addRecetaWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addRecetaButton;
    private javax.swing.JTextPane caloriasText;
    private javax.swing.JTextPane cant1Text;
    private javax.swing.JLabel cant2;
    private javax.swing.JTextPane cant2Text;
    private javax.swing.JLabel cant3;
    private javax.swing.JTextPane cant3Text;
    private javax.swing.JLabel cant4;
    private javax.swing.JTextPane cant4Text;
    private javax.swing.JLabel cant5;
    private javax.swing.JTextPane cant5Text;
    private javax.swing.JLabel cant6;
    private javax.swing.JTextPane cant6Text;
    private javax.swing.JLabel cant7;
    private javax.swing.JTextPane cant7Text;
    private javax.swing.JLabel cant8;
    private javax.swing.JTextPane cant8Text;
    private javax.swing.JLabel cant9;
    private javax.swing.JTextPane cant9Text;
    private javax.swing.JTextPane dificultadText;
    private javax.swing.JTextPane elaboracionText;
    private javax.swing.JTextPane idText;
    private javax.swing.JTextPane ing1Text;
    private javax.swing.JLabel ing2Label;
    private javax.swing.JTextPane ing2Text;
    private javax.swing.JLabel ing3Label;
    private javax.swing.JTextPane ing3Text;
    private javax.swing.JLabel ing4Label;
    private javax.swing.JTextPane ing4Text;
    private javax.swing.JLabel ing5Label;
    private javax.swing.JTextPane ing5Text;
    private javax.swing.JLabel ing6Label;
    private javax.swing.JTextPane ing6Text;
    private javax.swing.JLabel ing7Label;
    private javax.swing.JTextPane ing7Text;
    private javax.swing.JLabel ing8Label;
    private javax.swing.JTextPane ing8Text;
    private javax.swing.JLabel ing9Label;
    private javax.swing.JTextPane ing9Text;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JScrollPane jScrollPane23;
    private javax.swing.JScrollPane jScrollPane24;
    private javax.swing.JScrollPane jScrollPane25;
    private javax.swing.JScrollPane jScrollPane26;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextPane nombreText;
    private javax.swing.JScrollPane scrollPane9;
    private javax.swing.JTextPane tiempoText;
    private javax.swing.JTextPane tipoText;
    // End of variables declaration//GEN-END:variables
}
