package com.mycompany.pesomedio;

import java.util.Scanner;

public class PesoMedio {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas pessoas são para registrar altura?");
        int n = sc.nextInt();

        int[] vetor = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Digite a altura: ");
            vetor[i] = sc.nextInt();
        }

        double soma = 0;
        for (int i = 0; i < n; i++) {
            soma = soma + vetor[i]; //soma += vetor
        }
        double media = soma / n;
        System.out.println("A média é " + media);
        sc.close();
    }
}
