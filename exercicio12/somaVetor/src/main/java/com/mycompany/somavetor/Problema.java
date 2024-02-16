package com.mycompany.somavetor;

import java.util.Scanner;

public class Problema {
    private int[] posicao;

    public Problema(int[] posicao) {
        this.posicao = posicao;
    }

    public void lerNumeros() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < this.getPosicao().length; i++) {
            System.out.println("Digite um número: ");
            this.getPosicao()[i] = sc.nextInt();
        }
        sc.close();

        System.out.println("Os números registrados no vetor são: ");
        for (int valor : this.getPosicao()) {
            System.out.print(valor + " ");
        }
        System.out.println(); // Adicionando uma quebra de linha após os valores do vetor
    }

    public void somaMedia() {
        int soma = 0;
        for (int valor : this.getPosicao()) {
            soma += valor;
        }
        System.out.println("A soma dos números é " + soma);

        double media = (double) soma / this.getPosicao().length;
        System.out.println("A média é " + media);
    }

    public int[] getPosicao() {
        return posicao;
    }

    public void setPosicao(int[] posicao) {
        this.posicao = posicao;
    }
}

//Classe que estão todos os métodos