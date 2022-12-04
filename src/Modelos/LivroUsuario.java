/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author Gabriel
 */
public class LivroUsuario {
    String id;
    String idUsuario;
    String idLivro;
    boolean devolvido;
    String dataVenc;
    boolean jali;
    int avaliacao;
    
    public LivroUsuario(){
    
    }
    
    public LivroUsuario(String id, String idUsuario, String idLivro,
            boolean devolvido, String dataVenc, boolean jali, int avaliacao){
        this.id = id;
        this.idUsuario = idUsuario;
        this.idLivro = idLivro;
        this.devolvido = devolvido;
        this.dataVenc = dataVenc;
        this.jali = jali;
        this.avaliacao = avaliacao;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(String idLivro) {
        this.idLivro = idLivro;
    }

    public boolean isDevolvido() {
        return devolvido;
    }

    public void setDevolvido(boolean devolvido) {
        this.devolvido = devolvido;
    }

    public String getDataVenc() {
        return dataVenc;
    }

    public void setDataVenc(String dataVenc) {
        this.dataVenc = dataVenc;
    }

    public boolean isJali() {
        return jali;
    }

    public void setJali(boolean jali) {
        this.jali = jali;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }
    
    
}
