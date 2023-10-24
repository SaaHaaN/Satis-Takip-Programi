package Project;

public class HakkımızdaUygulamaIcınjDialogF extends javax.swing.JDialog {

    //Hakkımızda kısmı için kapatılmadan başka işlem yapılmaması için kendim yapmış olduğum JDialog..
    
    public HakkımızdaUygulamaIcınjDialogF(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        setLocationRelativeTo(null);
        setResizable(false);
        
        txtArea.setLineWrap(true);
        txtArea.setWrapStyleWord(true);
        txtArea.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        btnKapat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        txtArea.setColumns(20);
        txtArea.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        txtArea.setLineWrap(true);
        txtArea.setRows(5);
        txtArea.setText("Audi Satış Uygulamasına Hoşgeldiniz...\n\nBu uygulama müşterilerimiz için özelce üretilmiş Audi arabaları veya arabalarınız için yedek parçaların satışı için yapılmıştır.\n\nSon zamanlarda müşterilermizin taleblerin üzerine Audi arabalarının konforlarını arabalarımızı satın almadan deneyimlemenezi için Adui arabalarını kiralama servisi olarak da hizmet vermekteyiz.\n\nHer geçen gün Audi arabalarımızın dünya üzerinde herkesin deneyimlemesi ve bu konforun diğer araçlardan üstün olduğunu göstermek istiyoruz.,\n\nSizler için her geçen gün daha iyi olmayı hedefliyoruz. Bizleri tercih ettiniz için teşekkürler.");
        jScrollPane1.setViewportView(txtArea);

        btnKapat.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnKapat.setText("Kapat");
        btnKapat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKapatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnKapat, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnKapat)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKapatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKapatActionPerformed
        // Butona basınca kapatılsın
        this.dispose();
    }//GEN-LAST:event_btnKapatActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKapat;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtArea;
    // End of variables declaration//GEN-END:variables

}
