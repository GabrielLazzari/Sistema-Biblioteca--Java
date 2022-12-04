
package Tela;

import Modelos.PesquisaLivro;


public class FiltroPesquisaLivros extends javax.swing.JInternalFrame {
    
    protected static javax.swing.JDesktopPane dPane;
    String janelaAtual = "";
    String idUsuario = "";
    
    public FiltroPesquisaLivros(javax.swing.JDesktopPane dPane, String janela, String idUsuario) {
        super("",false,true,false,false);
        this.setLocation(215,0);
        initComponents();
        this.dPane = dPane;
        this.janelaAtual = janela;
        this.idUsuario = idUsuario;
    }

    public void PesquisarLivros(){
        
        PesquisaLivro pesquisaLivro = new PesquisaLivro();
        
        pesquisaLivro.setTodos(radioTodos.isSelected());
        pesquisaLivro.setAcao(radioAcao.isSelected());
        pesquisaLivro.setAventura(radioAventura.isSelected());
        pesquisaLivro.setComedia(radioComedia.isSelected());
        pesquisaLivro.setRomance(radioRomance.isSelected());
        pesquisaLivro.setEstudos(radioEstudos.isSelected());
        
        pesquisaLivro.setEmAlta(radioEmAlta.isSelected());
        pesquisaLivro.setNovos(radioNovos.isSelected());
        
        pesquisaLivro.setTitulo(campoTitulo.getText());
        pesquisaLivro.setAutor(campoAutor.getText());
        pesquisaLivro.setEditora(campoEditora.getText());
        pesquisaLivro.setData_lancamento(campoData.getText());
        pesquisaLivro.setEdicao(campoEdicao.getText());
        
        FecharFiltrosPesquisaLivro();
        
        ConsultarLivros livros = new ConsultarLivros(dPane, pesquisaLivro, janelaAtual, idUsuario);
        dPane.add(livros);
        livros.setVisible(true);
       
    }
    
    public void FecharFiltrosPesquisaLivro(){
        dispose();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cancelarPesquisaLivro = new javax.swing.JButton();
        botaoAplicarFiltroPesquis = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        radioTodos = new javax.swing.JRadioButton();
        radioAventura = new javax.swing.JRadioButton();
        radioComedia = new javax.swing.JRadioButton();
        radioRomance = new javax.swing.JRadioButton();
        radioEstudos = new javax.swing.JRadioButton();
        radioEmAlta = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        campoTitulo = new javax.swing.JTextField();
        campoAutor = new javax.swing.JTextField();
        campoEditora = new javax.swing.JTextField();
        campoData = new javax.swing.JTextField();
        campoEdicao = new javax.swing.JTextField();
        radioAcao = new javax.swing.JRadioButton();
        radioNovos = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        cancelarPesquisaLivro.setText("Cancelar");
        cancelarPesquisaLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarPesquisaLivroActionPerformed(evt);
            }
        });

        botaoAplicarFiltroPesquis.setText("Ok");
        botaoAplicarFiltroPesquis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAplicarFiltroPesquisActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(172, 172, 172));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 13, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        radioTodos.setText("Todos");
        radioTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioTodosActionPerformed(evt);
            }
        });

        radioAventura.setText("Aventura");

        radioComedia.setText("Comédia");

        radioRomance.setText("Romance");

        radioEstudos.setText("Estudos");

        radioEmAlta.setText("Em Alta");

        campoTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTituloActionPerformed(evt);
            }
        });

        radioAcao.setText("Ação");

        radioNovos.setText("Novos");

        jLabel1.setText("Título");

        jLabel2.setText("Autor");

        jLabel3.setText("Editora");

        jLabel4.setText("Data");

        jLabel5.setText("Edição");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(radioAventura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(radioComedia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(radioRomance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(radioEstudos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(radioTodos, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addComponent(radioAcao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campoEditora, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                            .addComponent(campoAutor, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(campoTitulo, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(cancelarPesquisaLivro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botaoAplicarFiltroPesquis))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(radioEmAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(radioNovos, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoData, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(campoEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioEmAlta)
                    .addComponent(radioNovos))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoEditora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoAplicarFiltroPesquis)
                    .addComponent(cancelarPesquisaLivro))
                .addGap(17, 17, 17))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(radioTodos)
                .addGap(4, 4, 4)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(radioAcao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioAventura)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioComedia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioRomance)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioEstudos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radioTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioTodosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioTodosActionPerformed

    private void campoTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTituloActionPerformed

    private void botaoAplicarFiltroPesquisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAplicarFiltroPesquisActionPerformed
        PesquisarLivros();
    }//GEN-LAST:event_botaoAplicarFiltroPesquisActionPerformed

    private void cancelarPesquisaLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarPesquisaLivroActionPerformed
        FecharFiltrosPesquisaLivro();
    }//GEN-LAST:event_cancelarPesquisaLivroActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAplicarFiltroPesquis;
    private javax.swing.JTextField campoAutor;
    private javax.swing.JTextField campoData;
    private javax.swing.JTextField campoEdicao;
    private javax.swing.JTextField campoEditora;
    private javax.swing.JTextField campoTitulo;
    private javax.swing.JButton cancelarPesquisaLivro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JRadioButton radioAcao;
    private javax.swing.JRadioButton radioAventura;
    private javax.swing.JRadioButton radioComedia;
    private javax.swing.JRadioButton radioEmAlta;
    private javax.swing.JRadioButton radioEstudos;
    private javax.swing.JRadioButton radioNovos;
    private javax.swing.JRadioButton radioRomance;
    private javax.swing.JRadioButton radioTodos;
    // End of variables declaration//GEN-END:variables
}
