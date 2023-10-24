package Project;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Grp extends javax.swing.JDialog {

    Graphics g;
    int thick = 5;

    public Grp(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        setLocationRelativeTo(null);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlGr = new javax.swing.JPanel();
        btnKapat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnlGr.setBackground(new java.awt.Color(255, 255, 255));

        btnKapat.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnKapat.setText("Kapat");
        btnKapat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKapatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlGrLayout = new javax.swing.GroupLayout(pnlGr);
        pnlGr.setLayout(pnlGrLayout);
        pnlGrLayout.setHorizontalGroup(
            pnlGrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlGrLayout.createSequentialGroup()
                .addContainerGap(227, Short.MAX_VALUE)
                .addComponent(btnKapat)
                .addContainerGap())
        );
        pnlGrLayout.setVerticalGroup(
            pnlGrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlGrLayout.createSequentialGroup()
                .addContainerGap(171, Short.MAX_VALUE)
                .addComponent(btnKapat)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlGr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlGr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKapatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKapatActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnKapatActionPerformed

    @Override
    public void paint(Graphics g) {
//        Graphics2D g2d = (Graphics2D) g;
        BasicStroke stroke = new BasicStroke(thick, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND);

        g = pnlGr.getGraphics();
        Graphics2D g2d = (Graphics2D) g;

        g2d.setColor(Color.BLACK);
        g2d.setStroke(stroke);
        g2d.drawOval(40, 60, 70, 70);
        g2d.drawOval(90, 60, 70, 70);
        g2d.drawOval(140, 60, 70, 70);
        g2d.drawOval(190, 60, 70, 70);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKapat;
    private javax.swing.JPanel pnlGr;
    // End of variables declaration//GEN-END:variables

}
