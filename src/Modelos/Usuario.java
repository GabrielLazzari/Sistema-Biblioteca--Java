
package Modelos;

public class Usuario {
    String id;
    String tipo;
    String nome;
    String senha;

    public Usuario(String id, String tipo, String nome, String senha){
        this.id = id;
        this.tipo = tipo;
        this.nome = nome;
        this.senha = senha;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
