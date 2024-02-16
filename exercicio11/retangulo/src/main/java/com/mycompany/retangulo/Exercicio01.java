package com.mycompany.retangulo;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Retangulo rect = new Retangulo();
        System.out.println("Insira largura e altura: ");
        double width = sc.nextDouble();
        double height = sc.nextDouble();

        rect.setWidth(width);
        rect.setHeight(height);
        rect.status();

        sc.close();
    }
}
