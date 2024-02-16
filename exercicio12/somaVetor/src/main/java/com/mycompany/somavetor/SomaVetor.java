/*
 * Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
 * - Imprimir todos os elementos do vetor
 * - Mostrar na tela a soma e a média dos elementos do vetor
 * 
 * Exemplo:
 * Quantos numeros você vai digitar? 4
 * Digite um numero: 8.0
 * Digite um numero: 4.0
 * Digite um numero: 10.0
 * Digite um numero: 14.0
 * 
 * VALORES = 8.0 4.0 10.0 14.0
 * SOMA = 36.00
 * MEDIA = 9.00
 */

package com.mycompany.somavetor;

import java.util.Scanner;

public class SomaVetor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos números você vai digitar? ");
        int posicao = sc.nextInt();

        Problema problema = new Problema(new int[posicao]); // Corrigido para criar uma instância de Problema

        problema.lerNumeros();
        problema.somaMedia(); // Adicionado para calcular e imprimir a média
        sc.close();
    }
}

// Classe principal
