package Tela;

import Modelos.PesquisaLivro;
import Principal.ImagemFundo;
import Principal.TelaLogin_Principal;
import static Tela.TelaUsuario.dPane;
import javax.swing.JOptionPane;

public class TelaAnonimo extends javax.swing.JFrame {
    
    public TelaAnonimo() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }
    
    public void AbrirFiltrosPesquisa(){
        try{
            FiltroPesquisaLivros filtros = new FiltroPesquisaLivros(dPane, "anonimo", "");
            dPane.add(filtros);
            filtros.setVisible(true);

	}catch (Exception erro) {}
    }
    
    public void CarregarLivros(){
        try{
            ConsultarLivros livros = new ConsultarLivros(dPane, new PesquisaLivro(), "anonimo", "");
            dPane.add(livros);
            livros.setVisible(true);

	}catch (Exception erro) {}
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dPane = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        botaoCatalogo = new javax.swing.JButton();
        botaoAbrirFiltrosPesquisa = new javax.swing.JButton();
        botaoSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Programação Visual");
        setExtendedState(MAXIMIZED_BOTH);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        botaoCatalogo.setText("Catalogo");
        botaoCatalogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCatalogoActionPerformed(evt);
            }
        });

        botaoAbrirFiltrosPesquisa.setText("Pesquisar");
        botaoAbrirFiltrosPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAbrirFiltrosPesquisaActionPerformed(evt);
            }
        });

        botaoSair.setText("Sair");
        botaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoCatalogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(botaoAbrirFiltrosPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(botaoAbrirFiltrosPesquisa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botaoCatalogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botaoSair)
                .addContainerGap(179, Short.MAX_VALUE))
        );

        dPane.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout dPaneLayout = new javax.swing.GroupLayout(dPane);
        dPane.setLayout(dPaneLayout);
        dPaneLayout.setHorizontalGroup(
            dPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dPaneLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 216, Short.MAX_VALUE))
        );
        dPaneLayout.setVerticalGroup(
            dPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        dispose();
    }//GEN-LAST:event_formWindowClosing

    private void botaoCatalogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCatalogoActionPerformed
        CarregarLivros();
    }//GEN-LAST:event_botaoCatalogoActionPerformed

    private void botaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSairActionPerformed
        dispose();
        TelaLogin_Principal menu=new TelaLogin_Principal();
        menu.setVisible(true);
    }//GEN-LAST:event_botaoSairActionPerformed

    private void botaoAbrirFiltrosPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAbrirFiltrosPesquisaActionPerformed
        AbrirFiltrosPesquisa();
    }//GEN-LAST:event_botaoAbrirFiltrosPesquisaActionPerformed
    
    private ImagemFundo fundo=new ImagemFundo();
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAbrirFiltrosPesquisa;
    private javax.swing.JButton botaoCatalogo;
    private javax.swing.JButton botaoSair;
    protected static javax.swing.JDesktopPane dPane;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
