/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.uesb.petshop.gui;

import br.edu.uesb.petshop.dao.ConexaoPostgreSQL;
import br.edu.uesb.petshop.enumerado.EnumView;
import br.edu.uesb.petshop.model.PetShop;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author matheus
 */
public class TelaLogin extends javax.swing.JPanel {

    /**
     * Creates new form TelaLogin
     */
    public TelaLogin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTituloMenuLogin = new javax.swing.JLabel();
        txtLoginMenuLogin = new javax.swing.JTextField();
        lbLoginMenuLogin = new javax.swing.JLabel();
        lbSenhaMenuLogin = new javax.swing.JLabel();
        bEntrarMenuLogin = new javax.swing.JButton();
        bSairMenuLogin = new javax.swing.JButton();
        txtSenhaMenuLogin = new javax.swing.JPasswordField();
        pLoginIncorretoMenuLogin = new javax.swing.JPanel();
        lbLoginIncorretoMenuLogin = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(700, 400));

        lbTituloMenuLogin.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lbTituloMenuLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTituloMenuLogin.setText("PET SHOP");

        txtLoginMenuLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLoginMenuLoginActionPerformed(evt);
            }
        });

        lbLoginMenuLogin.setText("Login:");

        lbSenhaMenuLogin.setText("Senha:");

        bEntrarMenuLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/54.png"))); // NOI18N
        bEntrarMenuLogin.setText("Entrar");
        bEntrarMenuLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEntrarMenuLoginActionPerformed(evt);
            }
        });

        bSairMenuLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/52.png"))); // NOI18N
        bSairMenuLogin.setText("Sair");
        bSairMenuLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSairMenuLoginActionPerformed(evt);
            }
        });

        txtSenhaMenuLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaMenuLoginActionPerformed(evt);
            }
        });

        pLoginIncorretoMenuLogin.setBackground(new java.awt.Color(255, 0, 0));
        pLoginIncorretoMenuLogin.setVisible(false);

        lbLoginIncorretoMenuLogin.setForeground(new java.awt.Color(255, 204, 204));
        lbLoginIncorretoMenuLogin.setText("Login incorreto, por favor tente novamente");

        javax.swing.GroupLayout pLoginIncorretoMenuLoginLayout = new javax.swing.GroupLayout(pLoginIncorretoMenuLogin);
        pLoginIncorretoMenuLogin.setLayout(pLoginIncorretoMenuLoginLayout);
        pLoginIncorretoMenuLoginLayout.setHorizontalGroup(
            pLoginIncorretoMenuLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pLoginIncorretoMenuLoginLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbLoginIncorretoMenuLogin)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pLoginIncorretoMenuLoginLayout.setVerticalGroup(
            pLoginIncorretoMenuLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbLoginIncorretoMenuLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pLoginIncorretoMenuLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bSairMenuLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(bEntrarMenuLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbLoginMenuLogin)
                        .addGap(18, 18, 18)
                        .addComponent(txtLoginMenuLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbSenhaMenuLogin)
                        .addGap(12, 12, 12)
                        .addComponent(txtSenhaMenuLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbTituloMenuLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbTituloMenuLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLoginMenuLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbLoginMenuLogin))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSenhaMenuLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbSenhaMenuLogin))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(pLoginIncorretoMenuLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bEntrarMenuLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bSairMenuLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtLoginMenuLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLoginMenuLoginActionPerformed
        txtSenhaMenuLogin.requestFocus();        // TODO add your handling code here:
    }//GEN-LAST:event_txtLoginMenuLoginActionPerformed

    private void bEntrarMenuLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEntrarMenuLoginActionPerformed
        Statement query = ConexaoPostgreSQL.openConnectionPostgreSQL();
        int cont = 0;

        try {

            ResultSet rs = query.executeQuery("SELECT id, login, senha, nivel FROM \"Admin\""
                    + "WHERE login = '" + txtLoginMenuLogin.getText() + "' ");

            while (rs.next()) {
                cont++;
                rs = query.executeQuery("SELECT id, login, senha, nivel FROM \"Admin\""
                        + "WHERE senha = '" + txtSenhaMenuLogin.getText() + "' ");

                while (rs.next()) {
                    if (rs.getString("login").equals(txtLoginMenuLogin.getText())) {
                        if (rs.getInt("nivel") == 1) {
//                            lbTituloMenuPrincipal.setText("FUNCIONARIO");
//                            bFuncionarioMenuPrincipal.setEnabled(false);
                        } else {
//                            lbTituloMenuPrincipal.setText("ADMIN");
//                            bFuncionarioMenuPrincipal.setEnabled(true);
                        }
                        pLoginIncorretoMenuLogin.setVisible(false);
                        cont++;
                        PetShop.tela.showView(EnumView.TELAPRINCIPAL);
//                        mAnimais.setEnabled(true);
//                        mClientes.setEnabled(true);
//                        mAtendimento.setEnabled(true);
//                        mCadastro.setEnabled(true);
                    }
                }
            }

            if (cont == 0) {
                pLoginIncorretoMenuLogin.setVisible(true);
                lbLoginIncorretoMenuLogin.setText("Login invalido, por favor tente novamente");
            } else if (cont == 1) {
                pLoginIncorretoMenuLogin.setVisible(true);
                lbLoginIncorretoMenuLogin.setText("Senha invalida, por favor tente novamente");
            }

        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            lbLoginIncorretoMenuLogin.setVisible(true);
        }
    }//GEN-LAST:event_bEntrarMenuLoginActionPerformed

    private void bSairMenuLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSairMenuLoginActionPerformed
        this.fechar();
    }//GEN-LAST:event_bSairMenuLoginActionPerformed

    private void txtSenhaMenuLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaMenuLoginActionPerformed
        bEntrarMenuLoginActionPerformed(evt);
    }//GEN-LAST:event_txtSenhaMenuLoginActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bEntrarMenuLogin;
    private javax.swing.JButton bSairMenuLogin;
    private javax.swing.JLabel lbLoginIncorretoMenuLogin;
    private javax.swing.JLabel lbLoginMenuLogin;
    private javax.swing.JLabel lbSenhaMenuLogin;
    private javax.swing.JLabel lbTituloMenuLogin;
    private javax.swing.JPanel pLoginIncorretoMenuLogin;
    private javax.swing.JTextField txtLoginMenuLogin;
    private javax.swing.JPasswordField txtSenhaMenuLogin;
    // End of variables declaration//GEN-END:variables

    private void fechar() {
        if (javax.swing.JOptionPane.showConfirmDialog(null, "Deseja sair do programa?", "ATENÇÃO ", javax.swing.JOptionPane.YES_NO_OPTION) == 0) {
            PetShop.tela.dispose();

        }
    }
}
