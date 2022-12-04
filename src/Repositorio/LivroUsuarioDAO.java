
package Repositorio;

import Modelos.Livro;
import Modelos.LivroUsuario;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.UUID;


public class LivroUsuarioDAO {
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
    
    /*public ArrayList<Livro> ProcurarLivroUsuario(String idUsuario) {
        ArrayList<Livro> livrosEncontrados = new ArrayList<Livro>();
        try {
            Connection conexao = getConnection();
            if (conexao != null) {
                PreparedStatement consultar = null;
                consultar = conexao.prepareStatement("SELECT * FROM livros_usuario WHERE idUsuario = '" + idUsuario + "' and jali = true");

                ResultSet rs = consultar.executeQuery();
                while (rs.next()) {
                    String id = rs.getString("id");
                    String idUsuario_ = rs.getString("idUsuario");
                    String idLivro = rs.getString("idLivro");
                    boolean devolvido = rs.getBoolean("devolvido");
                    String dataVenc = rs.getString("dataVenc");
                    boolean jali = rs.getBoolean("jali");
                    int qtdAlugado = rs.getInt("qtdAlugado");
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
    }*/
    
    public boolean CriarLivroUsuario(String idUsuario, String idLivro){
        boolean livroUsuarioCadastrado = false;
        try {
            Connection conexao = getConnection();
            if (conexao != null) {
                    PreparedStatement cadastrar = conexao.prepareStatement("INSERT INTO livros_usuario(id, idUsuario, idLivro, devolvido, dataVenc, jali, avaliacao) VALUES (?,?,?,?,?,?,?)");
                    cadastrar.setString(1, UUID.randomUUID().toString());
                    cadastrar.setString(2, idUsuario);
                    cadastrar.setString(3, idLivro);
                    cadastrar.setBoolean(4, false);
                    cadastrar.setString(5, "");
                    cadastrar.setBoolean(6, false);
                    cadastrar.setInt(7, 10);
                    cadastrar.executeUpdate();
                    livroUsuarioCadastrado = true;
                    cadastrar.close();
                    conexao.close();
            }	
        }catch (Exception e) {
                e.printStackTrace();
        }
        return livroUsuarioCadastrado;
    }
    
    public LivroUsuario ProcurarLivroUsuario(String idUsuario, String idLivro){
        LivroUsuario livroUsuarioEncontrado = null;     
        try {
            Connection conexao = getConnection();
            if (conexao != null) {
                PreparedStatement consultar = conexao.prepareStatement("SELECT * FROM livros_usuario where idUsuario=? and idLivro=?");
                consultar.setString(1, idUsuario);
                consultar.setString(2, idLivro);
                ResultSet rs = consultar.executeQuery();
                while (rs.next()) {
                    String id = rs.getString("id");
                    String idUsuario_ = rs.getString("idUsuario");
                    String idLivro_ = rs.getString("idLivro");
                    boolean devolvido = rs.getBoolean("devolvido");
                    String dataVenc = rs.getString("dataVenc");
                    boolean jali = rs.getBoolean("jali");
                    int avalizacao = rs.getInt("avaliacao");
                    livroUsuarioEncontrado = new LivroUsuario(id, idUsuario_, idLivro_,
                                                 devolvido, dataVenc, jali, avalizacao);
                }
                rs.close();
                consultar.close();
                conexao.close();
            }
        }catch (Exception e) {
                e.printStackTrace();
        }
        return livroUsuarioEncontrado;
    }
    
    public boolean MarcarLivroLido(String idUsuario, String idLivro) {
        boolean marcarLivroLidoAlterado = false;
        try {
                Connection conexao = getConnection();
                if (conexao != null) {
                        PreparedStatement atualizar = conexao.prepareStatement("UPDATE livros_usuario set jali = true where idUsuario=? and idLivro=?;");
                        atualizar.setString(1, idUsuario);
                        atualizar.setString(2, idLivro);
                        marcarLivroLidoAlterado = atualizar.executeUpdate() > 0;
                        atualizar.close();
                        conexao.close();
                }
        }catch (SQLException e) {
                e.printStackTrace();
        }catch (Exception e) {
                e.printStackTrace();
        }
        return marcarLivroLidoAlterado;
    }
    
    public boolean DesmarcarLivroLido(String idUsuario, String idLivro) {
        boolean desmarcarLivroLidoAlterado = false;
        try {
                Connection conexao = getConnection();
                if (conexao != null) {
                        PreparedStatement atualizar = conexao.prepareStatement("UPDATE livros_usuario set jali = false where idUsuario=? and idLivro=?;");
                        atualizar.setString(1, idUsuario);
                        atualizar.setString(2, idLivro);
                        desmarcarLivroLidoAlterado = atualizar.executeUpdate() > 0;
                        atualizar.close();
                        conexao.close();
                }
        }catch (SQLException e) {
                e.printStackTrace();
        }catch (Exception e) {
                e.printStackTrace();
        }
        return desmarcarLivroLidoAlterado;
    }
    
    public boolean AlugarLivro(String idUsuario, String idLivro) {
        boolean marcarLivroLidoAlterado = false;
        try {
            Connection conexao = getConnection();
            if (conexao != null) {
                PreparedStatement atualizar = conexao.prepareStatement("UPDATE livros_usuario set devolvido = false where idUsuario=? and idLivro=?;");
                atualizar.setString(1, idUsuario);
                atualizar.setString(2, idLivro);
                marcarLivroLidoAlterado = atualizar.executeUpdate() > 0;
                atualizar.close();
                conexao.close();
            }
        }catch (SQLException e) {
                e.printStackTrace();
        }catch (Exception e) {
                e.printStackTrace();
        }
        return marcarLivroLidoAlterado;
    }
    
    public boolean DevolverLivro(String idUsuario, String idLivro) {
        boolean desmarcarLivroLidoAlterado = false;
        try {
                Connection conexao = getConnection();
                if (conexao != null) {
                        PreparedStatement atualizar = conexao.prepareStatement("UPDATE livros_usuario set devolvido = true where idUsuario=? and idLivro=?;");
                        atualizar.setString(1, idUsuario);
                        atualizar.setString(2, idLivro);
                        desmarcarLivroLidoAlterado = atualizar.executeUpdate() > 0;
                        atualizar.close();
                        conexao.close();
                }
        }catch (SQLException e) {
                e.printStackTrace();
        }catch (Exception e) {
                e.printStackTrace();
        }
        return desmarcarLivroLidoAlterado;
    }
    
    public boolean DeletarLivroUsuarioPorIdUsuario(String idUsuario){
        boolean livroUsuarioDeletado = false;
        try {
            Connection conexao = getConnection();
            if (conexao != null) {
                PreparedStatement deletar = conexao.prepareStatement("DELETE FROM livros_usuario WHERE idUsuario = '" + idUsuario + "'");
                livroUsuarioDeletado = deletar.executeUpdate() > 0;
                deletar.close();
                conexao.close();
            }
        }catch (Exception e) {
                e.printStackTrace();
        }
        return livroUsuarioDeletado;
    }
    
    public boolean DeletarLivroUsuarioPorIdLivro(String idLivro){
        boolean livroUsuarioDeletado = false;
        try {
            Connection conexao = getConnection();
            if (conexao != null) {
                PreparedStatement deletar = conexao.prepareStatement("DELETE FROM livros_usuario WHERE idLivro = '" + idLivro + "'");
                livroUsuarioDeletado = deletar.executeUpdate() > 0;
                deletar.close();
                conexao.close();
            }
        }catch (Exception e) {
                e.printStackTrace();
        }
        return livroUsuarioDeletado;
    }
}
