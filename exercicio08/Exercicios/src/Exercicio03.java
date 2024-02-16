import java.util.Scanner;

public class Exercicio03 {
    Scanner ju = new Scanner(System.in);
    System.out.println("Exercício 3");
    int A = ju.nextInt();
    int B = ju.nextInt();
    int C= ju.nextInt();
    int D = ju.nextInt();
    int diferenca = (A*B)- (C*D);
    System.out.println("O resultado é " + diferenca);
    ju.close();
 
}
