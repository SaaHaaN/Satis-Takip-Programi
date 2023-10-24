package Project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AdminSatisTakip extends javax.swing.JFrame {

    String[] columns = {"Satiş Takip No", "Sasi No / Parca No", "Model / Parca Adı", "Müşteri Ad Soyad", "KullaniciAdi"};
    String[][] data = new String[0][5];
    DefaultTableModel tableModel = new DefaultTableModel(data, columns);


    /* Creates new form {name} */
    public AdminSatisTakip() {
        initComponents();

        setLocationRelativeTo(null);
        setResizable(false);

        tableSatisTakip.setModel(tableModel);

        tableModel.setColumnCount(5);

        //Table'da sütünları değiştirmeyi ve boyutlarını ayarlamayı devre dışı bırakıyorum
        tableSatisTakip.getTableHeader().setReorderingAllowed(false);

        //Tablodaki Sütunların Genişlikleri..
        tableSatisTakip.getTableHeader().setReorderingAllowed(false);
        tableSatisTakip.getColumnModel().getColumn(0).setPreferredWidth(70);
        tableSatisTakip.getColumnModel().getColumn(1).setPreferredWidth(100);
        tableSatisTakip.getColumnModel().getColumn(2).setPreferredWidth(70);
        tableSatisTakip.getColumnModel().getColumn(3).setPreferredWidth(70);
        tableSatisTakip.getColumnModel().getColumn(3).setPreferredWidth(70);

        tabloYazdir(); // Yapmış olduğum database verilermi tabloyu yazdıran metot..
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pMenuPanel = new javax.swing.JPopupMenu();
        pMemuTemizle = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        pMenuSeciliTemizle = new javax.swing.JMenuItem();
        pMenuTxtTemizle = new javax.swing.JMenuItem();
        pMenuTable = new javax.swing.JPopupMenu();
        pMenuItemTableTemizle = new javax.swing.JMenuItem();
        pMenuTxtAdSoyad = new javax.swing.JPopupMenu();
        adSoyadtxt = new javax.swing.JMenuItem();
        pMenuTxtSasiParcaNo = new javax.swing.JPopupMenu();
        sasiParcaNoTxt = new javax.swing.JMenuItem();
        pMenuTxtModelParcaAdi = new javax.swing.JPopupMenu();
        modelParcaAdiTxt = new javax.swing.JMenuItem();
        AdminSatisPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableSatisTakip = new javax.swing.JTable();
        lblSatısTakip = new javax.swing.JLabel();
        txtSatisTakipNo = new javax.swing.JTextField();
        lblSasiParcaNo = new javax.swing.JLabel();
        txtSasiParca = new javax.swing.JTextField();
        lblParcaModelAd = new javax.swing.JLabel();
        txtModelParcaAdi = new javax.swing.JTextField();
        lblAdSoyad = new javax.swing.JLabel();
        txtAdSoyad = new javax.swing.JTextField();
        lblKullaniciAdi = new javax.swing.JLabel();
        txtMusteriKulalniciAdi = new javax.swing.JTextField();
        lblAra = new javax.swing.JLabel();
        txtAra = new javax.swing.JTextField();
        btnAra = new javax.swing.JButton();
        btnYenile = new javax.swing.JButton();
        lblIcon1 = new javax.swing.JLabel();
        lblIcon2 = new javax.swing.JLabel();
        btnSatisSil = new javax.swing.JButton();

        pMemuTemizle.setText("Tümünü Temzile");
        pMemuTemizle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pMemuTemizleActionPerformed(evt);
            }
        });
        pMenuPanel.add(pMemuTemizle);
        pMenuPanel.add(jSeparator1);

        pMenuSeciliTemizle.setText("Tabloda Seçiliyi Temizle");
        pMenuSeciliTemizle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pMenuSeciliTemizleActionPerformed(evt);
            }
        });
        pMenuPanel.add(pMenuSeciliTemizle);

        pMenuTxtTemizle.setText("Özellikleri Temizle");
        pMenuTxtTemizle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pMenuTxtTemizleActionPerformed(evt);
            }
        });
        pMenuPanel.add(pMenuTxtTemizle);

        pMenuItemTableTemizle.setText("Seçili Veriyi Temizle");
        pMenuItemTableTemizle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pMenuItemTableTemizleActionPerformed(evt);
            }
        });
        pMenuTable.add(pMenuItemTableTemizle);

        adSoyadtxt.setText("Ad Soyad Bilgisi Temizle");
        adSoyadtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adSoyadtxtActionPerformed(evt);
            }
        });
        pMenuTxtAdSoyad.add(adSoyadtxt);

        sasiParcaNoTxt.setText("Sasi ya da Parca No Bilgisi Temizle");
        sasiParcaNoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sasiParcaNoTxtActionPerformed(evt);
            }
        });
        pMenuTxtSasiParcaNo.add(sasiParcaNoTxt);

        modelParcaAdiTxt.setText("Model ya da Parca Adı Bilgisi Temizle");
        modelParcaAdiTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modelParcaAdiTxtActionPerformed(evt);
            }
        });
        pMenuTxtModelParcaAdi.add(modelParcaAdiTxt);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        AdminSatisPanel.setBackground(new java.awt.Color(255, 153, 0));
        AdminSatisPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Satış Takip Kontrol Paneli   ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        AdminSatisPanel.setComponentPopupMenu(pMenuPanel);

        tableSatisTakip.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tableSatisTakip.setComponentPopupMenu(pMenuTable);
        tableSatisTakip.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tableSatisTakip.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tableSatisTakip.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableSatisTakipMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableSatisTakip);

        lblSatısTakip.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblSatısTakip.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSatısTakip.setText("Satiş Takip No");

        txtSatisTakipNo.setEditable(false);
        txtSatisTakipNo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lblSasiParcaNo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblSasiParcaNo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSasiParcaNo.setText("Sasi yada Parca No");

        txtSasiParca.setEditable(false);
        txtSasiParca.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtSasiParca.setComponentPopupMenu(pMenuTxtSasiParcaNo);

        lblParcaModelAd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblParcaModelAd.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblParcaModelAd.setText("Model yada Parça Adi");

        txtModelParcaAdi.setEditable(false);
        txtModelParcaAdi.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtModelParcaAdi.setComponentPopupMenu(pMenuTxtModelParcaAdi);

        lblAdSoyad.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblAdSoyad.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAdSoyad.setText("Musteri Ad Soyad");

        txtAdSoyad.setEditable(false);
        txtAdSoyad.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtAdSoyad.setComponentPopupMenu(pMenuTxtAdSoyad);

        lblKullaniciAdi.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblKullaniciAdi.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblKullaniciAdi.setText("Müşteri Kullanıcı Adı");

        txtMusteriKulalniciAdi.setEditable(false);
        txtMusteriKulalniciAdi.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lblAra.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblAra.setText("Satış Takip Arama");

        txtAra.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        btnAra.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAra.setText("Ara");
        btnAra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAraActionPerformed(evt);
            }
        });

        btnYenile.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnYenile.setText("Yenile");
        btnYenile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYenileActionPerformed(evt);
            }
        });

        lblIcon1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIcon1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Şahan\\Documents\\NetBeansProjects\\Project\\src\\main\\java\\Project\\PNG\\Satis.png")); // NOI18N

        lblIcon2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIcon2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Şahan\\Documents\\NetBeansProjects\\Project\\src\\main\\java\\Project\\PNG\\SatisTakip.png")); // NOI18N

        btnSatisSil.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSatisSil.setText("Satışı Sil");
        btnSatisSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSatisSilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AdminSatisPanelLayout = new javax.swing.GroupLayout(AdminSatisPanel);
        AdminSatisPanel.setLayout(AdminSatisPanelLayout);
        AdminSatisPanelLayout.setHorizontalGroup(
            AdminSatisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdminSatisPanelLayout.createSequentialGroup()
                .addGroup(AdminSatisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(AdminSatisPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AdminSatisPanelLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(AdminSatisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblIcon2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblAra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(txtAra, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAra, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnYenile, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(AdminSatisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AdminSatisPanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(AdminSatisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AdminSatisPanelLayout.createSequentialGroup()
                                .addComponent(lblParcaModelAd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtModelParcaAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AdminSatisPanelLayout.createSequentialGroup()
                                .addGroup(AdminSatisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(AdminSatisPanelLayout.createSequentialGroup()
                                        .addComponent(lblAdSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 1, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AdminSatisPanelLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(lblKullaniciAdi)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(AdminSatisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtMusteriKulalniciAdi)
                                    .addComponent(txtAdSoyad, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))))
                        .addContainerGap(21, Short.MAX_VALUE))
                    .addGroup(AdminSatisPanelLayout.createSequentialGroup()
                        .addGroup(AdminSatisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(AdminSatisPanelLayout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(btnSatisSil))
                            .addGroup(AdminSatisPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(AdminSatisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblIcon1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(AdminSatisPanelLayout.createSequentialGroup()
                                        .addGroup(AdminSatisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lblSasiParcaNo, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                                            .addComponent(lblSatısTakip, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(AdminSatisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtSatisTakipNo)
                                            .addComponent(txtSasiParca, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        AdminSatisPanelLayout.setVerticalGroup(
            AdminSatisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdminSatisPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AdminSatisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(AdminSatisPanelLayout.createSequentialGroup()
                        .addComponent(lblIcon1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(AdminSatisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSatisTakipNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSatısTakip))
                        .addGap(18, 18, 18)
                        .addGroup(AdminSatisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSasiParcaNo)
                            .addComponent(txtSasiParca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(AdminSatisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtModelParcaAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblParcaModelAd))
                        .addGap(18, 18, 18)
                        .addGroup(AdminSatisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAdSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAdSoyad))
                        .addGap(18, 18, 18)
                        .addGroup(AdminSatisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMusteriKulalniciAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblKullaniciAdi))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSatisSil))
                    .addGroup(AdminSatisPanelLayout.createSequentialGroup()
                        .addComponent(lblIcon2, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(AdminSatisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAra)
                            .addComponent(txtAra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAra)
                            .addComponent(btnYenile))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AdminSatisPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AdminSatisPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pMemuTemizleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pMemuTemizleActionPerformed
        // Panael üzerinden Tüm seçili veya Yazılı şeyleri temizlemek
        tableSatisTakip.clearSelection();

        txtAdSoyad.setText("");
        txtSasiParca.setText("");
        txtModelParcaAdi.setText("");
    }//GEN-LAST:event_pMemuTemizleActionPerformed

    private void pMenuSeciliTemizleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pMenuSeciliTemizleActionPerformed
        // Panael üzerinden veriyi Temizleme
        tableSatisTakip.clearSelection();
    }//GEN-LAST:event_pMenuSeciliTemizleActionPerformed

    private void pMenuTxtTemizleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pMenuTxtTemizleActionPerformed
        // Panael üzerinden Yazılı verileri Temizleme
        txtAdSoyad.setText("");
        txtSasiParca.setText("");
        txtModelParcaAdi.setText("");
    }//GEN-LAST:event_pMenuTxtTemizleActionPerformed

    private void pMenuItemTableTemizleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pMenuItemTableTemizleActionPerformed
        // Tablo üstünden Seçili veriyi Temizleme
        tableSatisTakip.clearSelection();
    }//GEN-LAST:event_pMenuItemTableTemizleActionPerformed

    private void adSoyadtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adSoyadtxtActionPerformed
        // Sasi TxtFilds Temizleme
        txtAdSoyad.setText("");
    }//GEN-LAST:event_adSoyadtxtActionPerformed

    private void sasiParcaNoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sasiParcaNoTxtActionPerformed
        // Model TxtFilds Temizleme
        txtSasiParca.setText("");
    }//GEN-LAST:event_sasiParcaNoTxtActionPerformed

    private void modelParcaAdiTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modelParcaAdiTxtActionPerformed
        // Model Yili TxtFilds Temizleme
        txtModelParcaAdi.setText("");
    }//GEN-LAST:event_modelParcaAdiTxtActionPerformed

    private void btnYenileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYenileActionPerformed
        // Veri Ekledikten veya herhangi bir işlem yaptıktan sonra tabloyu yenilemek için yani ekrana yazdırmak için..
        tableModel.setRowCount(0);
        tabloYazdir();

        txtAdSoyad.setText("");
        txtSasiParca.setText("");
        txtModelParcaAdi.setText("");
    }//GEN-LAST:event_btnYenileActionPerformed

    private void btnAraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAraActionPerformed
        // Satış Takip Arama
        String arama = txtAra.getText();
        tableModel.setRowCount(0);

        if (txtAra.getText().isBlank()) {
            tabloYazdir();
            JOptionPane.showMessageDialog(rootPane, "Aramak İstediğiniz Müşteriye Ait Ad Soyad, Aldığı Araç ya da Yedek Parça Bilgisini Girin.",
                    "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            try ( Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/araba", "root", "1234");) {
                System.out.println("Database connected");
                Statement st = connection.createStatement();
                String sql = "select * from satistakip where SatisTakipNo like '%" + arama
                        + "%' OR SasiParcaNo like '%" + arama
                        + "%' OR ModelParca like '%" + arama
                        + "%' OR AdSoyad like '%" + arama + "%'";
                // Eğer araç alınmışsa şasi numarası yada tableModel alınan eğerki yedek parça ise parça numarası yada parça adı
                // Ek olarak ad soyad aramısı yapılıyor
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    String a = rs.getString("SatisTakipNo");
                    String b = rs.getString("SasiParcaNo");
                    String c = rs.getString("ModelParca");
                    String d = rs.getString("AdSoyad");
                    String e = rs.getString("KullaniciAdi");

                    // Tabloya Primry key olarak Satiş Takip No yazılıyor. Geriye ise Model adı yada parça adı,
                    // Devamında ise alan kişinın adı soyadı ve aldığı hesabın kullanıcı adı yazılıyor..
                    tableModel.addRow(new Object[]{a, b, c, d, e});
                }
                if (tableSatisTakip.getRowCount() == 0) {  // Arama sonucunda veri açığa çıkmamış ise uyarı verip Listeyi en baştan yazıyor.
                    tabloYazdir();  // Kendi metodum..
                    txtAra.setText("");  // Arama TxtFields temizledi..
                    JOptionPane.showMessageDialog(rootPane, "Aranan Satış Takip Numarası, Müşteri, Aldığı Araç ya da Yedek Parça Bilgisi Bulunamadı.",
                            "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException e) {
                System.out.println("Database error " + e);
            }
        }
    }//GEN-LAST:event_btnAraActionPerformed

    private void tableSatisTakipMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableSatisTakipMouseClicked
        // Veri Seçilince TxtFields'larda verileri görmek için..

        int satir = tableSatisTakip.getSelectedRow();//Hangi satır seçili...
        String SatisTakipNo = String.valueOf(tableSatisTakip.getValueAt(satir, 0));  // seçtğim satırda olan arabanın sasi Numarası..

        if (tableSatisTakip.getSelectedRow() < 0) {
            return;
        }

        try ( Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/araba", "root", "1234");) {
            System.out.println("Database connected");
            Statement st = connection.createStatement();
            String sql = "select * from satistakip Where SatisTakipNo=" + SatisTakipNo;
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                String a = rs.getString("SatisTakipNo");
                String b = rs.getString("SasiParcaNo");
                String c = rs.getString("ModelParca");
                String d = rs.getString("AdSoyad");
                String e = rs.getString("KullaniciAdi");

                txtSatisTakipNo.setText(a);
                txtSasiParca.setText(b);
                txtModelParcaAdi.setText(c);
                txtAdSoyad.setText(d);
                txtMusteriKulalniciAdi.setText(e);

            }
        } catch (SQLException e) {
            System.out.println("Database error " + e);
        }
    }//GEN-LAST:event_tableSatisTakipMouseClicked

    private void btnSatisSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSatisSilActionPerformed
        // Admin Satış Silmek isterse

        int satir = tableSatisTakip.getSelectedRow();//Hangi satır seçili...
        String SatisTakipNo = String.valueOf(tableSatisTakip.getValueAt(satir, 0));  // seçtğim satırda olan arabanın sasi Numarası..

        try ( Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/araba", "root", "1234");) {
            System.out.println("Database connected");
            Statement st = connection.createStatement();
            String sql = "Delete from satistakip where SatisTakipNo =" + SatisTakipNo;
            //Satış silerken seçili olan satırda satırda Satış Takip Numarası ile silme işlemi yapılıyor bu sayade karışıklık olmuyor 
            //ve seçilen şasi numarasına ait aracın silme işlemi yapılıyor
            int x = JOptionPane.showConfirmDialog(rootPane, "Satışı Silmek İstiyor musun?", "Warning", JOptionPane.YES_NO_OPTION);

            if (x == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(rootPane, "Satış Başarıyla Silindi.", "Silme İşlemi Başarılı", JOptionPane.INFORMATION_MESSAGE);
            } else {
                return; // Eğerki "No" seçilirse silmiyor..
            }
            st.executeUpdate(sql);

        } catch (SQLException e) {
            System.out.println("Database error " + e);
        }
    }//GEN-LAST:event_btnSatisSilActionPerformed

    public void tabloYazdir() {
        try ( Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/araba", "root", "1234");) {
            System.out.println("Database connected");
            Statement st = connection.createStatement();
            String sql = "select * from satisTakip";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                String a = rs.getString("SatisTakipNo");
                String b = rs.getString("SasiParcaNo");
                String c = rs.getString("ModelParca");
                String d = rs.getString("AdSoyad");
                String e = rs.getString("KullaniciAdi");

                tableModel.addRow(new Object[]{a, b, c, d, e});

            }
        } catch (SQLException e) {
            System.out.println("Database error " + e);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AdminSatisPanel;
    private javax.swing.JMenuItem adSoyadtxt;
    private javax.swing.JButton btnAra;
    private javax.swing.JButton btnSatisSil;
    private javax.swing.JButton btnYenile;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel lblAdSoyad;
    private javax.swing.JLabel lblAra;
    private javax.swing.JLabel lblIcon1;
    private javax.swing.JLabel lblIcon2;
    private javax.swing.JLabel lblKullaniciAdi;
    private javax.swing.JLabel lblParcaModelAd;
    private javax.swing.JLabel lblSasiParcaNo;
    private javax.swing.JLabel lblSatısTakip;
    private javax.swing.JMenuItem modelParcaAdiTxt;
    private javax.swing.JMenuItem pMemuTemizle;
    private javax.swing.JMenuItem pMenuItemTableTemizle;
    private javax.swing.JPopupMenu pMenuPanel;
    private javax.swing.JMenuItem pMenuSeciliTemizle;
    private javax.swing.JPopupMenu pMenuTable;
    private javax.swing.JPopupMenu pMenuTxtAdSoyad;
    private javax.swing.JPopupMenu pMenuTxtModelParcaAdi;
    private javax.swing.JPopupMenu pMenuTxtSasiParcaNo;
    private javax.swing.JMenuItem pMenuTxtTemizle;
    private javax.swing.JMenuItem sasiParcaNoTxt;
    private javax.swing.JTable tableSatisTakip;
    private javax.swing.JTextField txtAdSoyad;
    private javax.swing.JTextField txtAra;
    private javax.swing.JTextField txtModelParcaAdi;
    private javax.swing.JTextField txtMusteriKulalniciAdi;
    private javax.swing.JTextField txtSasiParca;
    private javax.swing.JTextField txtSatisTakipNo;
    // End of variables declaration//GEN-END:variables

}
