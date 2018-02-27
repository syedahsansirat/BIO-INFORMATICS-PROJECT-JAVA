/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *

 */
public class DnaFrequencyCount extends javax.swing.JFrame {

    /**
     * Creates new form DnaFrequencyCount
     */
    public DnaFrequencyCount() {
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        inputTextArea = new javax.swing.JTextArea();
        sequenceLabel = new javax.swing.JLabel();
        goButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        outputTextArea = new javax.swing.JTextArea();
        outputLabel = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(450, 350));
        getContentPane().setLayout(null);

        titleLabel.setText("Frequency Count For DNA");
        getContentPane().add(titleLabel);
        titleLabel.setBounds(110, 20, 185, 30);

        inputTextArea.setColumns(20);
        inputTextArea.setRows(5);
        jScrollPane1.setViewportView(inputTextArea);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(130, 70, 180, 96);

        sequenceLabel.setText("Enter Sequence");
        getContentPane().add(sequenceLabel);
        sequenceLabel.setBounds(10, 110, 110, 20);

        goButton.setText("Go");
        goButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goButtonActionPerformed(evt);
            }
        });
        getContentPane().add(goButton);
        goButton.setBounds(320, 110, 45, 23);

        outputTextArea.setColumns(20);
        outputTextArea.setRows(5);
        jScrollPane2.setViewportView(outputTextArea);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(100, 170, 290, 120);

        outputLabel.setText("output");
        getContentPane().add(outputLabel);
        outputLabel.setBounds(20, 220, 50, 14);

        backButton.setText("CLOSE");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        getContentPane().add(backButton);
        backButton.setBounds(10, 243, 73, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void goButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goButtonActionPerformed
        String input = inputTextArea.getText();
        int length = input.length();
        int a = 0, t = 0, c = 0, g = 0;
        for (int i = 0; i < length; i++) {
            String temp = input.substring(i, i + 1);
            if (temp.compareTo("A") == 0 || temp.compareTo("a") == 0) {
                a++;
            } else if (temp.compareTo("T") == 0 || temp.compareTo("t") == 0) {
                t++;
            } else if (temp.compareTo("C") == 0 || temp.compareTo("c") == 0) {
                c++;
            } else if (temp.compareTo("G") == 0 || temp.compareTo("g") == 0) {
                g++;
            }

        }
        String output = "There are :\n";
        if (a >= 0) {
            output += a + " Adinin\n";
        }
        if (t >= 0) {
            output += t + " Thaimin\n";
        }
        if (c >= 0) {
            output += c + " Citocin\n";
        }
        if (g >= 0) {
            output += g + " Guanin\n";
        }

        outputTextArea.setText(output);
    }//GEN-LAST:event_goButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed

        dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(DnaFrequencyCount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DnaFrequencyCount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DnaFrequencyCount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DnaFrequencyCount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DnaFrequencyCount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton goButton;
    private javax.swing.JTextArea inputTextArea;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel outputLabel;
    private javax.swing.JTextArea outputTextArea;
    private javax.swing.JLabel sequenceLabel;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
