package Project;

public class FaturaYedekParca extends javax.swing.JFrame {

    public FaturaYedekParca(String parcaNo, String model, String parcaAdi, String tutar,
            String AliciTC, String aliciAdi, String aliciTelno, String aliciMail) {
        initComponents();

        setLocationRelativeTo(null);
        setResizable(false);

        //Verileri Faturaya uygun şekilde yazdırdı..
        lblParcaNo.setText(parcaNo);
        lblParcaModel.setText(model);
        lblParcaAdi.setText(parcaAdi);
        lblParcaTutar.setText(tutar);

        lblAliciTC.setText(AliciTC);
        lblAliciAdi.setText(aliciAdi);
        lblAliciTelefonNo.setText(aliciTelno);
        lblAliciMail.setText(aliciMail);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlYedekParcaFatura = new javax.swing.JPanel();
        lblAudiIcon = new javax.swing.JLabel();
        lblYedekParcaIcon = new javax.swing.JLabel();
        lblParcaNoS = new javax.swing.JLabel();
        lblParcaNo = new javax.swing.JLabel();
        lblParcaModelS = new javax.swing.JLabel();
        lblParcaModel = new javax.swing.JLabel();
        lblParcaAdiS = new javax.swing.JLabel();
        lblParcaAdi = new javax.swing.JLabel();
        lblParcaTutarS = new javax.swing.JLabel();
        lblParcaTutar = new javax.swing.JLabel();
        SepUst = new javax.swing.JSeparator();
        lblAliciTCS = new javax.swing.JLabel();
        lblAliciTC = new javax.swing.JLabel();
        lblAliciAdiS = new javax.swing.JLabel();
        lblAliciAdi = new javax.swing.JLabel();
        lblAliciTelefonNoS = new javax.swing.JLabel();
        lblAliciTelefonNo = new javax.swing.JLabel();
        lblAliciMailS = new javax.swing.JLabel();
        lblAliciMail = new javax.swing.JLabel();
        SepAlt = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnlYedekParcaFatura.setBackground(new java.awt.Color(255, 255, 255));
        pnlYedekParcaFatura.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Araç Faturası   ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        lblAudiIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAudiIcon.setIcon(new javax.swing.ImageIcon("C:\\Users\\Şahan\\Documents\\NetBeansProjects\\Project\\src\\main\\java\\Project\\PNG\\FaturaLogo.png")); // NOI18N

        lblYedekParcaIcon.setIcon(new javax.swing.ImageIcon("C:\\Users\\Şahan\\Documents\\NetBeansProjects\\Project\\src\\main\\java\\Project\\PNG\\YedekParcaFatura.png")); // NOI18N

        lblParcaNoS.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblParcaNoS.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblParcaNoS.setText("Parça Numarası");

        lblParcaNo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblParcaNo.setText("--");

        lblParcaModelS.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblParcaModelS.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblParcaModelS.setText("Uygun Model");

        lblParcaModel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblParcaModel.setText("--");

        lblParcaAdiS.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblParcaAdiS.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblParcaAdiS.setText("Parça Adı");

        lblParcaAdi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblParcaAdi.setText("--");

        lblParcaTutarS.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblParcaTutarS.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblParcaTutarS.setText("Parça Tutarı");

        lblParcaTutar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblParcaTutar.setText("--");

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

        lblAliciTelefonNoS.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblAliciTelefonNoS.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAliciTelefonNoS.setText("Alıcı Telefon");

        lblAliciTelefonNo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblAliciTelefonNo.setText("--");

        lblAliciMailS.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblAliciMailS.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAliciMailS.setText("Alıcı Mail");

        lblAliciMail.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblAliciMail.setText("--");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel4.setText("Bizi tercih ettiğiniz için teşekkür ederiz. Sağlıklı günler dileriz");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel3.setText("IBAN NO : TR56 000610000001299022302");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel5.setText("Aşağıda bırakılan iban numarasını ödemeyi 3 iş günü içinde yapılması önemle rica edilir.");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel6.setText("AUDI Yedek Parça Satın Almış Bulunmaktasınız.");

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Şahan\\Documents\\NetBeansProjects\\Project\\src\\main\\java\\Project\\PNG\\FaturaSon.png")); // NOI18N

        javax.swing.GroupLayout pnlYedekParcaFaturaLayout = new javax.swing.GroupLayout(pnlYedekParcaFatura);
        pnlYedekParcaFatura.setLayout(pnlYedekParcaFaturaLayout);
        pnlYedekParcaFaturaLayout.setHorizontalGroup(
            pnlYedekParcaFaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SepAlt)
            .addComponent(SepUst)
            .addGroup(pnlYedekParcaFaturaLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(pnlYedekParcaFaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblParcaAdiS, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                    .addComponent(lblParcaTutarS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblParcaModelS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblParcaNoS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pnlYedekParcaFaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblParcaAdi, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                    .addComponent(lblParcaTutar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblParcaModel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblParcaNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblYedekParcaIcon)
                .addGap(38, 38, 38))
            .addComponent(lblAudiIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlYedekParcaFaturaLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(pnlYedekParcaFaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblAliciTCS, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAliciAdiS, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(pnlYedekParcaFaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlYedekParcaFaturaLayout.createSequentialGroup()
                        .addComponent(lblAliciTC, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblAliciTelefonNoS))
                    .addGroup(pnlYedekParcaFaturaLayout.createSequentialGroup()
                        .addComponent(lblAliciAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAliciMailS, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlYedekParcaFaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAliciTelefonNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAliciMail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(pnlYedekParcaFaturaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlYedekParcaFaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addContainerGap(61, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlYedekParcaFaturaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );
        pnlYedekParcaFaturaLayout.setVerticalGroup(
            pnlYedekParcaFaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlYedekParcaFaturaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblAudiIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnlYedekParcaFaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlYedekParcaFaturaLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(pnlYedekParcaFaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblParcaNoS)
                            .addComponent(lblParcaNo, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlYedekParcaFaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblParcaModelS)
                            .addComponent(lblParcaModel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlYedekParcaFaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblParcaAdiS)
                            .addComponent(lblParcaAdi))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlYedekParcaFaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblParcaTutarS)
                            .addComponent(lblParcaTutar)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlYedekParcaFaturaLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblYedekParcaIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 46, Short.MAX_VALUE)
                .addComponent(SepUst, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlYedekParcaFaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAliciTelefonNo)
                    .addGroup(pnlYedekParcaFaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblAliciTCS)
                        .addComponent(lblAliciTC)
                        .addComponent(lblAliciTelefonNoS)))
                .addGap(18, 18, 18)
                .addGroup(pnlYedekParcaFaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAliciMail)
                    .addGroup(pnlYedekParcaFaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblAliciAdiS)
                        .addComponent(lblAliciAdi)
                        .addComponent(lblAliciMailS)))
                .addGap(48, 48, 48)
                .addComponent(SepAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlYedekParcaFatura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlYedekParcaFatura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator SepAlt;
    private javax.swing.JSeparator SepUst;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblAliciAdi;
    private javax.swing.JLabel lblAliciAdiS;
    private javax.swing.JLabel lblAliciMail;
    private javax.swing.JLabel lblAliciMailS;
    private javax.swing.JLabel lblAliciTC;
    private javax.swing.JLabel lblAliciTCS;
    private javax.swing.JLabel lblAliciTelefonNo;
    private javax.swing.JLabel lblAliciTelefonNoS;
    private javax.swing.JLabel lblAudiIcon;
    private javax.swing.JLabel lblParcaAdi;
    private javax.swing.JLabel lblParcaAdiS;
    private javax.swing.JLabel lblParcaModel;
    private javax.swing.JLabel lblParcaModelS;
    private javax.swing.JLabel lblParcaNo;
    private javax.swing.JLabel lblParcaNoS;
    private javax.swing.JLabel lblParcaTutar;
    private javax.swing.JLabel lblParcaTutarS;
    private javax.swing.JLabel lblYedekParcaIcon;
    private javax.swing.JPanel pnlYedekParcaFatura;
    // End of variables declaration//GEN-END:variables

}
