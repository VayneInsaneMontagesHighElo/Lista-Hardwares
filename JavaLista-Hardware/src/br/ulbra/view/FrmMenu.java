/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.view;

import br.ulbra.model.hardware;
import static br.ulbra.view.FrmCadastro.bditems;
import java.io.IOException;

/**
 *
 * @author Killer Queen
 */
public class FrmMenu extends javax.swing.JFrame {

   
    public FrmMenu() 
    {
        initComponents();
        setLocationRelativeTo(null);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        miCad = new javax.swing.JMenuItem();
        miSair = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        miBack = new javax.swing.JMenuItem();
        miRest = new javax.swing.JMenuItem();
        miElim = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        miCred = new javax.swing.JMenuItem();
        miNote = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu principal");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Noto Sans Light", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Listagem de hardwares");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, -1, -1));

        jLabel2.setFont(new java.awt.Font("Noto Sans Light", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 0));
        jLabel2.setText("AMD");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, -1, -1));

        jLabel3.setFont(new java.awt.Font("Noto Sans Light", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 153, 255));
        jLabel3.setText("Intel");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, -1, -1));

        jLabel4.setFont(new java.awt.Font("Noto Sans Light", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 204, 0));
        jLabel4.setText("NVIDIA");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 270, -1, -1));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 660, 390));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 460));

        jMenu1.setText("Cadastrar");

        miCad.setText("Cadastro");
        miCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCadActionPerformed(evt);
            }
        });
        jMenu1.add(miCad);

        miSair.setText("Sair");
        miSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSairActionPerformed(evt);
            }
        });
        jMenu1.add(miSair);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Op????es");

        miBack.setText("Backup");
        miBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miBackActionPerformed(evt);
            }
        });
        jMenu2.add(miBack);

        miRest.setText("Restaurar");
        miRest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miRestActionPerformed(evt);
            }
        });
        jMenu2.add(miRest);

        miElim.setText("Eliminar");
        miElim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miElimActionPerformed(evt);
            }
        });
        jMenu2.add(miElim);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Sobre");

        miCred.setText("Creditos");
        miCred.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCredActionPerformed(evt);
            }
        });
        jMenu3.add(miCred);

        miNote.setText("Bloco de notas");
        miNote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miNoteActionPerformed(evt);
            }
        });
        jMenu3.add(miNote);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCadActionPerformed
        FrmCadastro fcad = new FrmCadastro();
        fcad.setVisible(true);
    }//GEN-LAST:event_miCadActionPerformed

    private void miSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_miSairActionPerformed

    private void miCredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCredActionPerformed
        FrmCredito fcred = new FrmCredito();
        fcred.setVisible(true);
    }//GEN-LAST:event_miCredActionPerformed

    private void miNoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miNoteActionPerformed
        Runtime abrir = Runtime.getRuntime();
 
        try
        {
            abrir.exec("notepad.exe");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_miNoteActionPerformed

    private void miBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miBackActionPerformed
        bditems.backup();
    }//GEN-LAST:event_miBackActionPerformed

    private void miRestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miRestActionPerformed
        bditems.restaurar();
    }//GEN-LAST:event_miRestActionPerformed

    private void miElimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miElimActionPerformed
        bditems.eliminar();
    }//GEN-LAST:event_miElimActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JMenuItem miBack;
    private javax.swing.JMenuItem miCad;
    private javax.swing.JMenuItem miCred;
    private javax.swing.JMenuItem miElim;
    private javax.swing.JMenuItem miNote;
    private javax.swing.JMenuItem miRest;
    private javax.swing.JMenuItem miSair;
    // End of variables declaration//GEN-END:variables
}
