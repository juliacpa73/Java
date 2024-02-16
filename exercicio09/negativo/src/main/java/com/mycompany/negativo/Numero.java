package com.mycompany.negativo;



public class Numero {

    private int[] numeros;

    public Numero(int[] numeros) {
        this.numeros = numeros;
    }
/*
    public void positivo() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < this.getNumeros().length; i++) {
            System.out.print("Digite um numero: ");
            this.getNumeros()[i] = sc.nextInt();
        }
    }
*/
    /*
    public void negativo() {
        System.out.println("Números negativos: ");
        for (int numero : this.getNumeros()) {
            if (numero < 0) {
                System.out.println(numero);
            }
        }
    }
*/
    
    public int[] getNumeros() {
        return numeros;
    }

    public void setNumeros(int[] numeros) {
        this.numeros = numeros;
    }

}
