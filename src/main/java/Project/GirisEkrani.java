package Project;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JColorChooser;

public class GirisEkrani extends javax.swing.JFrame {

    Graphics g;
    int thick = 3;


    /* Creates new form {name} */
    public GirisEkrani() {
        initComponents();

        setLocationRelativeTo(null);
        setResizable(false);

        Generics<String> obj = new Generics<>("");
        lblGenerics.setText(obj.yazi());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainFramePanel = new javax.swing.JPanel();
        lblIconLogo = new javax.swing.JLabel();
        lblGenerics = new javax.swing.JLabel();
        AdminButton = new javax.swing.JButton();
        MusteriButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        AppMenu = new javax.swing.JMenu();
        menuItemRenk = new javax.swing.JMenuItem();
        menuItemLogoGrap = new javax.swing.JMenuItem();
        menuItemAracTanıtım = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        menuItemClose = new javax.swing.JMenuItem();
        AboutMenu = new javax.swing.JMenu();
        menuItemAudiHakkında = new javax.swing.JMenuItem();
        menuItemUygulamaHakkında = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AUDI SERVİS");
        setMinimumSize(new java.awt.Dimension(300, 300));

        MainFramePanel.setBackground(new java.awt.Color(0, 51, 255));
        MainFramePanel.setMinimumSize(new java.awt.Dimension(300, 300));

        lblIconLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIconLogo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Şahan\\Documents\\NetBeansProjects\\Project\\src\\main\\java\\Project\\PNG\\AnaEkranLogoIcon.png")); // NOI18N

        lblGenerics.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblGenerics.setForeground(new java.awt.Color(255, 255, 255));

        AdminButton.setBackground(new java.awt.Color(255, 255, 255));
        AdminButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        AdminButton.setText("ADMİN GİRİŞİ");
        AdminButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminButtonActionPerformed(evt);
            }
        });

        MusteriButton.setBackground(new java.awt.Color(255, 255, 255));
        MusteriButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        MusteriButton.setText("MÜŞTERİ GİRİŞİ");
        MusteriButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MusteriButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MainFramePanelLayout = new javax.swing.GroupLayout(MainFramePanel);
        MainFramePanel.setLayout(MainFramePanelLayout);
        MainFramePanelLayout.setHorizontalGroup(
            MainFramePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainFramePanelLayout.createSequentialGroup()
                .addGap(0, 50, Short.MAX_VALUE)
                .addGroup(MainFramePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblGenerics, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AdminButton, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                    .addComponent(MusteriButton, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                    .addComponent(lblIconLogo, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE))
                .addGap(37, 37, 37))
        );
        MainFramePanelLayout.setVerticalGroup(
            MainFramePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainFramePanelLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(lblIconLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblGenerics, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MusteriButton)
                .addGap(18, 18, 18)
                .addComponent(AdminButton)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        AppMenu.setText("Uygulama");

        menuItemRenk.setText("Renk Seç");
        menuItemRenk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemRenkActionPerformed(evt);
            }
        });
        AppMenu.add(menuItemRenk);

        menuItemLogoGrap.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuItemLogoGrap.setText("Logo");
        menuItemLogoGrap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemLogoGrapActionPerformed(evt);
            }
        });
        AppMenu.add(menuItemLogoGrap);

        menuItemAracTanıtım.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_K, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuItemAracTanıtım.setText("Araclar");
        menuItemAracTanıtım.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAracTanıtımActionPerformed(evt);
            }
        });
        AppMenu.add(menuItemAracTanıtım);
        AppMenu.add(jSeparator1);

        menuItemClose.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuItemClose.setText("Close");
        menuItemClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCloseActionPerformed(evt);
            }
        });
        AppMenu.add(menuItemClose);

        jMenuBar1.add(AppMenu);

        AboutMenu.setText("Hakkında");

        menuItemAudiHakkında.setText("Audi Hakkında");
        menuItemAudiHakkında.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAudiHakkındaActionPerformed(evt);
            }
        });
        AboutMenu.add(menuItemAudiHakkında);

        menuItemUygulamaHakkında.setText("Uygulama Hakkında");
        menuItemUygulamaHakkında.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemUygulamaHakkındaActionPerformed(evt);
            }
        });
        AboutMenu.add(menuItemUygulamaHakkında);

        jMenuBar1.add(AboutMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainFramePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainFramePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void MusteriButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MusteriButtonActionPerformed
        // Müşteri girişi..
        MusteriLogin musteri = new MusteriLogin();
        musteri.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MusteriButtonActionPerformed

    private void AdminButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminButtonActionPerformed
        // Admin girişi
        AdminLogin admin = new AdminLogin();
        admin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AdminButtonActionPerformed

    private void menuItemCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCloseActionPerformed
        // Menu Iıtem ile Kapatmak için 
        this.dispose();
    }//GEN-LAST:event_menuItemCloseActionPerformed

    private void menuItemAudiHakkındaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAudiHakkındaActionPerformed
        // Hakkımızdaya basarsa kedni yapmış olduğum JDialogFrame'e geçiş yapar ve Audi hakkında bilgileri gözükür.
        HakkımızdaJDialogF d = new HakkımızdaJDialogF(this, rootPaneCheckingEnabled);
        d.setVisible(true);
    }//GEN-LAST:event_menuItemAudiHakkındaActionPerformed

    private void menuItemUygulamaHakkındaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemUygulamaHakkındaActionPerformed
        // Uygulama Hakkında'ya basarsa kedni yapmış olduğum JDialogFrame'e geçiş yapar ve Uygulama hakkında hazırlamış olduğum bilgileri gözükür.
        HakkımızdaUygulamaIcınjDialogF d = new HakkımızdaUygulamaIcınjDialogF(this, rootPaneCheckingEnabled);
        d.setVisible(true);
    }//GEN-LAST:event_menuItemUygulamaHakkındaActionPerformed

    private void menuItemLogoGrapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemLogoGrapActionPerformed
        // TODO add your handling code here:
        Grp JDialogGraphics = new Grp(this, rootPaneCheckingEnabled);
        JDialogGraphics.setVisible(true);
    }//GEN-LAST:event_menuItemLogoGrapActionPerformed

    private void menuItemAracTanıtımActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAracTanıtımActionPerformed
        // TODO add your handling code here:
        AracTanitim tanitim = new AracTanitim();
        tanitim.setVisible(true);
    }//GEN-LAST:event_menuItemAracTanıtımActionPerformed

    private void menuItemRenkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemRenkActionPerformed
        // TODO add your handling code here:
        JColorChooser jcc = new JColorChooser();
        Color c = JColorChooser.showDialog(this, "Renk Seçii Yazpınız ", Color.BLACK);
        MainFramePanel.setBackground(c);
    }//GEN-LAST:event_menuItemRenkActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GirisEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu AboutMenu;
    private javax.swing.JButton AdminButton;
    private javax.swing.JMenu AppMenu;
    private javax.swing.JPanel MainFramePanel;
    private javax.swing.JButton MusteriButton;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel lblGenerics;
    private javax.swing.JLabel lblIconLogo;
    private javax.swing.JMenuItem menuItemAracTanıtım;
    private javax.swing.JMenuItem menuItemAudiHakkında;
    private javax.swing.JMenuItem menuItemClose;
    private javax.swing.JMenuItem menuItemLogoGrap;
    private javax.swing.JMenuItem menuItemRenk;
    private javax.swing.JMenuItem menuItemUygulamaHakkında;
    // End of variables declaration//GEN-END:variables
}
