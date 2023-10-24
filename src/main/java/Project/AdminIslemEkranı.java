package Project;

public class AdminIslemEkranı extends javax.swing.JFrame {

    /* Creates new form {name} */
    public AdminIslemEkranı(String kullaniciAdi) {
        initComponents();
        
        setLocationRelativeTo(null);
        setResizable(false);
        
        lblAdminAdı.setText(kullaniciAdi);
    }

    private AdminIslemEkranı() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        AdminPanel = new javax.swing.JPanel();
        lblIcon = new javax.swing.JLabel();
        lblHos = new javax.swing.JLabel();
        lblAdminAdı = new javax.swing.JLabel();
        btnAArac = new javax.swing.JButton();
        btnQArac = new javax.swing.JButton();
        btnETronArac = new javax.swing.JButton();
        btnTTArac = new javax.swing.JButton();
        btnR8Arac = new javax.swing.JButton();
        sep1 = new javax.swing.JSeparator();
        btnYedek = new javax.swing.JButton();
        sep2 = new javax.swing.JSeparator();
        btnMusteri = new javax.swing.JButton();
        btnAdmin = new javax.swing.JButton();
        sep3 = new javax.swing.JSeparator();
        btnSatisTakip = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        AdminPanel.setBackground(new java.awt.Color(255, 153, 0));

        lblIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIcon.setIcon(new javax.swing.ImageIcon("C:\\Users\\Şahan\\Documents\\NetBeansProjects\\Project\\src\\main\\java\\Project\\PNG\\AdminIslemLogo.png")); // NOI18N

        lblHos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblHos.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblHos.setText("Hoşgeldin Admin,");

        lblAdminAdı.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        btnAArac.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAArac.setText("A Serisi Araç Satış Kontrol");
        btnAArac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAAracActionPerformed(evt);
            }
        });

        btnQArac.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnQArac.setText("Q Serisi Araç Satış Kontrol");
        btnQArac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQAracActionPerformed(evt);
            }
        });

        btnETronArac.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnETronArac.setText("E-Tron Serisi Araç Satış Kontrol");
        btnETronArac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnETronAracActionPerformed(evt);
            }
        });

        btnTTArac.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnTTArac.setText("TT Serisi Araç Satış Kontrol");
        btnTTArac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTTAracActionPerformed(evt);
            }
        });

        btnR8Arac.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnR8Arac.setText("R8 Serisi Araç Satış Kontrol");
        btnR8Arac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnR8AracActionPerformed(evt);
            }
        });

        btnYedek.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnYedek.setText("Yedek Parça Satış Kontrol");
        btnYedek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYedekActionPerformed(evt);
            }
        });

        btnMusteri.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnMusteri.setText("Müsteri Kontrol");
        btnMusteri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMusteriActionPerformed(evt);
            }
        });

        btnAdmin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAdmin.setText("Admin Kontrol");
        btnAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminActionPerformed(evt);
            }
        });

        btnSatisTakip.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSatisTakip.setText("Satış Takip");
        btnSatisTakip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSatisTakipActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AdminPanelLayout = new javax.swing.GroupLayout(AdminPanel);
        AdminPanel.setLayout(AdminPanelLayout);
        AdminPanelLayout.setHorizontalGroup(
            AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sep2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(sep1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(sep3)
            .addGroup(AdminPanelLayout.createSequentialGroup()
                .addGroup(AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AdminPanelLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(AdminPanelLayout.createSequentialGroup()
                                .addComponent(lblHos, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblAdminAdı, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnAArac, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
                                .addComponent(lblIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
                                .addComponent(btnMusteri, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
                                .addComponent(btnAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
                                .addComponent(btnR8Arac, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
                                .addComponent(btnTTArac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnETronArac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnQArac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(AdminPanelLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(btnYedek, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AdminPanelLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(btnSatisTakip, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        AdminPanelLayout.setVerticalGroup(
            AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdminPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblIcon)
                .addGap(27, 27, 27)
                .addGroup(AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblHos)
                    .addComponent(lblAdminAdı, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAArac)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnQArac)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnETronArac)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTTArac)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnR8Arac)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sep1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnYedek)
                .addGap(18, 18, 18)
                .addComponent(sep2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(btnMusteri)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAdmin)
                .addGap(18, 18, 18)
                .addComponent(sep3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSatisTakip)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AdminPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AdminPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAAracActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAAracActionPerformed
        // A Serisi Araçları Görmek için..
        AdminSatisA a = new AdminSatisA();
        a.setVisible(true);
    }//GEN-LAST:event_btnAAracActionPerformed

    private void btnQAracActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQAracActionPerformed
        // Q Serisi Araçları Görmek için..
        AdminSatisQ q = new AdminSatisQ();
        q.setVisible(true);
    }//GEN-LAST:event_btnQAracActionPerformed

    private void btnETronAracActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnETronAracActionPerformed
        // E-Tron Serisi Araçları Görmek için..
        AdminSatisETron eTron = new AdminSatisETron();
        eTron.setVisible(true);
    }//GEN-LAST:event_btnETronAracActionPerformed

    private void btnTTAracActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTTAracActionPerformed
        // TT Serisi Araçları Görmek için..
        AdminSatisTT tt = new AdminSatisTT();
        tt.setVisible(true);
    }//GEN-LAST:event_btnTTAracActionPerformed

    private void btnR8AracActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnR8AracActionPerformed
        // R8 Serisi Araçları Görmek için..
        AdminSatisR8 r8 = new AdminSatisR8();
        r8.setVisible(true);
    }//GEN-LAST:event_btnR8AracActionPerformed

    private void btnMusteriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMusteriActionPerformed
        // Müşterileri Görmek için..
        AdminMüşteriKontrol adminM = new AdminMüşteriKontrol();
        adminM.setVisible(true);
    }//GEN-LAST:event_btnMusteriActionPerformed

    private void btnAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminActionPerformed
        // Adminleri Görmek için..
        AdminKontrol adminA = new AdminKontrol();
        adminA.setVisible(true);
    }//GEN-LAST:event_btnAdminActionPerformed

    private void btnYedekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYedekActionPerformed
        // Yedek Parçaları Görmek için..
        AdminYedekParca yedekP = new AdminYedekParca();
        yedekP.setVisible(true);
    }//GEN-LAST:event_btnYedekActionPerformed

    private void btnSatisTakipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSatisTakipActionPerformed
        // Satiş Takip paneli görmek için..
        AdminSatisTakip satis = new AdminSatisTakip();
        satis.setVisible(true);
    }//GEN-LAST:event_btnSatisTakipActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AdminPanel;
    private javax.swing.JButton btnAArac;
    private javax.swing.JButton btnAdmin;
    private javax.swing.JButton btnETronArac;
    private javax.swing.JButton btnMusteri;
    private javax.swing.JButton btnQArac;
    private javax.swing.JButton btnR8Arac;
    private javax.swing.JButton btnSatisTakip;
    private javax.swing.JButton btnTTArac;
    private javax.swing.JButton btnYedek;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lblAdminAdı;
    private javax.swing.JLabel lblHos;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JSeparator sep1;
    private javax.swing.JSeparator sep2;
    private javax.swing.JSeparator sep3;
    // End of variables declaration//GEN-END:variables

}
