/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.uesb.petshop.view;

import br.edu.uesb.petshop.dao.ClienteDAO;
import br.edu.uesb.petshop.enumerado.EnumView;
import br.edu.uesb.petshop.model.PetShop;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;

/**
 *
 * @author matheus
 */
public class TelaBuscaResultado extends javax.swing.JFrame {

    /**
     * Creates new form TelaBuscaResultado
     */
    public TelaBuscaResultado() {
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

        pTelaBuscaResultado = new javax.swing.JPanel();
        lbTituloBuscaResultado = new javax.swing.JLabel();
        cbResultadoBusca = new javax.swing.JComboBox();
        bSelecionar = new javax.swing.JButton();
        bCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(365, 161, 161, 161));
        setMaximizedBounds(new java.awt.Rectangle(577, 161, 577, 161));
        setMinimumSize(new java.awt.Dimension(577, 161));

        pTelaBuscaResultado.setMaximumSize(new java.awt.Dimension(577, 161));
        pTelaBuscaResultado.setMinimumSize(new java.awt.Dimension(577, 161));

        lbTituloBuscaResultado.setFont(new java.awt.Font("Arial", 1, 21)); // NOI18N
        lbTituloBuscaResultado.setText("RESULTADOS ENCONTRADOS");

        cbResultadoBusca.setModel(new javax.swing.DefaultComboBoxModel(new String[] { }));

        bSelecionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/54.png"))); // NOI18N
        bSelecionar.setText("Selecionar");
        bSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSelecionarActionPerformed(evt);
            }
        });

        bCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/52.png"))); // NOI18N
        bCancelar.setText("Cancelar");
        bCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pTelaBuscaResultadoLayout = new javax.swing.GroupLayout(pTelaBuscaResultado);
        pTelaBuscaResultado.setLayout(pTelaBuscaResultadoLayout);
        pTelaBuscaResultadoLayout.setHorizontalGroup(
            pTelaBuscaResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTelaBuscaResultadoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pTelaBuscaResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(cbResultadoBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pTelaBuscaResultadoLayout.createSequentialGroup()
                        .addComponent(bCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bSelecionar))
                    .addComponent(lbTituloBuscaResultado))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pTelaBuscaResultadoLayout.setVerticalGroup(
            pTelaBuscaResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTelaBuscaResultadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTituloBuscaResultado)
                .addGap(28, 28, 28)
                .addComponent(cbResultadoBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pTelaBuscaResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bSelecionar)
                    .addComponent(bCancelar))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pTelaBuscaResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pTelaBuscaResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelarActionPerformed
        PetShop.tela.setEnabled(true);
        this.dispose();
    }//GEN-LAST:event_bCancelarActionPerformed

    private void bSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSelecionarActionPerformed
        PetShop.tela.showView(EnumView.TELACLIENTE);
        PetShop.tela.setEnabled(true);
        this.dispose();
    }//GEN-LAST:event_bSelecionarActionPerformed

    public void BuscarByNome(String nome) {
        ClienteDAO clienteDAO = new ClienteDAO();
        ResultSet rs = clienteDAO.getByNome(nome);
        try {
            while (rs.next()) {
                cbResultadoBusca.addItem("Nome: " + rs.getString("nome") + " - CPF: " + rs.getString("cpf"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(TelaBuscaResultado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void BuscarByCpf(String cpf) {
        ClienteDAO clienteDAO = new ClienteDAO();
        ResultSet rs = clienteDAO.getByCpf(cpf);
        try {
            while (rs.next()) {
                cbResultadoBusca.addItem("Nome: " + rs.getString("nome") + " - CPF: " + rs.getString("cpf"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(TelaBuscaResultado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCancelar;
    private javax.swing.JButton bSelecionar;
    public javax.swing.JComboBox cbResultadoBusca;
    private javax.swing.JLabel lbTituloBuscaResultado;
    private javax.swing.JPanel pTelaBuscaResultado;
    // End of variables declaration//GEN-END:variables
}
