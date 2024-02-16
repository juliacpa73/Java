import java.util.Scanner;

public class Exercicio13 {
    Scanner ju = new Scanner(System.in);
    System.out.println("Exercício 13");
    int x = ju.nextInt();
    int y = ju.nextInt();
    while(x!=0&&y!=0){
    if (x > 0 && y > 0) {
        System.out.println("primeiro");
    }else if (x < 0 && y > 0) {
        System.out.println("segundo");
    }else if (x < 0 && y < 0) {
        System.out.println("terceiro");
    }else {
        System.out.println("quarto");
    }
    x = ju.nextInt();
    y = ju.nextInt();
    }ju.close();

}
