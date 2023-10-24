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

public class SatınAl_eTronSerisi extends javax.swing.JFrame {

    String[] columns = {"Sasi", "Model", "Model Yılı", "Yakıt Tipi", "Vites Tipi", "Stok", "Fiyat"};
    String[][] data = new String[0][7];
    DefaultTableModel tableModel = new DefaultTableModel(data, columns);

    //Fatura için oluşturduğum değişkenler
    int anahtarTeslim;

    String Ftc;
    String Fadsoyad;
    String Ftelno;
    String Femail;
    String FkullaniciAdi;
    String Fsifre;

    String Fsasi;
    String Fmodel;
    String FmodelYili;
    String Fyakit;
    String Fvites;
    String Ftutar;

    /* Creates new form {name} */
    public SatınAl_eTronSerisi(String kullaniciAdi) {
        initComponents();

        setLocationRelativeTo(null);
        setResizable(false);

        //Constructor'daki veriyi yerel değişkene atıyorum. Daha sonra bunun sayesinde databasedeki veriyi çekiyorum..
        FkullaniciAdi = kullaniciAdi;

        arabaSatinAlmaTable.setModel(tableModel);
        tableModel.setColumnCount(7);

        //Table'da sütünları değiştirmeyi ve boyutlarını ayarlamayı devre dışı bırakıyorum
        arabaSatinAlmaTable.getTableHeader().setReorderingAllowed(false);

        //Tablodaki Sütunların Genişlikleri..
        arabaSatinAlmaTable.getColumnModel().getColumn(0).setPreferredWidth(45);
        arabaSatinAlmaTable.getColumnModel().getColumn(1).setPreferredWidth(180);
        arabaSatinAlmaTable.getColumnModel().getColumn(2).setPreferredWidth(60);
        arabaSatinAlmaTable.getColumnModel().getColumn(3).setPreferredWidth(90);
        arabaSatinAlmaTable.getColumnModel().getColumn(4).setPreferredWidth(90);
        arabaSatinAlmaTable.getColumnModel().getColumn(5).setPreferredWidth(40);
        arabaSatinAlmaTable.getColumnModel().getColumn(6).setPreferredWidth(100);

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
        arabaSatinAlmaTable = new javax.swing.JTable();
        txtAra = new javax.swing.JTextField();
        btnAra = new javax.swing.JButton();
        btnFiyatlandir = new javax.swing.JButton();
        btnSatınAl = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblNetFiyat = new javax.swing.JLabel();
        lblAnahtarTeslimFiyat = new javax.swing.JLabel();
        lblOTV = new javax.swing.JLabel();
        lblKDV = new javax.swing.JLabel();
        lblMTV = new javax.swing.JLabel();
        lblRenk = new javax.swing.JLabel();
        cBoxRenk = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();

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
        ArabaSatinAlimPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "AUDI E-TRON Sersi Araba Satış ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        ArabaSatinAlimPanel.setComponentPopupMenu(pMenuPanel);
        ArabaSatinAlimPanel.setName(""); // NOI18N
        ArabaSatinAlimPanel.setRequestFocusEnabled(false);

        arabaSatinAlmaTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        arabaSatinAlmaTable.setComponentPopupMenu(pMenuTablo);
        arabaSatinAlmaTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        arabaSatinAlmaTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(arabaSatinAlmaTable);

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

        btnFiyatlandir.setBackground(new java.awt.Color(0, 0, 0));
        btnFiyatlandir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnFiyatlandir.setForeground(new java.awt.Color(255, 255, 255));
        btnFiyatlandir.setText("FİYATLANDIR");
        btnFiyatlandir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiyatlandirActionPerformed(evt);
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

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Net");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("ÖTV (%70)");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("KDV (%18)");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Motorlu Taşıtlar");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Renk Fiyatı");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Satın Almak İstediğiniz Aracın Özelliklerini Ekranda Görebilirsiniz. Seçili Araç Üzerinden İşlem Yapılmaktadır.");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Araba Model yada Sasi Numarası Arama");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Anahtar Teslim Fiyatı");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Vergisi");

        lblNetFiyat.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblNetFiyat.setText("--");

        lblAnahtarTeslimFiyat.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblAnahtarTeslimFiyat.setForeground(new java.awt.Color(255, 255, 255));
        lblAnahtarTeslimFiyat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAnahtarTeslimFiyat.setText("--");

        lblOTV.setText("--");

        lblKDV.setText("--");

        lblMTV.setText("--");

        lblRenk.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblRenk.setText("--");

        cBoxRenk.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        cBoxRenk.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Renk Seçin", "Beyaz", "Siyah", "Kırmızı", "Mavi" }));
        cBoxRenk.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cBoxRenkPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\Şahan\\Documents\\NetBeansProjects\\Project\\src\\main\\java\\Project\\PNG\\eTronSerisi.png")); // NOI18N

        javax.swing.GroupLayout ArabaSatinAlimPanelLayout = new javax.swing.GroupLayout(ArabaSatinAlimPanel);
        ArabaSatinAlimPanel.setLayout(ArabaSatinAlimPanelLayout);
        ArabaSatinAlimPanelLayout.setHorizontalGroup(
            ArabaSatinAlimPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ArabaSatinAlimPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ArabaSatinAlimPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ArabaSatinAlimPanelLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(ArabaSatinAlimPanelLayout.createSequentialGroup()
                        .addGroup(ArabaSatinAlimPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ArabaSatinAlimPanelLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtAra, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnAra, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(ArabaSatinAlimPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(ArabaSatinAlimPanelLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(ArabaSatinAlimPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(ArabaSatinAlimPanelLayout.createSequentialGroup()
                                    .addGroup(ArabaSatinAlimPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(ArabaSatinAlimPanelLayout.createSequentialGroup()
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lblRenk, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(ArabaSatinAlimPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(ArabaSatinAlimPanelLayout.createSequentialGroup()
                                                .addGroup(ArabaSatinAlimPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel8)
                                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(ArabaSatinAlimPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lblMTV, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(lblKDV, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(lblOTV, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(lblNetFiyat, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(cBoxRenk, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(1, 1, 1))
                                .addGroup(ArabaSatinAlimPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnFiyatlandir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblAnahtarTeslimFiyat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(btnSatınAl, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 33, Short.MAX_VALUE))))
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
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(ArabaSatinAlimPanelLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ArabaSatinAlimPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(ArabaSatinAlimPanelLayout.createSequentialGroup()
                        .addComponent(btnFiyatlandir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblAnahtarTeslimFiyat)
                        .addGap(40, 40, 40)
                        .addGroup(ArabaSatinAlimPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(lblNetFiyat))
                        .addGap(18, 18, 18)
                        .addGroup(ArabaSatinAlimPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblOTV))
                        .addGap(18, 18, 18)
                        .addGroup(ArabaSatinAlimPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(lblKDV))
                        .addGroup(ArabaSatinAlimPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ArabaSatinAlimPanelLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9))
                            .addGroup(ArabaSatinAlimPanelLayout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(lblMTV)))
                        .addGap(18, 18, 18)
                        .addComponent(cBoxRenk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(ArabaSatinAlimPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(lblRenk, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSatınAl))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jLabel8.getAccessibleContext().setAccessibleDescription("");

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
            String sql = "select * from etron";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                String a = rs.getString("Sasi");
                String b = rs.getString("Model");
                String c = rs.getString("ModelYili");
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

    private void btnSatınAlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSatınAlActionPerformed
        //Araba Satın Alma..

        int satir = arabaSatinAlmaTable.getSelectedRow();//Hangi satır seçili...
        String secilendeger = String.valueOf(arabaSatinAlmaTable.getValueAt(satir, 0));  // seçtğim satırda olan aracın sasi Numarası..
        int secili = (int) arabaSatinAlmaTable.getValueAt(satir, 5);  // seçtğim satırda olan aracın stok sayısı

//------------------------------------------------------------------------------------------------------------------------------
        if (secili == 0) {  //Stok Yetersiz ise..
            JOptionPane.showMessageDialog(rootPane, "Araç Satışı Yapılamadı. Yetersiz Stok.",
                    "Error", JOptionPane.ERROR_MESSAGE);

            int onSiparis = JOptionPane.showConfirmDialog(rootPane, "Satın Almak İstediğiniz Aracı Ön Sipariş Vermek İstiyor musunuz?.",
                    "Ön Sipariş Yapılsın mı?", JOptionPane.YES_NO_OPTION);
            if (onSiparis == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(rootPane, "Aracın Ön Siparişi verildi. En Kısa sürede temin edilecektir.",
                        "Ön Sipariş Alındi.", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            return;
//------------------------------------------------------------------------------------------------------------------------------
        } else if (lblAnahtarTeslimFiyat.getText().equals("--")) {  //Fiyatladnırma yapılmamış ise..   
            JOptionPane.showMessageDialog(rootPane, "Araç Satışı Yapılamadı. Fiyatlandırmayı Yapın.",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

//------------------------------------------------------------------------------------------------------------------------------
        //Fiyatlandırma doğru yapılmaş ve Stok yeterli ise..
        int x = JOptionPane.showConfirmDialog(rootPane, "Aracın Satın Alımı Onaylansın mı?", "", JOptionPane.YES_NO_OPTION);

        if (x == JOptionPane.NO_OPTION) {
            return;

        } else if (x == JOptionPane.YES_OPTION) {
            try ( Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/araba", "root", "1234");) {
                System.out.println("Database connected");
                Statement st = connection.createStatement();
                String sql = "Update etron Set Stok = '" + (secili - 1) + "' where sasi =" + secilendeger;
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

            JOptionPane.showMessageDialog(rootPane, "Araç Satışı Tamamlanmıştır Faturanız Hazırlınıyor. Devam Etmek için Butona Basın.",
                    "Satış Onaylandı", JOptionPane.INFORMATION_MESSAGE);

            // fatura için araç bilgilerini tablodan alıyorum
            Fsasi = String.valueOf(arabaSatinAlmaTable.getValueAt(satir, 0));  // 0. indexte olan sütun Sasi Nuamrası
            Fmodel = String.valueOf(arabaSatinAlmaTable.getValueAt(satir, 1));  // 1. indexte olan sütun modeli
            FmodelYili = String.valueOf(arabaSatinAlmaTable.getValueAt(satir, 2));  // 2. indexte olan sütun tableModel yılı
            Fyakit = String.valueOf(arabaSatinAlmaTable.getValueAt(satir, 3));  // 3. indexte olan sütun yakit tipi
            Fvites = String.valueOf(arabaSatinAlmaTable.getValueAt(satir, 4));  // 4. indexte olan sütun vites tipi
            // 5. indexte olan sütun Stok faturada göstermye gerek yok..
            // 6. indexte olan sütun net Fiyat arabanın net fiyatıdır, satın alım fiyatı değildir..

            //Fatura ekranı constructor yardımıyla database ile bağlayıp işlem yaptırıyorum.
            FaturaArac f = new FaturaArac(Fsasi, Fmodel, FmodelYili, Fyakit, Fvites, String.valueOf(anahtarTeslim), Ftc, Fadsoyad, Ftelno, Femail);
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
                    + "VALUES(" + "'" + satisTakipNo + "'," + "'" + Fsasi + "'," + "'" + Fmodel + "'," + "'" + Fadsoyad + "'," + "'" + FkullaniciAdi + "')";
            // Faturada kullanıdğım bazı deüişkenlerden burada da yararlandım ve satın alma geçmişine ekledim..

            st.executeUpdate(sql);
        } catch (SQLException e) {
            System.out.println("Database error " + e);
        }

    }//GEN-LAST:event_btnSatınAlActionPerformed

    private void btnFiyatlandirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiyatlandirActionPerformed
        // araçların fiyatları ve toplam fiyatını hesaplama..
        int otvFiyat = 0;
        int kdvFiyat = 0;
        int mtvFiyat = 800;
        int renkFiyat = 0;
        int toplamFiyat = 0;

        int satir = arabaSatinAlmaTable.getSelectedRow();//Hangi satır seçili...

        String secilendeger = String.valueOf(arabaSatinAlmaTable.getValueAt(satir, 6));  // seçtğim satırda olan araba fiyatı
        int secili = (int) arabaSatinAlmaTable.getValueAt(satir, 5);

        if (arabaSatinAlmaTable.getSelectedRowCount() == -1) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen Satın Almak istediğiniz Arabayı Seçin.",
                    "Error", JOptionPane.ERROR_MESSAGE);
        } else if (secili == 0) {  // Fiyatlandırma yaparken eğerki stok yoksa fiyatlandırma yapılamıyor..
            JOptionPane.showMessageDialog(rootPane, "Araç Stoğu Bulunmadığı için Fiyatlandırma Yapılmamaktadır.",
                    "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            // Stok durumu yeterli ise fiyatlar ekranda gerekli yerlere yerleştiriliyor..
            lblNetFiyat.setText(secilendeger);  //Net Fiyatını Yazdırma..

            otvFiyat = (Integer.parseInt(secilendeger) * 70) / 100;  // ÖTV Fiyatı Hesaplama..
            lblOTV.setText(String.valueOf(otvFiyat));  //ÖTV Fiyatını Yazdırma..

            kdvFiyat = (Integer.parseInt(secilendeger) * 18) / 100;  // KDV Fiyatı Hesaplama..
            lblKDV.setText(String.valueOf(kdvFiyat));  //KDV Fiyatını Yazdırma..

            lblMTV.setText(String.valueOf(mtvFiyat));  //MTV Fiyatını Yazdırma..

            //ComboBox'dan renk değişikliği yaptığında rengin kendine ait fiyatını bulup ekranra yazıyor..
            switch (cBoxRenk.getSelectedIndex()) {
                case 0:  // Renk seçilmemiş ise..
                    lblAnahtarTeslimFiyat.setText("--");
                    lblRenk.setText("--");
                    //Eğerki renk seçtikten sonra tekrar Renk Seçin indexini seçerse
                    //Anahtar Teslim fiyatını "--" olarak eski haline getirmesi için yaptım.

                    JOptionPane.showMessageDialog(rootPane, "Lütfen Satın Almak istediğiniz Rengi Seçin.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;

                case 1: // Beyaz seçili ise..
                    renkFiyat = 10000;
                    lblRenk.setText(String.valueOf(renkFiyat));
                    break;

                case 2:  // Siyah seçili ise..
                    renkFiyat = 15000;
                    lblRenk.setText(String.valueOf(renkFiyat));
                    break;

                case 3:  // Kırmızı seçili ise..
                    renkFiyat = 15000;
                    lblRenk.setText(String.valueOf(renkFiyat));
                    break;

                case 4:  //Mavi seçili ise..
                    renkFiyat = 15000;
                    lblRenk.setText(String.valueOf(renkFiyat));
                    break;
            }
        }

        if (!"--".equals(lblRenk.getText())) {  // Kullanıcı Rengi seçmeden Anahtar Teslim Fiyatını göremez..
            toplamFiyat = Integer.parseInt(secilendeger) + otvFiyat + kdvFiyat + mtvFiyat + renkFiyat;
            lblAnahtarTeslimFiyat.setText(String.valueOf(toplamFiyat));    //Toplam Aracın Fiyatını Yazdırma..
        }

        // Oluşutrduğum yerel değişkeni toplam fiyata eşitliyorum "anahtarTeslim" değişkenini fatura kullanıyorum..
        anahtarTeslim = toplamFiyat;

    }//GEN-LAST:event_btnFiyatlandirActionPerformed

    private void btnAraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAraActionPerformed
        // İstediğimiz tableModel arabayı bulmak için

        String arama = txtAra.getText();
        tableModel.setRowCount(0);  // Araya bastıktan sonra Table sıfırlayıp tekrar yazılmasın diye..

        if (txtAra.getText().isBlank()) {
            tabloYazdır();
            JOptionPane.showMessageDialog(rootPane, "Aramak İstediğiniz Aracın Modelini ya da Sasi Numarasını Girin.",
                    "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            try ( Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/araba", "root", "1234");) {
                System.out.println("Database connected");
                Statement st = connection.createStatement();
                //model yada sasi numarasına göre arama yapılıyor..
                String sql = "select * from etron where Model like '%" + arama + "%' OR Sasi like '%" + arama + "%'";
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    String a = rs.getString("Sasi");
                    String b = rs.getString("Model");
                    String c = rs.getString("ModelYili");
                    String d = rs.getString("Yakit");
                    String e = rs.getString("Vites");
                    int f = rs.getInt("Stok");
                    String g = rs.getString("Fiyat");

                    tableModel.addRow(new Object[]{a, b, c, d, e, f, g});
                }
                // eğerki arama sonucunda istenen arac bulunamıyorsa ekrana uyarı verip "tabloYazdır" metodum ile ekrana tüm araçlar yazılıyor.
                if (arabaSatinAlmaTable.getRowCount() == 0) {
                    tabloYazdır();
                    txtAra.setText("");
                    JOptionPane.showMessageDialog(rootPane, "Aranana Araç bulunamadı.",
                            "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException e) {
                System.out.println("Database error " + e);
            }
        }

    }//GEN-LAST:event_btnAraActionPerformed

    private void cBoxRenkPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cBoxRenkPopupMenuWillBecomeInvisible
        // Seçilen Araba Rengine GÖre ComboBoxRenk Değiştirir..
        String x = (String) cBoxRenk.getSelectedItem();
        switch (x) {
            case "Renk Seçin":
                cBoxRenk.setBackground(Color.white);
                break;
            case "Beyaz":
                cBoxRenk.setBackground(Color.white);
                break;
            case "Siyah":
                cBoxRenk.setBackground(Color.black);
                cBoxRenk.setForeground(Color.white);
                break;
            case "Kırmızı":
                cBoxRenk.setBackground(Color.red);
                break;
            case "Mavi":
                cBoxRenk.setBackground(Color.blue);
                break;
            default:
                break;
        }
    }//GEN-LAST:event_cBoxRenkPopupMenuWillBecomeInvisible

    private void pMenuItemTemizleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pMenuItemTemizleActionPerformed
        // Table'a tıklayınca Table da seçili olan satırı temizliyor..
        arabaSatinAlmaTable.clearSelection();
    }//GEN-LAST:event_pMenuItemTemizleActionPerformed

    private void pMenuItemTabloTemizleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pMenuItemTabloTemizleActionPerformed
        //  Panale Tıklayınca Table da seçili olan satırı temizliyor..
        arabaSatinAlmaTable.clearSelection();
    }//GEN-LAST:event_pMenuItemTabloTemizleActionPerformed

    private void pMenuItemFiyatTemizleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pMenuItemFiyatTemizleActionPerformed
        // Panale Tıklayınca Fiyat Listesini temziliyor..
        lblAnahtarTeslimFiyat.setText("--");
        lblNetFiyat.setText("--");
        lblKDV.setText("--");
        lblOTV.setText("--");
        lblMTV.setText("--");
        cBoxRenk.setSelectedIndex(0);
        lblRenk.setText("--");
    }//GEN-LAST:event_pMenuItemFiyatTemizleActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ArabaSatinAlimPanel;
    private javax.swing.JTable arabaSatinAlmaTable;
    private javax.swing.JButton btnAra;
    private javax.swing.JButton btnFiyatlandir;
    private javax.swing.JButton btnSatınAl;
    private javax.swing.JComboBox<String> cBoxRenk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JLabel lblAnahtarTeslimFiyat;
    private javax.swing.JLabel lblKDV;
    private javax.swing.JLabel lblMTV;
    private javax.swing.JLabel lblNetFiyat;
    private javax.swing.JLabel lblOTV;
    private javax.swing.JLabel lblRenk;
    private javax.swing.JMenuItem pMenuItemFiyatTemizle;
    private javax.swing.JMenuItem pMenuItemTabloTemizle;
    private javax.swing.JMenuItem pMenuItemTemizle;
    private javax.swing.JPopupMenu pMenuPanel;
    private javax.swing.JPopupMenu pMenuTablo;
    private javax.swing.JTextField txtAra;
    // End of variables declaration//GEN-END:variables

}
