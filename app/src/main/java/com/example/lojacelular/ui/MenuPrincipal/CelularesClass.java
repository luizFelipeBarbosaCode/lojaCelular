package com.example.lojacelular.ui.MenuPrincipal;

public class CelularesClass {


    // imagem do celular que vai aparecer na lista principal
    private int image;

    // nome do celular vai aparecer no titulo da lista principal
    private String titulo,preco,cor,tamanho,categoria,descricao;

    public CelularesClass(int image, String titulo,String preco,String cor,String tamanho,String categoria,String descricao) {
        this.image = image;
        this.titulo = titulo;
        this.preco = preco;
        this.cor = cor;
        this.tamanho = tamanho;
        this.categoria = categoria;
        this.descricao = descricao;
    }

    public int getImage(){
        return  image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
