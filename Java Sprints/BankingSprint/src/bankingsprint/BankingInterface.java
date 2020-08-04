/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankingsprint;

import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class BankingInterface extends javax.swing.JFrame {
    
    public static double balance = 2000;
    public static int userID = 0;
     private static SessionFactory factory;

    /**
     * Creates new form BankingInterface
     */
    public BankingInterface() {
        initComponents();
        viewBalance();
        tfBalances.setText(String.valueOf(balance));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnWithdraw = new javax.swing.JButton();
        btnDeposit = new javax.swing.JButton();
        tfDeposit = new javax.swing.JTextField();
        tfWithdraw = new javax.swing.JTextField();
        tfBalances = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnFinancial = new javax.swing.JButton();
        btnTax = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnWithdraw.setText("Withdraw");
        btnWithdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWithdrawActionPerformed(evt);
            }
        });

        btnDeposit.setText("Deposit");
        btnDeposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositActionPerformed(evt);
            }
        });

        tfDeposit.setText("0");

        tfWithdraw.setText("0");

        tfBalances.setText("0");
        tfBalances.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfBalancesActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setText("Transactions");

        btnFinancial.setText("Calculate");
        btnFinancial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinancialActionPerformed(evt);
            }
        });

        btnTax.setText("Calculate");
        btnTax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaxActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Financial Calculator");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Tax Forecaster");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Balances:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDeposit)
                            .addComponent(btnWithdraw)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(btnFinancial))
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfDeposit, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfWithdraw, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(74, 74, 74))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnTax)
                                .addGap(65, 65, 65))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfBalances, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDeposit)
                    .addComponent(tfDeposit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnWithdraw)
                    .addComponent(tfWithdraw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfBalances, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFinancial)
                    .addComponent(btnTax))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnFinancialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinancialActionPerformed
        Calculator.createWindow();
       
    }//GEN-LAST:event_btnFinancialActionPerformed

    private void tfBalancesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfBalancesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfBalancesActionPerformed

    private void btnTaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaxActionPerformed
        TaxForecast fore = new TaxForecast();
        fore.setVisible(true);
    }//GEN-LAST:event_btnTaxActionPerformed

    private void btnDepositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositActionPerformed
        
        double value = 0;
        
        try {
            value = Double.valueOf(tfDeposit.getText());
        } catch (Exception e) {
        }
        
        balance = balance + value;
        upDATE();
        tfBalances.setText(String.valueOf(balance));
    }//GEN-LAST:event_btnDepositActionPerformed

    private void btnWithdrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWithdrawActionPerformed
        // TODO add your handling code here:
        
        double value = 0;
        
        try {
            value = Double.valueOf(tfWithdraw.getText());
        } catch (Exception e) {
        }
        
        balance = balance - value;
        upDATE();
        tfBalances.setText(String.valueOf(balance));
    }//GEN-LAST:event_btnWithdrawActionPerformed

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
            java.util.logging.Logger.getLogger(BankingInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BankingInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BankingInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BankingInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BankingInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeposit;
    private javax.swing.JButton btnFinancial;
    private javax.swing.JButton btnTax;
    private javax.swing.JButton btnWithdraw;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tfBalances;
    private javax.swing.JTextField tfDeposit;
    private javax.swing.JTextField tfWithdraw;
    // End of variables declaration//GEN-END:variables

    public static void logIN(String userName, String passWord) {
        
        
        try {
        factory = new Configuration().configure().buildSessionFactory();
                
                Session session = factory.openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();

            Criteria crit = null;
            List stuff = null;
            
            
        
                    crit = session.createCriteria(POJOS.Accounts.class);
                    crit.add(Restrictions.eq("username", userName));
                    crit.add(Restrictions.eq("password", passWord));
                    
                    stuff = crit.list();
                    if (stuff.size() > 0) {
                        for (Iterator iterator = stuff.iterator(); iterator.hasNext();) {
                            POJOS.Accounts acc = (POJOS.Accounts) iterator.next();
                           userID = acc.getId() ; 
                        
                        }
                       
                        BankingInterface bank = new BankingInterface();
                        bank.setVisible(true);
                    
                    } else {
                        JOptionPane.showMessageDialog(null, "Invalid login credentials.");
                    }}
        
        catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }//JOptionPane.showMessageDialog(null, "Invalid username", "Access Denied", 0);
                
            } catch (Throwable ex) {
                System.err.println("An Error has occurred");
                throw new ExceptionInInitializerError(ex);
            }
    
    }
    
    public static void viewBalance() {
    
        try {
        factory = new Configuration().configure().buildSessionFactory();
                
                Session session = factory.openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            
            POJOS.Accounts acc = (POJOS.Accounts) session.get(POJOS.Accounts.class, userID);
                    balance = acc.getBalance();
                    tx.commit();
        }  catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }//JOptionPane.showMessageDialog(null, "Invalid username", "Access Denied", 0);
                
            } catch (Throwable ex) {
                System.err.println("An Error has occurred");
                throw new ExceptionInInitializerError(ex);
            }
        
    }
    
    public static void upDATE() {
        try {
        factory = new Configuration().configure().buildSessionFactory();
                
                Session session = factory.openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            
            POJOS.Accounts acc = (POJOS.Accounts) session.get(POJOS.Accounts.class, userID);
                    acc.setBalance(balance);
                    tx.commit();
        }  catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }//JOptionPane.showMessageDialog(null, "Invalid username", "Access Denied", 0);
                
            } catch (Throwable ex) {
                System.err.println("An Error has occurred");
                throw new ExceptionInInitializerError(ex);
            }
    }
    
    public static void inSERT(String iD, String uSernAme, String pAsswOrd, String bAlance, String nAme) {
        
        try {
        factory = new Configuration().configure().buildSessionFactory();
                
                Session session = factory.openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            
            //int idNum = 0;
            //String userName = "";
            //String passWord = "";
            //double balance = 0;
            //String name = "";
            
           
                 int idNum = Integer.valueOf(iD);
                 String userName = uSernAme;
                 String passWord = pAsswOrd;
                 double balance = Integer.valueOf(bAlance);
                 String name = nAme;
            
            
            POJOS.Accounts acc = new POJOS.Accounts(idNum, userName, passWord, balance, name);
                    //acc.setBalance(balance);
                    
                    
            
                    session.save(acc);
                    tx.commit();
                    
                    JOptionPane.showMessageDialog(null, "Account successfully created.");
                    
        }  catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }//JOptionPane.showMessageDialog(null, "Invalid username", "Access Denied", 0);
                
            } catch (Throwable ex) {
                System.err.println("An Error has occurred");
                throw new ExceptionInInitializerError(ex);
            }
    
    }


}
