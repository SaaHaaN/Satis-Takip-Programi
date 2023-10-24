package Project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class MusteriBilgileriniGoster extends javax.swing.JFrame {

    String kAdi;

    // Constructor yardımyıla databasedeki uygun verileri çekip ekranına yazdırdım..
    public MusteriBilgileriniGoster(String kullanciAdi) {

        initComponents();

        setLocationRelativeTo(null);
        setResizable(false);

        kAdi = kullanciAdi;

        txtTC.setEditable(false);  // TC gözüküyor ama değiştirilemiyor..
        txtKullaniciAdi.setEditable(false);  // Kullanici Adi gözüküyor ama değiştirilemiyor..

        bilgileriYaz();  // Databaseden verileri alıp TxtFiledsları yazdırmak için yaptığım metot..
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBilgiler = new javax.swing.JPanel();
        lblIcon = new javax.swing.JLabel();
        lblTC = new javax.swing.JLabel();
        txtTC = new javax.swing.JTextField();
        lblAdSoyad = new javax.swing.JLabel();
        txtAdSoyad = new javax.swing.JTextField();
        lblTel = new javax.swing.JLabel();
        txtTelefonNo = new javax.swing.JTextField();
        lblEMail = new javax.swing.JLabel();
        txtEMail = new javax.swing.JTextField();
        lblKAdi = new javax.swing.JLabel();
        txtKullaniciAdi = new javax.swing.JTextField();
        lblSifre = new javax.swing.JLabel();
        txtPSSifre = new javax.swing.JPasswordField();
        btnGuncelle = new javax.swing.JButton();
        btnVazgec = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnlBilgiler.setBackground(new java.awt.Color(0, 255, 255));

        lblIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIcon.setIcon(new javax.swing.ImageIcon("C:\\Users\\Şahan\\Documents\\NetBeansProjects\\Project\\src\\main\\java\\Project\\PNG\\Bilgileri Güncelle.png")); // NOI18N

        lblTC.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTC.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTC.setText("TC");

        txtTC.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtTC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTCMouseClicked(evt);
            }
        });

        lblAdSoyad.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblAdSoyad.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAdSoyad.setText("Ad Soyad");

        txtAdSoyad.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        lblTel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTel.setText("Telefon Numarası");

        txtTelefonNo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        lblEMail.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblEMail.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEMail.setText("E-Mail Adresi");

        txtEMail.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        lblKAdi.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblKAdi.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblKAdi.setText("Kullanici Adi");

        txtKullaniciAdi.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtKullaniciAdi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtKullaniciAdiMouseClicked(evt);
            }
        });

        lblSifre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblSifre.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSifre.setText("Şifre");

        txtPSSifre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        btnGuncelle.setBackground(new java.awt.Color(0, 0, 0));
        btnGuncelle.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnGuncelle.setForeground(new java.awt.Color(255, 255, 255));
        btnGuncelle.setText("Güncelle ve Kaydet");
        btnGuncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuncelleActionPerformed(evt);
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

        javax.swing.GroupLayout pnlBilgilerLayout = new javax.swing.GroupLayout(pnlBilgiler);
        pnlBilgiler.setLayout(pnlBilgilerLayout);
        pnlBilgilerLayout.setHorizontalGroup(
            pnlBilgilerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBilgilerLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(pnlBilgilerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBilgilerLayout.createSequentialGroup()
                        .addGroup(pnlBilgilerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblEMail, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTel)
                            .addComponent(lblKAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSifre, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAdSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTC, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlBilgilerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtKullaniciAdi)
                            .addComponent(txtEMail)
                            .addComponent(txtAdSoyad, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtTelefonNo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlBilgilerLayout.createSequentialGroup()
                                .addComponent(txtTC, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtPSSifre)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBilgilerLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlBilgilerLayout.createSequentialGroup()
                        .addComponent(btnGuncelle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(2, 2, 2)))
                .addGap(56, 56, 56))
            .addGroup(pnlBilgilerLayout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(btnVazgec, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlBilgilerLayout.setVerticalGroup(
            pnlBilgilerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBilgilerLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(lblIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(pnlBilgilerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTC)
                    .addComponent(txtTC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlBilgilerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAdSoyad)
                    .addComponent(txtAdSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlBilgilerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTel)
                    .addComponent(txtTelefonNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlBilgilerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEMail)
                    .addComponent(txtEMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlBilgilerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKAdi)
                    .addComponent(txtKullaniciAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlBilgilerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSifre)
                    .addComponent(txtPSSifre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(btnGuncelle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVazgec)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBilgiler, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBilgiler, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Kendi oluşturudğum ve giriş yapan kullanıcının kednsine ait bilgileri gördüğü metot..

    private void btnGuncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuncelleActionPerformed
        // Müşteri kendi bilgilerni kendisi güncellemek isterse bu ekrandan TC ve Kullanıcı Adı dışında olan verilerini değiştirebiliyor.

        String tc = txtTC.getText();
        String adSoyad = txtAdSoyad.getText();
        String telefonNO = txtTelefonNo.getText();
        String email = txtEMail.getText();
        String kullaniciAdi = txtKullaniciAdi.getText();
        String sifre = txtPSSifre.getText();

        Matcher matcher;

        //---------------------------------------------------------------------------------------------------------------------------
        if (txtTC.getText().isBlank()) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen Geçerli Bir TC Numarası Girin.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String RegexTC = txtTC.getText();
        matcher = Pattern.compile("^[1-9]{1}[0-9]{9}[02468]{1}$").matcher(RegexTC);
        if (!matcher.matches()) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen Geçerli Bir TC Numarası Girin. (11 Karakter)", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //---------------------------------------------------------------------------------------------------------------------------
        if (txtAdSoyad.getText().isBlank()) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen İsminizi Girin.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String RegexAdSoy = txtAdSoyad.getText();
        matcher = Pattern.compile("[A-z]{3,}\\s[A-z]{3,}").matcher(RegexAdSoy);
        if (!matcher.matches()) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen Geçerli Bir isim Girin. Örneğin; Şahan Aytekin", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //---------------------------------------------------------------------------------------------------------------------------
        if (txtTelefonNo.getText().isBlank()) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen Geçerli Bir Telefon Numarası Girin.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String RegexTelefonNo = txtTelefonNo.getText();
        matcher = Pattern.compile("^(05)([0-9]{2})([0-9]{3})([0-9]{2})([0-9]{2})$").matcher(RegexTelefonNo);
        if (!matcher.matches()) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen Geçerli Bir Telefon Numarası Girin. 05*********", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //---------------------------------------------------------------------------------------------------------------------------
        if (txtEMail.getText().isBlank()) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen Geçerli Bir E-Mail Adresi Girin.", "Error", JOptionPane.ERROR_MESSAGE);
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
            JOptionPane.showMessageDialog(rootPane, "Lütfen Geçerli Kullanıcı Adı Girin.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String RegexKullaniciAdi = txtKullaniciAdi.getText();
        matcher = Pattern.compile("[A-z]{4,}\\S").matcher(RegexKullaniciAdi);
        if (!matcher.matches()) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen Geçerli Bir Kullanıcı Adı Girin. En Az 5 Karakter", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //---------------------------------------------------------------------------------------------------------------------------
        if (txtPSSifre.getText().isBlank()) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen Geçerli Bir Şifre Girin.  En az 6 Karakter. 1 Tane Sayı İçermeli.",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String RegexSifre = txtPSSifre.getText();
        matcher = Pattern.compile("[A-z0-9]{6,}").matcher(RegexSifre);
        if (!matcher.matches()) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen Geçerli Bir Şifre Girin.  En az 5 Karakter ve 1 Tane Sayı İçermeli.",
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
                    String pozisyon = "Musteri"; // // Kayıt Ederken pozisyonu Admin olarak otomatik kendi kayıt ediyor
                    String sql = "update insan set AdSoyad='" + adSoyad
                            + "', TelefonNo='" + telefonNO
                            + "', EMail='" + email
                            + "', pozisyon='" + pozisyon
                            + "', Sifre='" + sifre + "' where TC='" + tc + "'";
                    //TC Kimlik  numarası ve Kullanici Adı dışındaki bilgierini değiştiiyor..

                    String sifreTekrar = "";
                    while (txtPSSifre.getText().compareTo(sifreTekrar) != 0) {
                        sifreTekrar = JOptionPane.showInputDialog(rootPane, "Lütfen Şifrenizi Girin", "Warning", JOptionPane.WARNING_MESSAGE);
                        if (txtPSSifre.getText().compareTo(sifreTekrar) != 0) {
                            JOptionPane.showConfirmDialog(rootPane, "Şifre Uyuşmuyor.", "Warning", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                    st.executeUpdate(sql);

                    JOptionPane.showConfirmDialog(rootPane, "Bilgileriniz Değiştirildi.", "Değiştirildi", JOptionPane.CLOSED_OPTION);
                    this.dispose();

                } catch (SQLException e) {

                    // Kullanıcı Telefon Numarası ve E-Mail adresini güncellerken Uniqe olması gerekiyor..
                    // Eğer ki Uniqe olmayan bir veri girerse hata alıcak ve hataya göre de karşına uyarı gelmesi gerekiyor..
                    // Burada databaseden gelen hataya göre ekranda kullanıcın girdiği verilerin hangisinde hata olduğunu görmesi için hazırladım..
                    if (bilgiler.emailUniqueMi(txtEMail.getText())) {
                        JOptionPane.showMessageDialog(rootPane, "E-Mail veya Telefon Numarası Zaten Kayıtlı. Lütfen Farklı Bir E-Mail Girin.",
                                "Bilgiler Güncellenmedi", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    if (bilgiler.telefonNoUniqueMi(telefonNO)) {
                        JOptionPane.showMessageDialog(rootPane, "Telefon Numarası Zaten Kayıtlı Lütfen Farklı Bir Telefon Numarası Girin.",
                                "Bilgiler Güncellenmedi", JOptionPane.ERROR_MESSAGE);
                    }
                    System.out.println("Database error" + e);
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
        }
//-------------------------------------------------------------------------------
    }//GEN-LAST:event_btnGuncelleActionPerformed

    private void txtTCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTCMouseClicked
        // TC Yazmak yada Veriyi Değiştirmek için tıklarsa hata veriryor..
        JOptionPane.showMessageDialog(rootPane, "TC Kimlik Numarası Değiştirilemez", "Error", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_txtTCMouseClicked

    private void btnVazgecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVazgecActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnVazgecActionPerformed

    private void txtKullaniciAdiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtKullaniciAdiMouseClicked
        // Kullanıcı Adını Yazmak yada Veriyi Değiştirmek için tıklarsa hata veriryor..
        JOptionPane.showMessageDialog(rootPane, "Kullanici Adı Değiştirilemez", "Error", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_txtKullaniciAdiMouseClicked

    public void bilgileriYaz() {
        try ( Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/araba", "root", "1234");) {
            System.out.println("Database connected");
            Statement st = connection.createStatement();
            String sql = "select * from insan where KullaniciAdi='" + kAdi + "'";
            //Giriş yaparken alınan kullanici adına göre giriş yapan kişini verileri alınıyor..
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                String a = rs.getString("TC");
                String b = rs.getString("AdSoyad");
                String c = rs.getString("TelefonNo");
                String d = rs.getString("EMail");
                String e = rs.getString("KullaniciAdi");
                String f = rs.getString("Sifre");

                //Veriler uygun olan TxtFileds'lara yazılıyor.
                txtTC.setText(a);
                txtAdSoyad.setText(b);
                txtTelefonNo.setText(c);
                txtEMail.setText(d);
                txtKullaniciAdi.setText(e);
                txtPSSifre.setText(f);

            }
        } catch (SQLException e) {
            System.out.println("Database error " + e);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuncelle;
    private javax.swing.JButton btnVazgec;
    private javax.swing.JLabel lblAdSoyad;
    private javax.swing.JLabel lblEMail;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JLabel lblKAdi;
    private javax.swing.JLabel lblSifre;
    private javax.swing.JLabel lblTC;
    private javax.swing.JLabel lblTel;
    private javax.swing.JPanel pnlBilgiler;
    private javax.swing.JTextField txtAdSoyad;
    private javax.swing.JTextField txtEMail;
    private javax.swing.JTextField txtKullaniciAdi;
    private javax.swing.JPasswordField txtPSSifre;
    private javax.swing.JTextField txtTC;
    private javax.swing.JTextField txtTelefonNo;
    // End of variables declaration//GEN-END:variables

}
