package Repositorio;

import Modelos.Usuario;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UsuarioDAO 
{
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
    
    public boolean CadastrarUsuario(Usuario usuario){
        boolean usuarioCadastrado = false;
        try {
            Connection conexao = getConnection();
            if (conexao != null) {
                    PreparedStatement cadastrar = conexao.prepareStatement("INSERT INTO usuario(id, tipo, nome, senha) VALUES (?,?,?,?)");
                    cadastrar.setString(1, usuario.getId());
                    cadastrar.setString(2, usuario.getTipo());
                    cadastrar.setString(3, usuario.getNome());
                    cadastrar.setString(4, usuario.getSenha());
                    cadastrar.executeUpdate();
                    usuarioCadastrado = true;
                    cadastrar.close();
                    conexao.close();
            }	
        }catch (Exception e) {
                e.printStackTrace();
        }
        return usuarioCadastrado;
    }
    
    public Usuario ProcurarUsuario(String nomeUsuario, String senhaUsuario){
        Usuario usuarioEncontrado = null;     
        try {
            Connection conexao = getConnection();
            if (conexao != null) {
                PreparedStatement consultar = conexao.prepareStatement("SELECT * FROM usuario WHERE senha = ? and nome = ?");
                consultar.setString(1, senhaUsuario);
                consultar.setString(2, nomeUsuario);
                ResultSet rs = consultar.executeQuery();
                while (rs.next()) {
                    String id = rs.getString("id");
                    String tipo = rs.getString("tipo");
                    String nome = rs.getString("nome");
                    String senha = rs.getString("senha");
                    usuarioEncontrado = new Usuario(id, tipo, nome, senha);
                }
                rs.close();
                consultar.close();
                conexao.close();
            }
        }catch (Exception e) {
                e.printStackTrace();
        }
        return usuarioEncontrado;
    }
    
    public Usuario ProcurarUsuarioPorNome(String nomeUsuario){
        Usuario usuarioEncontrado = null;     
        try {
            Connection conexao = getConnection();
            if (conexao != null) {
                PreparedStatement consultar = conexao.prepareStatement("SELECT * FROM usuario WHERE nome = ?");
                consultar.setString(1, nomeUsuario);
                ResultSet rs = consultar.executeQuery();
                while (rs.next()) {
                    String id = rs.getString("id");
                    String tipo = rs.getString("tipo");
                    String nome = rs.getString("nome");
                    String senha = rs.getString("senha");
                    usuarioEncontrado = new Usuario(id, tipo, nome, senha);
                }
                rs.close();
                consultar.close();
                conexao.close();
            }
        }catch (Exception e) {
                e.printStackTrace();
        }
        return usuarioEncontrado;
    }
    
    public Usuario ProcurarUsuarioPorId(String idUsuario){
        Usuario usuarioEncontrado = null;     
        try {
            Connection conexao = getConnection();
            if (conexao != null) {
                PreparedStatement consultar = conexao.prepareStatement("SELECT * FROM usuario WHERE id = ?");
                consultar.setString(1, idUsuario);
                ResultSet rs = consultar.executeQuery();
                while (rs.next()) {
                    String id = rs.getString("id");
                    String tipo = rs.getString("tipo");
                    String nome = rs.getString("nome");
                    String senha = rs.getString("senha");
                    usuarioEncontrado = new Usuario(id, tipo, nome, senha);
                }
                rs.close();
                consultar.close();
                conexao.close();
            }
        }catch (Exception e) {
                e.printStackTrace();
        }
        return usuarioEncontrado;
    }
    
    public ArrayList<Usuario> ConsultarUsuarios(String nome, String tipo) {
        ArrayList<Usuario> usuariosEncontrados = new ArrayList<Usuario>();
        try {
            Connection conexao = getConnection();
            if (conexao != null) {
                PreparedStatement consultar = null;
                nome = nome.toLowerCase();
                if ("Todos".equals(tipo) && "".equals(nome)){
                    consultar = conexao.prepareStatement("SELECT * FROM usuario;");
                }else if ("Todos".equals(tipo) && !"".equals(nome)) {
                    consultar = conexao.prepareStatement("SELECT * FROM usuario WHERE nome = '" + nome + "';");
                }else if(!"".equals(nome)){
                    consultar = conexao.prepareStatement("SELECT * FROM usuario WHERE nome like'%" + nome + "%' and tipo = '" + tipo + "';");
                }else{
                    return usuariosEncontrados;
                }
                ResultSet rs = consultar.executeQuery();
                usuariosEncontrados = new ArrayList<Usuario>();
                while (rs.next()) {
                    String id = rs.getString("id");
                    String tipo_r = rs.getString("tipo");
                    String nome_r = rs.getString("nome");
                    String senha = rs.getString("senha");
                    usuariosEncontrados.add(new Usuario(id, tipo_r, nome_r, senha));
                }
                rs.close();
                consultar.close();
                conexao.close();
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        return usuariosEncontrados;
    }
        
    public boolean AlterarUsuario(Usuario usuario) {
        boolean usuarioAlterado = false;
        try {
                Connection conexao = getConnection();
                if (conexao != null) {
                        PreparedStatement atualizar = conexao.prepareStatement("UPDATE usuario set nome=?, tipo=?, senha=? where id=?");
                        atualizar.setString(1, usuario.getNome());
                        atualizar.setString(2, usuario.getTipo());
                        atualizar.setString(3, usuario.getSenha());
                        atualizar.setString(4, usuario.getId());
                        usuarioAlterado = atualizar.executeUpdate() > 0;
                        atualizar.close();
                        conexao.close();
                }
        }catch (SQLException e) {
                e.printStackTrace();
        }catch (Exception e) {
                e.printStackTrace();
        }
        return usuarioAlterado;
    }
    
    public boolean DeletarUsuario(String idUsuario){
        boolean usuarioCadastrado = false;
        try {
            Connection conexao = getConnection();
            if (conexao != null) {
                PreparedStatement deletar = conexao.prepareStatement("DELETE FROM usuario WHERE id = '" + idUsuario + "'");
                usuarioCadastrado = deletar.executeUpdate() > 0;
                deletar.close();
                conexao.close();
            }
        }catch (Exception e) {
                e.printStackTrace();
        }
        return usuarioCadastrado;
    }
}