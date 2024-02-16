import java.util.Scanner;

public class Exercicio09 {
    Scanner ju = new Scanner(System.in);
    System.out.println("Exercício 9");
    int x = ju.nextInt();
    if(x%2==0){
        System.out.println("PAR");
    }else{
        System.out.println("ÍMPAR");
    }ju.close();
}
