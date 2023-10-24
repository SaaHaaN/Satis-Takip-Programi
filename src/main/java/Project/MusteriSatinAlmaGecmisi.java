package Project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MusteriSatinAlmaGecmisi extends javax.swing.JFrame {

    String[] columns = {"Satiş Takip No", "Sasi No / Parca No", "Model / Parca Adı"};
    String[][] data = new String[0][3];
    DefaultTableModel tableModel = new DefaultTableModel(data, columns);

    String kAdi;

    // Constructor yardımyıla databasedeki uygun verileri çekip ekranına yazdırdım..
    public MusteriSatinAlmaGecmisi(String kullanciAdi) {
        initComponents();

        setLocationRelativeTo(null);
        setResizable(false);

        kAdi = kullanciAdi;

        tableSatisTakip.setModel(tableModel);

        tableModel.setColumnCount(3);

        //Table'da sütünları değiştirmeyi ve boyutlarını ayarlamayı devre dışı bırakıyorum
        tableSatisTakip.getTableHeader().setReorderingAllowed(false);

        //Tablodaki Sütunların Genişlikleri..
        tableSatisTakip.getTableHeader().setReorderingAllowed(false);
        tableSatisTakip.getColumnModel().getColumn(0).setPreferredWidth(50);
        tableSatisTakip.getColumnModel().getColumn(1).setPreferredWidth(50);
        tableSatisTakip.getColumnModel().getColumn(2).setPreferredWidth(50);

        tabloYazdir(kAdi); // Yapmış olduğum database verilermi tabloyu yazdıran metot..
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlSatisTakip = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableSatisTakip = new javax.swing.JTable();
        lblIcon = new javax.swing.JLabel();
        lblAra = new javax.swing.JLabel();
        txtAra = new javax.swing.JTextField();
        btnAra = new javax.swing.JButton();
        btnYenile = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnlSatisTakip.setBackground(new java.awt.Color(255, 102, 102));
        pnlSatisTakip.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "AUDI Servis Müşteri Satın Alım Geçmişi", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

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
        jScrollPane1.setViewportView(tableSatisTakip);

        lblIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIcon.setIcon(new javax.swing.ImageIcon("C:\\Users\\Şahan\\Documents\\NetBeansProjects\\Project\\src\\main\\java\\Project\\PNG\\SatınAlmaGecmisi.png")); // NOI18N

        lblAra.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblAra.setText("Satın Alma Geçmişi Arama");

        txtAra.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

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

        javax.swing.GroupLayout pnlSatisTakipLayout = new javax.swing.GroupLayout(pnlSatisTakip);
        pnlSatisTakip.setLayout(pnlSatisTakipLayout);
        pnlSatisTakipLayout.setHorizontalGroup(
            pnlSatisTakipLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSatisTakipLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSatisTakipLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSatisTakipLayout.createSequentialGroup()
                        .addComponent(lblAra)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAra, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAra, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnYenile)))
                .addContainerGap())
        );
        pnlSatisTakipLayout.setVerticalGroup(
            pnlSatisTakipLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSatisTakipLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(pnlSatisTakipLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAra)
                    .addComponent(txtAra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAra)
                    .addComponent(btnYenile))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlSatisTakip, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlSatisTakip, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAraActionPerformed
        // Satış Takip Arama
        String arama = txtAra.getText();
        tableModel.setRowCount(0);

        if (txtAra.getText().isBlank()) {
            tabloYazdir(kAdi);
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
                    tabloYazdir(kAdi);  // Kendi metodum..
                    txtAra.setText("");  // Arama TxtFields temizledi..
                    JOptionPane.showMessageDialog(rootPane, "Aranan Müşteriye Ait Ad Soyad, Aldığı Araç ya da Yedek Parça Bilgisi Bulunamadı.",
                            "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException e) {
                System.out.println("Database error " + e);
            }
        }
    }//GEN-LAST:event_btnAraActionPerformed

    private void btnYenileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYenileActionPerformed
        // TODO add your handling code here:
        tableModel.setRowCount(0);  // Araya bastıktan sonra Table sıfırlayıp tekrar yazılmasın diye..
        tabloYazdir(kAdi);
        txtAra.setText("");
    }//GEN-LAST:event_btnYenileActionPerformed

    public void tabloYazdir(String kullaniciA) {
        // Bu Frame aslında tüm projenin amacı ve ödevin asıl amacıdır. Bu Frame de bir müşterinin kendisine ait satın alma geçmişi
        // ve satın aldığı tüm araçlar ya da yedek parçalar tablo halinde gösterilmektedir..
        try ( Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/araba", "root", "1234");) {
            System.out.println("Database connected");
            Statement st = connection.createStatement();
            String sql = "select * from satistakip where KullaniciAdi='" + kAdi + "'";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                String a = rs.getString("SatisTakipNo");
                String b = rs.getString("SasiParcaNo");
                String c = rs.getString("ModelParca");

                tableModel.addRow(new Object[]{a, b, c});

            }
        } catch (SQLException e) {
            System.out.println("Database error " + e);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAra;
    private javax.swing.JButton btnYenile;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAra;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JPanel pnlSatisTakip;
    private javax.swing.JTable tableSatisTakip;
    private javax.swing.JTextField txtAra;
    // End of variables declaration//GEN-END:variables

}
