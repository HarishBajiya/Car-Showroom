/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * i10.java
 *
 * Created on Jul 31, 2017, 11:05:12 PM
 */
package car.show.pkg12;

import javax.swing.JOptionPane;

/**
 *
 * @author Yoofiyaapa
 */
public class verna extends javax.swing.JFrame {

    /** Creates new form i10 */
    public verna() {
        initComponents();
        
        Red.setVisible(false);
        Black.setVisible(false);
        star.setVisible(false);
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Silver = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        e1 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        e2 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        vari = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        ss = new javax.swing.JRadioButton();
        sd = new javax.swing.JRadioButton();
        pb = new javax.swing.JRadioButton();
        fr = new javax.swing.JRadioButton();
        Black = new javax.swing.JLabel();
        star = new javax.swing.JLabel();
        Red = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        a1 = new javax.swing.JCheckBox();
        a2 = new javax.swing.JCheckBox();
        a3 = new javax.swing.JCheckBox();
        a4 = new javax.swing.JCheckBox();
        a5 = new javax.swing.JCheckBox();
        a6 = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        e3 = new javax.swing.JRadioButton();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Grand i10");
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setText("VERNA");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(23, 15, 212, 46);

        jButton1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton1.setText("PRODUCT DETAILS -->");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(180, 20, 264, 32);

        Silver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/car/show/pkg12/verna silver.png"))); // NOI18N
        getContentPane().add(Silver);
        Silver.setBounds(430, 10, 610, 240);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Choose a Engine...");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(23, 72, 167, 22);

        buttonGroup1.add(e1);
        e1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        e1.setText("1.6L Dual VTVT 6 Speed Automatic Transmission");
        e1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e1ActionPerformed(evt);
            }
        });
        getContentPane().add(e1);
        e1.setBounds(20, 110, 459, 31);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("4-DOOR Petrol 6 Speed Automatic Transmission");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 160, 381, 22);

        buttonGroup1.add(e2);
        e2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        e2.setText("1.6L Dual VTVT 6 Speed Manual Transmission");
        getContentPane().add(e2);
        e2.setBounds(20, 200, 433, 31);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("4-DOOR Petrol 6 Speed Manual Transmission");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(50, 240, 368, 26);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Choose a Variant..");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 380, 165, 22);

        vari.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        vari.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "E", "EX", "SX" }));
        getContentPane().add(vari);
        vari.setBounds(250, 380, 68, 28);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Choose a Exterior Color...");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(480, 330, 241, 22);

        buttonGroup2.add(ss);
        ss.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ss.setText("Sleek Silver");
        ss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ssActionPerformed(evt);
            }
        });
        getContentPane().add(ss);
        ss.setBounds(740, 330, 129, 31);

        buttonGroup2.add(sd);
        sd.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        sd.setText("Star Dust");
        sd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sdActionPerformed(evt);
            }
        });
        getContentPane().add(sd);
        sd.setBounds(900, 330, 109, 31);

        buttonGroup2.add(pb);
        pb.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        pb.setText("Phantom Black");
        pb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pbActionPerformed(evt);
            }
        });
        getContentPane().add(pb);
        pb.setBounds(730, 370, 161, 31);

        buttonGroup2.add(fr);
        fr.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        fr.setText("Fiery Red");
        fr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frActionPerformed(evt);
            }
        });
        getContentPane().add(fr);
        fr.setBounds(910, 370, 109, 31);

        Black.setIcon(new javax.swing.ImageIcon(getClass().getResource("/car/show/pkg12/verna black.png"))); // NOI18N
        getContentPane().add(Black);
        Black.setBounds(440, 0, 650, 270);

        star.setIcon(new javax.swing.ImageIcon(getClass().getResource("/car/show/pkg12/verna blue.png"))); // NOI18N
        getContentPane().add(star);
        star.setBounds(440, 10, 600, 270);

        Red.setIcon(new javax.swing.ImageIcon(getClass().getResource("/car/show/pkg12/verna red.png"))); // NOI18N
        getContentPane().add(Red);
        Red.setBounds(450, 0, 590, 280);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Choose Accessories...");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(30, 440, 234, 26);

        jButton2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton2.setText("RESULT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(700, 570, 101, 31);

        a1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        a1.setText("Seat Cover- Jacquard");
        getContentPane().add(a1);
        a1.setBounds(260, 450, 228, 31);

        a2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        a2.setText("3M Anti Rust Coating");
        getContentPane().add(a2);
        a2.setBounds(520, 450, 221, 31);

        a3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        a3.setText("Front Fog Lights");
        getContentPane().add(a3);
        a3.setBounds(500, 530, 169, 31);

        a4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        a4.setText("MapmyIndia GPS Navigator");
        getContentPane().add(a4);
        a4.setBounds(20, 530, 273, 31);

        a5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        a5.setText("Alloy Wheel");
        getContentPane().add(a5);
        a5.setBounds(330, 530, 131, 31);

        a6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        a6.setText("2 Din Infotainment System");
        getContentPane().add(a6);
        a6.setBounds(760, 450, 269, 31);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Rs 5400/-");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(280, 500, 71, 17);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Rs 4500/-");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(540, 500, 71, 17);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Rs 5550/-");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(510, 590, 71, 17);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Rs 16000/-");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(40, 580, 80, 17);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Rs 22500/-");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(340, 580, 80, 17);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Rs 14500/-");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(790, 510, 80, 17);

        jButton3.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton3.setText("<-- BACK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(920, 510, 117, 31);

        jButton4.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton4.setText("HOME PAGE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(900, 570, 141, 31);

        buttonGroup1.add(e3);
        e3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        e3.setText("1.6L U2 CRDi VGT 6 Speed Manual Transmission");
        getContentPane().add(e3);
        e3.setBounds(20, 280, 455, 31);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("4-DOOR Diesel 6 Speed Manual Transmission");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(50, 330, 359, 22);

        setSize(new java.awt.Dimension(1080, 661));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
dispose();
new vernadet11().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ssActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ssActionPerformed
Silver.setVisible(true);

Red.setVisible(false);
Black.setVisible(false);
star.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_ssActionPerformed

    private void sdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sdActionPerformed
Silver.setVisible(false);
Black.setVisible(false);

Red.setVisible(false);
star.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_sdActionPerformed

    private void pbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pbActionPerformed
Silver.setVisible(false);

Red.setVisible(false);
Black.setVisible(true);
star.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_pbActionPerformed

    private void frActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frActionPerformed
Silver.setVisible(false);

Red.setVisible(true);
Black.setVisible(false);
star.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_frActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
String variant = null, engine = null,color = null,acc = null;
 if (e1.isSelected())
 engine="1.6L Dual VTVT 6 Speed Automatic Transmission";    
else if (e2.isSelected())
engine="1.6L Dual VTVT 6 Speed Manual Transmission";
else if (e3.isSelected())
 engine="1.6L U2 CRDi VGT 6 Speed Manual Transmission";   
 if(a1.isSelected())
     acc= "Seat Cover - Jacquard    ";
  if(a2.isSelected())
     acc=acc+  "3M Anti Rust Coating     ";
   if(a3.isSelected())
     acc=acc + "Front Fog Lights     ";
    if(a4.isSelected())
     acc= acc + "MapmyIndia GPS Navigation      ";
     if(a5.isSelected())
     acc= acc + "Alloy Wheel";
      if(a6.isSelected())
     acc= acc + "2 Din Infotainment System    ";
     
     
 
 
 
if (vari.getSelectedIndex()==0)
   variant=" E " ;
else if (vari.getSelectedIndex()==1)
   variant=" EX " ;
else if (vari.getSelectedIndex()==2)
   variant=" SX " ;
if(ss.isSelected())
 color="Pure White"; 
else if(sd.isSelected())
color="Star Dust"; 
else if(pb.isSelected())
color="Twilight Blue"; 
else if(fr.isSelected())
color="Red Passion"; 

JOptionPane.showMessageDialog(this, " MODEL NAME :- VERNA " + "\n" +
        " VARIANT :- " + variant + "\n" +
          " ENGINE :- " + engine + "\n" +
        " EXTERIOR COLOR :- " + color + "\n" + 
        " ACCESSORIES :- " + acc + "\n" +
        " CONGRATS ! Your Vehicle Has Been Completed ");


// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

private void e1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e1ActionPerformed
    // TODO add your handling code here:
}//GEN-LAST:event_e1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
dispose();
new buildCar().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
dispose();
new Welcome().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new verna().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Black;
    private javax.swing.JLabel Red;
    private javax.swing.JLabel Silver;
    private javax.swing.JCheckBox a1;
    private javax.swing.JCheckBox a2;
    private javax.swing.JCheckBox a3;
    private javax.swing.JCheckBox a4;
    private javax.swing.JCheckBox a5;
    private javax.swing.JCheckBox a6;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JRadioButton e1;
    private javax.swing.JRadioButton e2;
    private javax.swing.JRadioButton e3;
    private javax.swing.JRadioButton fr;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton pb;
    private javax.swing.JRadioButton sd;
    private javax.swing.JRadioButton ss;
    private javax.swing.JLabel star;
    private javax.swing.JComboBox vari;
    // End of variables declaration//GEN-END:variables
}