
package Modelos;


public class Livro {
    String id;
    int qtdAlugado;
    String titulo;
    String autor;
    String editora;
    String descricao;
    String data_lancamento;
    String edicao;
    String serie;
    String tipo;
    String status;
    String dataatualizacao;
    String datainsercao;
    String observacoes;
    String caminhoImg;
    
    
    public Livro(String id, int qtdAlugado, String titulo, String autor, String editora,
            String descricao, String data_lancamento, String edicao, String serie,
            String tipo, String status, String dataatuaizacao, String datainsercao,
            String observacoes, String caminhoImg){
        this.id = id;
	this.qtdAlugado = qtdAlugado;
	this.titulo = titulo;
	this.autor = autor;
	this.editora = editora;
	this.descricao = descricao;
	this.data_lancamento = data_lancamento;
	this.edicao = edicao;
	this.serie = serie;
	this.tipo = tipo;
	this.status = status;
	this.dataatualizacao = dataatuaizacao;
	this.datainsercao = datainsercao;
	this.observacoes = observacoes;
        this.caminhoImg = caminhoImg;
    }

    public String getCaminhoImg() {
        return caminhoImg;
    }

    public void setCaminhoImg(String caminhoImg) {
        this.caminhoImg = caminhoImg;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getQtdAlugado() {
        return qtdAlugado;
    }

    public void setQtdAlugado(int qtdAlugado) {
        this.qtdAlugado = qtdAlugado;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDataatualizacao() {
        return dataatualizacao;
    }

    public void setDataatualizacao(String dataatualizacao) {
        this.dataatualizacao = dataatualizacao;
    }

    public String getDatainsercao() {
        return datainsercao;
    }

    public void setDatainsercao(String datainsercao) {
        this.datainsercao = datainsercao;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
}
