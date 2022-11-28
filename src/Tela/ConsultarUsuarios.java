
package Tela;

import Modelos.Usuario;
import Repositorio.UsuarioDAO;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ConsultarUsuarios extends javax.swing.JInternalFrame {


    public ConsultarUsuarios() {
        this.setLocation(215,0);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        barraRolagem = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        lblConsultarPor = new javax.swing.JLabel();
        campoTipoUsuario = new javax.swing.JComboBox<>();
        txtNome = new javax.swing.JTextField();
        btnConsultar = new javax.swing.JButton();
        btnFechar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        lblConsultarPor1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Tipo", "Senha", "Id"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela.getTableHeader().setReorderingAllowed(false);
        barraRolagem.setViewportView(tabela);

        lblConsultarPor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblConsultarPor.setText("Nome:");

        campoTipoUsuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        campoTipoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Usuario", "Administrador" }));

        txtNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btnConsultar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnFechar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnFechar.setText("Fechar");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        btnLimpar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnAlterar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        lblConsultarPor1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblConsultarPor1.setText("Tipo:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(lblConsultarPor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblConsultarPor1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(btnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(barraRolagem, javax.swing.GroupLayout.PREFERRED_SIZE, 748, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblConsultarPor)
                    .addComponent(campoTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblConsultarPor1))
                .addGap(18, 18, 18)
                .addComponent(barraRolagem, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        consultar();
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        dispose();
    }//GEN-LAST:event_btnFecharActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        alterar();
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        excluir();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void consultar()
    {
        String nomeUsuario = txtNome.getText();
        String tipoUsuario = (String) campoTipoUsuario.getSelectedItem();

        DefaultTableModel modelo=(DefaultTableModel)tabela.getModel();
        if (modelo.getRowCount()!=0)
        {
            for (int i=modelo.getRowCount()-1;i>=0;i--)
                modelo.removeRow(i);
        }

        UsuarioDAO usuarioDAO = new UsuarioDAO();
        List<Usuario> usuarios = null;

        usuarios = usuarioDAO.ConsultarUsuarios(nomeUsuario, tipoUsuario);

        if (!usuarios.isEmpty())
        {
            for (Usuario c:usuarios)
                modelo.addRow(new Object[] {c.getNome(),c.getTipo(),c.getSenha(), c.getId()});
        }else
            JOptionPane.showMessageDialog(null,"Nenhum registro encontrado","Nenhum registro",JOptionPane.INFORMATION_MESSAGE);
    }
    
    private void alterar()
    {
        if (tabela.getSelectedRow()>=0)
	{
            CadastroUsuario.operacao="alterar";
            DefaultTableModel modelo=(DefaultTableModel)tabela.getModel();
            CadastroUsuario.nome=modelo.getValueAt(tabela.getSelectedRow(),0).toString();
            CadastroUsuario.tipo=modelo.getValueAt(tabela.getSelectedRow(),1).toString();
            CadastroUsuario.senha=modelo.getValueAt(tabela.getSelectedRow(),2).toString();
            CadastroUsuario.idUsuario=modelo.getValueAt(tabela.getSelectedRow(),3).toString();
            dispose();
            CadastroUsuario alterar= new CadastroUsuario();
            TelaAdministrador.dPane.add(alterar);
            alterar.setVisible(true);
	}else
	{
            JOptionPane.showMessageDialog(null,"Selecione um registro da tabela antes de clicar no botão alterar","Erro",JOptionPane.ERROR_MESSAGE);
	}
    }
    
    private void excluir()
    {
        if (tabela.getSelectedRow()>=0)
	{
            Object[] opcoes={"Sim","Não"};
	    int retorno=JOptionPane.showOptionDialog(null,"Tem certeza que deseja excluir?","Excluir",
	         	JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,opcoes,opcoes[0]);
	    if (retorno == 0)
	    {
                DefaultTableModel modelo=(DefaultTableModel)tabela.getModel();
	        UsuarioDAO clienteDAO = new UsuarioDAO();
		boolean clienteDeletado = clienteDAO.DeletarUsuario(modelo.getValueAt(tabela.getSelectedRow(),3).toString());
		if (clienteDeletado == true)
		{
                    modelo.removeRow(tabela.getSelectedRow());
                    JOptionPane.showMessageDialog(null,"Usuario excluído com sucesso!","Excluído",JOptionPane.INFORMATION_MESSAGE);
		}else
                    JOptionPane.showMessageDialog(null,"Erro ao tentar excluir um usuario!","Erro",JOptionPane.ERROR_MESSAGE);
	    }
	}else
            JOptionPane.showMessageDialog(null,"Selecione um registro da tabela antes de clicar no botão excluir","Erro",JOptionPane.ERROR_MESSAGE);
    }
    
    private void limpar()
    {
	DefaultTableModel modelo=(DefaultTableModel)tabela.getModel();
        if (modelo.getRowCount()!=0)
        {
            for (int i=modelo.getRowCount()-1;i>=0;i--)
                modelo.removeRow(i);
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane barraRolagem;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JComboBox<String> campoTipoUsuario;
    private javax.swing.JLabel lblConsultarPor;
    private javax.swing.JLabel lblConsultarPor1;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
