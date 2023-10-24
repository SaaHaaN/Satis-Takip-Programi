package Project;

public class HakkımızdaJDialogF extends javax.swing.JDialog {

    //Hakkımızda kısmı için kapatılmadan başka işlem yapılmaması için kendim yapmış olduğum JDialog..
    public HakkımızdaJDialogF(java.awt.Frame parent, boolean modal) {
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

        btnKapat = new javax.swing.JButton();
        splitPane = new javax.swing.JSplitPane();
        pnlTxtArea = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        pnlResim = new javax.swing.JPanel();
        lblResim = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(400, 270));

        btnKapat.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnKapat.setText("Kapat");
        btnKapat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKapatActionPerformed(evt);
            }
        });

        splitPane.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        pnlTxtArea.setMinimumSize(new java.awt.Dimension(400, 200));
        pnlTxtArea.setPreferredSize(new java.awt.Dimension(400, 200));
        pnlTxtArea.setRequestFocusEnabled(false);
        pnlTxtArea.setLayout(new javax.swing.BoxLayout(pnlTxtArea, javax.swing.BoxLayout.LINE_AXIS));

        txtArea.setColumns(20);
        txtArea.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        txtArea.setRows(1);
        txtArea.setTabSize(1);
        txtArea.setText("Audi, Alman menşeli bir otomobil şirketidir ve Volkswagen grubunun bir markasıdır. Şirketin merkezi Ingolstadt, Bavyera'da bulunmaktadır.\n\nŞirketin geçmişi 1899 yılına ve August Horch'a dayanmaktadır. İlk Horch otomobili kendisi tarafından 1901 yılında tasarlanmıştı. 1910 yılında Horsche, şirket dışına atılmış ve kendi adını, eski ortaklarıyla olan anlaşmazlıklar nedeniyle yaptığı tasarımlarda kullanamayacak hale gelmişti. Eski Almancada anlamı \"Dinle!\" olan \"Horch\", Latincede aynı anlama gelen Audi'yi kendi markası olarak kullanmaya başladı.\n\n1932 yılında Audi, Auto Union'ı oluşturmak üzere Horch, DKW ve Wanderer şirketleri ile birleşti. Auto Union'ın kullandığı birbirine bağlı dört halka da bugün Audi'nin logosu olarak kullanılmaktadır.");
        txtArea.setMaximumSize(new java.awt.Dimension(400, 240));
        txtArea.setMinimumSize(new java.awt.Dimension(400, 240));
        jScrollPane1.setViewportView(txtArea);

        pnlTxtArea.add(jScrollPane1);

        splitPane.setLeftComponent(pnlTxtArea);

        pnlResim.setMinimumSize(new java.awt.Dimension(400, 175));
        pnlResim.setPreferredSize(new java.awt.Dimension(400, 175));

        lblResim.setIcon(new javax.swing.ImageIcon("C:\\Users\\Şahan\\Documents\\NetBeansProjects\\Project\\src\\main\\java\\Project\\PNG\\HakkımızdaLogo.jpg")); // NOI18N

        javax.swing.GroupLayout pnlResimLayout = new javax.swing.GroupLayout(pnlResim);
        pnlResim.setLayout(pnlResimLayout);
        pnlResimLayout.setHorizontalGroup(
            pnlResimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblResim, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlResimLayout.setVerticalGroup(
            pnlResimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlResimLayout.createSequentialGroup()
                .addComponent(lblResim, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        splitPane.setRightComponent(pnlResim);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnKapat, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(splitPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnKapat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
    private javax.swing.JLabel lblResim;
    private javax.swing.JPanel pnlResim;
    private javax.swing.JPanel pnlTxtArea;
    private javax.swing.JSplitPane splitPane;
    private javax.swing.JTextArea txtArea;
    // End of variables declaration//GEN-END:variables
}
