
package Tela;

import Modelos.Livro;
import Repositorio.LivroDAO;
import static Tela.TelaAdministrador.dPane;
import java.util.UUID;
import javax.swing.JOptionPane;

public class CadastroLivro extends javax.swing.JInternalFrame {

    LivroDAO livroRepositorio = new LivroDAO();
    
    public CadastroLivro(String operacao, String idLivro) {
        super("",false,true,false,false);
        this.setLocation(215,0);
        initComponents();
        
        this.operacao = operacao;
        this.idLivroAtual = idLivro;
        
        System.out.println(operacao);
        
        if (operacao == "alterar"){
            Livro livroBanco = livroRepositorio.ProcurarLivroPorId(idLivroAtual);

            if (livroBanco != null){          
                campoTitulo.setText(livroBanco.getTitulo());
                campoAutor.setText(livroBanco.getAutor());
                campoEditora.setText(livroBanco.getEditora());
                campoTipo.setToolTipText(livroBanco.getTipo());
                campoSerie.setText(livroBanco.getSerie());
                campoData.setText(livroBanco.getData_lancamento());
                campoEdicao.setText(livroBanco.getEdicao());
                campoDescricao.setText(livroBanco.getDescricao());
            }else{
                JOptionPane.showMessageDialog(null,"Ocorreu um erro, ao foi possivel carregar os dados","Erro de Conexão",JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public void NovoLivro(){
        String titulo = campoTitulo.getText();
        String autor = campoAutor.getText();
        String editora = campoEditora.getText();
        String tipo = (String) campoTipo.getSelectedItem();
        String serie = campoSerie.getText();
        String data = campoData.getText();
        String edicao = campoEdicao.getText();
        String descricao = campoDescricao.getText();
        
        if (titulo.equals("")) {
            JOptionPane.showMessageDialog(null,"Digite o titulo do livro!","",JOptionPane.ERROR_MESSAGE);
            campoTitulo.requestFocus();
	}else if (autor.equals("")) {
            JOptionPane.showMessageDialog(null,"Digite o nome do autor!","",JOptionPane.ERROR_MESSAGE);
            campoAutor.requestFocus();
	}else{
            Livro livroBanco = livroRepositorio.ProcurarLivroPorTituloEAutor(titulo, autor);
            if (livroBanco != null){
                JOptionPane.showMessageDialog(null,"O livro '" + titulo + "' para esse autor ja esta cadastrado","",JOptionPane.ERROR_MESSAGE);
                campoTitulo.requestFocus();
            }else{
                try{
                    Livro livro = new Livro(UUID.randomUUID().toString(), 0, titulo,
                                    autor, editora, descricao, data, edicao, serie,
                                    tipo, "Novo", "", "", "", "");
                    
                    livroRepositorio.CadastrarLivro(livro);
                    
                    JOptionPane.showMessageDialog(null,"Livro Cadastrado","",JOptionPane.OK_OPTION);
                    dispose();
                }catch (Exception e){
                    JOptionPane.showMessageDialog(null,"Não foi possivel cadastrar o livro, tente novamente","Erro de Conexão",JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }
    
    public void AlterarLivro(){
        String titulo = campoTitulo.getText();
        String autor = campoAutor.getText();
        String editora = campoEditora.getText();
        String tipo = (String) campoTipo.getSelectedItem();
        String serie = campoSerie.getText();
        String data = campoData.getText();
        String edicao = campoEdicao.getText();
        String descricao = campoDescricao.getText();
        
        if (titulo.equals("")) {
            JOptionPane.showMessageDialog(null,"Digite o titulo do livro!","",JOptionPane.ERROR_MESSAGE);
            campoTitulo.requestFocus();
        }else if (autor.equals("")) {
            JOptionPane.showMessageDialog(null,"Digite o nome do autor!","",JOptionPane.ERROR_MESSAGE);
            campoAutor.requestFocus();
        }else{
                
            System.out.println(titulo);

            Livro livroNome = livroRepositorio.ProcurarLivroPorTituloEAutor(titulo, autor);
            if (livroNome == null){
                Livro livroBanco = livroRepositorio.ProcurarLivroPorId(idLivroAtual);
                Livro livroAlterar = new Livro(idLivroAtual, livroBanco.getQtdAlugado(),
                                               titulo, autor, editora, descricao, data,
                                                edicao, serie, tipo, livroBanco.getStatus(),
                                                livroBanco.getDataatualizacao(),
                                                livroBanco.getDatainsercao(),
                                                livroBanco.getObservacoes(), livroBanco.getCaminhoImg());

                livroRepositorio.AlterarLivro(livroAlterar);

                JOptionPane.showMessageDialog(null,"Livro Alterado","",JOptionPane.OK_OPTION);
                dispose();
            }else{
                JOptionPane.showMessageDialog(null,"O livro '" + titulo + "' para esse autor ja esta cadastrado","",JOptionPane.ERROR_MESSAGE);
                campoTitulo.requestFocus();
            }
        }
    }
    
    public void CarregarImagem(){
    
        try{
            AbrirArquivos arquivos = new AbrirArquivos();
            dPane.add(arquivos);
            arquivos.setVisible(true);
	}catch (Exception erro) {}
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jFileChooser2 = new javax.swing.JFileChooser();
        edicaoLivro = new javax.swing.JButton();
        cancelarEdicaoLivro = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        campoDescricao = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        campoTitulo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        campoAutor = new javax.swing.JTextField();
        campoEditora = new javax.swing.JTextField();
        campoSerie = new javax.swing.JTextField();
        campoData = new javax.swing.JTextField();
        campoEdicao = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        botaoAbrirArquivos = new javax.swing.JButton();
        campoTipo = new javax.swing.JComboBox<>();

        edicaoLivro.setText("Ok");
        edicaoLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edicaoLivroActionPerformed(evt);
            }
        });

        cancelarEdicaoLivro.setText("Cancelar");
        cancelarEdicaoLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarEdicaoLivroActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(182, 182, 182));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(campoDescricao);

        jLabel1.setText("Descrição");

        jLabel2.setText("Título");

        jLabel3.setText("Autor");

        campoEditora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoEditoraActionPerformed(evt);
            }
        });

        campoEdicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoEdicaoActionPerformed(evt);
            }
        });

        jLabel4.setText("Editora");

        jLabel5.setText("Tipo");

        jLabel6.setText("Serie");

        jLabel7.setText("Data");

        jLabel8.setText("Edição");

        botaoAbrirArquivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAbrirArquivosActionPerformed(evt);
            }
        });

        campoTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Acao", "Aventura", "Comedia", "Romance", "Estudos" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(botaoAbrirArquivos, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(campoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoAutor)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cancelarEdicaoLivro)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(edicaoLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(campoEditora)
                                    .addComponent(campoSerie)
                                    .addComponent(campoData)
                                    .addComponent(campoEdicao)
                                    .addComponent(campoTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(campoAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoEditora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(campoTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edicaoLivro)
                            .addComponent(cancelarEdicaoLivro)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botaoAbrirArquivos, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void edicaoLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edicaoLivroActionPerformed
        if (operacao == "alterar"){

            AlterarLivro();
        }else{
            titulo="";
            autor="";
            editora="";
            tipo="";
            serie="";
            data="";
            edicao="";
            descricao="";
            NovoLivro();
        }
    }//GEN-LAST:event_edicaoLivroActionPerformed

    private void cancelarEdicaoLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarEdicaoLivroActionPerformed
        dispose();
    }//GEN-LAST:event_cancelarEdicaoLivroActionPerformed

    private void campoEditoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoEditoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoEditoraActionPerformed

    private void campoEdicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoEdicaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoEdicaoActionPerformed

    private void botaoAbrirArquivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAbrirArquivosActionPerformed
        CarregarImagem();
    }//GEN-LAST:event_botaoAbrirArquivosActionPerformed

    
    public static String operacao="";  //alterar ou cadastrar
    protected static String titulo="";
    protected static String autor="";
    protected static String editora="";
    protected static String tipo="";
    protected static String serie="";
    protected static String data="";
    protected static String edicao="";
    protected static String descricao="";
    protected static String idLivroAtual="";
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAbrirArquivos;
    private javax.swing.JTextField campoAutor;
    private javax.swing.JTextField campoData;
    private javax.swing.JTextPane campoDescricao;
    private javax.swing.JTextField campoEdicao;
    private javax.swing.JTextField campoEditora;
    private javax.swing.JTextField campoSerie;
    private javax.swing.JComboBox<String> campoTipo;
    private javax.swing.JTextField campoTitulo;
    private javax.swing.JButton cancelarEdicaoLivro;
    private javax.swing.JButton edicaoLivro;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JFileChooser jFileChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
