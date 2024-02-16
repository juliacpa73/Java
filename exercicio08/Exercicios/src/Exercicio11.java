import java.util.Scanner;

public class Exercicio11 {
    Scanner ju = new Scanner(System.in);
    System.out.println("Exercício 11");
    System.out.println("Qual é o código do item? ");
    int cod = ju.nextInt();
    System.out.println("Quantos?");
    int quantidade = ju.nextInt();
    System.out.println("Qual é o valor?");
    double valor = ju.nextDouble();
    if(quantidade>1){
        double multiplicação = quantidade * valor;
        System.out.println("O preço é " + multiplicação);
    }else{
        System.out.println("O preço é " + valor);
    }ju.close();
}
