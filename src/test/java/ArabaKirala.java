

import javax.swing.ButtonModel;

public class ArabaKirala extends javax.swing.JFrame {

    /* Creates new form {name} */
    public ArabaKirala() {
        initComponents();
        setLocationRelativeTo(null);

        cBoxGunluk.setVisible(true);
        cBoxAylik.setVisible(false);
        cBoxYillik.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kiralamaTuruBtnGrp = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        cBoxAylik = new javax.swing.JComboBox<>();
        cBoxYillik = new javax.swing.JComboBox<>();
        rBtnGunluk = new javax.swing.JRadioButton();
        rBtnAylik = new javax.swing.JRadioButton();
        rBtnYillik = new javax.swing.JRadioButton();
        cBoxGunluk = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "AUDI ARABA KİRALAMA EKRANI", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        cBoxAylik.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        cBoxAylik.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 Ay", "2 Ay", "3 Ay", "4 Ay", "5 Ay", "6 Ay", "7 Ay", "8 Ay", "9 Ay", "10 Ay", "11 Ay" }));
        cBoxAylik.setOpaque(false);

        cBoxYillik.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        cBoxYillik.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 Yıl", "2 Yıl", "3 Yıl", "4 Yıl", "5 Yıl" }));
        cBoxYillik.setOpaque(false);

        kiralamaTuruBtnGrp.add(rBtnGunluk);
        rBtnGunluk.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        rBtnGunluk.setForeground(new java.awt.Color(255, 255, 255));
        rBtnGunluk.setSelected(true);
        rBtnGunluk.setText("Günlük Kiralama");
        rBtnGunluk.setOpaque(false);
        rBtnGunluk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBtnGunlukActionPerformed(evt);
            }
        });

        kiralamaTuruBtnGrp.add(rBtnAylik);
        rBtnAylik.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        rBtnAylik.setForeground(new java.awt.Color(255, 255, 255));
        rBtnAylik.setText("Aylık Kiralama");
        rBtnAylik.setOpaque(false);
        rBtnAylik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBtnAylikActionPerformed(evt);
            }
        });

        kiralamaTuruBtnGrp.add(rBtnYillik);
        rBtnYillik.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        rBtnYillik.setForeground(new java.awt.Color(255, 255, 255));
        rBtnYillik.setText("Yıllık Kiralama");
        rBtnYillik.setOpaque(false);
        rBtnYillik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBtnYillikActionPerformed(evt);
            }
        });

        cBoxGunluk.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        cBoxGunluk.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 Gün", "2 Gün", "3 Gün", "4 Gün", "5 Gün", "6 Gün", "7 Gün", "8 Gün", "9 Gün", "10 Gün", "11 Gün", "12 Gün", "13 Gün", "14 Gün", "15 Gün" }));
        cBoxGunluk.setOpaque(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Seçili olan arabayı kiralayacak. Fiyatlandırma kiralama türüne göre değişecek");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rBtnAylik, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cBoxAylik, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cBoxYillik, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cBoxGunluk, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rBtnYillik, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rBtnGunluk))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rBtnGunluk)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rBtnAylik)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rBtnYillik)
                        .addGap(5, 5, 5)
                        .addComponent(cBoxGunluk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cBoxAylik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cBoxYillik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(125, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void kiralamaTuru() {
        if (rBtnGunluk.isSelected()) {
            cBoxGunluk.setVisible(true);
            cBoxAylik.setVisible(false);
            cBoxYillik.setVisible(false);
        } else if (rBtnAylik.isSelected()) {
            cBoxGunluk.setVisible(false);
            cBoxAylik.setVisible(true);
            cBoxYillik.setVisible(false);;
        } else if (rBtnYillik.isSelected()) {
            cBoxGunluk.setVisible(false);
            cBoxAylik.setVisible(false);
            cBoxYillik.setVisible(true);
        }
    }

    private void rBtnGunlukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBtnGunlukActionPerformed
        // TODO add your handling code here:
        kiralamaTuru();
    }//GEN-LAST:event_rBtnGunlukActionPerformed

    private void rBtnAylikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBtnAylikActionPerformed
        // TODO add your handling code here:
        kiralamaTuru();
    }//GEN-LAST:event_rBtnAylikActionPerformed

    private void rBtnYillikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBtnYillikActionPerformed
        // TODO add your handling code here:
        kiralamaTuru();
    }//GEN-LAST:event_rBtnYillikActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cBoxAylik;
    private javax.swing.JComboBox<String> cBoxGunluk;
    private javax.swing.JComboBox<String> cBoxYillik;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.ButtonGroup kiralamaTuruBtnGrp;
    private javax.swing.JRadioButton rBtnAylik;
    private javax.swing.JRadioButton rBtnGunluk;
    private javax.swing.JRadioButton rBtnYillik;
    // End of variables declaration//GEN-END:variables

}
