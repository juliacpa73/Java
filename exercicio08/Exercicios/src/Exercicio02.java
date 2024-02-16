import java.util.Scanner;

public class Exercicio02 {
    Scanner ju = new Scanner(System.in);
    System.out.println("Exercício 2");
    double R;
    double A;
    double pi = 3.14159;
    R=ju.nextDouble();
    A=pi*R*R;
    System.out.printf("A=%.4f%n",A);

    ju.close();
}
