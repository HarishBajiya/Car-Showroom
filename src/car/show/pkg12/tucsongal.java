/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * i10gal.java
 *
 * Created on Jul 31, 2017, 11:43:31 PM
 */
package car.show.pkg12;

/**
 *
 * @author Yoofiyaapa
 */
public class tucsongal extends javax.swing.JFrame {

    /** Creates new form i10gal */
    public tucsongal() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tucson Gallery");
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setText("EXTERIOR.....VIEW");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 11, 276, 43);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/car/show/pkg12/te1.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 74, 330, 203);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/car/show/pkg12/te2.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(368, 65, 340, 221);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/car/show/pkg12/te3.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(720, 80, 350, 210);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/car/show/pkg12/ti1.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 360, 362, 210);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/car/show/pkg12/ti2.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(390, 360, 330, 210);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/car/show/pkg12/ti3.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(730, 360, 350, 210);

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel8.setText("INTERIOR..... VIEW");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(30, 300, 318, 51);

        jButton1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton1.setText("...BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(490, 590, 127, 41);

        setSize(new java.awt.Dimension(1113, 690));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
dispose();
new Tucsondet().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new tucsongal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
