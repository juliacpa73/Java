package com.mycompany.empresa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Empresa {

    public static void main(String[] args) {
        List<Pessoa> list; // List<Pessoa> list = new ArrayList<>();
        list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos funcionário serão registrados? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("\n--------------------\n");
            System.out.println("Funcionário " + (i + 1) + "º: ");
            System.out.println("ID: ");
            Integer id = sc.nextInt();
            while (temId(list, id)) {
                System.out.print("Esse ID já existe, tente novamente! ");
                id = sc.nextInt();
            }
            sc.nextLine(); //para não ter quebra de linha 
            System.out.println("Nome: ");
            String nome = sc.nextLine();
            System.out.println("Salário: ");
            Double salario = sc.nextDouble();

            Pessoa pessoa = new Pessoa(id, nome, salario);
            list.add(pessoa);
        }
        System.out.println("\n--------------------\n");
        System.out.println("Digite o ID do funcionário que terá aumento salarial: ");
        int idSalario = sc.nextInt();
        Pessoa pessoa = list.stream().filter(x -> x.getId() == idSalario).findFirst().orElse(null);

        /*list.stream(): Converte a lista list em um fluxo (stream) de elementos. 
        Um stream é uma sequência de elementos que podem ser processados em paralelo ou sequencialmente.

        .filter(x -> x.getId() == id): Aplica uma operação de filtro no stream. 
        Neste caso, x -> x.getId() == id é uma expressão lambda que verifica se o ID do objeto x é igual ao ID fornecido (id). 
        Portanto, o filtro mantém apenas os elementos cujo ID é igual ao ID desejado.

        .findFirst(): Retorna o primeiro elemento do stream que atende ao critério estabelecido pelo filtro. 
        Se nenhum elemento atender ao critério, o resultado é um stream vazio.

        .orElse(null): Se houver um resultado (um objeto com o ID desejado), ele é retornado. Caso contrário, o valor padrão null é retornado.

         */
        if (pessoa == null) {
            System.out.println("\n--------------------\n");
            System.out.println("Esse ID não existe! ");
        } else {
            System.out.println("\n--------------------\n");
            System.out.println("Digite a porcentagem: ");
            double porcentagem = sc.nextInt();
            pessoa.aumentoSalarial(porcentagem);
        }
        System.out.println();
        System.out.println("Lista de funcionários: ");
        for (Pessoa obj : list) {
            System.out.println(obj);
        }
        sc.close();
    }

    public static boolean temId(List<Pessoa> list, int id) {
        Pessoa pessoa = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return pessoa != null;

    }

}
