package Project;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class SatınAl_YedekParca extends javax.swing.JFrame {

    String[] columns = {"Parça Numarası", "Model", "Parça Adı", "Stok", "Fiyat"};
    String[][] data = new String[0][5];
    DefaultTableModel tableModel = new DefaultTableModel(data, columns);

    //Fatura için oluşturduğum değişkenler
    int anahtarTeslim;

    String Ftc;
    String Fadsoyad;
    String Ftelno;
    String Femail;
    String FkullaniciAdi;
    String Fsifre;

    String FParcaNo;
    String Fmodel;
    String FParcaAdi;
    String FFiyat;

    /* Creates new form {name} */
    public SatınAl_YedekParca(String kullaniciAdi) {
        initComponents();
        
        setLocationRelativeTo(null);
        setResizable(false);

        //Constructor'daki veriyi yerel değişkene atıyorum. Daha sonra bunun sayesinde databasedeki veriyi çekiyorum..
        FkullaniciAdi = kullaniciAdi;

        tableYedekParca.setModel(tableModel);
        tableModel.setColumnCount(5);

        //Table'da sütünları değiştirmeyi ve boyutlarını ayarlamayı devre dışı bırakıyorum
        tableYedekParca.getTableHeader().setReorderingAllowed(false);

        //Tablodaki Sütunların Genişlikleri..
        tableYedekParca.getColumnModel().getColumn(0).setPreferredWidth(30);
        tableYedekParca.getColumnModel().getColumn(1).setPreferredWidth(90);
        tableYedekParca.getColumnModel().getColumn(2).setPreferredWidth(80);
        tableYedekParca.getColumnModel().getColumn(3).setPreferredWidth(50);
        tableYedekParca.getColumnModel().getColumn(4).setPreferredWidth(60);

        tabloYazdır();  // Yapmış olduğum database verilermi tabloyu yazdıran metot..

        //---------------------------------------------------------------
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pMenuTablo = new javax.swing.JPopupMenu();
        pMenuItemTemizle = new javax.swing.JMenuItem();
        pMenuPanel = new javax.swing.JPopupMenu();
        pMenuItemTabloTemizle = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        pMenuItemFiyatTemizle = new javax.swing.JMenuItem();
        ArabaSatinAlimPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableYedekParca = new javax.swing.JTable();
        txtAra = new javax.swing.JTextField();
        btnAra = new javax.swing.JButton();
        btnSatınAl = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblParcaFiyat = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        pMenuItemTemizle.setText("Seçili Veriyi Temizle");
        pMenuItemTemizle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pMenuItemTemizleActionPerformed(evt);
            }
        });
        pMenuTablo.add(pMenuItemTemizle);

        pMenuItemTabloTemizle.setText("Seçili Veriyi Temizle");
        pMenuItemTabloTemizle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pMenuItemTabloTemizleActionPerformed(evt);
            }
        });
        pMenuPanel.add(pMenuItemTabloTemizle);
        pMenuPanel.add(jSeparator1);

        pMenuItemFiyatTemizle.setText("Fiyat Bilgileri Temizle");
        pMenuItemFiyatTemizle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pMenuItemFiyatTemizleActionPerformed(evt);
            }
        });
        pMenuPanel.add(pMenuItemFiyatTemizle);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        ArabaSatinAlimPanel.setBackground(new java.awt.Color(0, 153, 153));
        ArabaSatinAlimPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "AUDI Yedek Parça Satış ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        ArabaSatinAlimPanel.setComponentPopupMenu(pMenuPanel);
        ArabaSatinAlimPanel.setName(""); // NOI18N
        ArabaSatinAlimPanel.setRequestFocusEnabled(false);

        tableYedekParca.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tableYedekParca.setComponentPopupMenu(pMenuTablo);
        tableYedekParca.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tableYedekParca.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tableYedekParca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableYedekParcaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableYedekParca);

        txtAra.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        btnAra.setBackground(new java.awt.Color(0, 0, 0));
        btnAra.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAra.setForeground(new java.awt.Color(255, 255, 255));
        btnAra.setText("Ara");
        btnAra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAraActionPerformed(evt);
            }
        });

        btnSatınAl.setBackground(new java.awt.Color(0, 0, 0));
        btnSatınAl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSatınAl.setForeground(new java.awt.Color(255, 255, 255));
        btnSatınAl.setText("SATIN AL");
        btnSatınAl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSatınAlActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Satın Almak İstediğiniz Yedek Parçayı Ekranda Görebilirsiniz. Seçili Araç Üzerinden İşlem Yapılmaktadır.");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Parça Adı yada Yedek Parça Numarası Arama");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Yedek Parça Fiyat");

        lblParcaFiyat.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblParcaFiyat.setForeground(new java.awt.Color(255, 255, 255));
        lblParcaFiyat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblParcaFiyat.setText("--");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Şahan\\Documents\\NetBeansProjects\\Project\\src\\main\\java\\Project\\PNG\\YedekParcaSatınAl.png")); // NOI18N

        javax.swing.GroupLayout ArabaSatinAlimPanelLayout = new javax.swing.GroupLayout(ArabaSatinAlimPanel);
        ArabaSatinAlimPanel.setLayout(ArabaSatinAlimPanelLayout);
        ArabaSatinAlimPanelLayout.setHorizontalGroup(
            ArabaSatinAlimPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ArabaSatinAlimPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ArabaSatinAlimPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ArabaSatinAlimPanelLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtAra, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAra, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGroup(ArabaSatinAlimPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(ArabaSatinAlimPanelLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(ArabaSatinAlimPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ArabaSatinAlimPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblParcaFiyat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnSatınAl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(ArabaSatinAlimPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 34, Short.MAX_VALUE))
        );
        ArabaSatinAlimPanelLayout.setVerticalGroup(
            ArabaSatinAlimPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ArabaSatinAlimPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ArabaSatinAlimPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ArabaSatinAlimPanelLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(29, 29, 29)
                        .addGroup(ArabaSatinAlimPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAra, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAra, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ArabaSatinAlimPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(160, 160, 160)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblParcaFiyat)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSatınAl)))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ArabaSatinAlimPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ArabaSatinAlimPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void tabloYazdır() {
        //Database verilermi tabloyu yazdıran metot, bazı yerlerde kod tekrarından kurtarmıştır.
        try ( Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/araba", "root", "1234");) {
            System.out.println("Database connected");
            Statement st = connection.createStatement();
            String sql = "select * from yedekparca";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                String a = rs.getString("ParcaNo");
                String b = rs.getString("Model");
                String c = rs.getString("ParcaAdi");
                int d = rs.getInt("Stok");
                String e = rs.getString("Fiyat");

                tableModel.addRow(new Object[]{a, b, c, d, e});
            }
        } catch (SQLException e) {
            System.out.println("Database error " + e);
        }
    }

    private void btnSatınAlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSatınAlActionPerformed
        //Yedek Parça Satın Alma..

        int satir = tableYedekParca.getSelectedRow();//Hangi satır seçili...
        String secilendeger = String.valueOf(tableYedekParca.getValueAt(satir, 0));  // seçtğim satırda olan parçanın parça numarası..
        int secili = (int) tableYedekParca.getValueAt(satir, 3);  // seçtğim satırda olan parcanın stok sayısı

        if (tableYedekParca.getSelectedRowCount() == -1) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen Satın Almak istediğiniz Parçayı Seçin.",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } else if (secili == 0) {  // Eğerki stok yoksa satış yapılamıyor..
            JOptionPane.showMessageDialog(rootPane, "Parça Stoğu Bulunmamaktadır.",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int x = JOptionPane.showConfirmDialog(rootPane, "Yedek Parçanın Satın Alımı Onaylansın mı?", "", JOptionPane.YES_NO_OPTION);

        if (x == JOptionPane.YES_OPTION) {
            try ( Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/araba", "root", "1234");) {
                System.out.println("Database connected");
                Statement st = connection.createStatement();
                String sql = "Update yedekparca Set Stok = '" + (secili - 1) + "' where ParcaNo =" + secilendeger;
                // seçtiğim arac satın alınırsa stok sayısı 1 azalıyor
                st.executeUpdate(sql);
            } catch (SQLException e) {
                System.out.println("Database error " + e);
            }

            // Burada musteri Table ile oluşan databasedeki verilere ulaşıyorum
            try ( Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/araba", "root", "1234");) {
                System.out.println("Database connected");
                Statement st = connection.createStatement();
                // Kullanıcı adına göre alan kişi bulunuyor ve o kişinin verileri ile işlem yapılıyor..
                String sql = "select * from insan where KullaniciAdi='" + FkullaniciAdi + "'";
                ResultSet rs = st.executeQuery(sql);

                while (rs.next()) {
                    String a = rs.getString("TC");
                    String b = rs.getString("AdSoyad");
                    String c = rs.getString("TelefonNo");
                    String d = rs.getString("EMail");
                    String e = rs.getString("KullaniciAdi");
                    String f = rs.getString("Sifre");

                    // Değişkenler database verilerine atanıyor..
                    Ftc = a;
                    Fadsoyad = b;
                    Ftelno = c;
                    Femail = d;
                    FkullaniciAdi = e;
                    Fsifre = f;

                }
            } catch (SQLException e) {
                System.out.println("Database error " + e);
            }

            JOptionPane.showMessageDialog(rootPane, "Yedek Parçanın Satışı Tamamlanmıştır Faturanız Hazırlınıyor. Devam Etmek için Butona Basın.",
                    "Satış Onaylandı", JOptionPane.INFORMATION_MESSAGE);

            // fatura için parça bilgilerini tablodan alıyorum
            FParcaNo = String.valueOf(tableYedekParca.getValueAt(satir, 0));  // 0. indexte olan sütun Sasi Nuamrası
            Fmodel = String.valueOf(tableYedekParca.getValueAt(satir, 1));  // 1. indexte olan sütun modeli
            FParcaAdi = String.valueOf(tableYedekParca.getValueAt(satir, 2));  // 2. indexte olan sütun tableModel yılı

            //Fatura ekranı constructor yardımıyla database ile bağlayıp işlem yaptırıyorum.
            FaturaYedekParca f = new FaturaYedekParca(FParcaNo, Fmodel, FParcaAdi, FFiyat, Ftc, Fadsoyad, Ftelno, Femail);
            f.setVisible(true);

            this.dispose();

        } else {
            return;
        }
        //-----------------------------------------------------------------------------------------
        //-----------------------------------------------------------------------------------------
        //-----------------------------------------------------------------------------------------
        int satisTakipNo = 0;
        ArrayList numbers = new ArrayList();
        for (int i = 10000; i < 99999; i++) {
            numbers.add(i);
        }
        Collections.shuffle(numbers);

        for (int j = 0; j < 1; j++) {
            satisTakipNo = (int) numbers.get(j);
        }

        //Araç satın alındıktan sonra kullanıya ait olacak şekilde yeni bir database'e yazılıyor ve bu kullancıya özel olarak ayarlanıyor..
        try ( Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/araba", "root", "1234");) {
            System.out.println("Database connected");
            Statement st = connection.createStatement();
            String sql = "Insert Into satistakip (SatisTakipNo, SasiParcaNo, ModelParca, AdSoyad, KullaniciAdi)"
                    + "VALUES(" + "'" + satisTakipNo + "'," + "'" + FParcaNo + "'," + "'" + FParcaAdi + "'," + "'" + Fadsoyad + "'," + "'" + FkullaniciAdi + "')";
            // Faturada kullanıdğım bazı deüişkenlerden burada da yararlandım ve satın alma geçmişine ekledim..

            st.executeUpdate(sql);
        } catch (SQLException e) {
            System.out.println("Database error " + e);
        }
    }//GEN-LAST:event_btnSatınAlActionPerformed

    private void btnAraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAraActionPerformed
        // İstediğimiz yedek parçayı bulmak için

        String arama = txtAra.getText();
        tableModel.setRowCount(0);  // Araya bastıktan sonra Table sıfırlayıp tekrar yazılmasın diye..

        if (txtAra.getText().isBlank()) {
            tabloYazdır();
            JOptionPane.showMessageDialog(rootPane, "Aramak İstediğiniz Parçanın Modelini ya da Parça Numarasını Girin.",
                    "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            try ( Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/araba", "root", "1234");) {
                System.out.println("Database connected");
                Statement st = connection.createStatement();
                //Parça modeli yada parça numarasına göre arama yapılıyor..
                String sql = "select * from yedekparca where ParcaNo like '%" + arama + "%' OR ParcaAdi like '%" + arama + "%'";
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    String a = rs.getString("ParcaNo");
                    String b = rs.getString("Model");
                    String c = rs.getString("ParcaAdi");
                    int d = rs.getInt("Stok");
                    String e = rs.getString("Fiyat");

                    tableModel.addRow(new Object[]{a, b, c, d, e});
                }
                // eğerki arama sonucunda istenen parca bulunamıyorsa ekrana uyarı verip "tabloYazdır" metodum ile ekrana tüm araçlar yazılıyor.
                if (tableYedekParca.getRowCount() == 0) {
                    tabloYazdır();
                    txtAra.setText("");
                    JOptionPane.showMessageDialog(rootPane, "Aranan Parça Modeli ya da Parça Numarasınına Uygun Araç bulunamadı.",
                            "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException e) {
                System.out.println("Database error " + e);
            }
        }

    }//GEN-LAST:event_btnAraActionPerformed

    private void pMenuItemTemizleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pMenuItemTemizleActionPerformed
        // Table'a tıklayınca Table da seçili olan satırı temizliyor..
        tableYedekParca.clearSelection();
    }//GEN-LAST:event_pMenuItemTemizleActionPerformed

    private void pMenuItemTabloTemizleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pMenuItemTabloTemizleActionPerformed
        //  Panale Tıklayınca Table da seçili olan satırı temizliyor..
        tableYedekParca.clearSelection();
    }//GEN-LAST:event_pMenuItemTabloTemizleActionPerformed

    private void pMenuItemFiyatTemizleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pMenuItemFiyatTemizleActionPerformed
        // Panale Tıklayınca Fiyat Listesini temziliyor..
        lblParcaFiyat.setText("--");
    }//GEN-LAST:event_pMenuItemFiyatTemizleActionPerformed

    private void tableYedekParcaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableYedekParcaMouseClicked
        // TODO add your handling code here:

        int satir = tableYedekParca.getSelectedRow();//Hangi satır seçili...
        Object parcaNo = tableYedekParca.getValueAt(satir, 0);

        if (tableYedekParca.getSelectedRow() < 0) {
            return;
        }

        try ( Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/araba", "root", "1234");) {
            System.out.println("Database connected");
            Statement st = connection.createStatement();
            String sql = "select * from yedekparca Where parcano=" + parcaNo;
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                String e = rs.getString("Fiyat");

                lblParcaFiyat.setText(e);
                FFiyat = e;

            }
        } catch (SQLException e) {
            System.out.println("Database error " + e);
        }
    }//GEN-LAST:event_tableYedekParcaMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ArabaSatinAlimPanel;
    private javax.swing.JButton btnAra;
    private javax.swing.JButton btnSatınAl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel lblParcaFiyat;
    private javax.swing.JMenuItem pMenuItemFiyatTemizle;
    private javax.swing.JMenuItem pMenuItemTabloTemizle;
    private javax.swing.JMenuItem pMenuItemTemizle;
    private javax.swing.JPopupMenu pMenuPanel;
    private javax.swing.JPopupMenu pMenuTablo;
    private javax.swing.JTable tableYedekParca;
    private javax.swing.JTextField txtAra;
    // End of variables declaration//GEN-END:variables

}
