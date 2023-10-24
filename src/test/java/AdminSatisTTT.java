

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AdminSatisTTT extends javax.swing.JFrame {

    String[] columns = {"Sasi", "Model", "Model Yılı", "Yakıt Tipi", "Vites Tipi", "Stok", "Fiyat"};
    String[][] data = new String[0][7];
    DefaultTableModel model = new DefaultTableModel(data, columns);


    /* Creates new form {name} */
    public AdminSatisTTT() {
        initComponents();
        setLocationRelativeTo(null);

        tableASerisi.setModel(model);
        model.setColumnCount(7);

        tableASerisi.getTableHeader().setReorderingAllowed(false);
        tableASerisi.getColumnModel().getColumn(0).setPreferredWidth(45);
        tableASerisi.getColumnModel().getColumn(1).setPreferredWidth(180);
        tableASerisi.getColumnModel().getColumn(2).setPreferredWidth(60);
        tableASerisi.getColumnModel().getColumn(3).setPreferredWidth(90);
        tableASerisi.getColumnModel().getColumn(4).setPreferredWidth(90);
        tableASerisi.getColumnModel().getColumn(5).setPreferredWidth(40);
        tableASerisi.getColumnModel().getColumn(6).setPreferredWidth(100);

        tabloYazdir();
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
        pMenuTxtYakit = new javax.swing.JPopupMenu();
        yakitTxt = new javax.swing.JMenuItem();
        pMenuTxtVites = new javax.swing.JPopupMenu();
        vitesTxt = new javax.swing.JMenuItem();
        pMenuTxtStok = new javax.swing.JPopupMenu();
        stokTxt = new javax.swing.JMenuItem();
        pMenuTxtFiyat = new javax.swing.JPopupMenu();
        fiyatTxt = new javax.swing.JMenuItem();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableASerisi = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtSasi = new javax.swing.JTextField();
        txtModel = new javax.swing.JTextField();
        txtModelYili = new javax.swing.JTextField();
        txtYakit = new javax.swing.JTextField();
        txtVites = new javax.swing.JTextField();
        txtStok = new javax.swing.JTextField();
        txtFiyat = new javax.swing.JTextField();
        txtAra = new javax.swing.JTextField();
        btnASerisiGüncelle = new javax.swing.JButton();
        btnASerisiSil = new javax.swing.JButton();
        btnASerisiAra = new javax.swing.JButton();
        btnASerisiEkle = new javax.swing.JButton();
        btnASerisiYenile = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

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

        modelTxt.setText("Model  Bilgisi Temizle");
        modelTxt.setActionCommand("Model Bilgisi Temizle");
        modelTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modelTxtActionPerformed(evt);
            }
        });
        pMenuTxtModel.add(modelTxt);

        modelYiliTxt.setText("Model Yili  Bilgisi Temizle");
        modelYiliTxt.setActionCommand("Model Yili Bilgisi Temizle");
        modelYiliTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modelYiliTxtActionPerformed(evt);
            }
        });
        pMenuTxtModelYili.add(modelYiliTxt);

        yakitTxt.setText("Yakit  Bilgisi Temizle");
        yakitTxt.setActionCommand("Yakit Bilgileri Temizle");
        yakitTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yakitTxtActionPerformed(evt);
            }
        });
        pMenuTxtYakit.add(yakitTxt);

        vitesTxt.setText("Vites  Bilgisi Temizle");
        vitesTxt.setActionCommand("Vites Bilgisi Temizle");
        vitesTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vitesTxtActionPerformed(evt);
            }
        });
        pMenuTxtVites.add(vitesTxt);

        stokTxt.setText("Stok  Bilgisi Temizle");
        stokTxt.setActionCommand("Stok Bilgisi Temizle");
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

        jPanel6.setBackground(new java.awt.Color(255, 153, 0));
        jPanel6.setComponentPopupMenu(pMenuPanel);

        tableASerisi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tableASerisi.setComponentPopupMenu(pMenuTable);
        tableASerisi.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tableASerisi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableASerisiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableASerisi);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Şasi");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Model");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Model Yılı");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Yakit");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Vites");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Stok");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Fiyat");

        txtSasi.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtSasi.setComponentPopupMenu(pMenuTxtSasi);

        txtModel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtModel.setComponentPopupMenu(pMenuTxtModel);

        txtModelYili.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtModelYili.setComponentPopupMenu(pMenuTxtModelYili);

        txtYakit.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtYakit.setComponentPopupMenu(pMenuTxtYakit);

        txtVites.setComponentPopupMenu(pMenuTxtVites);

        txtStok.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtStok.setComponentPopupMenu(pMenuTxtStok);

        txtFiyat.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtFiyat.setComponentPopupMenu(pMenuTxtFiyat);

        txtAra.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        btnASerisiGüncelle.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnASerisiGüncelle.setText("Bilgileri Güncelle");
        btnASerisiGüncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnASerisiGüncelleActionPerformed(evt);
            }
        });

        btnASerisiSil.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnASerisiSil.setText("Araba Sil");
        btnASerisiSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnASerisiSilActionPerformed(evt);
            }
        });

        btnASerisiAra.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnASerisiAra.setText("Ara");
        btnASerisiAra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnASerisiAraActionPerformed(evt);
            }
        });

        btnASerisiEkle.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnASerisiEkle.setText("Yeni Araba Ekle");
        btnASerisiEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnASerisiEkleActionPerformed(evt);
            }
        });

        btnASerisiYenile.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnASerisiYenile.setText("Yenile");
        btnASerisiYenile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnASerisiYenileActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("TT Serisi Araba Satış Tablosu");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Model yada Şasi Numarası");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(txtAra, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnASerisiAra, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnASerisiYenile, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(54, 54, 54)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtModelYili, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSasi, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtModel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtYakit, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtVites, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtStok, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFiyat, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnASerisiEkle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnASerisiGüncelle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnASerisiSil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addGap(48, 48, 48)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtAra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnASerisiAra)
                    .addComponent(btnASerisiYenile))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtSasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtModelYili, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtYakit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtVites, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtStok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtFiyat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnASerisiEkle)
                        .addGap(18, 18, 18)
                        .addComponent(btnASerisiGüncelle)
                        .addGap(18, 18, 18)
                        .addComponent(btnASerisiSil))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnASerisiYenileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnASerisiYenileActionPerformed
        // VeriEkledikten veya herhangi bir işlem yaptıktan sonra tabloyu yenilemek için yani ekrana yazdırmak için..
        model.setRowCount(0);
        tabloYazdir();

        txtSasi.setText("");
        txtModel.setText("");
        txtModelYili.setText("");
        txtYakit.setText("");
        txtVites.setText("");
        txtStok.setText("");
        txtFiyat.setText("");
    }//GEN-LAST:event_btnASerisiYenileActionPerformed

    private void btnASerisiEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnASerisiEkleActionPerformed
        // TODO add your handling code here:
        try ( Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/araba", "root", "1234");) {
            System.out.println("Database connected");
            Statement st = connection.createStatement();
            String Sasi = txtSasi.getText();
            String Model = txtModel.getText();
            String ModelYili = txtModelYili.getText();
            String Yakit = txtYakit.getText();
            String Vites = txtVites.getText();
            String Stok = txtStok.getText();
            String Fiyat = txtFiyat.getText();

            if (txtSasi.getText().isBlank() || txtModel.getText().isBlank() || txtModelYili.getText().isBlank()
                    || txtYakit.getText().isBlank() || txtVites.getText().isBlank() || txtStok.getText().isBlank()
                    || txtFiyat.getText().isBlank()) {

                JOptionPane.showMessageDialog(rootPane, "Boş satır bırakmayın", "Error", JOptionPane.ERROR_MESSAGE);
            }

            String sql = ("INSERT INTO tt(Sasi, Model, ModelYili, Yakit, Vites, Stok, Fiyat)"
                    + "VALUES('" + Sasi + "','"
                    + Model + "','"
                    + Integer.parseInt(ModelYili) + "','"
                    + Yakit + "','" + Vites
                    + "','" + Integer.parseInt(Stok)
                    + "','" + Fiyat + "')");
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(rootPane, "Aracınız Başarıyla Eklendi..", "Onaylandı..", JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException e) {
            System.out.println("Database error " + e);
            JOptionPane.showMessageDialog(rootPane, "Aracınız Eklenmedi Lütfen Şasi Numarsını Doğru Girin", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnASerisiEkleActionPerformed

    private void btnASerisiAraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnASerisiAraActionPerformed
        //Admin Arac Arama
        String arama = txtAra.getText();
        model.setRowCount(0);

        if (txtAra.getText().isBlank()) {
            tabloYazdir();
            JOptionPane.showMessageDialog(rootPane, "Aramak İstediğiniz Modeli Girin",
                    "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            try ( Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/araba", "root", "1234");) {
                System.out.println("Database connected");
                Statement st = connection.createStatement();
                String sql = "select * from tt where Model like '%" + arama + "%' OR Sasi like '%" + arama + "%'";
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    String a = rs.getString("Sasi");
                    String b = rs.getString("Model");
                    int c = rs.getInt("ModelYili");
                    String d = rs.getString("Yakit");
                    String e = rs.getString("Vites");
                    int f = rs.getInt("Stok");
                    String g = rs.getString("Fiyat");

                    model.addRow(new Object[]{a, b, c, d, e, f, g});
                }
                if (tableASerisi.getRowCount() == 0) {
                    tabloYazdir();
                    txtAra.setText("");
                    JOptionPane.showMessageDialog(rootPane, "Aranana model bulunamadı", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException e) {
                System.out.println("Database error " + e);
            }
        }
    }//GEN-LAST:event_btnASerisiAraActionPerformed

    private void btnASerisiSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnASerisiSilActionPerformed
        // TODO add your handling code here:

        int satir = tableASerisi.getSelectedRow();//Hangi satır seçili...
        String sasiNo = String.valueOf(tableASerisi.getValueAt(satir, 0));  // seçtğim satırda olan arabanın sasi Numarası..

        try ( Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/araba", "root", "1234");) {
            System.out.println("Database connected");
            Statement st = connection.createStatement();
            String sql = "Delete from tt where sasi =" + sasiNo;
            int x = JOptionPane.showConfirmDialog(rootPane, "Aracı Silmek İstiyor musun?", "Warning..", JOptionPane.YES_NO_OPTION);

            if (x == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(rootPane, "Aracınız Başarıyla Silindi..", "Silme İşlemi Başarılı..", JOptionPane.INFORMATION_MESSAGE);
            } else {
                return;
            }
            st.executeUpdate(sql);

        } catch (SQLException e) {
            System.out.println("Database error " + e);
        }
    }//GEN-LAST:event_btnASerisiSilActionPerformed

    private void btnASerisiGüncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnASerisiGüncelleActionPerformed
        // TODO add your handling code here:

        String sasi = txtSasi.getText();
        String model = txtModel.getText();
        int modelYili = Integer.parseInt(txtModelYili.getText());
        String Yakit = txtYakit.getText();
        String Vites = txtVites.getText();
        int Stok = Integer.parseInt(txtStok.getText());
        String Fiyat = txtFiyat.getText();

        try ( Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/araba", "root", "1234");) {
            System.out.println("Database connected");
            Statement st = connection.createStatement();
            String sql = "update tt set Model='" + model
                    + "', ModelYili='" + modelYili
                    + "', Yakit='" + Yakit
                    + "', Vites='" + Vites
                    + "', Stok='" + Stok
                    + "', Fiyat='" + Fiyat + "' where Sasi='" + sasi + "'";
            st.executeUpdate(sql);

        } catch (SQLException e) {
            System.out.println("Database error " + e);
            JOptionPane.showMessageDialog(rootPane, "Aracın Şasi Numarası Değiştirelemez", "Error", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_btnASerisiGüncelleActionPerformed

    private void tableASerisiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableASerisiMouseClicked
        // TODO add your handling code here:

        int satir = tableASerisi.getSelectedRow();//Hangi satır seçili...
        String sasiNo = String.valueOf(tableASerisi.getValueAt(satir, 0));  // seçtğim satırda olan arabanın sasi Numarası..

        if (tableASerisi.getSelectedRow() < 0) {
            return;
        }

        try ( Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/araba", "root", "1234");) {
            System.out.println("Database connected");
            Statement st = connection.createStatement();
            String sql = "select * from tt Where sasi=" + sasiNo;
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                String a = rs.getString("Sasi");
                String b = rs.getString("Model");
                int c = rs.getInt("ModelYili");
                String d = rs.getString("Yakit");
                String e = rs.getString("Vites");
                int f = rs.getInt("Stok");
                String g = rs.getString("Fiyat");

                txtSasi.setText(a);
                txtModel.setText(b);
                txtModelYili.setText(c + "");
                txtYakit.setText(d);
                txtVites.setText(e);
                txtStok.setText(f + "");
                txtFiyat.setText(g);

            }
        } catch (SQLException e) {
            System.out.println("Database error " + e);
        }
    }//GEN-LAST:event_tableASerisiMouseClicked

    private void pMemuTemizleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pMemuTemizleActionPerformed
        // TODO add your handling code here:
        tableASerisi.clearSelection();
        txtSasi.setText("");
        txtModel.setText("");
        txtModelYili.setText("");
        txtYakit.setText("");
        txtVites.setText("");
        txtStok.setText("");
        txtFiyat.setText("");
    }//GEN-LAST:event_pMemuTemizleActionPerformed

    private void pMenuSeciliTemizleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pMenuSeciliTemizleActionPerformed
        // TODO add your handling code here:
        tableASerisi.clearSelection();
    }//GEN-LAST:event_pMenuSeciliTemizleActionPerformed

    private void pMenuTxtTemizleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pMenuTxtTemizleActionPerformed
        // TODO add your handling code here:
        txtSasi.setText("");
        txtModel.setText("");
        txtModelYili.setText("");
        txtYakit.setText("");
        txtVites.setText("");
        txtStok.setText("");
        txtFiyat.setText("");
    }//GEN-LAST:event_pMenuTxtTemizleActionPerformed

    private void pMenuItemTableTemizleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pMenuItemTableTemizleActionPerformed
        // TODO add your handling code here:
        tableASerisi.clearSelection();
    }//GEN-LAST:event_pMenuItemTableTemizleActionPerformed

    private void sasiTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sasiTxtActionPerformed
        // TODO add your handling code here:
        txtSasi.setText("");
    }//GEN-LAST:event_sasiTxtActionPerformed

    private void modelTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modelTxtActionPerformed
        // TODO add your handling code here:
        txtModel.setText("");
    }//GEN-LAST:event_modelTxtActionPerformed

    private void modelYiliTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modelYiliTxtActionPerformed
        // TODO add your handling code here:
        txtModelYili.setText("");
    }//GEN-LAST:event_modelYiliTxtActionPerformed

    private void yakitTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yakitTxtActionPerformed
        // TODO add your handling code here:
        txtYakit.setText("");
    }//GEN-LAST:event_yakitTxtActionPerformed

    private void vitesTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vitesTxtActionPerformed
        // TODO add your handling code here:
        txtVites.setText("");
    }//GEN-LAST:event_vitesTxtActionPerformed

    private void stokTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stokTxtActionPerformed
        // TODO add your handling code here:
        txtStok.setText("");
    }//GEN-LAST:event_stokTxtActionPerformed

    private void fiyatTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiyatTxtActionPerformed
        // TODO add your handling code here:
        txtFiyat.setText("");
    }//GEN-LAST:event_fiyatTxtActionPerformed

    public void tabloYazdir() {
        try ( Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/araba", "root", "1234");) {
            System.out.println("Database connected");
            Statement st = connection.createStatement();
            String sql = "select * from tt";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                String a = rs.getString("Sasi");
                String b = rs.getString("Model");
                int c = rs.getInt("ModelYili");
                String d = rs.getString("Yakit");
                String e = rs.getString("Vites");
                int f = rs.getInt("Stok");
                String g = rs.getString("Fiyat");

                model.addRow(new Object[]{a, b, c, d, e, f, g});
            }
        } catch (SQLException e) {
            System.out.println("Database error " + e);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnASerisiAra;
    private javax.swing.JButton btnASerisiEkle;
    private javax.swing.JButton btnASerisiGüncelle;
    private javax.swing.JButton btnASerisiSil;
    private javax.swing.JButton btnASerisiYenile;
    private javax.swing.JMenuItem fiyatTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel6;
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
    private javax.swing.JPopupMenu pMenuTxtVites;
    private javax.swing.JPopupMenu pMenuTxtYakit;
    private javax.swing.JMenuItem sasiTxt;
    private javax.swing.JMenuItem stokTxt;
    private javax.swing.JTable tableASerisi;
    private javax.swing.JTextField txtAra;
    private javax.swing.JTextField txtFiyat;
    private javax.swing.JTextField txtModel;
    private javax.swing.JTextField txtModelYili;
    private javax.swing.JTextField txtSasi;
    private javax.swing.JTextField txtStok;
    private javax.swing.JTextField txtVites;
    private javax.swing.JTextField txtYakit;
    private javax.swing.JMenuItem vitesTxt;
    private javax.swing.JMenuItem yakitTxt;
    // End of variables declaration//GEN-END:variables

}
