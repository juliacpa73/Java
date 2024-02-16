package com.mycompany.exercicio02;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("----------------------------------\n Quantos números você vai digitar? \n----------------------------------\n ");
        int quantidade = sc.nextInt();

        // Verifica se a quantidade de números está dentro do intervalo válido
        if (quantidade > 0 || quantidade < 11) {
            // Cria um objeto da classe Número, passando a quantidade de números como argumento
            Numero numeros = new Numero(quantidade);

            // Chama o método para ler os números digitados
            numeros.lerNumeros();

            // Chama o método para exibir os números negativos
            numeros.exibirNegativos();
        } else {
            // Mensagem de erro para quantidade de números inválida
            System.out.println("---------------------------\n Quantidade de números inválida. Digite um valor entre 1 e 10.");
        }
    }
}
