/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.uesb.petshop.gui;

/**
 *
 * @author matheus
 */
public class TelaPrincipal extends javax.swing.JFrame {

    public TelaPrincipal() {
        initComponents();
    }

    /**
     * This ethod is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

//        this.setContentPane(pMenuPrincipal);
        pMenuPrincipal = new javax.swing.JPanel();
        bClientes = new javax.swing.JButton();
        bServicos = new javax.swing.JButton();
        bAnimais = new javax.swing.JButton();
        bFuncionario = new javax.swing.JButton();
        bLogout = new javax.swing.JButton();
        txtAdmin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pMenuPrincipal.setVisible(false);

        bClientes.setIcon(new javax.swing.ImageIcon("/home/matheus/Downloads/mimiGlyphs/png/13.png")); // NOI18N
        bClientes.setText("<html><body>CLIENTES</body></html>");
        bClientes.setToolTipText("");
        bClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bClientesActionPerformed(evt);
            }
        });

        bServicos.setIcon(new javax.swing.ImageIcon("/home/matheus/Downloads/mimiGlyphs/png/10.png")); // NOI18N
        bServicos.setText("<html><body>SERVIÇOS</body></html>");
        bServicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bServicosActionPerformed(evt);
            }
        });

        bAnimais.setIcon(new javax.swing.ImageIcon("/home/matheus/Downloads/mimiGlyphs/png/77.png")); // NOI18N
        bAnimais.setText("<html><body>ANIMAIS</body></html>");
        bAnimais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAnimaisActionPerformed(evt);
            }
        });

        bFuncionario.setIcon(new javax.swing.ImageIcon("/home/matheus/Downloads/mimiGlyphs/png/14.png")); // NOI18N
        bFuncionario.setText("<html><body>FUNCIONÁRIOS</body></html>");

        bLogout.setIcon(new javax.swing.ImageIcon("/home/matheus/Downloads/mimiGlyphs/png/52.png")); // NOI18N
        bLogout.setText("<html><body>LOGOUT</body></html>");
        bLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLogoutActionPerformed(evt);
            }
        });

        txtAdmin.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        txtAdmin.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        txtAdmin.setText("ADMIN");

        javax.swing.GroupLayout pMenuPrincipalLayout = new javax.swing.GroupLayout(pMenuPrincipal);
        pMenuPrincipal.setLayout(pMenuPrincipalLayout);
        pMenuPrincipalLayout.setHorizontalGroup(
                pMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pMenuPrincipalLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtAdmin)
                        .addGap(0, 0, Short.MAX_VALUE))
                .addGroup(pMenuPrincipalLayout.createSequentialGroup()
                        .addContainerGap(94, Short.MAX_VALUE)
                        .addGroup(pMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(bFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                        .addGroup(pMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(bServicos, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bAnimais, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(95, Short.MAX_VALUE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pMenuPrincipalLayout.createSequentialGroup()
                        .addContainerGap(552, Short.MAX_VALUE)
                        .addComponent(bLogout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pMenuPrincipalLayout.setVerticalGroup(
                pMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pMenuPrincipalLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtAdmin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(bAnimais, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(pMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(bServicos, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(bLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pMenuPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pMenuPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
        );
        pack();
    }// </editor-fold>                        

    private void bClientesActionPerformed(java.awt.event.ActionEvent evt) {
        pMenuPrincipal.setVisible(false);
//        pClientes.setVisible(true);
    }

    private void bServicosActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void bAnimaisActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void bLogoutActionPerformed(java.awt.event.ActionEvent evt) {
        pMenuPrincipal.setVisible(false);
//        pLogin.setVisible(true);
//        txtLogin.setText("");
//        txtSenha.setText("");
//        mAnimais.setEnabled(false);
//        mClientes.setEnabled(false);
//        mAtendimento.setEnabled(false);
//        mCadastro.setEnabled(false);
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton bAnimais;
    private javax.swing.JButton bClientes;
    private javax.swing.JButton bFuncionario;
    private javax.swing.JButton bLogout;
    private javax.swing.JButton bServicos;
    private javax.swing.JPanel pMenuPrincipal;
    private javax.swing.JLabel txtAdmin;
    // End of variables declaration                   

    public javax.swing.JPanel getpMenuPrincipal() {
        return pMenuPrincipal;
    }

}
