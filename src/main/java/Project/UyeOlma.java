package Project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

public class UyeOlma extends javax.swing.JFrame {

    private Connection con = null;
    private Statement statement = null;

    /* Creates new form {name} */
    public UyeOlma() {

        initComponents();

        setLocationRelativeTo(null);
        setResizable(false);

        if (chcBoxOnay.isSelected()) {
            btnKaydol.setEnabled(true);
        }

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver Bulunamadı....");
        }
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/araba", "root", "1234");
            System.out.println("Database connected");
        } catch (SQLException e) {
            System.out.println("Database error " + e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtTC = new javax.swing.JTextField();
        txtAdSoyad = new javax.swing.JTextField();
        txtTelefonNo = new javax.swing.JTextField();
        txtEMail = new javax.swing.JTextField();
        txtKullaniciAdi = new javax.swing.JTextField();
        txtPFSfire = new javax.swing.JPasswordField();
        txtPDTekrarSifre = new javax.swing.JPasswordField();
        btnKaydol = new javax.swing.JButton();
        btnVazgec = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        chcBoxOnay = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 475));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "AUDI SERVİS ÜYE OLMA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setMinimumSize(new java.awt.Dimension(400, 475));

        txtTC.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N

        txtAdSoyad.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N

        txtTelefonNo.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N

        txtEMail.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N

        txtKullaniciAdi.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N

        txtPFSfire.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N

        txtPDTekrarSifre.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N

        btnKaydol.setBackground(new java.awt.Color(0, 0, 0));
        btnKaydol.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnKaydol.setForeground(new java.awt.Color(255, 255, 255));
        btnKaydol.setText("Kaydol");
        btnKaydol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKaydolActionPerformed(evt);
            }
        });

        btnVazgec.setBackground(new java.awt.Color(0, 0, 0));
        btnVazgec.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnVazgec.setForeground(new java.awt.Color(255, 255, 255));
        btnVazgec.setText("Vazgeç");
        btnVazgec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVazgecActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Şahan\\Documents\\NetBeansProjects\\Project\\src\\main\\java\\Project\\PNG\\UyeOl.png")); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Şahan\\Documents\\NetBeansProjects\\Project\\src\\main\\java\\Project\\PNG\\UyeEMail.png")); // NOI18N
        jLabel2.setText("E-Mail");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Şahan\\Documents\\NetBeansProjects\\Project\\src\\main\\java\\Project\\PNG\\UyeAdSoyad.png")); // NOI18N
        jLabel3.setText("Ad Soyad");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("AUDI Servisine Üye Olmak İçin Lütfen Bilgilerinizi Giriniz");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Şahan\\Documents\\NetBeansProjects\\Project\\src\\main\\java\\Project\\PNG\\UyeTC.png")); // NOI18N
        jLabel5.setText("TC Kimlik NO");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Şahan\\Documents\\NetBeansProjects\\Project\\src\\main\\java\\Project\\PNG\\UyeTelefon.png")); // NOI18N
        jLabel6.setText("Telefon Numarası");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Şahan\\Documents\\NetBeansProjects\\Project\\src\\main\\java\\Project\\PNG\\UyeKullanıcıAdı.png")); // NOI18N
        jLabel7.setText("Kullanıcı Adı");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\Şahan\\Documents\\NetBeansProjects\\Project\\src\\main\\java\\Project\\PNG\\UyeSifre.png")); // NOI18N
        jLabel8.setText("Şifre");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\Şahan\\Documents\\NetBeansProjects\\Project\\src\\main\\java\\Project\\PNG\\UyeSifre.png")); // NOI18N
        jLabel9.setText("Şifre Doğrulama");

        chcBoxOnay.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        chcBoxOnay.setText("Kullanıcı Sözleşmesini Okudum ve Onaylıyorum.");
        chcBoxOnay.setOpaque(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(btnKaydol, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(btnVazgec))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTC, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelefonNo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEMail, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPFSfire, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtKullaniciAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPDTekrarSifre, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAdSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(chcBoxOnay, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAdSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefonNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtKullaniciAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPFSfire, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPDTekrarSifre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addComponent(chcBoxOnay)
                .addGap(7, 7, 7)
                .addComponent(btnKaydol)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVazgec)
                .addGap(26, 26, 26))
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

    private void btnKaydolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKaydolActionPerformed
        // Kullnıcı Kayıt Olma

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
        if (txtPFSfire.getText().isBlank()) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen Şifre Giriniz. En az 6 Karakter. 1 Tane Sayı İçermeli.",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String RegexSifre = txtPFSfire.getText();
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
                        String telNo = txtTelefonNo.getText();
                        String email = txtEMail.getText();
                        String kullaniciAdi = txtKullaniciAdi.getText();
                        String sifre = txtPFSfire.getText();
                        String pozisyon = "Musteri"; // // Kayıt Ederken pozisyonu Admin olarak otomatik kendi kayıt ediyor

                        String sql = "Insert Into insan (TC, AdSoyad, TelefonNo, EMail, KullaniciAdi, Sifre, pozisyon) "
                                + "VALUES(" + "'" + tc + "'," + "'" + adSoyad + "'," + "'" + telNo
                                + "'," + "'" + email + "'," + "'" + kullaniciAdi + "'," + "'" + sifre + "'," + "'" + pozisyon + "')";

                        if (chcBoxOnay.isSelected()) {
                            st.executeUpdate(sql);
                        } else {
                            JOptionPane.showMessageDialog(rootPane, "Lütfen Kullanıcı Sözleşmesini Onaylayınız", "Başarısız", JOptionPane.ERROR_MESSAGE);
                            return;
                        }

                        JOptionPane.showMessageDialog(rootPane, "Kayıt Başarılı. AUDI Alilesine Hoşgeldiniz.", "Onaylandı", JOptionPane.INFORMATION_MESSAGE);
                        this.dispose();

                    } catch (SQLException e) {

                        // Kullanıcı Telefon Numarası ve E-Mail adresini güncellerken Uniqe olması gerekiyor..
                        // Eğer ki Uniqe olmayan bir veri girerse hata alıcak ve hataya göre de karşına uyarı gelmesi gerekiyor..
                        // Burada databaseden gelen hataya göre ekranda kullanıcın girdiği verilerin hangisinde hata olduğunu görmesi için hazırladım..
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
    }//GEN-LAST:event_btnKaydolActionPerformed

    private void btnVazgecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVazgecActionPerformed
        // Üye olmaktan vazgeçer ve kapatmak isterse
        this.dispose();
    }//GEN-LAST:event_btnVazgecActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKaydol;
    private javax.swing.JButton btnVazgec;
    private javax.swing.JCheckBox chcBoxOnay;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtAdSoyad;
    private javax.swing.JTextField txtEMail;
    private javax.swing.JTextField txtKullaniciAdi;
    private javax.swing.JPasswordField txtPDTekrarSifre;
    private javax.swing.JPasswordField txtPFSfire;
    private javax.swing.JTextField txtTC;
    private javax.swing.JTextField txtTelefonNo;
    // End of variables declaration//GEN-END:variables

}
