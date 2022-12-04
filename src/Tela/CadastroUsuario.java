
package Tela;

import Modelos.Usuario;
import Repositorio.UsuarioDAO;
import java.util.UUID;
import javax.swing.JOptionPane;


public class CadastroUsuario extends javax.swing.JInternalFrame {

    UsuarioDAO usuarioRepositorio = new UsuarioDAO();
    
    public CadastroUsuario() {
        super("Usuario",false,true,false,false);
        this.setLocation(210,0);
        initComponents();
        
        if (operacao.equals("alterar"))
	{
            campoTipoUsuario.setName(tipo);
            campoNomeUsuario.setText(nome);
            campoSenhaUsuario.setText(senha);

            this.setTitle("Alterar Usuario");
        } 
    }
    
    public void NovoUsuario(){
        String tipoUsuario = (String) campoTipoUsuario.getSelectedItem();
        String nomeUsuario = campoNomeUsuario.getText();
        String senhaUsuario = campoSenhaUsuario.getText();
        if (nomeUsuario.equals(""))
	{
            JOptionPane.showMessageDialog(null,"Digite o nome do usuario!","",JOptionPane.ERROR_MESSAGE);
            campoNomeUsuario.requestFocus();
	}else if (senhaUsuario.equals(""))
        {
            JOptionPane.showMessageDialog(null,"Digite a senha do usuario!","",JOptionPane.ERROR_MESSAGE);
            campoSenhaUsuario.requestFocus();
	}else{
            Usuario usuario = usuarioRepositorio.ProcurarUsuarioPorNome(nomeUsuario);
            if (usuario != null){
                JOptionPane.showMessageDialog(null,"O usuario ja existe","",JOptionPane.ERROR_MESSAGE);
                campoNomeUsuario.requestFocus();
            }else{
                try{
                    usuario = new Usuario(UUID.randomUUID().toString(), tipoUsuario, nomeUsuario, senhaUsuario);
                    
                    usuarioRepositorio.CadastrarUsuario(usuario);
                    
                    JOptionPane.showMessageDialog(null,"Usuario Cadastrado","",JOptionPane.OK_OPTION);
                    dispose();
                }catch (Exception e){
                    JOptionPane.showMessageDialog(null,"Não foi possivel cadastrar o usuario, tente novamente","Erro de Conexão",JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }
    
    public void AlterarUsuario(String idUsuario){
        String tipoUsuario = (String) campoTipoUsuario.getSelectedItem();
        String nomeUsuario = campoNomeUsuario.getText();
        String senhaUsuario = campoSenhaUsuario.getText();
        if (nomeUsuario.equals(""))
	{
            JOptionPane.showMessageDialog(null,"Digite o nome do usuario!","",JOptionPane.ERROR_MESSAGE);
            campoNomeUsuario.requestFocus();
	}else if (senhaUsuario.equals(""))
        {
            JOptionPane.showMessageDialog(null,"Digite a senha do usuario!","",JOptionPane.ERROR_MESSAGE);
            campoSenhaUsuario.requestFocus();
	}else{
            Usuario usuarioNome = usuarioRepositorio.ProcurarUsuarioPorNome(nomeUsuario);
            Usuario usuarioId = usuarioRepositorio.ProcurarUsuarioPorId(idUsuario); 
            
            if (usuarioId != null && usuarioNome == null){
                try{
                    Usuario usuarioInserir = new Usuario(idUsuario, tipoUsuario,
                                                        nomeUsuario, senhaUsuario);
                    
                    usuarioRepositorio.AlterarUsuario(usuarioInserir);
                    
                    JOptionPane.showMessageDialog(null,"Usuario Alterado","",JOptionPane.OK_OPTION);
                    dispose();
                }catch (Exception e){
                    JOptionPane.showMessageDialog(null,"Não foi possivel alterar o usuario, tente novamente","Erro de Conexão",JOptionPane.ERROR_MESSAGE);
                }
            }else{
                JOptionPane.showMessageDialog(null,"O usuario ja existe","",JOptionPane.ERROR_MESSAGE);
                campoNomeUsuario.requestFocus();
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        campoTipoUsuario = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        campoNomeUsuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        campoSenhaUsuario = new javax.swing.JTextField();
        edicaoUsuario = new javax.swing.JButton();
        cancelarEdicaoUsuario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        campoTipoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Usuario", "Administrador" }));

        jLabel1.setText("Tipo Usuario");

        jLabel2.setText("Nome");

        jLabel3.setText("Senha");

        campoSenhaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoSenhaUsuarioActionPerformed(evt);
            }
        });

        edicaoUsuario.setText("Ok");
        edicaoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edicaoUsuarioActionPerformed(evt);
            }
        });

        cancelarEdicaoUsuario.setText("Cancelar");
        cancelarEdicaoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarEdicaoUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3)
                        .addComponent(jLabel2)
                        .addComponent(jLabel1)
                        .addComponent(campoTipoUsuario, 0, 160, Short.MAX_VALUE)
                        .addComponent(campoNomeUsuario)
                        .addComponent(campoSenhaUsuario))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cancelarEdicaoUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edicaoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(4, 4, 4)
                .addComponent(campoTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLabel2)
                .addGap(3, 3, 3)
                .addComponent(campoNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLabel3)
                .addGap(3, 3, 3)
                .addComponent(campoSenhaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edicaoUsuario)
                    .addComponent(cancelarEdicaoUsuario))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoSenhaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoSenhaUsuarioActionPerformed
        dispose();
    }//GEN-LAST:event_campoSenhaUsuarioActionPerformed

    private void edicaoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edicaoUsuarioActionPerformed
        if (operacao == "alterar"){
            AlterarUsuario(idUsuario);
        }else{
            idUsuario="";
            nome="";
            senha="";
            NovoUsuario();
        }
    }//GEN-LAST:event_edicaoUsuarioActionPerformed

    private void cancelarEdicaoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarEdicaoUsuarioActionPerformed
        dispose();
    }//GEN-LAST:event_cancelarEdicaoUsuarioActionPerformed

    public static String operacao="";  //alterar ou cadastrar
    protected static String idUsuario="";
    protected static String nome="";
    protected static String tipo="";
    protected static String senha="";

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campoNomeUsuario;
    private javax.swing.JTextField campoSenhaUsuario;
    private javax.swing.JComboBox<String> campoTipoUsuario;
    private javax.swing.JButton cancelarEdicaoUsuario;
    private javax.swing.JButton edicaoUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
