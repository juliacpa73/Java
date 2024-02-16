import java.util.Scanner;

public class Exercicio14 {
    Scanner ju = new Scanner(System.in);
    int x = ju.nextInt();
    int alcool = 0;
    int gasolina = 0;
    int diesel = 0;

    while(x!=4){
        switch(x){
            case 1:alcool+=1;
            break;
            case 2:gasolina+=1;
            break;
            case 3:diesel+=1;
            default;
    }
    x=ju.nextInt();
    System.out.println("MUITO OBRIGADO");
    System.out.println("Alcool: "+alcool);
    System.out.println("Gasolina: "+gasolina);
    System.out.println("Diesel: "+diesel);

ju.close();
}
}