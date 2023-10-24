package Project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class MusteriLogin extends javax.swing.JFrame {

    /* Creates new form MusteriLogin*/
    public MusteriLogin() {
        initComponents();
        
        setLocationRelativeTo(null);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MusteriGirisPanel = new javax.swing.JPanel();
        AudiIcon = new javax.swing.JLabel();
        MusteriIcon = new javax.swing.JLabel();
        lblYazi = new javax.swing.JLabel();
        lblKadi = new javax.swing.JLabel();
        txtKullaniciAdi = new javax.swing.JTextField();
        lblSifre = new javax.swing.JLabel();
        txtSifre = new javax.swing.JPasswordField();
        btnMusteriLogin = new javax.swing.JButton();
        lblUyeDegilMisin = new javax.swing.JLabel();
        btnUyeOl = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setMinimumSize(new java.awt.Dimension(400, 400));

        MusteriGirisPanel.setBackground(new java.awt.Color(204, 204, 204));
        MusteriGirisPanel.setForeground(new java.awt.Color(102, 102, 102));
        MusteriGirisPanel.setMinimumSize(new java.awt.Dimension(400, 400));
        MusteriGirisPanel.setPreferredSize(new java.awt.Dimension(400, 400));

        AudiIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AudiIcon.setIcon(new javax.swing.ImageIcon("C:\\Users\\Şahan\\Documents\\NetBeansProjects\\Project\\src\\main\\java\\Project\\PNG\\AudiLogoMusteriLogin.png")); // NOI18N

        MusteriIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MusteriIcon.setIcon(new javax.swing.ImageIcon("C:\\Users\\Şahan\\Documents\\NetBeansProjects\\Project\\src\\main\\java\\Project\\PNG\\MusteriLogoAAudiIcon.png")); // NOI18N

        lblYazi.setBackground(new java.awt.Color(255, 255, 255));
        lblYazi.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblYazi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblYazi.setText("Audi Servis Müşteri Ekranı");

        lblKadi.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblKadi.setText("Kullanıcı Adı");

        lblSifre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblSifre.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSifre.setText("Şifre");

        btnMusteriLogin.setBackground(new java.awt.Color(0, 0, 0));
        btnMusteriLogin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnMusteriLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnMusteriLogin.setText("Giriş");
        btnMusteriLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMusteriLoginActionPerformed(evt);
            }
        });

        lblUyeDegilMisin.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblUyeDegilMisin.setForeground(new java.awt.Color(51, 51, 51));
        lblUyeDegilMisin.setText("Üye Değil misiniz ?");

        btnUyeOl.setBackground(new java.awt.Color(0, 0, 0));
        btnUyeOl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnUyeOl.setForeground(new java.awt.Color(255, 255, 255));
        btnUyeOl.setText("ÜYE OL");
        btnUyeOl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUyeOlActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MusteriGirisPanelLayout = new javax.swing.GroupLayout(MusteriGirisPanel);
        MusteriGirisPanel.setLayout(MusteriGirisPanelLayout);
        MusteriGirisPanelLayout.setHorizontalGroup(
            MusteriGirisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MusteriGirisPanelLayout.createSequentialGroup()
                .addGroup(MusteriGirisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MusteriGirisPanelLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(MusteriGirisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(MusteriIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AudiIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblYazi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(MusteriGirisPanelLayout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addGroup(MusteriGirisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblUyeDegilMisin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnUyeOl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(MusteriGirisPanelLayout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addGroup(MusteriGirisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnMusteriLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(MusteriGirisPanelLayout.createSequentialGroup()
                                .addComponent(lblSifre, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSifre, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(MusteriGirisPanelLayout.createSequentialGroup()
                                .addComponent(lblKadi)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtKullaniciAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        MusteriGirisPanelLayout.setVerticalGroup(
            MusteriGirisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MusteriGirisPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(AudiIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MusteriIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblYazi)
                .addGap(26, 26, 26)
                .addGroup(MusteriGirisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKadi)
                    .addComponent(txtKullaniciAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(MusteriGirisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSifre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSifre))
                .addGap(18, 18, 18)
                .addComponent(btnMusteriLogin)
                .addGap(18, 18, 18)
                .addComponent(lblUyeDegilMisin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUyeOl)
                .addGap(51, 51, 51))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MusteriGirisPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MusteriGirisPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMusteriLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMusteriLoginActionPerformed
        // Müşteri Giriş yaparken...
        
        MusteriIslemEkranı musteri = new MusteriIslemEkranı(txtKullaniciAdi.getText());

        String kullaniciAdi = txtKullaniciAdi.getText();
        String sifre = txtSifre.getText();
        String pozisyon = "Musteri";  // giriş yapan kişi database üzerinden "Musteri" pozisyonun dda kayıtlı ise doğru giriş yapılıyor..

        try ( Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/araba", "root", "1234");) {
            System.out.println("Database connected");
            Statement st = connection.createStatement();
            String sql = "select * from insan where KullaniciAdi='" + kullaniciAdi + "' and Sifre='" + sifre + "' and pozisyon='" + pozisyon + "'";
            
            // Databasede "Musteri" pozisyonunda olan ve doğru kullanıcı adı ve şifre yazılmışsa giriş yapılabilir aksi taktirdi giriş yapılamaz..
            
            if (txtKullaniciAdi.getText().isBlank()) {
                JOptionPane.showMessageDialog(rootPane, "Lütfen Kullanıcı Adınızı girin", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (txtSifre.getText().isBlank()) {
                JOptionPane.showMessageDialog(rootPane, "Lütfen Şifrenizi girin", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                dispose();
                musteri.setVisible(true);

            } else {
                JOptionPane.showMessageDialog(rootPane, "Kullanıcı Adınızı yada Şifrenizi Kontrol Edin", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            System.out.println("Database error " + e);
        }
    }//GEN-LAST:event_btnMusteriLoginActionPerformed

    private void btnUyeOlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUyeOlActionPerformed
        // Bir müşteri üye olmak istiyorsa buraya basar ve üye olmak için açılan panele gider.
        UyeOlma uyeOlma = new UyeOlma();
        uyeOlma.setVisible(true);
    }//GEN-LAST:event_btnUyeOlActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AudiIcon;
    private javax.swing.JPanel MusteriGirisPanel;
    private javax.swing.JLabel MusteriIcon;
    private javax.swing.JButton btnMusteriLogin;
    private javax.swing.JButton btnUyeOl;
    private javax.swing.JLabel lblKadi;
    private javax.swing.JLabel lblSifre;
    private javax.swing.JLabel lblUyeDegilMisin;
    private javax.swing.JLabel lblYazi;
    private javax.swing.JTextField txtKullaniciAdi;
    private javax.swing.JPasswordField txtSifre;
    // End of variables declaration//GEN-END:variables
}
