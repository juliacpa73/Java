import java.util.Scanner;

public class Exercicio12 {
    Scanner ju = new Scanner(System.in);
    System.out.println("Exercício 12");
    int x = ju.nextInt();
    while(x!=2002){
        x = ju.nextInt();
        System.out.println("Senha Inválida");
    }
    System.out.println("Acesso permitido");
    ju.close();
}
