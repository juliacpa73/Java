package com.mycompany.aula07;

import java.util.Random;

public class Luta {

    private Lutador desafiado;
    private Lutador desafiante;
    private int round;
    private String aprovada;

    public void marcarLuta() {
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 =! l2){ //l1.getCategoria() == l2.getCategoria() ---- .equals() significa == no tipo String
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        }else{
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }

    public void lutar() {
        if (this.aprovada) {
            this.desafiado.apresentar();
            this.desafiante.apresentar();
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3); // 0 1 2
            switch (vencedor) {
                case 0 -> {
                    // Empate
                    System.out.println("Empatou!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                }
                case 1 -> {
                    // Desafiador vence
                    System.out.println("Vitória do " + this.desafiado);
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                }
                case 2 -> {
                    // Desafiante vence
                    System.out.println("Vitória do " + this.desafiante);
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                }
            }
        } else {
            System.out.println("A luta não pode acontecer!");
        }
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
    }

    public String getAprovada() {
        return aprovada;
    }

    public void setAprovada(String aprovada) {
        this.aprovada = aprovada;
    }

}