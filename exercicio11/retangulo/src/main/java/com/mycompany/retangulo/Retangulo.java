package com.mycompany.retangulo;

public class Retangulo {

    private double width;
    private double height;

    public void status() {
        System.out.println("Os valores do retângulo: ");
        this.area();
        this.perimeter();
        this.diagonal();
    }

    public void area() {
        double area = this.getWidth() * this.getHeight();
        System.out.println("A área é " + area);
    }

    public void perimeter() {
        double perimeter = 2 * (this.getWidth() + this.getHeight());
        System.out.println("O perímetro é " + perimeter);
    }

    public void diagonal() {
        double diagonal = Math.sqrt(Math.pow(this.getWidth(), 2) + Math.pow(this.getHeight(), 2));
        System.out.println("A diagonal é " + diagonal);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;

    
    }

}
