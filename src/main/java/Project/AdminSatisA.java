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

public class AdminSatisA extends javax.swing.JFrame {

    String[] columns = {"Sasi", "Model", "Model Yılı", "Yakıt Tipi", "Vites Tipi", "Stok", "Fiyat"};
    String[][] data = new String[0][7];
    DefaultTableModel tableModel = new DefaultTableModel(data, columns);


    /* Creates new form {name} */
    public AdminSatisA() {
        initComponents();

        setLocationRelativeTo(null);
        setResizable(false);

        tableAracSatis.setModel(tableModel);

        tableModel.setColumnCount(7);

        //Table'da sütünları değiştirmeyi ve boyutlarını ayarlamayı devre dışı bırakıyorum
        tableAracSatis.getTableHeader().setReorderingAllowed(false);

        //Tablodaki Sütunların Genişlikleri..
        tableAracSatis.getTableHeader().setReorderingAllowed(false);
        tableAracSatis.getColumnModel().getColumn(0).setPreferredWidth(45);
        tableAracSatis.getColumnModel().getColumn(1).setPreferredWidth(180);
        tableAracSatis.getColumnModel().getColumn(2).setPreferredWidth(60);
        tableAracSatis.getColumnModel().getColumn(3).setPreferredWidth(90);
        tableAracSatis.getColumnModel().getColumn(4).setPreferredWidth(90);
        tableAracSatis.getColumnModel().getColumn(5).setPreferredWidth(40);
        tableAracSatis.getColumnModel().getColumn(6).setPreferredWidth(100);

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
        pMenuTxtYakit = new javax.swing.JPopupMenu();
        yakitTxt = new javax.swing.JMenuItem();
        pMenuTxtVites = new javax.swing.JPopupMenu();
        vitesTxt = new javax.swing.JMenuItem();
        pMenuTxtStok = new javax.swing.JPopupMenu();
        stokTxt = new javax.swing.JMenuItem();
        pMenuTxtFiyat = new javax.swing.JPopupMenu();
        fiyatTxt = new javax.swing.JMenuItem();
        AdminSatisPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableAracSatis = new javax.swing.JTable();
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

        yakitTxt.setText("Yakit Bilgisi Temizle");
        yakitTxt.setActionCommand("Yakit Bilgileri Temizle");
        yakitTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yakitTxtActionPerformed(evt);
            }
        });
        pMenuTxtYakit.add(yakitTxt);

        vitesTxt.setText("Vites Bilgisi Temizle");
        vitesTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vitesTxtActionPerformed(evt);
            }
        });
        pMenuTxtVites.add(vitesTxt);

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
        AdminSatisPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "A Sersi Araba Satış Tablosu Kontrol Paneli     ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        AdminSatisPanel.setComponentPopupMenu(pMenuPanel);

        tableAracSatis.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tableAracSatis.setComponentPopupMenu(pMenuTable);
        tableAracSatis.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tableAracSatis.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tableAracSatis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableAracSatisMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableAracSatis);

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
        btnEkle.setText("Yeni Arac Ekle");
        btnEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEkleActionPerformed(evt);
            }
        });

        btnGüncelle.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnGüncelle.setText("Arac Bilgileri Güncelle");
        btnGüncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGüncelleActionPerformed(evt);
            }
        });

        btnSil.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSil.setText("Arac Sil");
        btnSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSilActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Model yada Şasi Numarası");

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\Şahan\\Documents\\NetBeansProjects\\Project\\src\\main\\java\\Project\\PNG\\ASerisi.png")); // NOI18N

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
                        .addGap(18, 18, 18)
                        .addComponent(txtAra, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAra, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnYenile, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(54, 54, 54)
                .addGroup(AdminSatisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(AdminSatisPanelLayout.createSequentialGroup()
                        .addGroup(AdminSatisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(AdminSatisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtModelYili, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSasi, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtModel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtYakit, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtVites, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtStok, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFiyat, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnEkle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGüncelle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        AdminSatisPanelLayout.setVerticalGroup(
            AdminSatisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdminSatisPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                            .addComponent(txtSasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(AdminSatisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(AdminSatisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtModelYili, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(AdminSatisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtYakit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(AdminSatisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtVites, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void btnYenileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYenileActionPerformed
        // Veri Ekledikten veya herhangi bir işlem yaptıktan sonra tabloyu yenilemek için yani ekrana yazdırmak için..
        tableModel.setRowCount(0);
        tabloYazdir();

        txtSasi.setText("");
        txtModel.setText("");
        txtModelYili.setText("");
        txtYakit.setText("");
        txtVites.setText("");
        txtStok.setText("");
        txtFiyat.setText("");
    }//GEN-LAST:event_btnYenileActionPerformed

    private void btnEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEkleActionPerformed
        // Araç Eklemek için..

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

            //-------------------------------------------
            //Girilen bilgileri TXTFileds için boş mu diye kontrol ediliyor..
            if (txtSasi.getText().isBlank() || txtModel.getText().isBlank() || txtModelYili.getText().isBlank()
                    || txtYakit.getText().isBlank() || txtVites.getText().isBlank() || txtStok.getText().isBlank()
                    || txtFiyat.getText().isBlank()) {

                JOptionPane.showMessageDialog(rootPane, "Boş satır bırakmayın.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            //-------------------------------------------
            Matcher matcher;

            String RegexSasi = txtSasi.getText();
            matcher = Pattern.compile("[0-9]").matcher(RegexSasi);
            if (!matcher.matches()) {
                JOptionPane.showMessageDialog(rootPane, "Lütfen Geçerli Bir Sasi Numarasını Giriniz. En az 2 Haneli Sayı.",
                        "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            //-------------------------------------------
            String RegexYil = txtModelYili.getText();
            matcher = Pattern.compile("[0-9]{4}").matcher(RegexYil);
            if (Integer.parseInt(RegexYil) < 2000) {
                JOptionPane.showMessageDialog(rootPane, "Ekelenecek aracın Model Yılı 2000 yılından küçük olamaz.",
                        "Error", JOptionPane.ERROR_MESSAGE);
                return;
            } else {
                if (!matcher.matches()) {
                    JOptionPane.showMessageDialog(rootPane, "Lütfen Geçerli Bir Model Yili Giriniz. En az 4 Haneli Sayı.",
                            "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }
            //Bilgiler Doğru mu girildi Kontrol Ediyor.
            //-----------------------------------------------------------------

            String sql = ("INSERT INTO a(Sasi, Model, ModelYili, Yakit, Vites, Stok, Fiyat)"
                    + "VALUES('" + Sasi + "','"
                    + Model + "','"
                    + Integer.parseInt(ModelYili) + "','"
                    + Yakit + "','" + Vites
                    + "','" + Integer.parseInt(Stok)
                    + "','" + Fiyat + "')");
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(rootPane, "Aracınız Başarıyla Eklendi.", "Onaylandı", JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException e) {
            System.out.println("Database error " + e);
            JOptionPane.showMessageDialog(rootPane, "Aracınız Eklenmedi Lütfen Şasi Numarsını Doğru Girin.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEkleActionPerformed

    private void btnAraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAraActionPerformed
        // Araç Arama
        String arama = txtAra.getText();
        tableModel.setRowCount(0);

        if (txtAra.getText().isBlank()) {
            tabloYazdir();
            JOptionPane.showMessageDialog(rootPane, "Aramak İstediğiniz Modeli Girin.",
                    "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            try ( Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/araba", "root", "1234");) {
                System.out.println("Database connected");
                Statement st = connection.createStatement();
                String sql = "select * from a where Model like '%" + arama + "%' OR Sasi like '%" + arama + "%'";
                // Model ya da Sasi Numarasını Göre Araç arıyor..
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    String a = rs.getString("Sasi");
                    String b = rs.getString("Model");
                    int c = rs.getInt("ModelYili");
                    String d = rs.getString("Yakit");
                    String e = rs.getString("Vites");
                    int f = rs.getInt("Stok");
                    String g = rs.getString("Fiyat");

                    tableModel.addRow(new Object[]{a, b, c, d, e, f, g});
                }
                if (tableAracSatis.getRowCount() == 0) {  // Arama sonucunda veri açığa çıkmamış ise uyarı verip Tabloyu en baştan yazıyor.
                    tabloYazdir();  // Kendi metodum..
                    txtAra.setText("");  // Arama TxtFields temizledi..
                    JOptionPane.showMessageDialog(rootPane, "Aranan Model ya da Sasi Numarasınına Uygun Araç bulunamadı.",
                            "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException e) {
                System.out.println("Database error " + e);
            }
        }
    }//GEN-LAST:event_btnAraActionPerformed

    private void btnSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSilActionPerformed
        // // Admin Araç Silmek isterse

        int satir = tableAracSatis.getSelectedRow();//Hangi satır seçili...
        String sasiNo = String.valueOf(tableAracSatis.getValueAt(satir, 0));  // seçtğim satırda olan arabanın sasi Numarası..

        try ( Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/araba", "root", "1234");) {
            System.out.println("Database connected");
            Statement st = connection.createStatement();
            String sql = "Delete from a where sasi =" + sasiNo;
            //Araç silerken seçili olan satırda acarın sasi numarası ile silme işlemi yapılıyor bu sayade karışıklık olmuyor 
            //ve seçilen şasi numarasına ait aracın silme işlemi yapılıyor
            int x = JOptionPane.showConfirmDialog(rootPane, "Aracı Silmek İstiyor musun?", "Warning", JOptionPane.YES_NO_OPTION);

            if (x == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(rootPane, "Aracınız Başarıyla Silindi.", "Silme İşlemi Başarılı", JOptionPane.INFORMATION_MESSAGE);
            } else {
                return; // Eğerki "No" seçilirse silmiyor..
            }
            st.executeUpdate(sql);

        } catch (SQLException e) {
            System.out.println("Database error " + e);
        }
    }//GEN-LAST:event_btnSilActionPerformed

    private void btnGüncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGüncelleActionPerformed
        // Araç Bilgilerini Güncelleme

        String sasi = txtSasi.getText();
        String model = txtModel.getText();
        int modelYili = Integer.parseInt(txtModelYili.getText());
        String Yakit = txtYakit.getText();
        String Vites = txtVites.getText();
        int Stok = Integer.parseInt(txtStok.getText());
        String Fiyat = txtFiyat.getText();

        //-------------------------------------------
        Matcher matcher;

        String RegexYil = txtModelYili.getText();

        if (Integer.parseInt(RegexYil) < 2000 && Integer.parseInt(RegexYil) > 2022) {
            JOptionPane.showMessageDialog(rootPane, "Ekelenecek aracın Model Yılı 2000 - 2022 Arasında Olmalıdır.",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } else {
            matcher = Pattern.compile("[0-9]{4}").matcher(RegexYil);
            if (!matcher.matches()) {
                JOptionPane.showMessageDialog(rootPane, "Lütfen Geçerli Bir Model Yili Giriniz. En az 4 Haneli Sayı.",
                        "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
        //Bilgiler Doğru mu girildi Kontrol Ediyor.
        //-----------------------------------------------------------------
        try ( Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/araba", "root", "1234");) {
            System.out.println("Database connected");
            Statement st = connection.createStatement();

            String sql = "update a set Model='" + model
                    + "', ModelYili='" + modelYili
                    + "', Yakit='" + Yakit
                    + "', Vites='" + Vites
                    + "', Stok='" + Stok
                    + "', Fiyat='" + Fiyat + "' where Sasi='" + sasi + "'";
            //Seçili olan arac sasi numarsı ile kontrol yapılıyor ve sasi numarası dışında olan verileri değiştirebiliyor..

            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(rootPane, "Arac Bilgileri Başarıyla Güncellendi.", "Güncellendi", JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException e) {
            System.out.println("Database error " + e);
            JOptionPane.showMessageDialog(rootPane, "Aracın Şasi Numarası Değiştirelemez.", "Error", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_btnGüncelleActionPerformed

    private void tableAracSatisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableAracSatisMouseClicked
        // Veri Seçilince TxtFields'larda veri bilgilerini görmek için..

        int satir = tableAracSatis.getSelectedRow();//Hangi satır seçili...
        String sasiNo = String.valueOf(tableAracSatis.getValueAt(satir, 0));  // seçtğim satırda olan arabanın sasi Numarası..

        if (tableAracSatis.getSelectedRow() < 0) {
            return;
        }

        try ( Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/araba", "root", "1234");) {
            System.out.println("Database connected");
            Statement st = connection.createStatement();
            String sql = "select * from a Where sasi=" + sasiNo;
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
                //Verileri TXTFieldslara yazıyor..

            }
        } catch (SQLException e) {
            System.out.println("Database error " + e);
        }
    }//GEN-LAST:event_tableAracSatisMouseClicked

    private void pMemuTemizleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pMemuTemizleActionPerformed
        // Panael üzerinden Tüm seçili veya Yazılı şeyleri temizlemek

        tableAracSatis.clearSelection();

        txtSasi.setText("");
        txtModel.setText("");
        txtModelYili.setText("");
        txtYakit.setText("");
        txtVites.setText("");
        txtStok.setText("");
        txtFiyat.setText("");
    }//GEN-LAST:event_pMemuTemizleActionPerformed

    private void pMenuSeciliTemizleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pMenuSeciliTemizleActionPerformed
        // Panael üzerinden veriyi Temizleme
        tableAracSatis.clearSelection();
    }//GEN-LAST:event_pMenuSeciliTemizleActionPerformed

    private void pMenuTxtTemizleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pMenuTxtTemizleActionPerformed
        // Panael üzerinden Yazılı verileri Temizleme
        txtSasi.setText("");
        txtModel.setText("");
        txtModelYili.setText("");
        txtYakit.setText("");
        txtVites.setText("");
        txtStok.setText("");
        txtFiyat.setText("");
    }//GEN-LAST:event_pMenuTxtTemizleActionPerformed

    private void pMenuItemTableTemizleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pMenuItemTableTemizleActionPerformed
        // Tablo üstünden Seçili veriyi Temizleme
        tableAracSatis.clearSelection();
    }//GEN-LAST:event_pMenuItemTableTemizleActionPerformed

    private void sasiTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sasiTxtActionPerformed
        // Sasi TxtFilds Temizleme
        txtSasi.setText("");
    }//GEN-LAST:event_sasiTxtActionPerformed

    private void modelTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modelTxtActionPerformed
        // Model TxtFilds Temizleme
        txtModel.setText("");
    }//GEN-LAST:event_modelTxtActionPerformed

    private void modelYiliTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modelYiliTxtActionPerformed
        // Model Yili TxtFilds Temizleme
        txtModelYili.setText("");
    }//GEN-LAST:event_modelYiliTxtActionPerformed

    private void yakitTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yakitTxtActionPerformed
        // Yakit TxtFilds Temizleme
        txtYakit.setText("");
    }//GEN-LAST:event_yakitTxtActionPerformed

    private void vitesTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vitesTxtActionPerformed
        // Vites TxtFilds Temizleme
        txtVites.setText("");
    }//GEN-LAST:event_vitesTxtActionPerformed

    private void stokTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stokTxtActionPerformed
        // Stok TxtFilds Temizleme
        txtStok.setText("");
    }//GEN-LAST:event_stokTxtActionPerformed

    private void fiyatTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiyatTxtActionPerformed
        // Fiyat TxtFilds Temizleme
        txtFiyat.setText("");
    }//GEN-LAST:event_fiyatTxtActionPerformed

    public void tabloYazdir() {
        try ( Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/araba", "root", "1234");) {
            System.out.println("Database connected");
            Statement st = connection.createStatement();
            String sql = "select * from a";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                String a = rs.getString("Sasi");
                String b = rs.getString("Model");
                int c = rs.getInt("ModelYili");
                String d = rs.getString("Yakit");
                String e = rs.getString("Vites");
                int f = rs.getInt("Stok");
                String g = rs.getString("Fiyat");

                tableModel.addRow(new Object[]{a, b, c, d, e, f, g});
            }
        } catch (SQLException e) {
            System.out.println("Database error " + e);
        }
    }


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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
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
    private javax.swing.JPopupMenu pMenuTxtVites;
    private javax.swing.JPopupMenu pMenuTxtYakit;
    private javax.swing.JMenuItem sasiTxt;
    private javax.swing.JMenuItem stokTxt;
    private javax.swing.JTable tableAracSatis;
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
