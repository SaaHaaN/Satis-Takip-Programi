package Project;

import java.awt.Color;
import javax.swing.Icon;

public class AracTanitim extends javax.swing.JFrame {

    /* Creates new form {name} */
    public AracTanitim() {
        initComponents();

        setLocationRelativeTo(null);
        setResizable(false);

        tabPane.setBackgroundAt(0, Color.red);
        tabPane.setBackgroundAt(1, Color.blue);

        tabPane.setBackgroundAt(2, Color.darkGray);

        tabPane.setBackgroundAt(3, Color.darkGray);
        tabPane.setBackgroundAt(4, Color.darkGray);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabPane = new javax.swing.JTabbedPane();
        pnlA = new javax.swing.JPanel();
        AResim1 = new javax.swing.JLabel();
        AResim2 = new javax.swing.JLabel();
        AResim3 = new javax.swing.JLabel();
        AResim4 = new javax.swing.JLabel();
        pnlQ = new javax.swing.JPanel();
        QResim1 = new javax.swing.JLabel();
        QResim2 = new javax.swing.JLabel();
        QResim3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        pnlETron = new javax.swing.JPanel();
        ETronResim1 = new javax.swing.JLabel();
        ETronResim2 = new javax.swing.JLabel();
        ETronResim3 = new javax.swing.JLabel();
        ETronResim4 = new javax.swing.JLabel();
        pnlTT = new javax.swing.JPanel();
        TTResim1 = new javax.swing.JLabel();
        TTResim2 = new javax.swing.JLabel();
        TTResim3 = new javax.swing.JLabel();
        TTResim4 = new javax.swing.JLabel();
        pnlR8 = new javax.swing.JPanel();
        R8Resim1 = new javax.swing.JLabel();
        R8Resim2 = new javax.swing.JLabel();
        R8Resim3 = new javax.swing.JLabel();
        R8Resim4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tabPane.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tabPane.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        pnlA.setBackground(new java.awt.Color(0, 0, 0));

        AResim1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Şahan\\Documents\\NetBeansProjects\\Project\\src\\main\\java\\Project\\PNG\\ASerisiAracOn.jpg")); // NOI18N

        AResim2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Şahan\\Documents\\NetBeansProjects\\Project\\src\\main\\java\\Project\\PNG\\ASerisiAracArka.jpg")); // NOI18N

        AResim3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Şahan\\Documents\\NetBeansProjects\\Project\\src\\main\\java\\Project\\PNG\\ASerisiMotor.jpg")); // NOI18N

        AResim4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Şahan\\Documents\\NetBeansProjects\\Project\\src\\main\\java\\Project\\PNG\\ASerisiIc.jpg")); // NOI18N

        javax.swing.GroupLayout pnlALayout = new javax.swing.GroupLayout(pnlA);
        pnlA.setLayout(pnlALayout);
        pnlALayout.setHorizontalGroup(
            pnlALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlALayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AResim3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AResim1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pnlALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(AResim4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AResim2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlALayout.setVerticalGroup(
            pnlALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlALayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AResim1)
                    .addComponent(AResim2, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(AResim3, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AResim4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        tabPane.addTab("A Serisi", pnlA);

        pnlQ.setBackground(new java.awt.Color(0, 0, 0));

        QResim1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Şahan\\Documents\\NetBeansProjects\\Project\\src\\main\\java\\Project\\PNG\\QSerisiAracaOn.jpg")); // NOI18N

        QResim2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Şahan\\Documents\\NetBeansProjects\\Project\\src\\main\\java\\Project\\PNG\\QSerisiAracArka.jpg")); // NOI18N

        QResim3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Şahan\\Documents\\NetBeansProjects\\Project\\src\\main\\java\\Project\\PNG\\QSerisiMotor.jpg")); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Şahan\\Documents\\NetBeansProjects\\Project\\src\\main\\java\\Project\\PNG\\QSerisiAracIc.jpg")); // NOI18N

        javax.swing.GroupLayout pnlQLayout = new javax.swing.GroupLayout(pnlQ);
        pnlQ.setLayout(pnlQLayout);
        pnlQLayout.setHorizontalGroup(
            pnlQLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlQLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlQLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(QResim1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(QResim3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(pnlQLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(QResim2, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlQLayout.setVerticalGroup(
            pnlQLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlQLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlQLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(QResim2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(QResim1, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pnlQLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(QResim3, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        tabPane.addTab("Q Serisi", pnlQ);

        pnlETron.setBackground(new java.awt.Color(0, 0, 0));

        ETronResim1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Şahan\\Documents\\NetBeansProjects\\Project\\src\\main\\java\\Project\\PNG\\ETronAracOn.jpg")); // NOI18N

        ETronResim2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Şahan\\Documents\\NetBeansProjects\\Project\\src\\main\\java\\Project\\PNG\\ETronAracArka.jpg")); // NOI18N

        ETronResim3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Şahan\\Documents\\NetBeansProjects\\Project\\src\\main\\java\\Project\\PNG\\ETronAracMotor.jpg")); // NOI18N

        ETronResim4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Şahan\\Documents\\NetBeansProjects\\Project\\src\\main\\java\\Project\\PNG\\ETronAracIc.jpg")); // NOI18N

        javax.swing.GroupLayout pnlETronLayout = new javax.swing.GroupLayout(pnlETron);
        pnlETron.setLayout(pnlETronLayout);
        pnlETronLayout.setHorizontalGroup(
            pnlETronLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlETronLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlETronLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ETronResim3, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
                    .addComponent(ETronResim1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pnlETronLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ETronResim4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ETronResim2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlETronLayout.setVerticalGroup(
            pnlETronLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlETronLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlETronLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ETronResim2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ETronResim1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pnlETronLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ETronResim3, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ETronResim4))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        tabPane.addTab("E-Tron Serisi", pnlETron);

        pnlTT.setBackground(new java.awt.Color(0, 0, 0));

        TTResim1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Şahan\\Documents\\NetBeansProjects\\Project\\src\\main\\java\\Project\\PNG\\TTOn.jpg")); // NOI18N

        TTResim2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Şahan\\Documents\\NetBeansProjects\\Project\\src\\main\\java\\Project\\PNG\\TTArka.jpg")); // NOI18N

        TTResim3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Şahan\\Documents\\NetBeansProjects\\Project\\src\\main\\java\\Project\\PNG\\TTMotor.jpg")); // NOI18N

        TTResim4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Şahan\\Documents\\NetBeansProjects\\Project\\src\\main\\java\\Project\\PNG\\TTIc.jpg")); // NOI18N

        javax.swing.GroupLayout pnlTTLayout = new javax.swing.GroupLayout(pnlTT);
        pnlTT.setLayout(pnlTTLayout);
        pnlTTLayout.setHorizontalGroup(
            pnlTTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTTLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TTResim3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TTResim1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pnlTTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TTResim4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TTResim2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlTTLayout.setVerticalGroup(
            pnlTTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTTLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TTResim1)
                    .addComponent(TTResim2, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlTTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TTResim3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TTResim4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        tabPane.addTab("TT Serisi", pnlTT);

        pnlR8.setBackground(new java.awt.Color(0, 0, 0));

        R8Resim1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Şahan\\Documents\\NetBeansProjects\\Project\\src\\main\\java\\Project\\PNG\\R8On.jpg")); // NOI18N

        R8Resim2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Şahan\\Documents\\NetBeansProjects\\Project\\src\\main\\java\\Project\\PNG\\R8Arka.jpg")); // NOI18N

        R8Resim3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Şahan\\Documents\\NetBeansProjects\\Project\\src\\main\\java\\Project\\PNG\\R8Motor.jpg")); // NOI18N

        R8Resim4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Şahan\\Documents\\NetBeansProjects\\Project\\src\\main\\java\\Project\\PNG\\R8Ic.jpg")); // NOI18N

        javax.swing.GroupLayout pnlR8Layout = new javax.swing.GroupLayout(pnlR8);
        pnlR8.setLayout(pnlR8Layout);
        pnlR8Layout.setHorizontalGroup(
            pnlR8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlR8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlR8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(R8Resim3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(R8Resim1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pnlR8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(R8Resim4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(R8Resim2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlR8Layout.setVerticalGroup(
            pnlR8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlR8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlR8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(R8Resim2, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R8Resim1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(pnlR8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(R8Resim4, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R8Resim3, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabPane.addTab("R8 Serisi", pnlR8);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AResim1;
    private javax.swing.JLabel AResim2;
    private javax.swing.JLabel AResim3;
    private javax.swing.JLabel AResim4;
    private javax.swing.JLabel ETronResim1;
    private javax.swing.JLabel ETronResim2;
    private javax.swing.JLabel ETronResim3;
    private javax.swing.JLabel ETronResim4;
    private javax.swing.JLabel QResim1;
    private javax.swing.JLabel QResim2;
    private javax.swing.JLabel QResim3;
    private javax.swing.JLabel R8Resim1;
    private javax.swing.JLabel R8Resim2;
    private javax.swing.JLabel R8Resim3;
    private javax.swing.JLabel R8Resim4;
    private javax.swing.JLabel TTResim1;
    private javax.swing.JLabel TTResim2;
    private javax.swing.JLabel TTResim3;
    private javax.swing.JLabel TTResim4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel pnlA;
    private javax.swing.JPanel pnlETron;
    private javax.swing.JPanel pnlQ;
    private javax.swing.JPanel pnlR8;
    private javax.swing.JPanel pnlTT;
    private javax.swing.JTabbedPane tabPane;
    // End of variables declaration//GEN-END:variables

}
