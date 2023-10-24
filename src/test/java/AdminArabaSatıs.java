

import Project.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AdminArabaSatıs extends javax.swing.JFrame {

    String[] columns = {"Sasi", "Model", "Model Yılı", "Yakıt Tipi", "Vites Tipi", "Stok", "Fiyat"};
    String[][] data = new String[0][7];
    DefaultTableModel AModel = new DefaultTableModel(data, columns);
    DefaultTableModel QModel = new DefaultTableModel(data, columns);

    /* Creates new form {name} */
    public AdminArabaSatıs() {
        initComponents();
        setLocationRelativeTo(null);

        tableASerisi.setModel(AModel);
        AModel.setColumnCount(7);

        tableQSerisi.setModel(QModel);
        QModel.setColumnCount(7);

        tableASerisi.getTableHeader().setReorderingAllowed(false);
        tableASerisi.getColumnModel().getColumn(0).setPreferredWidth(45);
        tableASerisi.getColumnModel().getColumn(1).setPreferredWidth(180);
        tableASerisi.getColumnModel().getColumn(2).setPreferredWidth(60);
        tableASerisi.getColumnModel().getColumn(3).setPreferredWidth(90);
        tableASerisi.getColumnModel().getColumn(4).setPreferredWidth(90);
        tableASerisi.getColumnModel().getColumn(5).setPreferredWidth(40);
        tableASerisi.getColumnModel().getColumn(6).setPreferredWidth(100);

        txtSasi.setEditable(false);

        tabloYazdırASerisi();
        tabloYazdırQSerisi();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
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
        jPanel12 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableQSerisi = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txtSasiQ = new javax.swing.JTextField();
        txtModelQ = new javax.swing.JTextField();
        txtModelYiliQ = new javax.swing.JTextField();
        txtYakitQ = new javax.swing.JTextField();
        txtVitesQ = new javax.swing.JTextField();
        txtStokQ = new javax.swing.JTextField();
        txtFiyatQ = new javax.swing.JTextField();
        txtAraQ = new javax.swing.JTextField();
        btnQSerisiGüncelleme = new javax.swing.JButton();
        btnQSerisiArabaSil = new javax.swing.JButton();
        btnQSerisiAra = new javax.swing.JButton();
        btnQSerisiArabaEkle = new javax.swing.JButton();
        btnQSerisiYenile = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel6.setBackground(new java.awt.Color(255, 153, 0));

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

        txtModel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtModelYili.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtYakit.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtStok.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtFiyat.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

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
        jLabel17.setText("A Serisi Araba Satış Tablosu");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Model yada Sasi No");

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
                .addContainerGap(66, Short.MAX_VALUE))
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

        jTabbedPane2.addTab("A Serisi", jPanel6);

        jPanel12.setBackground(new java.awt.Color(255, 153, 0));

        tableQSerisi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tableQSerisi.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tableQSerisi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableQSerisiMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tableQSerisi);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("Şasi");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("Model");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel20.setText("Model Yılı");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel21.setText("Yakit");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel22.setText("Vites");

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel23.setText("Stok");

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel24.setText("Fiyat");

        txtSasiQ.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtModelQ.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtModelYiliQ.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtYakitQ.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtStokQ.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtFiyatQ.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtAraQ.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        btnQSerisiGüncelleme.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnQSerisiGüncelleme.setText("Bilgileri Güncelle");
        btnQSerisiGüncelleme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQSerisiGüncellemeActionPerformed(evt);
            }
        });

        btnQSerisiArabaSil.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnQSerisiArabaSil.setText("Araba Sil");
        btnQSerisiArabaSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQSerisiArabaSilActionPerformed(evt);
            }
        });

        btnQSerisiAra.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnQSerisiAra.setText("Ara");
        btnQSerisiAra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQSerisiAraActionPerformed(evt);
            }
        });

        btnQSerisiArabaEkle.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnQSerisiArabaEkle.setText("Yeni Araba Ekle");
        btnQSerisiArabaEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQSerisiArabaEkleActionPerformed(evt);
            }
        });

        btnQSerisiYenile.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnQSerisiYenile.setText("Yenile");
        btnQSerisiYenile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQSerisiYenileActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel25.setText("Model yada Sasi No");

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel26.setText("Q Serisi Araba Satış Tablosu");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel12Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(jLabel25)
                                .addGap(18, 18, 18)
                                .addComponent(txtAraQ, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnQSerisiAra, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnQSerisiYenile, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(54, 54, 54)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtModelYiliQ, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSasiQ, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtModelQ, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtYakitQ, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtVitesQ, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtStokQ, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFiyatQ, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnQSerisiArabaEkle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnQSerisiGüncelleme, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnQSerisiArabaSil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel26)
                .addGap(48, 48, 48)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(txtAraQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnQSerisiAra)
                    .addComponent(btnQSerisiYenile))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(txtSasiQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(txtModelQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(txtModelYiliQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(txtYakitQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(txtVitesQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(txtStokQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(txtFiyatQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnQSerisiArabaEkle)
                        .addGap(18, 18, 18)
                        .addComponent(btnQSerisiGüncelleme)
                        .addGap(18, 18, 18)
                        .addComponent(btnQSerisiArabaSil))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Q Serisi", jPanel12);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnASerisiYenileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnASerisiYenileActionPerformed
        // VeriEkledikten veya herhangi bir işlem yaptıktan sonra tabloyu yenilemek için yani ekrana yazdırmak için..
        AModel.setRowCount(0);
        tabloYazdırASerisi();
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

            String sql = ("INSERT INTO a(Sasi, Model, ModelYili, Yakit, Vites, Stok, Fiyat)"
                    + "VALUES('" + Sasi + "','"
                    + Model + "','"
                    + Integer.parseInt(ModelYili) + "','"
                    + Yakit + "','" + Vites
                    + "','" + Integer.parseInt(Stok)
                    + "','" + Fiyat + "')");
            st.executeUpdate(sql);
        } catch (SQLException e) {
            System.out.println("Database error " + e);
        }
    }//GEN-LAST:event_btnASerisiEkleActionPerformed

    private void btnASerisiAraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnASerisiAraActionPerformed
        //Admin Arac Arama
        String arama = txtAra.getText();
        AModel.setRowCount(0);

        if (txtAra.getText().isBlank()) {
            tabloYazdırASerisi();
            JOptionPane.showMessageDialog(rootPane, "Aramak İstediğiniz Modeli Girin",
                    "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            try ( Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/araba", "root", "1234");) {
                System.out.println("Database connected");
                Statement st = connection.createStatement();
                String sql = "select * from a where Model like '%" + arama + "%'";
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    String a = rs.getString("Sasi");
                    String b = rs.getString("Model");
                    int c = rs.getInt("ModelYili");
                    String d = rs.getString("Yakit");
                    String e = rs.getString("Vites");
                    int f = rs.getInt("Stok");
                    String g = rs.getString("Fiyat");

                    AModel.addRow(new Object[]{a, b, c, d, e, f, g});
                }
                if (tableASerisi.getRowCount() == 0) {
                    tabloYazdırASerisi();
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
            String sql = "Delete from a where sasi =" + sasiNo;
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
            String sql = "update a set Model='" + model
                    + "', ModelYili='" + modelYili
                    + "', Yakit='" + Yakit
                    + "', Vites='" + Vites
                    + "', Stok='" + Stok
                    + "', Fiyat='" + Fiyat + "' where Sasi='" + sasi + "'";
            st.executeUpdate(sql);

        } catch (SQLException e) {
            System.out.println("Database error " + e);
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

            }
        } catch (SQLException e) {
            System.out.println("Database error " + e);
        }
    }//GEN-LAST:event_tableASerisiMouseClicked

    private void btnQSerisiYenileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQSerisiYenileActionPerformed
        // VeriEkledikten veya herhangi bir işlem yaptıktan sonra tabloyu yenilemek için yani ekrana yazdırmak için..
        QModel.setRowCount(0);
        tabloYazdırQSerisi();
    }//GEN-LAST:event_btnQSerisiYenileActionPerformed

    private void btnQSerisiArabaEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQSerisiArabaEkleActionPerformed
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

            String sql = ("INSERT INTO a(Sasi, Model, ModelYili, Yakit, Vites, Stok, Fiyat)"
                + "VALUES('" + Sasi + "','"
                + Model + "','"
                + Integer.parseInt(ModelYili) + "','"
                + Yakit + "','" + Vites
                + "','" + Integer.parseInt(Stok)
                + "','" + Fiyat + "')");
            st.executeUpdate(sql);
        } catch (SQLException e) {
            System.out.println("Database error " + e);
        }
    }//GEN-LAST:event_btnQSerisiArabaEkleActionPerformed

    private void btnQSerisiAraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQSerisiAraActionPerformed
        //Admin Arac Arama
        String arama = txtAra.getText();
        AModel.setRowCount(0);

        if (txtAra.getText().isBlank()) {
            tabloYazdırQSerisi();
            JOptionPane.showMessageDialog(rootPane, "Aramak İstediğiniz Modeli Girin",
                "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            try ( Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/araba", "root", "1234");) {
                System.out.println("Database connected");
                Statement st = connection.createStatement();
                String sql = "select * from q where Model like '%" + arama + "%'";
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    String a = rs.getString("Sasi");
                    String b = rs.getString("Model");
                    int c = rs.getInt("ModelYili");
                    String d = rs.getString("Yakit");
                    String e = rs.getString("Vites");
                    int f = rs.getInt("Stok");
                    String g = rs.getString("Fiyat");

                    AModel.addRow(new Object[]{a, b, c, d, e, f, g});
                }
                if (tableASerisi.getRowCount() == 0) {
                    tabloYazdırQSerisi();
                    txtAra.setText("");
                    JOptionPane.showMessageDialog(rootPane, "Aranana model bulunamadı", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException e) {
                System.out.println("Database error " + e);
            }
        }
    }//GEN-LAST:event_btnQSerisiAraActionPerformed

    private void btnQSerisiArabaSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQSerisiArabaSilActionPerformed
        // TODO add your handling code here:

        int satir = tableASerisi.getSelectedRow();//Hangi satır seçili...
        String sasiNo = String.valueOf(tableASerisi.getValueAt(satir, 0));  // seçtğim satırda olan arabanın sasi Numarası..

        try ( Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/araba", "root", "1234");) {
            System.out.println("Database connected");
            Statement st = connection.createStatement();
            String sql = "Delete from a where sasi =" + sasiNo;
            st.executeUpdate(sql);
        } catch (SQLException e) {
            System.out.println("Database error " + e);
        }
    }//GEN-LAST:event_btnQSerisiArabaSilActionPerformed

    private void btnQSerisiGüncellemeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQSerisiGüncellemeActionPerformed
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
            String sql = "update a set Model='" + model
            + "', ModelYili='" + modelYili
            + "', Yakit='" + Yakit
            + "', Vites='" + Vites
            + "', Stok='" + Stok
            + "', Fiyat='" + Fiyat + "' where Sasi='" + sasi + "'";
            st.executeUpdate(sql);

        } catch (SQLException e) {
            System.out.println("Database error " + e);
        }
    }//GEN-LAST:event_btnQSerisiGüncellemeActionPerformed

    private void tableQSerisiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableQSerisiMouseClicked
        int satir = tableQSerisi.getSelectedRow();//Hangi satır seçili...
        String sasiNo = String.valueOf(tableQSerisi.getValueAt(satir, 0));  // seçtğim satırda olan arabanın sasi Numarası..

        if (tableQSerisi.getSelectedRow() < 0) {
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

                txtSasiQ.setText(a);
                txtModelQ.setText(b);
                txtModelYiliQ.setText(c + "");
                txtYakitQ.setText(d);
                txtVitesQ.setText(e);
                txtStokQ.setText(f + "");
                txtFiyatQ.setText(g);

            }
        } catch (SQLException e) {
            System.out.println("Database error " + e);
        }
    }//GEN-LAST:event_tableQSerisiMouseClicked

    public void tabloYazdırASerisi() {
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

                AModel.addRow(new Object[]{a, b, c, d, e, f, g});
            }
        } catch (SQLException e) {
            System.out.println("Database error " + e);
        }
    }

    public void tabloYazdırQSerisi() {
        try ( Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/araba", "root", "1234");) {
            System.out.println("Database connected");
            Statement st = connection.createStatement();
            String sql = "select * from q";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                String a = rs.getString("Sasi");
                String b = rs.getString("Model");
                int c = rs.getInt("ModelYili");
                String d = rs.getString("Yakit");
                String e = rs.getString("Vites");
                int f = rs.getInt("Stok");
                String g = rs.getString("Fiyat");

                QModel.addRow(new Object[]{a, b, c, d, e, f, g});
            }
        } catch (SQLException e) {
            System.out.println("Database error " + e);
        }
    }

    public void tabloYazdırETron() {
        try ( Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/araba", "root", "1234");) {
            System.out.println("Database connected");
            Statement st = connection.createStatement();
            String sql = "select * from etron";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                String a = rs.getString("Sasi");
                String b = rs.getString("Model");
                int c = rs.getInt("ModelYili");
                String d = rs.getString("Yakit");
                String e = rs.getString("Vites");
                int f = rs.getInt("Stok");
                String g = rs.getString("Fiyat");

                AModel.addRow(new Object[]{a, b, c, d, e, f, g});
            }
        } catch (SQLException e) {
            System.out.println("Database error " + e);
        }
    }

    public void tabloYazdırTT() {
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

                AModel.addRow(new Object[]{a, b, c, d, e, f, g});
            }
        } catch (SQLException e) {
            System.out.println("Database error " + e);
        }
    }

    public void tabloYazdırR8() {
        try ( Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/araba", "root", "1234");) {
            System.out.println("Database connected");
            Statement st = connection.createStatement();
            String sql = "select * from r8";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                String a = rs.getString("Sasi");
                String b = rs.getString("Model");
                int c = rs.getInt("ModelYili");
                String d = rs.getString("Yakit");
                String e = rs.getString("Vites");
                int f = rs.getInt("Stok");
                String g = rs.getString("Fiyat");

                AModel.addRow(new Object[]{a, b, c, d, e, f, g});
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
    private javax.swing.JButton btnQSerisiAra;
    private javax.swing.JButton btnQSerisiArabaEkle;
    private javax.swing.JButton btnQSerisiArabaSil;
    private javax.swing.JButton btnQSerisiGüncelleme;
    private javax.swing.JButton btnQSerisiYenile;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable tableASerisi;
    private javax.swing.JTable tableQSerisi;
    private javax.swing.JTextField txtAra;
    private javax.swing.JTextField txtAraQ;
    private javax.swing.JTextField txtFiyat;
    private javax.swing.JTextField txtFiyatQ;
    private javax.swing.JTextField txtModel;
    private javax.swing.JTextField txtModelQ;
    private javax.swing.JTextField txtModelYili;
    private javax.swing.JTextField txtModelYiliQ;
    private javax.swing.JTextField txtSasi;
    private javax.swing.JTextField txtSasiQ;
    private javax.swing.JTextField txtStok;
    private javax.swing.JTextField txtStokQ;
    private javax.swing.JTextField txtVites;
    private javax.swing.JTextField txtVitesQ;
    private javax.swing.JTextField txtYakit;
    private javax.swing.JTextField txtYakitQ;
    // End of variables declaration//GEN-END:variables

}
