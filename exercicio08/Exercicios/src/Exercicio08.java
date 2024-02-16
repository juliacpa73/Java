import java.util.Scanner;

public class Exercicio08 {
    Scanner ju = new Scanner(System.in);
    System.out.println("Exercício 8");
    int A = ju.nextInt();
    int B = ju.nextInt();
    if(A%B==0||B%A==0){
        System.out.println("Sao Multiplos");
    }else{
        System.out.println("Nao sao Multiplos");
    }
    ju.close();
}
