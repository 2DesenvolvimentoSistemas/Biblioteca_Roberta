/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.gui;

import controler.LivroDao;
import javax.swing.JOptionPane;
import model.design.Livro;
import model.design.Setor;
import view.modelo.ModeloTabelaLivro;

/**
 *
 * @author Professor
 */
public class CadastroLivro extends javax.swing.JFrame {
    
    //modelo de tabela
    ModeloTabelaLivro modelo = new ModeloTabelaLivro();
    
    //criacao do objeto Dao
    LivroDao pDao = new LivroDao();

    /**
     * Creates new form CadastroLivro
     */
    public CadastroLivro() {
        initComponents();        
        this.tblCadastroLivro.setModel(modelo);
        this.lerTabela();
        cmbSetor.addItem(Setor.INFANTIL);
        cmbSetor.addItem(Setor.FICÇÃO);
        cmbSetor.addItem(Setor.FÁBULA);
        cmbSetor.addItem(Setor.CONTO);
        cmbSetor.addItem(Setor.APÓLOGO);
        cmbSetor.addItem(Setor.CRÔNICA);
        cmbSetor.addItem(Setor.LENDA);
        cmbSetor.addItem(Setor.MITO);   
        cmbSetor.addItem(Setor.FANTASIA); 
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        pnlCadastroLivro = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblAcabamento = new javax.swing.JLabel();
        txtAcabamento = new javax.swing.JTextField();
        lblCodigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        lblPreco = new javax.swing.JLabel();
        txtPreco = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        btnexcluir = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCadastroLivro = new javax.swing.JTable();
        lblSetor = new javax.swing.JLabel();
        cmbSetor = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Seja bem vindo ao Sistema - Cadastro de Livros Infantis  ");

        pnlCadastroLivro.setBackground(new java.awt.Color(204, 204, 255));
        pnlCadastroLivro.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        pnlCadastroLivro.setToolTipText("");

        lblNome.setText("Nome do livro: ");

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        lblAcabamento.setText("Acabamento: ");

        txtAcabamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAcabamentoActionPerformed(evt);
            }
        });

        lblCodigo.setText("Código do livro: ");

        txtCodigo.setEditable(false);
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });

        lblPreco.setText("Preço: ");

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        btnexcluir.setText("Excluir");
        btnexcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexcluirActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        tblCadastroLivro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblCadastroLivro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCadastroLivroMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCadastroLivro);

        lblSetor.setText("Gêneros:");

        cmbSetor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSetorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCadastroLivroLayout = new javax.swing.GroupLayout(pnlCadastroLivro);
        pnlCadastroLivro.setLayout(pnlCadastroLivroLayout);
        pnlCadastroLivroLayout.setHorizontalGroup(
            pnlCadastroLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCadastroLivroLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(pnlCadastroLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCadastroLivroLayout.createSequentialGroup()
                        .addGroup(pnlCadastroLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlCadastroLivroLayout.createSequentialGroup()
                                .addComponent(btnCadastrar)
                                .addGap(18, 18, 18)
                                .addComponent(btnAtualizar)
                                .addGap(18, 18, 18)
                                .addComponent(btnexcluir)
                                .addGap(18, 18, 18)
                                .addComponent(btnLimpar))
                            .addGroup(pnlCadastroLivroLayout.createSequentialGroup()
                                .addGroup(pnlCadastroLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlCadastroLivroLayout.createSequentialGroup()
                                        .addComponent(lblSetor)
                                        .addGap(18, 18, 18)
                                        .addComponent(cmbSetor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnlCadastroLivroLayout.createSequentialGroup()
                                        .addComponent(lblAcabamento)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtAcabamento, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnlCadastroLivroLayout.createSequentialGroup()
                                        .addComponent(lblCodigo)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(48, 48, 48)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(99, Short.MAX_VALUE))
                    .addGroup(pnlCadastroLivroLayout.createSequentialGroup()
                        .addGroup(pnlCadastroLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlCadastroLivroLayout.createSequentialGroup()
                                .addComponent(lblNome)
                                .addGap(18, 18, 18)
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlCadastroLivroLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(lblPreco)
                                .addGap(18, 18, 18)
                                .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        pnlCadastroLivroLayout.setVerticalGroup(
            pnlCadastroLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCadastroLivroLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pnlCadastroLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSetor)
                    .addComponent(cmbSetor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnlCadastroLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCadastroLivroLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(pnlCadastroLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblNome)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(pnlCadastroLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblAcabamento)
                            .addComponent(txtAcabamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addGroup(pnlCadastroLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCodigo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlCadastroLivroLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addGroup(pnlCadastroLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPreco)
                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(pnlCadastroLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar)
                    .addComponent(btnAtualizar)
                    .addComponent(btnexcluir)
                    .addComponent(btnLimpar))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlCadastroLivro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlCadastroLivro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void lerTabela (){
        //limpar tabela ...não tinha!
        modelo.clearTable();
        
        //add livros na tabela        
        for (Livro l: pDao.read())
            this.modelo.addRow(l);
        
        
    }
    
    
    
    private void txtAcabamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAcabamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAcabamentoActionPerformed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        // TODO add your handling code here:
        
        //linha a ser atualizada
        int linha = tblCadastroLivro.getSelectedRow();
        
        if (linha != -1){
            
            try{
                pDao.update(new Livro(
                                      txtNome.getText(),
                                      txtAcabamento.getText(),
                                      Integer.parseInt(txtCodigo.getText()),
                                      (Setor)cmbSetor.getSelectedItem(),
                                      Double.parseDouble(txtPreco.getText())
                )
                    );
                this.lerTabela();
            }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Erro!" + e.getMessage());
            }
        }
        
        //limpando o form
        this.btnLimparActionPerformed(evt);
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexcluirActionPerformed
        // TODO add your handling code here:
        
        //linha selecionada para exclusão
        int linha = tblCadastroLivro.getSelectedRow();
        
        if (linha != -1){
            
            try{
            pDao.delete(
                    new Livro(
                            txtNome.getText(),
                            txtAcabamento.getText(),
                            Integer.parseInt(txtCodigo.getText()),
                            (Setor) cmbSetor.getSelectedItem(), //também tive que atualizar aqui...
                            Double.parseDouble(txtPreco.getText())
            
            )
            
            );
            
            //atualializando a tabela
            this.lerTabela();
            
        }catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
                }
        }
        
        //limpando o form
        this.btnLimparActionPerformed(evt);
    }//GEN-LAST:event_btnexcluirActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        // TODO add your handling code here:
        
        try{            
        
        //gravando na tabela do BD 
        pDao.create(
                new Livro(
                    txtNome.getText(), 
                    txtAcabamento.getText(),
                    (Setor)cmbSetor.getSelectedItem(), //pequena correção para que o setor seja inserido
                    Double.parseDouble(txtPreco.getText())
                )
                
        );
        
                //atualizando a tabela da interface
                this.lerTabela();
        
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog( 
                    null, 
                    "Erro" + e.getMessage(),
                    "Ops!",
                    JOptionPane.ERROR_MESSAGE
            );
            
        }
        
        //limpando a tela
        this.btnLimparActionPerformed(evt);
        
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        // TODO add your handling code here:
        
        txtNome.setText(null);
        txtAcabamento.setText(null);
        txtCodigo.setText(null);
        txtPreco.setText(null);
    }//GEN-LAST:event_btnLimparActionPerformed

    private void tblCadastroLivroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCadastroLivroMouseClicked
        // TODO add your handling code here:
        
        //obtendo o numero da linha da tabela que o usuario clicou
        int linha = tblCadastroLivro.getSelectedRow();
        
        if (linha != -1){
            txtNome.setText(modelo.getValueAt(linha, 0).toString());
            cmbSetor.setSelectedItem(modelo.getValueAt(linha, 1));
            txtAcabamento.setText(modelo.getValueAt(linha, 2).toString());
            txtCodigo.setText(modelo.getValueAt(linha, 3).toString());
            txtPreco.setText(modelo.getValueAt(linha, 4).toString());
        }
    }//GEN-LAST:event_tblCadastroLivroMouseClicked

    private void cmbSetorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSetorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbSetorActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroLivro().setVisible(true);
            }
            
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnexcluir;
    private javax.swing.JComboBox<Setor> cmbSetor;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAcabamento;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPreco;
    private javax.swing.JLabel lblSetor;
    private javax.swing.JPanel pnlCadastroLivro;
    private javax.swing.JTable tblCadastroLivro;
    private javax.swing.JTextField txtAcabamento;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPreco;
    // End of variables declaration//GEN-END:variables
}
