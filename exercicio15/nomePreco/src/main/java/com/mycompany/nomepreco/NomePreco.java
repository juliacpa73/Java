package com.mycompany.nomepreco;

import java.util.Scanner;

public class NomePreco {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos produtos serão adicionados? ");
        int n = sc.nextInt();

        Produto[] vetor = new Produto[n];
        for (int i = 0; i < vetor.length; i++) { //for (int i = 0; i < n; i++){
            System.out.println("Digite o nome e o preço");
            sc.nextLine();
            String nome = sc.nextLine();
            double preco = sc.nextDouble();
            vetor[i] = new Produto(nome, preco);
        }
        double soma = 0;
        for (int i = 0; i < n; i++) {
            soma = soma + vetor[i].getPreco(); //soma += vetor
        }
        double media = soma / n;
        System.out.println("A média é " + media);
        sc.close();
    }
 
}
