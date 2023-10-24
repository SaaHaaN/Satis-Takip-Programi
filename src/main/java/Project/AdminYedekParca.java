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

public class AdminYedekParca extends javax.swing.JFrame {

    String[] columns = {"Parça Numarası", "Model", "Parça Adı", "Stok", "Fiyat"};
    String[][] data = new String[0][5];
    DefaultTableModel tableModel = new DefaultTableModel(data, columns);

    /* Creates new form {name} */
    public AdminYedekParca() {
        initComponents();

        setLocationRelativeTo(null);
        setResizable(false);

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
        pMenuTxtSasi = new javax.swing.JPopupMenu();
        sasiTxt = new javax.swing.JMenuItem();
        pMenuTxtModel = new javax.swing.JPopupMenu();
        modelTxt = new javax.swing.JMenuItem();
        pMenuTxtModelYili = new javax.swing.JPopupMenu();
        modelYiliTxt = new javax.swing.JMenuItem();
        pMenuTxtStok = new javax.swing.JPopupMenu();
        stokTxt = new javax.swing.JMenuItem();
        pMenuTxtFiyat = new javax.swing.JPopupMenu();
        fiyatTxt = new javax.swing.JMenuItem();
        AdminSatisPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableYedekParca = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtParcaNo = new javax.swing.JTextField();
        txtModel = new javax.swing.JTextField();
        txtParcaAdi = new javax.swing.JTextField();
        txtStok = new javax.swing.JTextField();
        txtFiyat = new javax.swing.JTextField();
        txtAra = new javax.swing.JTextField();
        btnAra = new javax.swing.JButton();
        btnYenile = new javax.swing.JButton();
        btnEkle = new javax.swing.JButton();
        btnGüncelle = new javax.swing.JButton();
        btnSil = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

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

        sasiTxt.setText("Sasi Bilgisi Temizle");
        sasiTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sasiTxtActionPerformed(evt);
            }
        });
        pMenuTxtSasi.add(sasiTxt);

        modelTxt.setText("Model Bilgisi Temizle");
        modelTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modelTxtActionPerformed(evt);
            }
        });
        pMenuTxtModel.add(modelTxt);

        modelYiliTxt.setText("Model Yili Bilgisi Temizle");
        modelYiliTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modelYiliTxtActionPerformed(evt);
            }
        });
        pMenuTxtModelYili.add(modelYiliTxt);

        stokTxt.setText("Stok Bilgisi Temizle");
        stokTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stokTxtActionPerformed(evt);
            }
        });
        pMenuTxtStok.add(stokTxt);

        fiyatTxt.setText("Fiyat Bilgisi Temizle");
        fiyatTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiyatTxtActionPerformed(evt);
            }
        });
        pMenuTxtFiyat.add(fiyatTxt);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        AdminSatisPanel.setBackground(new java.awt.Color(255, 153, 0));
        AdminSatisPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Yedek Parça Satış Tablosu Kontrol Paneli     ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        AdminSatisPanel.setComponentPopupMenu(pMenuPanel);

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
        tableYedekParca.setComponentPopupMenu(pMenuTable);
        tableYedekParca.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tableYedekParca.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tableYedekParca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableYedekParcaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableYedekParca);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Parça Numarası");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Model");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Parça Adı");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Stok");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Fiyat");

        txtParcaNo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtParcaNo.setComponentPopupMenu(pMenuTxtSasi);

        txtModel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtModel.setComponentPopupMenu(pMenuTxtModel);

        txtParcaAdi.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtParcaAdi.setComponentPopupMenu(pMenuTxtModelYili);

        txtStok.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtStok.setComponentPopupMenu(pMenuTxtStok);

        txtFiyat.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtFiyat.setComponentPopupMenu(pMenuTxtFiyat);

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

        btnEkle.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEkle.setText("Yeni Yedek Parça Ekle");
        btnEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEkleActionPerformed(evt);
            }
        });

        btnGüncelle.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnGüncelle.setText("Yedek Parça Bilgilerini Güncelle");
        btnGüncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGüncelleActionPerformed(evt);
            }
        });

        btnSil.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSil.setText("Yedek Parça Sil");
        btnSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSilActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Parça Adı yada Yedek Parça Numarası Arama");

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\Şahan\\Documents\\NetBeansProjects\\Project\\src\\main\\java\\Project\\PNG\\YedekParcaAdmin.png")); // NOI18N

        javax.swing.GroupLayout AdminSatisPanelLayout = new javax.swing.GroupLayout(AdminSatisPanel);
        AdminSatisPanel.setLayout(AdminSatisPanelLayout);
        AdminSatisPanelLayout.setHorizontalGroup(
            AdminSatisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdminSatisPanelLayout.createSequentialGroup()
                .addGroup(AdminSatisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(AdminSatisPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, AdminSatisPanelLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(AdminSatisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAra, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAra, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnYenile, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(AdminSatisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(AdminSatisPanelLayout.createSequentialGroup()
                        .addGroup(AdminSatisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(AdminSatisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtParcaAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtParcaNo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtModel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFiyat, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtStok, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnEkle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGüncelle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        AdminSatisPanelLayout.setVerticalGroup(
            AdminSatisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdminSatisPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(1, 1, 1)
                .addGroup(AdminSatisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtAra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAra)
                    .addComponent(btnYenile))
                .addGap(18, 18, 18)
                .addGroup(AdminSatisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(AdminSatisPanelLayout.createSequentialGroup()
                        .addGroup(AdminSatisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtParcaNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(AdminSatisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(AdminSatisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtParcaAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(AdminSatisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtStok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(AdminSatisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtFiyat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEkle)
                        .addGap(18, 18, 18)
                        .addComponent(btnGüncelle)
                        .addGap(18, 18, 18)
                        .addComponent(btnSil))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AdminSatisPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AdminSatisPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void tabloYazdir() {
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
    private void btnYenileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYenileActionPerformed
        // Veri Ekledikten veya herhangi bir işlem yaptıktan sonra tabloyu yenilemek için yani ekrana yazdırmak için..
        tableModel.setRowCount(0);
        tabloYazdir();

        txtParcaNo.setText("");
        txtModel.setText("");
        txtParcaAdi.setText("");
        txtStok.setText("");
        txtFiyat.setText("");
    }//GEN-LAST:event_btnYenileActionPerformed

    private void btnEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEkleActionPerformed
        // Araç Eklemek için..

        try ( Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/araba", "root", "1234");) {
            System.out.println("Database connected");
            Statement st = connection.createStatement();
            String ParcaNo = txtParcaNo.getText();
            String Model = txtModel.getText();
            String ParcaAdi = txtParcaAdi.getText();
            String Stok = txtStok.getText();
            String Fiyat = txtFiyat.getText();

            Matcher matcher;

            String RegexParcaNO = txtParcaNo.getText();
            matcher = Pattern.compile("[0-9]").matcher(RegexParcaNO);
            if (!matcher.matches()) {
                JOptionPane.showMessageDialog(rootPane, "Lütfen Geçerli Bir Parça Numarasını Giriniz. En az 2 Haneli Sayı.",
                        "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            //-------------------------------------------

            //Girilen bilgileri TXTFileds için boş mu diye kontrol ediliyor..
            if (txtParcaNo.getText().isBlank() || txtModel.getText().isBlank() || txtParcaAdi.getText().isBlank()
                    || txtStok.getText().isBlank() || txtFiyat.getText().isBlank()) {

                JOptionPane.showMessageDialog(rootPane, "Boş satır bırakmayın.", "Error", JOptionPane.ERROR_MESSAGE);
            }

            String sql = ("INSERT INTO yedekparca(ParcaNo, Model, ParcaAdi, Stok, Fiyat)"
                    + "VALUES('" + ParcaNo + "','"
                    + Model + "','"
                    + ParcaAdi + "','"
                    + Integer.parseInt(Stok) + "','"
                    + Fiyat + "')");
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(rootPane, "Parça Başarıyla Eklendi.", "Onaylandı", JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException e) {
            System.out.println("Database error " + e);
            JOptionPane.showMessageDialog(rootPane, "Parça Eklenmedi Lütfen Parça Numarsını Doğru Girin.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEkleActionPerformed

    private void btnAraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAraActionPerformed
        // Araç Arama
        String arama = txtAra.getText();
        tableModel.setRowCount(0);  // Araya bastıktan sonra Table sıfırlayıp tekrar yazılmasın diye..

        if (txtAra.getText().isBlank()) {
            tabloYazdir();
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
                    tabloYazdir();
                    txtAra.setText("");
                    JOptionPane.showMessageDialog(rootPane, "Aranan Parça Modeli ya da Parça Numarasınına Uygun Araç bulunamadı.",
                            "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException e) {
                System.out.println("Database error " + e);
            }
        }
    }//GEN-LAST:event_btnAraActionPerformed

    private void btnSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSilActionPerformed
        // // Admin Araç Silmek isterse

        int satir = tableYedekParca.getSelectedRow();//Hangi satır seçili...
        String parcaNo = String.valueOf(tableYedekParca.getValueAt(satir, 0));  // seçtğim satırda olan arabanın sasi Numarası..

        try ( Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/araba", "root", "1234");) {
            System.out.println("Database connected");
            Statement st = connection.createStatement();
            String sql = "Delete from yedekparca where parcaNo =" + parcaNo;
            int x = JOptionPane.showConfirmDialog(rootPane, "Yedek Parçayı Silmek İstiyor musun?", "Warning", JOptionPane.YES_NO_OPTION);
            //Yedek parça silerken seçili olan satırda yedek parçanın parça numarası ile silme işlemi yapılıyor bu sayade karışıklık olmuyor 
            //ve seçilin parça numarasına ait yedek parçanın silme işlemi yapılıyor
            if (x == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(rootPane, "Yedek Parça Başarıyla Silindi.", "Silme İşlemi Başarılı", JOptionPane.INFORMATION_MESSAGE);
            } else {
                return;
            }
            st.executeUpdate(sql);

        } catch (SQLException e) {
            System.out.println("Database error " + e);
        }
    }//GEN-LAST:event_btnSilActionPerformed

    private void btnGüncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGüncelleActionPerformed
        // Parça Bilgilerini Güncelleme

        String parcaNo = txtParcaNo.getText();
        String model = txtModel.getText();
        String parcaAdi = txtParcaAdi.getText();
        int Stok = Integer.parseInt(txtStok.getText());
        String Fiyat = txtFiyat.getText();

        try ( Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/araba", "root", "1234");) {
            System.out.println("Database connected");
            Statement st = connection.createStatement();
            String sql = "update yedekparca set model='" + model
                    + "', ParcaAdi='" + parcaAdi
                    + "', Stok='" + Stok
                    + "', Fiyat='" + Fiyat + "' where ParcaNo='" + parcaNo + "'";
            //Seçili olan Yedek parça numarsı ile kontrol yapılıyor ve yedek parça numarası dışında olan verileri değiştirebiliyor..

            st.executeUpdate(sql);

        } catch (SQLException e) {
            System.out.println("Database error " + e);
            JOptionPane.showMessageDialog(rootPane, "Yedek Parçanın Parça Numarası Değiştirelemez.",
                    "Error", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_btnGüncelleActionPerformed

    private void tableYedekParcaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableYedekParcaMouseClicked
        // Veri Seçilince TxtFields'larda verileri görmek için..

        int satir = tableYedekParca.getSelectedRow();//Hangi satır seçili...
        String parcaNo = String.valueOf(tableYedekParca.getValueAt(satir, 0));  // seçtğim satırda olan arabanın sasi Numarası..

        if (tableYedekParca.getSelectedRow() < 0) {
            return;
        }

        try ( Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/araba", "root", "1234");) {
            System.out.println("Database connected");
            Statement st = connection.createStatement();
            String sql = "select * from yedekParca Where ParcaNo=" + parcaNo;
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                String a = rs.getString("ParcaNo");
                String b = rs.getString("Model");
                String c = rs.getString("ParcaAdi");
                int d = rs.getInt("Stok");
                String e = rs.getString("Fiyat");

                txtParcaNo.setText(a);
                txtModel.setText(b);
                txtParcaAdi.setText(c);
                txtStok.setText(d + "");
                txtFiyat.setText(e);
                //Verileri TXTFieldslara yazıyor..

            }
        } catch (SQLException e) {
            System.out.println("Database error " + e);
        }
    }//GEN-LAST:event_tableYedekParcaMouseClicked

    private void pMemuTemizleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pMemuTemizleActionPerformed
        // Panael üzerinden Tüm seçili veya Yazılı şeyleri temizlemek

        tableYedekParca.clearSelection();

        txtParcaNo.setText("");
        txtModel.setText("");
        txtParcaAdi.setText("");
        txtStok.setText("");
        txtFiyat.setText("");
    }//GEN-LAST:event_pMemuTemizleActionPerformed

    private void pMenuSeciliTemizleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pMenuSeciliTemizleActionPerformed
        // Panael üzerinden veriyi Temizleme
        tableYedekParca.clearSelection();
    }//GEN-LAST:event_pMenuSeciliTemizleActionPerformed

    private void pMenuTxtTemizleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pMenuTxtTemizleActionPerformed
        // Panael üzerinden Yazılı verileri Temizleme
        txtParcaNo.setText("");
        txtModel.setText("");
        txtParcaAdi.setText("");
        txtStok.setText("");
        txtFiyat.setText("");
    }//GEN-LAST:event_pMenuTxtTemizleActionPerformed

    private void pMenuItemTableTemizleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pMenuItemTableTemizleActionPerformed
        // Tablo üstünden Seçili veriyi Temizleme
        tableYedekParca.clearSelection();
    }//GEN-LAST:event_pMenuItemTableTemizleActionPerformed

    private void sasiTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sasiTxtActionPerformed
        // Sasi TxtFilds Temizleme
        txtParcaNo.setText("");
    }//GEN-LAST:event_sasiTxtActionPerformed

    private void modelTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modelTxtActionPerformed
        // Model TxtFilds Temizleme
        txtModel.setText("");
    }//GEN-LAST:event_modelTxtActionPerformed

    private void modelYiliTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modelYiliTxtActionPerformed
        // Model Yili TxtFilds Temizleme
        txtParcaAdi.setText("");
    }//GEN-LAST:event_modelYiliTxtActionPerformed

    private void stokTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stokTxtActionPerformed
        // Stok TxtFilds Temizleme
        txtStok.setText("");
    }//GEN-LAST:event_stokTxtActionPerformed

    private void fiyatTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiyatTxtActionPerformed
        // Fiyat TxtFilds Temizleme
        txtFiyat.setText("");
    }//GEN-LAST:event_fiyatTxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AdminSatisPanel;
    private javax.swing.JButton btnAra;
    private javax.swing.JButton btnEkle;
    private javax.swing.JButton btnGüncelle;
    private javax.swing.JButton btnSil;
    private javax.swing.JButton btnYenile;
    private javax.swing.JMenuItem fiyatTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem modelTxt;
    private javax.swing.JMenuItem modelYiliTxt;
    private javax.swing.JMenuItem pMemuTemizle;
    private javax.swing.JMenuItem pMenuItemTableTemizle;
    private javax.swing.JPopupMenu pMenuPanel;
    private javax.swing.JMenuItem pMenuSeciliTemizle;
    private javax.swing.JPopupMenu pMenuTable;
    private javax.swing.JPopupMenu pMenuTxtFiyat;
    private javax.swing.JPopupMenu pMenuTxtModel;
    private javax.swing.JPopupMenu pMenuTxtModelYili;
    private javax.swing.JPopupMenu pMenuTxtSasi;
    private javax.swing.JPopupMenu pMenuTxtStok;
    private javax.swing.JMenuItem pMenuTxtTemizle;
    private javax.swing.JMenuItem sasiTxt;
    private javax.swing.JMenuItem stokTxt;
    private javax.swing.JTable tableYedekParca;
    private javax.swing.JTextField txtAra;
    private javax.swing.JTextField txtFiyat;
    private javax.swing.JTextField txtModel;
    private javax.swing.JTextField txtParcaAdi;
    private javax.swing.JTextField txtParcaNo;
    private javax.swing.JTextField txtStok;
    // End of variables declaration//GEN-END:variables

}
