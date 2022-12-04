package Tela;

import Modelos.Livro;
import Modelos.LivroUsuario;
import Modelos.PesquisaLivro;
import Repositorio.LivroDAO;
import Repositorio.LivroUsuarioDAO;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.util.HashMap;
import java.util.Map;

public class ConsultarLivros extends javax.swing.JInternalFrame implements ActionListener{
	
    protected static javax.swing.JDesktopPane dPane;
    
    private JButton b;
    private JPanel painel;

    LivroDAO livroDAO = new LivroDAO();
    LivroUsuarioDAO livroUsuarioDAO = new LivroUsuarioDAO();

    public ConsultarLivros(javax.swing.JDesktopPane dPane, PesquisaLivro pesquisaLivro, String janela, String idUsuario)
    {
        super("",false,true,false,false);
        this.setTitle("Exemplo");
        this.setSize(700,400);
        this.setLocation(180,0);
        this.setResizable(true);

        this.dPane = dPane;


        String consulta = CriarConsultaLivro(pesquisaLivro);
        ArrayList<Livro> livrosEncontrados = livroDAO.ConsultarLivros(consulta);

        painel=new JPanel();

        List<JButton> buttonList = new ArrayList<>();
        Map<String, String> idsLivros = new HashMap<>();

        if (!livrosEncontrados.isEmpty())
        {
            for (Livro l:livrosEncontrados){
                b = new JButton(l.getTitulo());
                b.setToolTipText(l.getAutor());
                idsLivros.put(l.getTitulo(), l.getId());
                buttonList.add(b);
                painel.add(b);
            }
        }else
            JOptionPane.showMessageDialog(null,"Nenhum livro encontrado","Nenhum registro",JOptionPane.INFORMATION_MESSAGE);

        for (JButton b:buttonList){
            b.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    String idLivro = idsLivros.get(b.getText());
                    Livro livro = livroDAO.ProcurarLivroPorId(idLivro);
                    livro.setIdUsuario(idUsuario);

                    LivroUsuario livroUsuario = livroUsuarioDAO.ProcurarLivroUsuario(idUsuario, idLivro);
                    boolean devolvido = true;
                    boolean jali = false;
                    if (livroUsuario != null){
                        devolvido = livroUsuario.isDevolvido();
                        jali = livroUsuario.isJali();
                    }

                    if (janela == "administrador"){
                        JanelaLivroAdministrador janelaLivroAdministrador = new JanelaLivroAdministrador(livro);
                        dPane.add(janelaLivroAdministrador);
                        janelaLivroAdministrador.setVisible(true);
                    }else if (janela == "usuario"){
                        JanelaLivroUsuario janelaLivroUsuario = new JanelaLivroUsuario(livro, devolvido, jali);
                        dPane.add(janelaLivroUsuario);
                        janelaLivroUsuario.setVisible(true);
                    }else{
                        JanelaLivroAnonimo janelaLivroAnonimo = new JanelaLivroAnonimo(livro);
                        dPane.add(janelaLivroAnonimo);
                        janelaLivroAnonimo.setVisible(true);
                    }
                }
            });
        }

        add(painel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String CriarConsultaLivro(PesquisaLivro pesquisaLivro){
        String consulta = "";
        
        if (pesquisaLivro.getIdUsuario()!= null){
            if (!pesquisaLivro.getIdUsuario().equals("")){
                if (pesquisaLivro.isJali())
                    consulta = " select * from livros inner join livros_usuario where livros.id = livros_usuario.idLivro and livros_usuario.jali = true and livros_usuario.idUsuario = '" + pesquisaLivro.getIdUsuario() + "'; ";
                else
                    consulta = " select * from livros inner join livros_usuario where livros.id = livros_usuario.idLivro and livros_usuario.devolvido = false and livros_usuario.idUsuario = '" + pesquisaLivro.getIdUsuario() + "'; ";
            }
            
        }else{
        
            consulta = " SELECT * FROM livros WHERE 1=1 ";

            if (pesquisaLivro.getTitulo() != null){
                if (!pesquisaLivro.getTitulo().equals(""))
                    consulta = consulta + " and titulo like'%" + pesquisaLivro.getTitulo() + "%'" ;
            }

            if (pesquisaLivro.getAutor() != null){
                if (!pesquisaLivro.getAutor().equals(""))
                    consulta = consulta + " and autor like'%" + pesquisaLivro.getAutor() + "%'" ;
            }

            if (pesquisaLivro.getEditora() != null){
                if (!pesquisaLivro.getEditora().equals(""))
                    consulta = consulta + " and editora like'%" + pesquisaLivro.getEditora()+ "%'" ;
            }

            if (pesquisaLivro.getDescricao() != null){
                if (!pesquisaLivro.getDescricao().equals(""))
                    consulta = consulta + " and descricao like'%" + pesquisaLivro.getDescricao()+ "%'" ;
            }

            if (pesquisaLivro.getData_lancamento()!= null){
                if (!pesquisaLivro.getData_lancamento().equals(""))
                    consulta = consulta + " and descricao like'%" + pesquisaLivro.getData_lancamento()+ "%'" ;
            }

            if (pesquisaLivro.getEdicao()!= null){
                if (!pesquisaLivro.getEdicao().equals(""))
                    consulta = consulta + " and descricao like'%" + pesquisaLivro.getEdicao()+ "%'" ;
            }

            if (pesquisaLivro.getSerie() != null){
                if (!pesquisaLivro.getSerie().equals(""))
                    consulta = consulta + " and descricao like'%" + pesquisaLivro.getSerie()+ "%'" ;
            }

            if (!pesquisaLivro.isTodos()){
                String sub = " and ";
                if (pesquisaLivro.isAcao()){
                    sub = sub + " tipo = 'Acao' or";
                }

                if (pesquisaLivro.isAventura()){
                    sub = sub + " tipo = 'Aventura' or";
                }

                if (pesquisaLivro.isComedia()){
                    sub = sub + " tipo = 'Comedia' or";
                }

                if (pesquisaLivro.isRomance()){
                    sub = sub + " tipo = 'Romance' or";
                }

                if (pesquisaLivro.isEstudos()){
                    sub = sub + " tipo = 'Estudos' or";
                }

                if (sub != " and "){
                    sub = sub.substring(0, sub.length()-2);
                    consulta = consulta + sub;
                }
            }

            if (pesquisaLivro.isNovos()){
                consulta = consulta + " and status = 'Novo' ";
            } else if (pesquisaLivro.isEmAlta())
                consulta = consulta + " and status = 'EmAlta' ";


            if (consulta.equals(" SELECT * FROM livros WHERE 1=1 ")){
                consulta = " SELECT * FROM livros;";
            }else{
                consulta = consulta + ";";
            }
        }
        return consulta;
    }

}
