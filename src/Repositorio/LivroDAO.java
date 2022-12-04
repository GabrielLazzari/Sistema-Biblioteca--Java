
package Repositorio;

import Modelos.Livro;
import Modelos.PesquisaLivro;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class LivroDAO {
    private Connection getConnection() {
        Connection connection = null;
        try {
                String url = "jdbc:sqlite:bancoDados.db";
                connection = DriverManager.getConnection(url);
        }catch (SQLException e) {
                e.printStackTrace();
        }catch (Exception e)  {
                e.printStackTrace();
        }
        return connection;
    }
    
    public boolean CadastrarLivro(Livro livro){
        boolean livroCadastrado = false;
        try {
            Connection conexao = getConnection();
            if (conexao != null) {
                    PreparedStatement cadastrar = conexao.prepareStatement("INSERT INTO livros(id, qtdAlugado, titulo, autor, editora, descricao, data_lancamento, edicao, serie, tipo, status, dataatualizacao, datainsercao, observacoes, caminhoImg) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                    cadastrar.setString(1, livro.getId());
                    cadastrar.setInt(2, livro.getQtdAlugado());
                    cadastrar.setString(3, livro.getTitulo());
                    cadastrar.setString(4, livro.getAutor());
                    cadastrar.setString(5, livro.getEditora());
                    cadastrar.setString(6, livro.getDescricao());
                    cadastrar.setString(7, livro.getData_lancamento());
                    cadastrar.setString(8, livro.getEdicao());
                    cadastrar.setString(9, livro.getSerie());
                    cadastrar.setString(10, livro.getTipo());
                    cadastrar.setString(11, livro.getStatus());
                    cadastrar.setString(12, livro.getDataatualizacao());
                    cadastrar.setString(13, livro.getDatainsercao());
                    cadastrar.setString(14, livro.getObservacoes());
                    cadastrar.setString(15, livro.getCaminhoImg());
                    cadastrar.executeUpdate();
                    livroCadastrado = true;
                    cadastrar.close();
                    conexao.close();
            }	
        }catch (Exception e) {
                e.printStackTrace();
        }
        return livroCadastrado;
    }
    
    public ArrayList<Livro> ConsultarLivros(String pesquisaLivro) {
        ArrayList<Livro> livrosEncontrados = new ArrayList<Livro>();
        try {
            Connection conexao = getConnection();
            if (conexao != null) {
                PreparedStatement consultar = null;
                consultar = conexao.prepareStatement(pesquisaLivro);

                ResultSet rs = consultar.executeQuery();
                while (rs.next()) {
                    String id = rs.getString("id");
                    int qtdAlugado = rs.getInt("qtdAlugado");
                    String titulo = rs.getString("titulo");
                    String autor = rs.getString("autor");
                    String editora = rs.getString("editora");
                    String descricao = rs.getString("descricao");
                    String data_lancamento = rs.getString("data_lancamento");
                    String edicao = rs.getString("edicao");
                    String serie = rs.getString("serie");
                    String tipo = rs.getString("tipo");
                    String status = rs.getString("status");
                    String dataatualizacao = rs.getString("dataatualizacao");
                    String datainsercao = rs.getString("datainsercao");
                    String observacoes = rs.getString("observacoes");
                    String caminhoImg = rs.getString("caminhoImg");
                    livrosEncontrados.add(new Livro(id, qtdAlugado, titulo, autor,
                                                    editora, descricao, data_lancamento,
                                                    edicao, serie, tipo, status,
                                                    dataatualizacao, datainsercao,
                                                    observacoes, caminhoImg));
                }
                rs.close();
                consultar.close();
                conexao.close();
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        return livrosEncontrados;
    }
    
    public Livro ProcurarLivroPorTituloEAutor(String titulo, String autor){
        Livro livroEncontrado = null;     
        try {
            Connection conexao = getConnection();
            if (conexao != null) {
                PreparedStatement consultar = conexao.prepareStatement("SELECT * FROM livros WHERE titulo = ? and autor = ?");
                consultar.setString(1, titulo);
                consultar.setString(2, autor);
                ResultSet rs = consultar.executeQuery();
                while (rs.next()) {
                    String id = rs.getString("id");
                    int qtdAlugado = rs.getInt("qtdAlugado");
                    String titulo_ = rs.getString("titulo");
                    String autor_ = rs.getString("autor");
                    String editora = rs.getString("editora");
                    String descricao = rs.getString("descricao");
                    String data_lancamento = rs.getString("data_lancamento");
                    String edicao = rs.getString("edicao");
                    String serie = rs.getString("serie");
                    String tipo = rs.getString("tipo");
                    String status = rs.getString("status");
                    String dataatualizacao = rs.getString("dataatualizacao");
                    String datainsercao = rs.getString("datainsercao");
                    String observacoes = rs.getString("observacoes");
                    String caminhoImg = rs.getString("caminhoImg");
                    livroEncontrado = new Livro(id, qtdAlugado, titulo_, autor_,
                                                    editora, descricao, data_lancamento,
                                                    edicao, serie, tipo, status,
                                                    dataatualizacao, datainsercao,
                                                    observacoes, caminhoImg);
                }
                rs.close();
                consultar.close();
                conexao.close();
            }
        }catch (Exception e) {
                e.printStackTrace();
        }
        return livroEncontrado;
    }
    
    public Livro ProcurarLivroPorId(String idLivro){
        Livro livroEncontrado = null;     
        try {
            Connection conexao = getConnection();
            if (conexao != null) {
                PreparedStatement consultar = conexao.prepareStatement("SELECT * FROM livros WHERE id = ?");
                consultar.setString(1, idLivro);
                ResultSet rs = consultar.executeQuery();
                while (rs.next()) {
                    String id = rs.getString("id");
                    int qtdAlugado = rs.getInt("qtdAlugado");
                    String titulo_ = rs.getString("titulo");
                    String autor_ = rs.getString("autor");
                    String editora = rs.getString("editora");
                    String descricao = rs.getString("descricao");
                    String data_lancamento = rs.getString("data_lancamento");
                    String edicao = rs.getString("edicao");
                    String serie = rs.getString("serie");
                    String tipo = rs.getString("tipo");
                    String status = rs.getString("status");
                    String dataatualizacao = rs.getString("dataatualizacao");
                    String datainsercao = rs.getString("datainsercao");
                    String observacoes = rs.getString("observacoes");
                    String caminhoImg = rs.getString("caminhoImg");
                    livroEncontrado = new Livro(id, qtdAlugado, titulo_, autor_,
                                                    editora, descricao, data_lancamento,
                                                    edicao, serie, tipo, status,
                                                    dataatualizacao, datainsercao,
                                                    observacoes, caminhoImg);
                }
                rs.close();
                consultar.close();
                conexao.close();
            }
        }catch (Exception e) {
                e.printStackTrace();
        }
        return livroEncontrado;
    }
    
    public boolean AlterarLivro(Livro livro) {
        boolean livroAlterado = false;
        try {
                Connection conexao = getConnection();
                if (conexao != null) {
                        PreparedStatement atualizar = conexao.prepareStatement("UPDATE livros set titulo=?, autor=?, editora=?, descricao=?, data_lancamento=?, edicao=?, serie=?, tipo=?, observacoes=? where id=?");
                        atualizar.setString(1, livro.getTitulo());
                        atualizar.setString(2, livro.getAutor());
                        atualizar.setString(3, livro.getEditora());
                        atualizar.setString(4, livro.getDescricao());
                        atualizar.setString(5, livro.getData_lancamento());
                        atualizar.setString(6, livro.getEdicao());
                        atualizar.setString(7, livro.getSerie());
                        atualizar.setString(8, livro.getTipo());
                        atualizar.setString(9, livro.getObservacoes());
                        atualizar.setString(10, livro.getId());
                        livroAlterado = atualizar.executeUpdate() > 0;
                        atualizar.close();
                        conexao.close();
                }
        }catch (SQLException e) {
                e.printStackTrace();
        }catch (Exception e) {
                e.printStackTrace();
        }
        return livroAlterado;
    }
    
    public boolean DeletarLivro(String idLivro){
        boolean livroDeletado = false;
        try {
            Connection conexao = getConnection();
            if (conexao != null) {
                PreparedStatement deletar = conexao.prepareStatement("DELETE FROM livros WHERE id = '" + idLivro + "'");
                livroDeletado = deletar.executeUpdate() > 0;
                deletar.close();
                conexao.close();
            }
        }catch (Exception e) {
                e.printStackTrace();
        }
        return livroDeletado;
    }
}
