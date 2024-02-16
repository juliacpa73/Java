import java.util.Scanner;

public class Exercicio05 {
    Scanner ju = new Scanner(System.in);
    System.out.println("Exercício 5");
    int cod1 = ju.nextInt();
    int num1 = ju.nextInt();
    double valor1 = ju.nextDouble();
    int cod2 = ju.nextInt();
    int num2 = ju.nextInt();
    double valor2 = ju.nextDouble();
    double pagamento = (num1 * valor1) + (num2 * valor2);
    System.out.println("O valor a ser pago é " + pagamento + ", o código da peça 1 é " + cod1 + " e da peça 2 é " + cod2);
    ju.close();
}
