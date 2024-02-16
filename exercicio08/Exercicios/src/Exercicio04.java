import java.util.Scanner;

public class Exercicio04 {
    Scanner ju = new Scanner(System.in);
    System.out.println("Exercício 4");
    int num = ju.nextInt();
    int hora = ju.nextInt();
    double valorHora = ju.nextDouble();
    double salario = hora * valorHora;
    System.out.println("O número do funcionário é " + num + " e o valor do seu salário é " + salario + ".");
    ju.close();
}
