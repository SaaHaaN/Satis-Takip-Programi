package Project;

public class FaturaArac extends javax.swing.JFrame {

    // Constructor yardımyıla databasedeki uygun verileri çekip fatura ekranına yazdırdım.
    public FaturaArac(String sasi, String model, String modelYili, String vites, String yakit, String tutar,
            String AliciTC, String aliciAdi, String aliciTelno, String aliciMail) {
        initComponents();

        setLocationRelativeTo(null);
        setResizable(false);

        
        //Verileri Faturaya uygun şekilde yazdırdı..
        lblSasi.setText(sasi);
        lblModel.setText(model);
        lblYil.setText(modelYili);
        lblVites.setText(vites);
        lblYakit.setText(yakit);
        lblTutar.setText(tutar);

        lblAliciTC.setText(AliciTC);
        lblAliciAdi.setText(aliciAdi);
        lblAliciTelefon.setText(aliciTelno);
        lblAliciMail.setText(aliciMail);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlAracFatura = new javax.swing.JPanel();
        lblAudiIcon = new javax.swing.JLabel();
        lblAnahtarIcon = new javax.swing.JLabel();
        lblSasiS = new javax.swing.JLabel();
        lblSasi = new javax.swing.JLabel();
        lblModelS = new javax.swing.JLabel();
        lblModel = new javax.swing.JLabel();
        lblYilS = new javax.swing.JLabel();
        lblYil = new javax.swing.JLabel();
        lblVitesS = new javax.swing.JLabel();
        lblVites = new javax.swing.JLabel();
        lblYakitS = new javax.swing.JLabel();
        lblYakit = new javax.swing.JLabel();
        lblTutarS = new javax.swing.JLabel();
        lblTutar = new javax.swing.JLabel();
        SepUst = new javax.swing.JSeparator();
        lblAliciTCS = new javax.swing.JLabel();
        lblAliciTC = new javax.swing.JLabel();
        lblAliciAdiS = new javax.swing.JLabel();
        lblAliciAdi = new javax.swing.JLabel();
        lblAliciTelefonS = new javax.swing.JLabel();
        lblAliciTelefon = new javax.swing.JLabel();
        lblAlıcıMaisS = new javax.swing.JLabel();
        lblAliciMail = new javax.swing.JLabel();
        SepAlt = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnlAracFatura.setBackground(new java.awt.Color(255, 255, 255));
        pnlAracFatura.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Araç Faturası   ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        lblAudiIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAudiIcon.setIcon(new javax.swing.ImageIcon("C:\\Users\\Şahan\\Documents\\NetBeansProjects\\Project\\src\\main\\java\\Project\\PNG\\FaturaLogo.png")); // NOI18N

        lblAnahtarIcon.setIcon(new javax.swing.ImageIcon("C:\\Users\\Şahan\\Documents\\NetBeansProjects\\Project\\src\\main\\java\\Project\\PNG\\Fatura.png")); // NOI18N

        lblSasiS.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSasiS.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSasiS.setText("Araç Şasi No");

        lblSasi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSasi.setText("--");

        lblModelS.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblModelS.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblModelS.setText("Araç Model");

        lblModel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblModel.setText("--");

        lblYilS.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblYilS.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblYilS.setText("Araç Model Yılı");

        lblYil.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblYil.setText("--");

        lblVitesS.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblVitesS.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblVitesS.setText("Araç Vites Tipi");

        lblVites.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblVites.setText("--");

        lblYakitS.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblYakitS.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblYakitS.setText("Araç Yakıt Tipi");

        lblYakit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblYakit.setText("--");

        lblTutarS.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTutarS.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTutarS.setText("Araç Tutarı");

        lblTutar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTutar.setText("--");

        lblAliciTCS.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblAliciTCS.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAliciTCS.setText("Alıcı TC");

        lblAliciTC.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblAliciTC.setText("--");

        lblAliciAdiS.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblAliciAdiS.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAliciAdiS.setText("Alıcı Adı");

        lblAliciAdi.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblAliciAdi.setText("--");

        lblAliciTelefonS.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblAliciTelefonS.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAliciTelefonS.setText("Alıcı Telefon");

        lblAliciTelefon.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblAliciTelefon.setText("--");

        lblAlıcıMaisS.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblAlıcıMaisS.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAlıcıMaisS.setText("Alıcı Mail");

        lblAliciMail.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblAliciMail.setText("--");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel1.setText("AUDI Aracı Satın Almış Bulunmaktasınız.");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel2.setText("Aşağıda bırakılan iban numarasını ödemeyi 3 iş günü içinde yapılması önemle rica edilir.");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel3.setText("IBAN NO : TR56 000610000001299022302");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel4.setText("Bizi tercih ettiğiniz için teşekkür ederiz. Sağlıklı günler dileriz");

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Şahan\\Documents\\NetBeansProjects\\Project\\src\\main\\java\\Project\\PNG\\FaturaSon.png")); // NOI18N

        javax.swing.GroupLayout pnlAracFaturaLayout = new javax.swing.GroupLayout(pnlAracFatura);
        pnlAracFatura.setLayout(pnlAracFaturaLayout);
        pnlAracFaturaLayout.setHorizontalGroup(
            pnlAracFaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SepAlt)
            .addComponent(SepUst)
            .addGroup(pnlAracFaturaLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(pnlAracFaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblYilS, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                    .addComponent(lblVitesS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblYakitS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTutarS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblModelS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblSasiS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pnlAracFaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblYil, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                    .addComponent(lblVites, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblYakit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTutar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblModel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblSasi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(lblAnahtarIcon)
                .addGap(38, 38, 38))
            .addComponent(lblAudiIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlAracFaturaLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(pnlAracFaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblAliciTCS, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAliciAdiS, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(pnlAracFaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAracFaturaLayout.createSequentialGroup()
                        .addComponent(lblAliciTC, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblAliciTelefonS))
                    .addGroup(pnlAracFaturaLayout.createSequentialGroup()
                        .addComponent(lblAliciAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAlıcıMaisS, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAracFaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAliciTelefon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAliciMail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(pnlAracFaturaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAracFaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAracFaturaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5))
        );
        pnlAracFaturaLayout.setVerticalGroup(
            pnlAracFaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAracFaturaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblAudiIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlAracFaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAracFaturaLayout.createSequentialGroup()
                        .addGroup(pnlAracFaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSasiS)
                            .addComponent(lblSasi, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlAracFaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblModelS)
                            .addComponent(lblModel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlAracFaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblYilS)
                            .addComponent(lblYil))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlAracFaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblVitesS)
                            .addComponent(lblVites))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlAracFaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblYakitS)
                            .addComponent(lblYakit))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlAracFaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTutarS)
                            .addComponent(lblTutar)))
                    .addComponent(lblAnahtarIcon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 46, Short.MAX_VALUE)
                .addComponent(SepUst, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlAracFaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAliciTelefon)
                    .addGroup(pnlAracFaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblAliciTCS)
                        .addComponent(lblAliciTC)
                        .addComponent(lblAliciTelefonS)))
                .addGap(18, 18, 18)
                .addGroup(pnlAracFaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAliciMail)
                    .addGroup(pnlAracFaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblAliciAdiS)
                        .addComponent(lblAliciAdi)
                        .addComponent(lblAlıcıMaisS)))
                .addGap(48, 48, 48)
                .addComponent(SepAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(20, 20, 20)
                .addComponent(jLabel5))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlAracFatura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlAracFatura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator SepAlt;
    private javax.swing.JSeparator SepUst;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblAliciAdi;
    private javax.swing.JLabel lblAliciAdiS;
    private javax.swing.JLabel lblAliciMail;
    private javax.swing.JLabel lblAliciTC;
    private javax.swing.JLabel lblAliciTCS;
    private javax.swing.JLabel lblAliciTelefon;
    private javax.swing.JLabel lblAliciTelefonS;
    private javax.swing.JLabel lblAlıcıMaisS;
    private javax.swing.JLabel lblAnahtarIcon;
    private javax.swing.JLabel lblAudiIcon;
    private javax.swing.JLabel lblModel;
    private javax.swing.JLabel lblModelS;
    private javax.swing.JLabel lblSasi;
    private javax.swing.JLabel lblSasiS;
    private javax.swing.JLabel lblTutar;
    private javax.swing.JLabel lblTutarS;
    private javax.swing.JLabel lblVites;
    private javax.swing.JLabel lblVitesS;
    private javax.swing.JLabel lblYakit;
    private javax.swing.JLabel lblYakitS;
    private javax.swing.JLabel lblYil;
    private javax.swing.JLabel lblYilS;
    private javax.swing.JPanel pnlAracFatura;
    // End of variables declaration//GEN-END:variables

}
