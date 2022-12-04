
package Modelos;


public class PesquisaLivro {
    String id;
    String idUsuario;
    String idLivro;
    boolean jali;
    boolean devolvido;
    String titulo;
    String autor;
    String editora;
    String descricao;
    String data_lancamento;
    String edicao;
    String serie;
    boolean todos;
    boolean acao;
    boolean aventura;
    boolean comedia;
    boolean romance;
    boolean estudos;
    boolean novos;
    boolean emAlta;
    
    public PesquisaLivro(String id, String titulo, String autor, String editora,
            String descricao, String data_lancamento, String edicao, String serie,
            boolean todos, boolean acao, boolean aventura,
            boolean comedia, boolean romance, boolean estudos, boolean novos,
            boolean emAlta){
	this.id = id;
        this.titulo = titulo;
	this.autor = autor;
	this.editora = editora;
	this.descricao = descricao;
	this.data_lancamento = data_lancamento;
	this.edicao = edicao;
	this.serie = serie;
        this.todos = todos;
        this.acao = acao;
        this.aventura = aventura;
        this.comedia = comedia;
        this.romance = romance;
        this.estudos = estudos;
        this.novos = novos;
        this.emAlta = emAlta;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isJali() {
        return jali;
    }

    public void setJali(boolean jali) {
        this.jali = jali;
    }

    public boolean isDevolvido() {
        return devolvido;
    }

    public void setDevolvido(boolean devolvido) {
        this.devolvido = devolvido;
    }
    
    public PesquisaLivro(){
    
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

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getData_lancamento() {
        return data_lancamento;
    }

    public void setData_lancamento(String data_lancamento) {
        this.data_lancamento = data_lancamento;
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public boolean isTodos() {
        return todos;
    }

    public void setTodos(boolean todos) {
        this.todos = todos;
    }

    public boolean isAcao() {
        return acao;
    }

    public void setAcao(boolean acao) {
        this.acao = acao;
    }

    public boolean isAventura() {
        return aventura;
    }

    public void setAventura(boolean aventura) {
        this.aventura = aventura;
    }

    public boolean isComedia() {
        return comedia;
    }

    public void setComedia(boolean comedia) {
        this.comedia = comedia;
    }

    public boolean isRomance() {
        return romance;
    }

    public void setRomance(boolean romance) {
        this.romance = romance;
    }

    public boolean isEstudos() {
        return estudos;
    }

    public void setEstudos(boolean estudos) {
        this.estudos = estudos;
    }

    public boolean isNovos() {
        return novos;
    }

    public void setNovos(boolean novos) {
        this.novos = novos;
    }

    public boolean isEmAlta() {
        return emAlta;
    }

    public void setEmAlta(boolean emAlta) {
        this.emAlta = emAlta;
    }

    
}
