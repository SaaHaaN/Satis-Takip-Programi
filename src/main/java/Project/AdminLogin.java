package Project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class AdminLogin extends javax.swing.JFrame {

    /* Creates new form {name} */
    public AdminLogin() {
        initComponents();

        setLocationRelativeTo(null);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlAdminLogin = new javax.swing.JPanel();
        lblIcon = new javax.swing.JLabel();
        lblYazi = new javax.swing.JLabel();
        lblKAd = new javax.swing.JLabel();
        lblSifre = new javax.swing.JLabel();
        txtKullaniciAdi = new javax.swing.JTextField();
        txtSifre = new javax.swing.JPasswordField();
        btnAdminLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 400));

        pnlAdminLogin.setBackground(new java.awt.Color(204, 204, 204));
        pnlAdminLogin.setMinimumSize(new java.awt.Dimension(400, 400));
        pnlAdminLogin.setPreferredSize(new java.awt.Dimension(400, 400));

        lblIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIcon.setIcon(new javax.swing.ImageIcon("C:\\Users\\Şahan\\Documents\\NetBeansProjects\\Project\\src\\main\\java\\Project\\PNG\\AdminLoginIcon.png")); // NOI18N
        lblIcon.setToolTipText("");

        lblYazi.setBackground(new java.awt.Color(204, 204, 204));
        lblYazi.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblYazi.setText("Audi Servis Admin Ekranı");

        lblKAd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblKAd.setText("Admin Kullanıcı Adı");

        lblSifre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblSifre.setText("Şifre");

        btnAdminLogin.setBackground(new java.awt.Color(0, 0, 0));
        btnAdminLogin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAdminLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnAdminLogin.setText("Giriş");
        btnAdminLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlAdminLoginLayout = new javax.swing.GroupLayout(pnlAdminLogin);
        pnlAdminLogin.setLayout(pnlAdminLoginLayout);
        pnlAdminLoginLayout.setHorizontalGroup(
            pnlAdminLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAdminLoginLayout.createSequentialGroup()
                .addContainerGap(83, Short.MAX_VALUE)
                .addGroup(pnlAdminLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAdminLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAdminLoginLayout.createSequentialGroup()
                            .addComponent(lblSifre, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtSifre, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAdminLoginLayout.createSequentialGroup()
                            .addComponent(lblKAd)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtKullaniciAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(btnAdminLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblYazi)
                    .addComponent(lblIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78))
        );
        pnlAdminLoginLayout.setVerticalGroup(
            pnlAdminLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAdminLoginLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(lblIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblYazi)
                .addGap(18, 18, 18)
                .addGroup(pnlAdminLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKAd)
                    .addComponent(txtKullaniciAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlAdminLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSifre)
                    .addComponent(txtSifre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAdminLogin)
                .addGap(113, 113, 113))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlAdminLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlAdminLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdminLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminLoginActionPerformed
        // Admin Giriş Butonu
        AdminIslemEkranı a = new AdminIslemEkranı(txtKullaniciAdi.getText());

        String kullaniciAdi = txtKullaniciAdi.getText();
        String sifre = txtSifre.getText();
        String pozisyon = "Admin"; // Databasede Admin Pozisyoununda olan verilerle işlem yapmak için..

        try ( Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/araba", "root", "1234");) {
            System.out.println("Database connected");
            Statement st = connection.createStatement();
            String sql = "select * from insan where KullaniciAdi='" + kullaniciAdi + "' and Sifre='" + sifre
                    + "' and pozisyon='" + pozisyon + "'";  //sql sorgusunda pozisyonu admin olarak kayıtlı olanları alıyor..

            if (txtKullaniciAdi.getText().isBlank()) {
                JOptionPane.showMessageDialog(rootPane, "Lütfen Admin Kullanıcı Adınızı girin", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (txtSifre.getText().isBlank()) {
                JOptionPane.showMessageDialog(rootPane, "Lütfen Şifrenizi girin", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                dispose();
                a.setVisible(true);

            } else {
                JOptionPane.showMessageDialog(rootPane, "Hatalı Kullanıcı Adı veya Şifre. Lütfen Kullanıcı Adınızı yada Şifrenizi Kontrol Edin",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            System.out.println("Database error " + e);
        }
    }//GEN-LAST:event_btnAdminLoginActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdminLogin;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JLabel lblKAd;
    private javax.swing.JLabel lblSifre;
    private javax.swing.JLabel lblYazi;
    private javax.swing.JPanel pnlAdminLogin;
    private javax.swing.JTextField txtKullaniciAdi;
    private javax.swing.JPasswordField txtSifre;
    // End of variables declaration//GEN-END:variables
}
