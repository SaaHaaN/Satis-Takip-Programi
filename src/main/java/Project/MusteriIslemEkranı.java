package Project;

public class MusteriIslemEkranı extends javax.swing.JFrame {

    // Constructor yardımıyla giriş yapan müşterinin kullanıcı adı Label üzerine yazılıyor..
    public MusteriIslemEkranı(String kullaniciAdi) {
        initComponents();
        
        setLocationRelativeTo(null);
        setResizable(false);
        
        labelUserName.setText(kullaniciAdi);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MusteriIslemEkraniPanel = new javax.swing.JPanel();
        HosgeldinLabel = new javax.swing.JLabel();
        labelUserName = new javax.swing.JLabel();
        lblIcon = new javax.swing.JLabel();
        btnArabaSatınAll = new javax.swing.JButton();
        btnYedekParca = new javax.swing.JButton();
        btnMusteriBilgileri = new javax.swing.JButton();
        btnSatisTakip = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        MusteriIslemEkraniPanel.setBackground(new java.awt.Color(0, 153, 153));
        MusteriIslemEkraniPanel.setName(""); // NOI18N

        HosgeldinLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        HosgeldinLabel.setForeground(new java.awt.Color(255, 255, 255));
        HosgeldinLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        HosgeldinLabel.setText("Hoşgeldiniz,");

        labelUserName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelUserName.setForeground(new java.awt.Color(255, 255, 255));

        lblIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIcon.setIcon(new javax.swing.ImageIcon("C:\\Users\\Şahan\\Documents\\NetBeansProjects\\Project\\src\\main\\java\\Project\\PNG\\MusteriIslemEkraniIcon.png")); // NOI18N

        btnArabaSatınAll.setBackground(new java.awt.Color(0, 0, 0));
        btnArabaSatınAll.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnArabaSatınAll.setForeground(new java.awt.Color(255, 255, 255));
        btnArabaSatınAll.setText("Araba Satın Al");
        btnArabaSatınAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArabaSatınAllActionPerformed(evt);
            }
        });

        btnYedekParca.setBackground(new java.awt.Color(0, 0, 0));
        btnYedekParca.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnYedekParca.setForeground(new java.awt.Color(255, 255, 255));
        btnYedekParca.setText("Yedek Parça Satın Al");
        btnYedekParca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYedekParcaActionPerformed(evt);
            }
        });

        btnMusteriBilgileri.setBackground(new java.awt.Color(0, 0, 0));
        btnMusteriBilgileri.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnMusteriBilgileri.setForeground(new java.awt.Color(255, 255, 255));
        btnMusteriBilgileri.setText("Bilgilerimi Görüntüle");
        btnMusteriBilgileri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMusteriBilgileriActionPerformed(evt);
            }
        });

        btnSatisTakip.setBackground(new java.awt.Color(0, 0, 0));
        btnSatisTakip.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSatisTakip.setForeground(new java.awt.Color(255, 255, 255));
        btnSatisTakip.setText("Satın Alma Geçmişi");
        btnSatisTakip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSatisTakipActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MusteriIslemEkraniPanelLayout = new javax.swing.GroupLayout(MusteriIslemEkraniPanel);
        MusteriIslemEkraniPanel.setLayout(MusteriIslemEkraniPanelLayout);
        MusteriIslemEkraniPanelLayout.setHorizontalGroup(
            MusteriIslemEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MusteriIslemEkraniPanelLayout.createSequentialGroup()
                .addGroup(MusteriIslemEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MusteriIslemEkraniPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MusteriIslemEkraniPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(MusteriIslemEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MusteriIslemEkraniPanelLayout.createSequentialGroup()
                                .addComponent(HosgeldinLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnArabaSatınAll, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnYedekParca, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(MusteriIslemEkraniPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnMusteriBilgileri, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(MusteriIslemEkraniPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnSatisTakip, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        MusteriIslemEkraniPanelLayout.setVerticalGroup(
            MusteriIslemEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MusteriIslemEkraniPanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(MusteriIslemEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HosgeldinLabel)
                    .addComponent(labelUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(lblIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnArabaSatınAll)
                .addGap(18, 18, 18)
                .addComponent(btnYedekParca)
                .addGap(18, 18, 18)
                .addComponent(btnMusteriBilgileri)
                .addGap(18, 18, 18)
                .addComponent(btnSatisTakip)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MusteriIslemEkraniPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MusteriIslemEkraniPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnArabaSatınAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArabaSatınAllActionPerformed
        // Araba Satın Al Paneli
        SatınAl satinAl = new SatınAl(labelUserName.getText());
        satinAl.setVisible(true);
    }//GEN-LAST:event_btnArabaSatınAllActionPerformed

    private void btnYedekParcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYedekParcaActionPerformed
        // Yedek Parça Satın Al Paneli
        SatınAl_YedekParca yedekParcaAl = new SatınAl_YedekParca(labelUserName.getText());
        yedekParcaAl.setVisible(true);
    }//GEN-LAST:event_btnYedekParcaActionPerformed

    private void btnMusteriBilgileriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMusteriBilgileriActionPerformed
        // Müşteri Bilgileri Paneli
        MusteriBilgileriniGoster mbg = new MusteriBilgileriniGoster(labelUserName.getText());
        mbg.setVisible(true);
    }//GEN-LAST:event_btnMusteriBilgileriActionPerformed

    private void btnSatisTakipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSatisTakipActionPerformed
        // TODO add your handling code here:
        MusteriSatinAlmaGecmisi msag = new MusteriSatinAlmaGecmisi(labelUserName.getText());
        msag.setVisible(true);
    }//GEN-LAST:event_btnSatisTakipActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel HosgeldinLabel;
    private javax.swing.JPanel MusteriIslemEkraniPanel;
    private javax.swing.JButton btnArabaSatınAll;
    private javax.swing.JButton btnMusteriBilgileri;
    private javax.swing.JButton btnSatisTakip;
    private javax.swing.JButton btnYedekParca;
    private javax.swing.JLabel labelUserName;
    private javax.swing.JLabel lblIcon;
    // End of variables declaration//GEN-END:variables
}
