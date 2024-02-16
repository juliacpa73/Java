package com.mycompany.exercicio02;

import java.util.Scanner;

public class Numero {

    private int[] numeros;

    // Construtor que recebe a quantidade de números a serem digitados e inicializa o array
    public Numero(int quantidade) {
        this.numeros = new int[quantidade];
    }

    // Método para ler os números digitados
    public void lerNumeros() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("---------------------------\n Digite um numero: ");
            numeros[i] = sc.nextInt();
        }
        System.out.println("---------------------------\n Tamanho do vetor: " + numeros.length);
    }

    // Método para exibir os números negativos presentes no array
    public void exibirNegativos() {
        System.out.println("---------------------------\n Números negativos:");
        for (int numero : numeros) {
            if (numero < 0) {
                System.out.println(numero);
            }
        }
    }

    // Métodos getter e setter para o array de números
    public int[] getNumeros() {
        return numeros;
    }

    public void setNumeros(int[] numeros) {
        this.numeros = numeros;
    }
}
