
/**
 *
 * @author karan
 */
import javax.swing.*;
public class Calc extends javax.swing.JFrame {
    /*
    * Programmer Defined Variables
    */
    double plusMinus;
    double firstDouble;
    double secondDouble;
    double totalDouble;

    //Clicks
    int plusClick;
    int minusClick;
    int multiplyClick;
    int divideClick;

    /**
     * Creates new form Calc
     */
    public Calc() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        mDisplay = new javax.swing.JTextField();
        btn_one = new javax.swing.JButton();
        btn_two = new javax.swing.JButton();
        btn_three = new javax.swing.JButton();
        btn_five = new javax.swing.JButton();
        btn_four = new javax.swing.JButton();
        btn_seven = new javax.swing.JButton();
        btn_eight = new javax.swing.JButton();
        btn_nine = new javax.swing.JButton();
        btn_six = new javax.swing.JButton();
        btn_multiply = new javax.swing.JButton();
        btn_plus = new javax.swing.JButton();
        btn_minus = new javax.swing.JButton();
        btn_zero = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();
        btn_decimal = new javax.swing.JButton();
        btn_equals = new javax.swing.JButton();
        btn_divide = new javax.swing.JButton();
        btn_posneg = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mDisplay.setEditable(false);
        mDisplay.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        mDisplay.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        mDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mDisplayActionPerformed(evt);
            }
        });

        btn_one.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_one.setText("1");
        btn_one.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_oneActionPerformed(evt);
            }
        });

        btn_two.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_two.setText("2");
        btn_two.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_twoActionPerformed(evt);
            }
        });

        btn_three.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_three.setText("3");
        btn_three.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_threeActionPerformed(evt);
            }
        });

        btn_five.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_five.setText("5");
        btn_five.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_fiveActionPerformed(evt);
            }
        });

        btn_four.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_four.setText("4");
        btn_four.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_fourActionPerformed(evt);
            }
        });

        btn_seven.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_seven.setText("7");
        btn_seven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sevenActionPerformed(evt);
            }
        });

        btn_eight.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_eight.setText("8");
        btn_eight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eightActionPerformed(evt);
            }
        });

        btn_nine.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_nine.setText("9");
        btn_nine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nineActionPerformed(evt);
            }
        });

        btn_six.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_six.setText("6");
        btn_six.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sixActionPerformed(evt);
            }
        });

        btn_multiply.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_multiply.setText("x");
        btn_multiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_multiplyActionPerformed(evt);
            }
        });

        btn_plus.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_plus.setText("+");
        btn_plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_plusActionPerformed(evt);
            }
        });

        btn_minus.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_minus.setText("-");
        btn_minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_minusActionPerformed(evt);
            }
        });

        btn_zero.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_zero.setText("0");
        btn_zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_zeroActionPerformed(evt);
            }
        });

        btn_clear.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_clear.setText("c");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });

        btn_decimal.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_decimal.setText(".");
        btn_decimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_decimalActionPerformed(evt);
            }
        });

        btn_equals.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_equals.setText("=");
        btn_equals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_equalsActionPerformed(evt);
            }
        });

        btn_divide.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_divide.setText("/");
        btn_divide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_divideActionPerformed(evt);
            }
        });

        btn_posneg.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_posneg.setText("+/-");
        btn_posneg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_posnegActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_seven, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_eight, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_nine, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_four, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_five, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_six, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_one, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_two, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_three, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_zero, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_decimal, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_plus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                            .addComponent(btn_minus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_multiply, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_divide, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(mDisplay)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_posneg, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_equals, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_one, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_two, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_three, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_plus, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_five, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_minus, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_four, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_six, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_seven, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_eight, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_nine, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_multiply, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_zero, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_decimal, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_divide, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_equals, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_posneg, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>

    private void mDisplayActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btn_oneActionPerformed(java.awt.event.ActionEvent evt) {
        //clearText();
        mDisplay.setText(mDisplay.getText()+btn_one.getText());
    }

    private void btn_twoActionPerformed(java.awt.event.ActionEvent evt) {
        //clearText();
        mDisplay.setText(mDisplay.getText()+btn_two.getText());
    }

    private void btn_threeActionPerformed(java.awt.event.ActionEvent evt) {

        mDisplay.setText(mDisplay.getText()+btn_three.getText());
    }

    private void btn_fiveActionPerformed(java.awt.event.ActionEvent evt) {

        mDisplay.setText(mDisplay.getText()+btn_five.getText());
    }

    private void btn_fourActionPerformed(java.awt.event.ActionEvent evt) {

        mDisplay.setText(mDisplay.getText() + btn_four.getText());
    }

    private void btn_sevenActionPerformed(java.awt.event.ActionEvent evt) {
        mDisplay.setText(mDisplay.getText()+btn_seven.getText());
    }

    private void btn_eightActionPerformed(java.awt.event.ActionEvent evt) {
       mDisplay.setText(mDisplay.getText()+btn_eight.getText());
    }

    private void btn_nineActionPerformed(java.awt.event.ActionEvent evt) {
        mDisplay.setText(mDisplay.getText()+btn_nine.getText());
    }

    private void btn_sixActionPerformed(java.awt.event.ActionEvent evt) {
        mDisplay.setText(mDisplay.getText()+btn_six.getText());
    }

    private void btn_multiplyActionPerformed(java.awt.event.ActionEvent evt) {
//        firstDouble = (Double.parseDouble(String.valueOf(mDisplay.getText())));
//        mDisplay.setText("");
        updateText();
        mDisplay.setText("*");
        multiplyClick = 1;
    }

    private void btn_plusActionPerformed(java.awt.event.ActionEvent evt) {
//        firstDouble = (Double.parseDouble(String.valueOf(mDisplay.getText())));
//        mDisplay.setText("");
        updateText();
        mDisplay.setText("+");
        plusClick = 1;
    }

    private void btn_minusActionPerformed(java.awt.event.ActionEvent evt) {
//        firstDouble = (Double.parseDouble(String.valueOf(mDisplay.getText())));
//        mDisplay.setText("");
        updateText();
        mDisplay.setText("-");
        minusClick = 1;
    }

    private void btn_zeroActionPerformed(java.awt.event.ActionEvent evt) {
        mDisplay.setText(mDisplay.getText()+btn_zero.getText());
    }

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {
        mDisplay.setText("");
        firstDouble = 0;
        secondDouble = 0;
    }

    private void btn_decimalActionPerformed(java.awt.event.ActionEvent evt) {
        mDisplay.setText(mDisplay.getText()+btn_decimal.getText());
    }
    private void updateText(){
        firstDouble = (Double.parseDouble(String.valueOf(mDisplay.getText())));
    }
    private void btn_equalsActionPerformed(java.awt.event.ActionEvent evt) {
            secondDouble = (Double.parseDouble(String.valueOf(mDisplay.getText())));
        if(secondDouble == 0){
            JOptionPane.showMessageDialog(null, "illegal division by zero");
            clearText();
            throw new ArithmeticException("division by zero");

        }
        if(plusClick > 0) {
            totalDouble = (Math.round(firstDouble + secondDouble));
            mDisplay.setText(String.valueOf(totalDouble));
            firstDouble = 0;
            secondDouble = 0;
            plusClick = 0;
        }
        else if(minusClick > 0) {
            totalDouble = Math.round(firstDouble - secondDouble);
            mDisplay.setText(String.valueOf(totalDouble));
            firstDouble = 0;
            secondDouble = 0;
            minusClick = 0;
        }
        else if(multiplyClick > 0) {
            totalDouble = Math.round(firstDouble * secondDouble);
            mDisplay.setText(String.valueOf(totalDouble));
            firstDouble = 0;
            secondDouble = 0;
            multiplyClick = 0;
        }
        else if(divideClick > 0) {
            totalDouble = Math.round(firstDouble / secondDouble);
            mDisplay.setText(String.valueOf(totalDouble));
            firstDouble = 0;
            secondDouble = 0;
            divideClick = 0;
        }
        else {

            // Do Nothing.
        }
    }

    private void btn_divideActionPerformed(java.awt.event.ActionEvent evt) {

        firstDouble = (Double.parseDouble(String.valueOf(mDisplay.getText())));
        mDisplay.setText("");
        divideClick = 1;
    }

    private void btn_posnegActionPerformed(java.awt.event.ActionEvent evt) {
        plusMinus=(Double.parseDouble(String.valueOf(mDisplay.getText())));
        plusMinus = (plusMinus * (-1));
        mDisplay.setText(String.valueOf(plusMinus));
    }
    private void clearText(){
        mDisplay.setText("");
    }
/*
    private void resetAll() {
        this.firstDouble = 0;
        this.secondDouble = 0;
        if(this.plusClick > 0) {
            this.plusClick = 0;
        } else if(this.minusClick > 0) {
            this.minusClick = 0;
        } else if(this.multiplyClick > 0) {
            this.multiplyClick = 0;
        } else if(this.divideClick > 0) {
            this.divideClick = 0;
        } else {
            // Do Nothing.
        }
    }
*/
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
            java.util.logging.Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Calc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_decimal;
    private javax.swing.JButton btn_divide;
    private javax.swing.JButton btn_eight;
    private javax.swing.JButton btn_equals;
    private javax.swing.JButton btn_five;
    private javax.swing.JButton btn_four;
    private javax.swing.JButton btn_minus;
    private javax.swing.JButton btn_multiply;
    private javax.swing.JButton btn_nine;
    private javax.swing.JButton btn_one;
    private javax.swing.JButton btn_plus;
    private javax.swing.JButton btn_posneg;
    private javax.swing.JButton btn_seven;
    private javax.swing.JButton btn_six;
    private javax.swing.JButton btn_three;
    private javax.swing.JButton btn_two;
    private javax.swing.JButton btn_zero;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField mDisplay;
    // End of variables declaration
}
