package gui;

public class Operation extends javax.swing.JFrame {

    public Operation() {
        initComponents();
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
        panelTitle = new javax.swing.JPanel();
        lbTitle = new javax.swing.JLabel();
        panelOperation = new javax.swing.JPanel();
        btnPlace = new javax.swing.JButton();
        btnCompany = new javax.swing.JButton();
        btnUser = new javax.swing.JButton();
        btnTicket = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtPlace = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtTicket = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtUser = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtCompany = new javax.swing.JTextArea();
        lbName = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 215, 0));

        panelTitle.setBackground(new java.awt.Color(247, 247, 247));

        lbTitle.setFont(new java.awt.Font("URW Gothic", 1, 48)); // NOI18N
        lbTitle.setForeground(new java.awt.Color(51, 51, 51));
        lbTitle.setText("NPB - Operaciones");
        lbTitle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panelTitleLayout = new javax.swing.GroupLayout(panelTitle);
        panelTitle.setLayout(panelTitleLayout);
        panelTitleLayout.setHorizontalGroup(
            panelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTitleLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(lbTitle)
                .addContainerGap(454, Short.MAX_VALUE))
        );
        panelTitleLayout.setVerticalGroup(
            panelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTitleLayout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(lbTitle)
                .addGap(22, 22, 22))
        );

        panelOperation.setBackground(new java.awt.Color(242, 245, 247));

        btnPlace.setBackground(new java.awt.Color(111, 29, 27));
        btnPlace.setFont(new java.awt.Font("URW Gothic", 0, 36)); // NOI18N
        btnPlace.setForeground(new java.awt.Color(255, 255, 255));
        btnPlace.setText("Lugares");
        btnPlace.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPlace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlaceActionPerformed(evt);
            }
        });

        btnCompany.setBackground(new java.awt.Color(111, 29, 27));
        btnCompany.setFont(new java.awt.Font("URW Gothic", 0, 36)); // NOI18N
        btnCompany.setForeground(new java.awt.Color(255, 255, 255));
        btnCompany.setText("Compañías");
        btnCompany.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCompany.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompanyActionPerformed(evt);
            }
        });

        btnUser.setBackground(new java.awt.Color(111, 29, 27));
        btnUser.setFont(new java.awt.Font("URW Gothic", 0, 36)); // NOI18N
        btnUser.setForeground(new java.awt.Color(255, 255, 255));
        btnUser.setText("Usuarios");
        btnUser.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserActionPerformed(evt);
            }
        });

        btnTicket.setBackground(new java.awt.Color(111, 29, 27));
        btnTicket.setFont(new java.awt.Font("URW Gothic", 0, 36)); // NOI18N
        btnTicket.setForeground(new java.awt.Color(255, 255, 255));
        btnTicket.setText("Billetes");
        btnTicket.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTicketActionPerformed(evt);
            }
        });

        txtPlace.setEditable(false);
        txtPlace.setBackground(new java.awt.Color(255, 255, 255));
        txtPlace.setColumns(20);
        txtPlace.setFont(new java.awt.Font("URW Gothic", 1, 18)); // NOI18N
        txtPlace.setForeground(new java.awt.Color(30, 30, 30));
        txtPlace.setLineWrap(true);
        txtPlace.setRows(3);
        txtPlace.setText("Son los sitios que serán origen o destino para el billete.  Cada lugar tiene un número y un nombre que lo identifica dentro del sistema.");
        jScrollPane1.setViewportView(txtPlace);

        txtTicket.setEditable(false);
        txtTicket.setBackground(new java.awt.Color(255, 255, 255));
        txtTicket.setColumns(20);
        txtTicket.setFont(new java.awt.Font("URW Gothic", 1, 18)); // NOI18N
        txtTicket.setForeground(new java.awt.Color(30, 30, 30));
        txtTicket.setLineWrap(true);
        txtTicket.setRows(3);
        txtTicket.setText("Son los tickets del viaje. Contienen detalles como número de boleto, fecha, hora, lugar de destino y origen, DNI del cliente  y el ID de la compañía.");
        jScrollPane2.setViewportView(txtTicket);

        txtUser.setEditable(false);
        txtUser.setBackground(new java.awt.Color(255, 255, 255));
        txtUser.setColumns(20);
        txtUser.setFont(new java.awt.Font("URW Gothic", 1, 18)); // NOI18N
        txtUser.setForeground(new java.awt.Color(30, 30, 30));
        txtUser.setLineWrap(true);
        txtUser.setRows(3);
        txtUser.setText("Representan las personas que utilizan la aplicación. Tienen información como el DNI, contraseña, nombre, teléfono y dirección.");
        jScrollPane3.setViewportView(txtUser);

        txtCompany.setEditable(false);
        txtCompany.setBackground(new java.awt.Color(255, 255, 255));
        txtCompany.setColumns(20);
        txtCompany.setFont(new java.awt.Font("URW Gothic", 1, 18)); // NOI18N
        txtCompany.setForeground(new java.awt.Color(30, 30, 30));
        txtCompany.setLineWrap(true);
        txtCompany.setRows(3);
        txtCompany.setText("Son las entidades comerciales relacionadas con la prestación de servicios. Tienen un número único y un nombre que las identifica.");
        jScrollPane4.setViewportView(txtCompany);

        lbName.setFont(new java.awt.Font("URW Gothic", 1, 18)); // NOI18N
        lbName.setForeground(new java.awt.Color(30, 30, 30));
        lbName.setText("BIENVENIDO, ADMIN");

        javax.swing.GroupLayout panelOperationLayout = new javax.swing.GroupLayout(panelOperation);
        panelOperation.setLayout(panelOperationLayout);
        panelOperationLayout.setHorizontalGroup(
            panelOperationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOperationLayout.createSequentialGroup()
                .addGroup(panelOperationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelOperationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelOperationLayout.createSequentialGroup()
                            .addGap(93, 93, 93)
                            .addComponent(btnUser, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelOperationLayout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(panelOperationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnCompany, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnPlace, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE))))
                    .addComponent(btnTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(panelOperationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
            .addGroup(panelOperationLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(lbName, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelOperationLayout.setVerticalGroup(
            panelOperationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOperationLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lbName)
                .addGap(47, 47, 47)
                .addGroup(panelOperationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(panelOperationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPlace, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(panelOperationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelOperationLayout.createSequentialGroup()
                        .addComponent(btnCompany, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)))
                .addGap(39, 39, 39)
                .addGroup(panelOperationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(72, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelOperation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(panelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelOperation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTicketActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Ticket page = new Ticket();
        page.setVisible(true);
        page.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnTicketActionPerformed

    private void btnPlaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlaceActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Place page = new Place();
        page.setVisible(true);
        page.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnPlaceActionPerformed

    private void btnCompanyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompanyActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Company page = new Company();
        page.setVisible(true);
        page.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnCompanyActionPerformed

    private void btnUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserActionPerformed
        // TODO add your handling code here:
        this.dispose();
        User page = new User();
        page.setVisible(true);
        page.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnUserActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCompany;
    private javax.swing.JButton btnPlace;
    private javax.swing.JButton btnTicket;
    private javax.swing.JButton btnUser;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JPanel panelOperation;
    private javax.swing.JPanel panelTitle;
    private javax.swing.JTextArea txtCompany;
    private javax.swing.JTextArea txtPlace;
    private javax.swing.JTextArea txtTicket;
    private javax.swing.JTextArea txtUser;
    // End of variables declaration//GEN-END:variables
}
