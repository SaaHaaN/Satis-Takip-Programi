package Project;

public class SatınAl extends javax.swing.JFrame {

    String kAdi;

    /* Creates new form {name} */
    // Fatura da doğru müşterinin bilgilerini yazdırmak için gene constructor'dan yardım alıyorum..
    public SatınAl(String kullaniciAdi) {
        initComponents();
        
        setLocationRelativeTo(null);
        setResizable(false);
        
        kAdi = kullaniciAdi;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ArabaSatinAlimPanel = new javax.swing.JPanel();
        lblHosgeldin = new javax.swing.JLabel();
        lblYonlendirme = new javax.swing.JLabel();
        btnA = new javax.swing.JButton();
        btnQ = new javax.swing.JButton();
        btneTron = new javax.swing.JButton();
        btnTT = new javax.swing.JButton();
        btnR8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        ArabaSatinAlimPanel.setBackground(new java.awt.Color(0, 153, 153));
        ArabaSatinAlimPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "AUDI ARABA SATIŞ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        ArabaSatinAlimPanel.setName(""); // NOI18N
        ArabaSatinAlimPanel.setRequestFocusEnabled(false);

        lblHosgeldin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblHosgeldin.setText("AUDI Araba Satın Ekranına Hoşgeldiniz");

        lblYonlendirme.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblYonlendirme.setText("Satın Almak İstediğiniz Model Türünü Seçin");

        btnA.setBackground(new java.awt.Color(204, 204, 204));
        btnA.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnA.setIcon(new javax.swing.ImageIcon("C:\\Users\\Şahan\\Documents\\NetBeansProjects\\Project\\src\\main\\java\\Project\\PNG\\ASerisi.png")); // NOI18N
        btnA.setText("A Model Araçlar");
        btnA.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAActionPerformed(evt);
            }
        });

        btnQ.setBackground(new java.awt.Color(204, 204, 204));
        btnQ.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnQ.setIcon(new javax.swing.ImageIcon("C:\\Users\\Şahan\\Documents\\NetBeansProjects\\Project\\src\\main\\java\\Project\\PNG\\QSerisi.png")); // NOI18N
        btnQ.setText(" Q Model Araçlar");
        btnQ.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQActionPerformed(evt);
            }
        });

        btneTron.setBackground(new java.awt.Color(204, 204, 204));
        btneTron.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btneTron.setIcon(new javax.swing.ImageIcon("C:\\Users\\Şahan\\Documents\\NetBeansProjects\\Project\\src\\main\\java\\Project\\PNG\\eTronSerisi.png")); // NOI18N
        btneTron.setText("E-Tron Model Araçlar");
        btneTron.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btneTron.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneTronActionPerformed(evt);
            }
        });

        btnTT.setBackground(new java.awt.Color(204, 204, 204));
        btnTT.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnTT.setIcon(new javax.swing.ImageIcon("C:\\Users\\Şahan\\Documents\\NetBeansProjects\\Project\\src\\main\\java\\Project\\PNG\\TTSerisi.png")); // NOI18N
        btnTT.setText("TT Model Araçlar");
        btnTT.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnTT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTTActionPerformed(evt);
            }
        });

        btnR8.setBackground(new java.awt.Color(204, 204, 204));
        btnR8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnR8.setIcon(new javax.swing.ImageIcon("C:\\Users\\Şahan\\Documents\\NetBeansProjects\\Project\\src\\main\\java\\Project\\PNG\\R8Serisi.png")); // NOI18N
        btnR8.setText("R8 Model Araçlar");
        btnR8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnR8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnR8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ArabaSatinAlimPanelLayout = new javax.swing.GroupLayout(ArabaSatinAlimPanel);
        ArabaSatinAlimPanel.setLayout(ArabaSatinAlimPanelLayout);
        ArabaSatinAlimPanelLayout.setHorizontalGroup(
            ArabaSatinAlimPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ArabaSatinAlimPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(ArabaSatinAlimPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblYonlendirme)
                    .addGroup(ArabaSatinAlimPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblHosgeldin)))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(ArabaSatinAlimPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ArabaSatinAlimPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btneTron, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnQ, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnR8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ArabaSatinAlimPanelLayout.setVerticalGroup(
            ArabaSatinAlimPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ArabaSatinAlimPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblHosgeldin, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblYonlendirme, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(btnA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnQ)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btneTron, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnTT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnR8)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        btnA.getAccessibleContext().setAccessibleDescription("");

        getContentPane().add(ArabaSatinAlimPanel);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAActionPerformed
        // A Serisi Araba Paneli
        SatınAl_ASerisi a = new SatınAl_ASerisi(kAdi);
        a.setVisible(true);
    }//GEN-LAST:event_btnAActionPerformed

    private void btnQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQActionPerformed
        // Q Serisi Araba Paneli
        SatınAl_QSerisi Q = new SatınAl_QSerisi(kAdi);
        Q.setVisible(true);
    }//GEN-LAST:event_btnQActionPerformed

    private void btnTTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTTActionPerformed
        // TT Serisi Araba Paneli
        SatınAl_TTSerisi tt = new SatınAl_TTSerisi(kAdi);
        tt.setVisible(true);
    }//GEN-LAST:event_btnTTActionPerformed

    private void btnR8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnR8ActionPerformed
        // R8 Serisi Araba Paneli
        SatınAl_R8Serisi r = new SatınAl_R8Serisi(kAdi);
        r.setVisible(true);
    }//GEN-LAST:event_btnR8ActionPerformed

    private void btneTronActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneTronActionPerformed
        // E-Tron Serisi Araba Paneli
        SatınAl_eTronSerisi et = new SatınAl_eTronSerisi(kAdi);
        et.setVisible(true);
    }//GEN-LAST:event_btneTronActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ArabaSatinAlimPanel;
    private javax.swing.JButton btnA;
    private javax.swing.JButton btnQ;
    private javax.swing.JButton btnR8;
    private javax.swing.JButton btnTT;
    private javax.swing.JButton btneTron;
    private javax.swing.JLabel lblHosgeldin;
    private javax.swing.JLabel lblYonlendirme;
    // End of variables declaration//GEN-END:variables

}
