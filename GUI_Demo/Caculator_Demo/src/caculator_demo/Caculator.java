/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package caculator_demo;

/**
 *
 * @author Hii
 */
public class Caculator extends javax.swing.JFrame {
    
    double Num1;
    double result;
    double Num2;
    String op;
    /**
     * Creates new form NewJFrame
     */
    public Caculator() {
        initComponents();
        setTitle("Calculator");
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtxtResult = new javax.swing.JTextField();
        jbtac = new javax.swing.JButton();
        jbtdivide = new javax.swing.JButton();
        jbtmultily = new javax.swing.JButton();
        jbtminus = new javax.swing.JButton();
        jbtdigit7 = new javax.swing.JButton();
        jbtplus = new javax.swing.JButton();
        jbtdigit8 = new javax.swing.JButton();
        jbtdigit9 = new javax.swing.JButton();
        jbtdigit6 = new javax.swing.JButton();
        jbtdigit5 = new javax.swing.JButton();
        jbtdigit4 = new javax.swing.JButton();
        jbtdigitdots = new javax.swing.JButton();
        jbtequal = new javax.swing.JButton();
        jbtdigit0 = new javax.swing.JButton();
        jbtdel = new javax.swing.JButton();
        jbtdigit1 = new javax.swing.JButton();
        jbtdigit3 = new javax.swing.JButton();
        jbtdigit2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jtxtResult.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jtxtResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtResultActionPerformed(evt);
            }
        });

        jbtac.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtac.setText("AC");
        jbtac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtacActionPerformed(evt);
            }
        });

        jbtdivide.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtdivide.setText("/");
        jbtdivide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtdivideActionPerformed(evt);
            }
        });

        jbtmultily.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtmultily.setText("*");
        jbtmultily.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtmultilyActionPerformed(evt);
            }
        });

        jbtminus.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtminus.setText("-");
        jbtminus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtminusActionPerformed(evt);
            }
        });

        jbtdigit7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtdigit7.setText("7");
        jbtdigit7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtdigit7ActionPerformed(evt);
            }
        });

        jbtplus.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtplus.setText("+");
        jbtplus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtplusActionPerformed(evt);
            }
        });

        jbtdigit8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtdigit8.setText("8");
        jbtdigit8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtdigit8ActionPerformed(evt);
            }
        });

        jbtdigit9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtdigit9.setText("9");
        jbtdigit9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtdigit9ActionPerformed(evt);
            }
        });

        jbtdigit6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtdigit6.setText("6");
        jbtdigit6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtdigit6ActionPerformed(evt);
            }
        });

        jbtdigit5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtdigit5.setText("5");
        jbtdigit5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtdigit5ActionPerformed(evt);
            }
        });

        jbtdigit4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtdigit4.setText("4");
        jbtdigit4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtdigit4ActionPerformed(evt);
            }
        });

        jbtdigitdots.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtdigitdots.setText(".");
        jbtdigitdots.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtdigitdotsActionPerformed(evt);
            }
        });

        jbtequal.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtequal.setText("=");
        jbtequal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtequalActionPerformed(evt);
            }
        });

        jbtdigit0.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtdigit0.setText("0");
        jbtdigit0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtdigit0ActionPerformed(evt);
            }
        });

        jbtdel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtdel.setText("Del");
        jbtdel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtdelActionPerformed(evt);
            }
        });

        jbtdigit1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtdigit1.setText("1");
        jbtdigit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtdigit1ActionPerformed(evt);
            }
        });

        jbtdigit3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtdigit3.setText("3");
        jbtdigit3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtdigit3ActionPerformed(evt);
            }
        });

        jbtdigit2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtdigit2.setText("2");
        jbtdigit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtdigit2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtxtResult)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtac, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtdivide, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbtmultily, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jbtdigit7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jbtdigit8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jbtdigit9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jbtdel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jbtdigit0, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jbtdigitdots, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jbtdigit4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jbtdigit1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jbtdigit5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jbtdigit6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jbtdigit2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jbtdigit3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbtminus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbtplus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbtequal, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jtxtResult, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtac, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtdivide, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtmultily, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtminus, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbtdigit7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtdigit8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtdigit9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbtdigit4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtdigit5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtdigit6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jbtplus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbtdigit1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtdigit2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtdigit3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbtdel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtdigit0, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtdigitdots, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jbtequal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void EnterNumber(String q){
        String Nums = jtxtResult.getText() + q;
        jtxtResult.setText(Nums);
    }
    
    private void delete() {
        String currentText = jtxtResult.getText();
        if (!currentText.isEmpty()) {
            jtxtResult.setText(currentText.substring(0, currentText.length() - 1));
        }
    }
    private void clear() {
        jtxtResult.setText("");
    }
    

    
    private void jbtacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtacActionPerformed
        clear();
    }//GEN-LAST:event_jbtacActionPerformed

    private void jtxtResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtResultActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtResultActionPerformed

    private void jbtdigit5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtdigit5ActionPerformed
        EnterNumber("5");
    }//GEN-LAST:event_jbtdigit5ActionPerformed

    private void jbtdigit7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtdigit7ActionPerformed
        EnterNumber("7");
    }//GEN-LAST:event_jbtdigit7ActionPerformed

    private void jbtplusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtplusActionPerformed
        Num1 =  Double.parseDouble(jtxtResult.getText());
        jtxtResult.setText("");
        op="+";
    }//GEN-LAST:event_jbtplusActionPerformed

    private void jbtdigit8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtdigit8ActionPerformed
        EnterNumber("8");
    }//GEN-LAST:event_jbtdigit8ActionPerformed

    private void jbtdigit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtdigit1ActionPerformed
        EnterNumber("1");
    }//GEN-LAST:event_jbtdigit1ActionPerformed

    private void jbtdigit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtdigit2ActionPerformed
        EnterNumber("2");
    }//GEN-LAST:event_jbtdigit2ActionPerformed

    private void jbtdigit3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtdigit3ActionPerformed
        EnterNumber("3");
    }//GEN-LAST:event_jbtdigit3ActionPerformed

    private void jbtdigit0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtdigit0ActionPerformed
        EnterNumber("0");
    }//GEN-LAST:event_jbtdigit0ActionPerformed

    private void jbtdigit9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtdigit9ActionPerformed
        EnterNumber("9");
    }//GEN-LAST:event_jbtdigit9ActionPerformed

    private void jbtdigit4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtdigit4ActionPerformed
        EnterNumber("4");
    }//GEN-LAST:event_jbtdigit4ActionPerformed

    private void jbtdigitdotsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtdigitdotsActionPerformed
        if(! jtxtResult.getText().contains(("."))){
            EnterNumber(".");
        }
    }//GEN-LAST:event_jbtdigitdotsActionPerformed

    private void jbtdelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtdelActionPerformed
        delete();
    }//GEN-LAST:event_jbtdelActionPerformed

    private void jbtdivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtdivideActionPerformed
        Num1 =  Double.parseDouble(jtxtResult.getText());
        jtxtResult.setText("");
        op="/";
    }//GEN-LAST:event_jbtdivideActionPerformed

    private void jbtmultilyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtmultilyActionPerformed
        Num1 =  Double.parseDouble(jtxtResult.getText());
        jtxtResult.setText("");
        op="*";
    }//GEN-LAST:event_jbtmultilyActionPerformed

    private void jbtminusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtminusActionPerformed
        Num1 =  Double.parseDouble(jtxtResult.getText());
        jtxtResult.setText("");
        op="-";
    }//GEN-LAST:event_jbtminusActionPerformed

    private void jbtdigit6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtdigit6ActionPerformed
        EnterNumber("6");
    }//GEN-LAST:event_jbtdigit6ActionPerformed

    private void jbtequalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtequalActionPerformed
        Num2 = Double.parseDouble((jtxtResult.getText()));
        if (op.equals("+")) {
            result = Num1 + Num2;
        } else if (op.equals("-")) {
            result = Num1 - Num2;
        } else if (op.equals("*")) {
            result = Num1 * Num2;
        } else if (op.equals("/")) {
            if (Num2 == 0) {
                jtxtResult.setText("Cannot divide by zero");
                return; 
            } else {
                result = Num1 / Num2;
            }
        }
        if (result == Math.floor(result)) {
            jtxtResult.setText(String.format("%.0f", result)); // Định dạng kết quả thành số nguyên
        } else {
            jtxtResult.setText(String.valueOf(result));
        }
    }//GEN-LAST:event_jbtequalActionPerformed

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
            java.util.logging.Logger.getLogger(Caculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Caculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Caculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Caculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Caculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtac;
    private javax.swing.JButton jbtdel;
    private javax.swing.JButton jbtdigit0;
    private javax.swing.JButton jbtdigit1;
    private javax.swing.JButton jbtdigit2;
    private javax.swing.JButton jbtdigit3;
    private javax.swing.JButton jbtdigit4;
    private javax.swing.JButton jbtdigit5;
    private javax.swing.JButton jbtdigit6;
    private javax.swing.JButton jbtdigit7;
    private javax.swing.JButton jbtdigit8;
    private javax.swing.JButton jbtdigit9;
    private javax.swing.JButton jbtdigitdots;
    private javax.swing.JButton jbtdivide;
    private javax.swing.JButton jbtequal;
    private javax.swing.JButton jbtminus;
    private javax.swing.JButton jbtmultily;
    private javax.swing.JButton jbtplus;
    private javax.swing.JTextField jtxtResult;
    // End of variables declaration//GEN-END:variables
}
