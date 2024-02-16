package com.mycompany.aula07;

public class Lutador implements Interface {

    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitoria;
    private int derrota;
    private int empate;

    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, String categoria, int vitoria, int derrota, int empate) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.categoria = categoria;
        this.vitoria = vitoria;
        this.derrota = derrota;
        this.empate = empate;
    }

    @Override
    public void apresentar() {
        System.out.println("Lutador: " + this.getNome());
        System.out.println("Origem: " + this.getNacionalidade());
        System.out.println(this.getIdade() + " anos");
        System.out.println(this.getAltura() + " m de altura");
        System.out.println("Pesando " + this.getPeso());
        System.out.println("Ganhou: " + this.getVitoria());
        System.out.println("Perdeu: " + this.getDerrota());
        System.out.println("Empate: " + this.getEmpate());
    }

    @Override
    public void status() {
        System.out.println(this.getNome());
        System.out.println(this.getVitoria() + " vitórias");
        System.out.println(this.getDerrota() + " derrotas");
        System.out.println(this.getEmpate() + " empates");

    }

    @Override
    public void ganharLuta() {
        this.setVitoria(getVitoria() + 1);
    }

    @Override
    public void perderLuta() {
        this.setDerrota(getDerrota() + 1);
    }

    @Override
    public void empatarLuta() {
        this.setEmpate(getEmpate() + 1);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria(categoria);
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        if (this.peso < 52.2) {
            this.categoria = "Inválido1";
        } else if (this.peso <= 70.3) {
            this.categoria = "Leve";
        } else if (this.peso <= 83.9) {
            this.categoria = "Médio";
        } else if (this.peso <= 120.2) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido";
        }
    }

    public int getVitoria() {
        return vitoria;
    }

    public void setVitoria(int vitoria) {
        this.vitoria = vitoria;
    }

    public int getDerrota() {
        return derrota;
    }

    public void setDerrota(int derrota) {
        this.derrota = derrota;
    }

    public int getEmpate() {
        return empate;
    }

    public void setEmpate(int empate) {
        this.empate = empate;
    }

}
