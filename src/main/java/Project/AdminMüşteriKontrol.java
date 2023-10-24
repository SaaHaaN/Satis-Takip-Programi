package Project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AdminMüşteriKontrol extends javax.swing.JFrame {

    String[] columns = {"TC", "Ad Soyad", "Telefon Numarası", "E-Mail", "Kullancı Adı", "Şifre"};
    String[][] data = new String[0][6];
    DefaultTableModel tableModel = new DefaultTableModel(data, columns);


    /* Creates new form {name} */
    public AdminMüşteriKontrol() {
        initComponents();

        setLocationRelativeTo(null);
        setResizable(false);

        tableMusteri.setModel(tableModel);

        tableModel.setColumnCount(6);

        //Tablodaki Sütunların Genişlikleri..
        tableMusteri.getTableHeader().setReorderingAllowed(false);
        tableMusteri.getColumnModel().getColumn(0).setPreferredWidth(75);
        tableMusteri.getColumnModel().getColumn(1).setPreferredWidth(90);
        tableMusteri.getColumnModel().getColumn(2).setPreferredWidth(80);
        tableMusteri.getColumnModel().getColumn(3).setPreferredWidth(100);
        tableMusteri.getColumnModel().getColumn(4).setPreferredWidth(90);
        tableMusteri.getColumnModel().getColumn(5).setPreferredWidth(65);

        tabloYazdir();  // Yapmış olduğum database verilermi tabloyu yazdıran metot..
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
        pMenuTxtTC = new javax.swing.JPopupMenu();
        tctxt = new javax.swing.JMenuItem();
        pMenuTxtTelefonNo = new javax.swing.JPopupMenu();
        telefonNoTxt = new javax.swing.JMenuItem();
        pMenuTxtEMail = new javax.swing.JPopupMenu();
        EMailTxt = new javax.swing.JMenuItem();
        pMenuTxtKullaniciAdi = new javax.swing.JPopupMenu();
        KullaniciAdiTxt = new javax.swing.JMenuItem();
        pMenuTxtSifre = new javax.swing.JPopupMenu();
        sifreTxt = new javax.swing.JMenuItem();
        AdminMusteriPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableMusteri = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtTC = new javax.swing.JTextField();
        txtAdSoyad = new javax.swing.JTextField();
        txtTelefonNo = new javax.swing.JTextField();
        txtEMail = new javax.swing.JTextField();
        txtKullaniciAdi = new javax.swing.JTextField();
        txtSifre = new javax.swing.JTextField();
        txtAra = new javax.swing.JTextField();
        btnMusteriAra = new javax.swing.JButton();
        btnMusteriYenile = new javax.swing.JButton();
        btnMusteriEkle = new javax.swing.JButton();
        btnMusteriGuncelle = new javax.swing.JButton();
        btnMusteriSil = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

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

        pMenuTxtTemizle.setText("Bilgileri Temizle");
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

        tctxt.setText("TC Bilgisi Temizle");
        tctxt.setActionCommand("Model Bilgisi Temizle");
        tctxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tctxtActionPerformed(evt);
            }
        });
        pMenuTxtTC.add(tctxt);

        telefonNoTxt.setText("Telefon Numarası Bilgisi Temizle");
        telefonNoTxt.setActionCommand("Model Yili Bilgisi Temizle");
        telefonNoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonNoTxtActionPerformed(evt);
            }
        });
        pMenuTxtTelefonNo.add(telefonNoTxt);

        EMailTxt.setText("E-Mail Bilgisi Temizle");
        EMailTxt.setActionCommand("Yakit Bilgileri Temizle");
        EMailTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EMailTxtActionPerformed(evt);
            }
        });
        pMenuTxtEMail.add(EMailTxt);

        KullaniciAdiTxt.setText("Kullanici Adi Bilgisi Temizle");
        KullaniciAdiTxt.setActionCommand("Vites Bilgisi Temizle");
        KullaniciAdiTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KullaniciAdiTxtActionPerformed(evt);
            }
        });
        pMenuTxtKullaniciAdi.add(KullaniciAdiTxt);

        sifreTxt.setText("Sifre Bilgisi Temizle");
        sifreTxt.setActionCommand("Stok Bilgisi Temizle");
        sifreTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sifreTxtActionPerformed(evt);
            }
        });
        pMenuTxtSifre.add(sifreTxt);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        AdminMusteriPanel.setBackground(new java.awt.Color(255, 153, 0));
        AdminMusteriPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "AUDI Servis Kayıtlı Müşteri Kontrol Paneli     ", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        AdminMusteriPanel.setComponentPopupMenu(pMenuPanel);

        tableMusteri.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tableMusteri.setComponentPopupMenu(pMenuTable);
        tableMusteri.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tableMusteri.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMusteriMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableMusteri);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("TC");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Ad Soyad");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Telefon No");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("E-Mail");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Kullanici Adi");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Şifre");

        txtTC.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtTC.setComponentPopupMenu(pMenuTxtTC);

        txtAdSoyad.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtAdSoyad.setComponentPopupMenu(pMenuTxtAdSoyad);

        txtTelefonNo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtTelefonNo.setComponentPopupMenu(pMenuTxtTelefonNo);

        txtEMail.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtEMail.setComponentPopupMenu(pMenuTxtEMail);

        txtKullaniciAdi.setComponentPopupMenu(pMenuTxtKullaniciAdi);

        txtSifre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtSifre.setComponentPopupMenu(pMenuTxtSifre);

        txtAra.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        btnMusteriAra.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnMusteriAra.setText("Ara");
        btnMusteriAra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMusteriAraActionPerformed(evt);
            }
        });

        btnMusteriYenile.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnMusteriYenile.setText("Yenile");
        btnMusteriYenile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMusteriYenileActionPerformed(evt);
            }
        });

        btnMusteriEkle.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnMusteriEkle.setText("Yeni Müşteri Ekle");
        btnMusteriEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMusteriEkleActionPerformed(evt);
            }
        });

        btnMusteriGuncelle.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnMusteriGuncelle.setText("Bilgileri Güncelle");
        btnMusteriGuncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMusteriGuncelleActionPerformed(evt);
            }
        });

        btnMusteriSil.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnMusteriSil.setText("Müşteri Sil");
        btnMusteriSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMusteriSilActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Müşteri Arama");

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Şahan\\Documents\\NetBeansProjects\\Project\\src\\main\\java\\Project\\PNG\\AdminMusteriKontrol.png")); // NOI18N
        jLabel7.setToolTipText("");

        javax.swing.GroupLayout AdminMusteriPanelLayout = new javax.swing.GroupLayout(AdminMusteriPanel);
        AdminMusteriPanel.setLayout(AdminMusteriPanelLayout);
        AdminMusteriPanelLayout.setHorizontalGroup(
            AdminMusteriPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdminMusteriPanelLayout.createSequentialGroup()
                .addGroup(AdminMusteriPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(AdminMusteriPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AdminMusteriPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAra, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnMusteriAra, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnMusteriYenile, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addGroup(AdminMusteriPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(AdminMusteriPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnMusteriGuncelle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnMusteriEkle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                        .addComponent(btnMusteriSil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(AdminMusteriPanelLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSifre, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AdminMusteriPanelLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtKullaniciAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AdminMusteriPanelLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtEMail, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AdminMusteriPanelLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTelefonNo, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AdminMusteriPanelLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtAdSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AdminMusteriPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTC, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        AdminMusteriPanelLayout.setVerticalGroup(
            AdminMusteriPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdminMusteriPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(AdminMusteriPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtAra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMusteriAra)
                    .addComponent(btnMusteriYenile))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(AdminMusteriPanelLayout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(AdminMusteriPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(AdminMusteriPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAdSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(AdminMusteriPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefonNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(AdminMusteriPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(AdminMusteriPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtKullaniciAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(AdminMusteriPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSifre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(36, 36, 36)
                .addComponent(btnMusteriEkle)
                .addGap(18, 18, 18)
                .addComponent(btnMusteriGuncelle)
                .addGap(18, 18, 18)
                .addComponent(btnMusteriSil)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AdminMusteriPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AdminMusteriPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMusteriYenileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMusteriYenileActionPerformed
        // Veri Ekledikten veya herhangi bir işlem yaptıktan sonra tabloyu yenilemek için yani ekrana yazdırmak için..
        tableModel.setRowCount(0);
        tabloYazdir();

        txtTC.setText("");
        txtAdSoyad.setText("");
        txtTelefonNo.setText("");
        txtEMail.setText("");
        txtKullaniciAdi.setText("");
        txtSifre.setText("");
    }//GEN-LAST:event_btnMusteriYenileActionPerformed

    private void btnMusteriEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMusteriEkleActionPerformed
        // Müşteri Ekle
        Matcher matcher;

        //---------------------------------------------------------------------------------------------------------------------------
        if (txtTC.getText().isBlank()) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen TC Kimlik Numarası Giriniz.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String RegexTC = txtTC.getText();
        matcher = Pattern.compile("^[1-9]{1}[0-9]{9}[02468]{1}$").matcher(RegexTC);
        if (!matcher.matches()) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen Geçerli Bir TC Kimlik Numarası Giriniz. (11 Karakter)",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //---------------------------------------------------------------------------------------------------------------------------
        if (txtAdSoyad.getText().isBlank()) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen İsminizi Giriniz.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String RegexAdSoy = txtAdSoyad.getText();
        matcher = Pattern.compile("[A-z]{3,}\\s[A-z]{3,}").matcher(RegexAdSoy);
        if (!matcher.matches()) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen Geçerli Bir isim Giriniz. Örneğin; Şahan Aytekin", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //---------------------------------------------------------------------------------------------------------------------------
        if (txtTelefonNo.getText().isBlank()) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen  Telefon Numarası Giriniz.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String RegexTelefonNo = txtTelefonNo.getText();
        matcher = Pattern.compile("^(05)([0-9]{2})([0-9]{3})([0-9]{2})([0-9]{2})$").matcher(RegexTelefonNo);
        if (!matcher.matches()) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen Geçerli Bir Telefon Numarası Giriniz. 05*********", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //---------------------------------------------------------------------------------------------------------------------------
        if (txtEMail.getText().isBlank()) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen E-Mail Adresini Giriniz.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String RegexMail = txtEMail.getText();
        matcher = Pattern.compile("^[^0-9][A-z0-9]{3,}\\w*@((outlook)|(hotmail)|(gmail))(.com)$").matcher(RegexMail);
        if (!matcher.matches()) {
            JOptionPane.showMessageDialog(rootPane, "Mail Adresi Yanlış Girildi. Örneğin; audi@hotmail.com , audi@outlook.com , audi@gmail.com",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //---------------------------------------------------------------------------------------------------------------------------
        if (txtKullaniciAdi.getText().isBlank()) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen Kullanıcı Adı Giriniz.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String RegexKullaniciAdi = txtKullaniciAdi.getText();
        matcher = Pattern.compile("[a-z0-9]{4,}\\S").matcher(RegexKullaniciAdi);
        if (!matcher.matches()) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen Geçerli Bir Kullanıcı Adı Giriniz. En Az 5 Karakter ve Tüm Harflar Ufak Olmalı",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //---------------------------------------------------------------------------------------------------------------------------
        if (txtSifre.getText().isBlank()) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen Şifre Giriniz. En az 6 Karakter. 1 Tane Sayı İçermeli.",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String RegexSifre = txtSifre.getText();
        matcher = Pattern.compile("[A-z0-9]{6,}").matcher(RegexSifre);
        if (!matcher.matches()) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen Geçerli Bir Şifre Giriniz. En az 6 Karakter. 1 Tane Sayı İçermeli.",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Buraya kadar olan kısım TXTFieldslar boş mu diye kontorl ediyor..
        // ve ardından Regex sayesinde doğru girdilerin yazılması için uğraşıyor.
//---------------------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------------------
        BilgileriKontrolEt bilgiler = new BilgileriKontrolEt();

        if (!bilgiler.telefonNoUniqueMi(txtTelefonNo.getText())) {

            if (!bilgiler.emailUniqueMi(txtEMail.getText())) {

                if (!bilgiler.kullaniciAdiUniqueMi(txtKullaniciAdi.getText())) {

                    try ( Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/araba", "root", "1234");) {
                        System.out.println("Database connected");
                        Statement st = connection.createStatement();

                        String tc = txtTC.getText();
                        String adSoyad = txtAdSoyad.getText();
                        String telefonNO = txtTelefonNo.getText();
                        String email = txtEMail.getText();
                        String kullaniciAdi = txtKullaniciAdi.getText();
                        String sifre = txtSifre.getText();
                        String pozisyon = "Musteri"; // // Kayıt Ederken pozisyonu Müşteri olarak otomatik kendi kayıt ediyor

                        String sql = "Insert Into insan (TC, AdSoyad, TelefonNo, EMail, KullaniciAdi, Sifre, pozisyon) "
                                + "VALUES(" + "'" + tc + "'," + "'" + adSoyad + "'," + "'" + telefonNO
                                + "'," + "'" + email + "'," + "'" + kullaniciAdi + "'," + "'" + sifre + "'," + "'" + pozisyon + "')";

                        st.executeUpdate(sql);

                        JOptionPane.showMessageDialog(rootPane, "Kayıt Başarılı.", "Onaylandı", JOptionPane.INFORMATION_MESSAGE);

                    } catch (SQLException e) {
                        System.out.println("Database error" + e);
                        JOptionPane.showMessageDialog(rootPane, "Lütfen Bilgilerinizi Doğru Girin. TC Kimlik Numaranızın ve "
                                + "Diğer Bilgilerinizin Doğru Olduğundan Emin Olun.", "Kayıt Başarısız", JOptionPane.ERROR_MESSAGE);
                    }
//-------------------------------------------------------------------------------
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Kullanici Adi Daha Önce Alınmış Lütfen Farklı Bir Kullanici Adi Girin.",
                            "Bilgiler Güncellenmedi", JOptionPane.ERROR_MESSAGE);
                    return;

                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "E-Mail Daha Önce Alınmış Lütfen Farklı Bir E-Mail Girin.",
                        "Kayıt Başarısız", JOptionPane.ERROR_MESSAGE);
                return;
            }
//-------------------------------------------------------------------------------
        } else {
            JOptionPane.showMessageDialog(rootPane, "Telefon Numarası Zaten Kayıtlı Lütfen Farklı Bir Telefon Numarası Girin.",
                    "Kayıt Başarısız", JOptionPane.ERROR_MESSAGE);
            return;
        }

    }//GEN-LAST:event_btnMusteriEkleActionPerformed

    private void btnMusteriAraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMusteriAraActionPerformed
        //Admin Musteri Aramak isterse..

        String arama = txtAra.getText();
        tableModel.setRowCount(0);

        if (txtAra.getText().isBlank()) {
            tabloYazdir();
            JOptionPane.showMessageDialog(rootPane, "Aramak İstediğiniz Müşterinin TC Kimlik Numarasını ya da Ad Soyad Bilgilerni Girin.",
                    "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            try ( Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/araba", "root", "1234");) {
                System.out.println("Database connected");
                Statement st = connection.createStatement();
                String sql = "select * from insan where TC like '%" + arama + "%' OR AdSoyad like '%" + arama + "%'";
                // TC ya da AdSoyad'a göre arama yapıyor
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    String a = rs.getString("TC");
                    String b = rs.getString("AdSoyad");
                    String c = rs.getString("TelefonNo");
                    String d = rs.getString("EMail");
                    String e = rs.getString("KullaniciAdi");
                    String f = rs.getString("Sifre");
                    tableModel.addRow(new Object[]{a, b, c, d, e, f});
                }
                if (tableMusteri.getRowCount() == 0) {  // Arama sonucunda veri açığa çıkmamış ise uyarı verip Listeyi en baştan yazıyor.
                    tabloYazdir(); // Kendi metodum..
                    txtAra.setText(""); // Arama TxtFields temizledi..
                    JOptionPane.showMessageDialog(rootPane, "Aranan Müşteri bulunamadı.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException e) {
                System.out.println("Database error " + e);
            }
        }
    }//GEN-LAST:event_btnMusteriAraActionPerformed

    private void btnMusteriSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMusteriSilActionPerformed
        // Admin Müşteri Silmek isterse

        int satir = tableMusteri.getSelectedRow();//Hangi satır seçili...
        String tcNo = String.valueOf(tableMusteri.getValueAt(satir, 0));  // seçtğim satırda olan müşterinin TC'si

        try ( Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/araba", "root", "1234");) {
            System.out.println("Database connected");
            Statement st = connection.createStatement();
            String sql = "Delete from insan where TC =" + tcNo;
            //Secili müşterinin TC Kimlik Numarası ile kontrol sağlanıyor ve o tcyi ait müşteri Siliniyor.
            int x = JOptionPane.showConfirmDialog(rootPane, "Müşteriyi Silmek İstiyor musun?", "Warning", JOptionPane.YES_NO_OPTION);

            if (x == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(rootPane, "Müşteri Başarıyla Silindi.", "Silme İşlemi Başarılı", JOptionPane.INFORMATION_MESSAGE);
            } else {
                return;
            }
            st.executeUpdate(sql);

        } catch (SQLException e) {
            System.out.println("Database error " + e);
        }
    }//GEN-LAST:event_btnMusteriSilActionPerformed

    private void btnMusteriGuncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMusteriGuncelleActionPerformed
        // Müşteri Bilgilerini Güncelleme
        String tc = txtTC.getText();
        String adSoyad = txtAdSoyad.getText();
        String telefonNO = txtTelefonNo.getText();
        String email = txtEMail.getText();
        String kullaniciAdi = txtKullaniciAdi.getText();
        String sifre = txtSifre.getText();

        Matcher matcher;

        //---------------------------------------------------------------------------------------------------------------------------
        if (txtTC.getText().isBlank()) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen TC Kimlik Numarası Giriniz.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String RegexTC = txtTC.getText();
        matcher = Pattern.compile("^[1-9]{1}[0-9]{9}[02468]{1}$").matcher(RegexTC);
        if (!matcher.matches()) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen Geçerli Bir TC Kimlik Numarası Giriniz. (11 Karakter)",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //---------------------------------------------------------------------------------------------------------------------------
        if (txtAdSoyad.getText().isBlank()) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen İsminizi Giriniz.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String RegexAdSoy = txtAdSoyad.getText();
        matcher = Pattern.compile("[A-z]{3,}\\s[A-z]{3,}").matcher(RegexAdSoy);
        if (!matcher.matches()) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen Geçerli Bir isim Giriniz. Örneğin; Şahan Aytekin", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //---------------------------------------------------------------------------------------------------------------------------
        if (txtTelefonNo.getText().isBlank()) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen  Telefon Numarası Giriniz.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String RegexTelefonNo = txtTelefonNo.getText();
        matcher = Pattern.compile("^(05)([0-9]{2})([0-9]{3})([0-9]{2})([0-9]{2})$").matcher(RegexTelefonNo);
        if (!matcher.matches()) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen Geçerli Bir Telefon Numarası Giriniz. 05*********", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //---------------------------------------------------------------------------------------------------------------------------
        if (txtEMail.getText().isBlank()) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen E-Mail Adresini Giriniz.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String RegexMail = txtEMail.getText();
        matcher = Pattern.compile("^[^0-9][A-z0-9]{3,}\\w*@((outlook)|(hotmail)|(gmail))(.com)$").matcher(RegexMail);
        if (!matcher.matches()) {
            JOptionPane.showMessageDialog(rootPane, "Mail Adresi Yanlış Girildi. Örneğin; audi@hotmail.com , audi@outlook.com , audi@gmail.com",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //---------------------------------------------------------------------------------------------------------------------------
        if (txtKullaniciAdi.getText().isBlank()) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen Kullanıcı Adı Giriniz.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String RegexKullaniciAdi = txtKullaniciAdi.getText();
        matcher = Pattern.compile("[a-z0-9]{4,}\\S").matcher(RegexKullaniciAdi);
        if (!matcher.matches()) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen Geçerli Bir Kullanıcı Adı Giriniz. En Az 5 Karakter ve Tüm Harflar Ufak Olmalı",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //---------------------------------------------------------------------------------------------------------------------------
        if (txtSifre.getText().isBlank()) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen Şifre Giriniz. En az 6 Karakter. 1 Tane Sayı İçermeli.",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String RegexSifre = txtSifre.getText();
        matcher = Pattern.compile("[A-z0-9]{6,}").matcher(RegexSifre);
        if (!matcher.matches()) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen Geçerli Bir Şifre Giriniz. En az 6 Karakter. 1 Tane Sayı İçermeli.",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Buraya kadar olan kısım TXTFieldslar boş mu diye kontorl ediyor..
        // ve ardından Regex sayesinde doğru girdilerin yazılması için uğraşıyor.
//---------------------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------------------
        BilgileriKontrolEt bilgiler = new BilgileriKontrolEt();

        if (!bilgiler.telefonNoUniqueMi(txtTelefonNo.getText()) || txtTelefonNo.getText().equals(telefonNO)) {

            if (!bilgiler.emailUniqueMi(txtEMail.getText()) || txtEMail.getText().equals(email)) {

                try ( Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/araba", "root", "1234");) {
                    System.out.println("Database connected");
                    Statement st = connection.createStatement();
                    String sql = "update insan set AdSoyad='" + adSoyad
                            + "', TelefonNo='" + telefonNO
                            + "', EMail='" + email
                            + "', KullaniciAdi='" + kullaniciAdi
                            + "', Sifre='" + sifre + "' where TC='" + tc + "'";
                    //TC Kimlik  numarası ve Kullanici Adı dışındaki bilgierini değiştiiyor..

                    st.executeUpdate(sql);

                    JOptionPane.showConfirmDialog(rootPane, "Müşteri Bilgileri Değiştirildi.", "Değiştirildi", JOptionPane.CLOSED_OPTION);

                } catch (SQLException e) {
                    if (bilgiler.emailUniqueMi(email)) {
                        JOptionPane.showMessageDialog(rootPane, "E-Mail Daha Önce Alınmış Lütfen Farklı Bir E-Mail Girin.",
                                "Bilgiler Güncellenmedi", JOptionPane.ERROR_MESSAGE);
                        return;
                    } else if (bilgiler.telefonNoUniqueMi(telefonNO)) {
                        JOptionPane.showMessageDialog(rootPane, "Telefon Numarası Zaten Kayıtlı Lütfen Farklı Bir Telefon Numarası Girin.",
                                "Bilgiler Güncellenmedi", JOptionPane.ERROR_MESSAGE);
                    }
                    System.out.println("Database error " + e);

                }
//-------------------------------------------------------------------------------
            } else {
                JOptionPane.showMessageDialog(rootPane, "E-Mail Daha Önce Alınmış Lütfen Farklı Bir E-Mail Girin.",
                        "Bilgiler Güncellenmedi", JOptionPane.ERROR_MESSAGE);
                return;
            }
//-------------------------------------------------------------------------------
        } else {
            JOptionPane.showMessageDialog(rootPane, "Telefon Numarası Zaten Kayıtlı Lütfen Farklı Bir Telefon Numarası Girin.",
                    "Bilgiler Güncellenmedi", JOptionPane.ERROR_MESSAGE);
            return;
        }
//-------------------------------------------------------------------------------
    }//GEN-LAST:event_btnMusteriGuncelleActionPerformed

    private void tableMusteriMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMusteriMouseClicked
        // Veri Seçilince TxtFields'larda verileri görmek için..

        int satir = tableMusteri.getSelectedRow();//Hangi satır seçili...
        String tcNo = String.valueOf(tableMusteri.getValueAt(satir, 0));  // seçtğim satırda olan müşterinin TC'si

        if (tableMusteri.getSelectedRow() < 0) {
            return;
        }

        try ( Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/araba", "root", "1234");) {
            System.out.println("Database connected");
            Statement st = connection.createStatement();
            String sql = "select * from insan Where TC=" + tcNo;
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                String a = rs.getString("TC");
                String b = rs.getString("AdSoyad");
                String c = rs.getString("TelefonNo");
                String d = rs.getString("EMail");
                String e = rs.getString("KullaniciAdi");
                String f = rs.getString("Sifre");

                txtTC.setText(a);
                txtAdSoyad.setText(b);
                txtTelefonNo.setText(c);
                txtEMail.setText(d);
                txtKullaniciAdi.setText(e);
                txtSifre.setText(f);

            }
        } catch (SQLException e) {
            System.out.println("Database error " + e);
        }
    }//GEN-LAST:event_tableMusteriMouseClicked

    private void pMemuTemizleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pMemuTemizleActionPerformed
        // Panael üzerinden Tüm seçili veya Yazılı şeyleri temizlemek

        tableMusteri.clearSelection();

        txtTC.setText("");
        txtAdSoyad.setText("");
        txtTelefonNo.setText("");
        txtEMail.setText("");
        txtKullaniciAdi.setText("");
        txtSifre.setText("");
    }//GEN-LAST:event_pMemuTemizleActionPerformed

    private void pMenuSeciliTemizleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pMenuSeciliTemizleActionPerformed
        // Panael üzerinden veriyi Temizleme
        tableMusteri.clearSelection();
    }//GEN-LAST:event_pMenuSeciliTemizleActionPerformed

    private void pMenuTxtTemizleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pMenuTxtTemizleActionPerformed
        // Panael üzerinden Yazılı verileri Temizleme
        txtTC.setText("");
        txtAdSoyad.setText("");
        txtTelefonNo.setText("");
        txtEMail.setText("");
        txtKullaniciAdi.setText("");
        txtSifre.setText("");
    }//GEN-LAST:event_pMenuTxtTemizleActionPerformed

    private void pMenuItemTableTemizleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pMenuItemTableTemizleActionPerformed
        // Tablo üstünden Seçili veriyi Temizleme
        tableMusteri.clearSelection();
    }//GEN-LAST:event_pMenuItemTableTemizleActionPerformed

    private void adSoyadtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adSoyadtxtActionPerformed
        // Ad SoyAd TxtFilds Temizleme
        txtAdSoyad.setText("");
    }//GEN-LAST:event_adSoyadtxtActionPerformed

    private void tctxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tctxtActionPerformed
        // TC TxtFilds Temizleme
        txtTC.setText("");
    }//GEN-LAST:event_tctxtActionPerformed

    private void telefonNoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonNoTxtActionPerformed
        // TelefonNo TxtFilds Temizleme
        txtTelefonNo.setText("");
    }//GEN-LAST:event_telefonNoTxtActionPerformed

    private void EMailTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EMailTxtActionPerformed
        // EMail TxtFilds Temizleme
        txtEMail.setText("");
    }//GEN-LAST:event_EMailTxtActionPerformed

    private void KullaniciAdiTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KullaniciAdiTxtActionPerformed
        // KullaniciAdi TxtFilds Temizleme
        txtKullaniciAdi.setText("");
    }//GEN-LAST:event_KullaniciAdiTxtActionPerformed

    private void sifreTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sifreTxtActionPerformed
        // Şifre TxtFilds Temizleme
        txtSifre.setText("");
    }//GEN-LAST:event_sifreTxtActionPerformed

    public void tabloYazdir() {
        String pozisyon = "Musteri"; // Tabloya yazarken Pozisyonu Müşteri olanları yazıp onlar üzerinden işlem yapılıyor.
        try ( Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/araba", "root", "1234");) {
            System.out.println("Database connected");
            Statement st = connection.createStatement();
            String sql = "select * from insan where pozisyon='" + pozisyon + "'";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                String a = rs.getString("TC");
                String b = rs.getString("AdSoyad");
                String c = rs.getString("TelefonNo");
                String d = rs.getString("EMail");
                String e = rs.getString("KullaniciAdi");
                String f = rs.getString("Sifre");
                tableModel.addRow(new Object[]{a, b, c, d, e, f});
            }
        } catch (SQLException e) {
            System.out.println("Database error " + e);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AdminMusteriPanel;
    private javax.swing.JMenuItem EMailTxt;
    private javax.swing.JMenuItem KullaniciAdiTxt;
    private javax.swing.JMenuItem adSoyadtxt;
    private javax.swing.JButton btnMusteriAra;
    private javax.swing.JButton btnMusteriEkle;
    private javax.swing.JButton btnMusteriGuncelle;
    private javax.swing.JButton btnMusteriSil;
    private javax.swing.JButton btnMusteriYenile;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem pMemuTemizle;
    private javax.swing.JMenuItem pMenuItemTableTemizle;
    private javax.swing.JPopupMenu pMenuPanel;
    private javax.swing.JMenuItem pMenuSeciliTemizle;
    private javax.swing.JPopupMenu pMenuTable;
    private javax.swing.JPopupMenu pMenuTxtAdSoyad;
    private javax.swing.JPopupMenu pMenuTxtEMail;
    private javax.swing.JPopupMenu pMenuTxtKullaniciAdi;
    private javax.swing.JPopupMenu pMenuTxtSifre;
    private javax.swing.JPopupMenu pMenuTxtTC;
    private javax.swing.JPopupMenu pMenuTxtTelefonNo;
    private javax.swing.JMenuItem pMenuTxtTemizle;
    private javax.swing.JMenuItem sifreTxt;
    private javax.swing.JTable tableMusteri;
    private javax.swing.JMenuItem tctxt;
    private javax.swing.JMenuItem telefonNoTxt;
    private javax.swing.JTextField txtAdSoyad;
    private javax.swing.JTextField txtAra;
    private javax.swing.JTextField txtEMail;
    private javax.swing.JTextField txtKullaniciAdi;
    private javax.swing.JTextField txtSifre;
    private javax.swing.JTextField txtTC;
    private javax.swing.JTextField txtTelefonNo;
    // End of variables declaration//GEN-END:variables

}
