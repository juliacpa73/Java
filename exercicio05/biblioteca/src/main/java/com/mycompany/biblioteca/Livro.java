package com.mycompany.biblioteca;

public class Livro implements Publicacao {

    private String titulo;
    private String autor;
    private int totPagina;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public void detalhe() {
    }

    @Override
    public void abrir() {
        if (this.isAberto() == true) {
            System.out.println("Livro aberto! ");
        } else {
            System.out.println("O livro ainda está fechado! ");
        }
    }

    @Override
    public void fechar() {
        if (this.isAberto() == false) {
            System.out.println("Livro fechado com sucesso! ");
        } else {
            System.out.println("O livro ainda está aberto! ");
        }
    }

    public Livro(String titulo, String autor, int totPagina, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPagina = totPagina;
        this.leitor = leitor;
    }

    @Override
    public void avancarPag() {
        if (this.getTotPagina() > 0) {
            this.setTotPagina(this.getTotPagina() + 1);
        }
    }

    @Override
    public void voltarPag() {

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

    public int getTotPagina() {
        return totPagina;
    }

    public void setTotPagina(int totPagina) {
        this.totPagina = totPagina;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

}
