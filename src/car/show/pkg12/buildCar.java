/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * buildCar.java
 *
 * Created on Jul 8, 2017, 12:27:35 AM
 */
package car.show.pkg12;

/**
 *
 * @author Yoofiyaapa
 */
public class buildCar extends javax.swing.JFrame {

    /** Creates new form buildCar */
    public buildCar() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        jCheckBox5 = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        jCheckBox7 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Build Car");
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setText("FIND A CAR:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 20, 222, 39);

        jCheckBox1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jCheckBox1.setText("GRAND i10");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox1);
        jCheckBox1.setBounds(140, 280, 150, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/car/show/pkg12/Elantra1.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(410, 40, 390, 210);

        jCheckBox2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jCheckBox2.setText("Elantra");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox2);
        jCheckBox2.setBounds(520, 280, 110, 31);

        jCheckBox4.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jCheckBox4.setText("Verna");
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox4);
        jCheckBox4.setBounds(940, 280, 79, 31);

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel6.setText("FIND A SUV:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(40, 340, 190, 50);

        jCheckBox5.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jCheckBox5.setText("CRETA");
        jCheckBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox5ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox5);
        jCheckBox5.setBounds(350, 570, 120, 31);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/car/show/pkg12/tucson m.png"))); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(690, 330, 385, 200);

        jCheckBox7.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jCheckBox7.setText("Tucson");
        jCheckBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox7ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox7);
        jCheckBox7.setBounds(850, 570, 130, 31);

        jButton1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jButton1.setText("HOME PAGE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(30, 600, 240, 50);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/car/show/pkg12/Grand i10 (2).png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 70, 360, 180);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/car/show/pkg12/Verna (2).png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(790, 40, 390, 189);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/car/show/pkg12/Cretaq.png"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(220, 370, 350, 180);

        setSize(new java.awt.Dimension(1179, 709));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
dispose();
new Welcome().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
dispose();
new i10().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
   dispose();
new Elantra().setVisible(true);     // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
dispose();
new verna().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void jCheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox5ActionPerformed
dispose();
new Creta().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox5ActionPerformed

    private void jCheckBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox7ActionPerformed
dispose();
new Tucson().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox7ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new buildCar().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
