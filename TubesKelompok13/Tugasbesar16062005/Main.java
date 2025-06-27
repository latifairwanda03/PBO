/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugasbesar16062005;

/**
 *
 * @author Lenovo
 */
public class Main {
    public static void main(String[] args) {
        Shape s1 = new Circle(5.5, "RED", false); // Upcast Circle to Shape
        System.out.println(s1);
        System.out.println(s1.getArea());
        System.out.println(s1.getPerimeter());
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
        System.out.println(((Circle)s1).getRadius()); // ✅ Solusi

        Circle c1 = (Circle)s1; // Downcast back to Circle
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());

        // Shape s2 = new Shape(); ❌ Dihapus karena abstract

        Shape s3 = new Rectangle(1.0, 2.0, "RED", false); // Upcast
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());
        System.out.println(((Rectangle)s3).getLength()); // ✅ Solusi

        Rectangle r1 = (Rectangle)s3; // Downcast
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());

        Shape s4 = new Square(6.6); // Upcast
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());
        System.out.println(((Square)s4).getSide()); // ✅ Solusi

        Rectangle r2 = (Rectangle)s4; // Downcast to Rectangle
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
        System.out.println(((Square)r2).getSide()); // ✅ Solusi
        System.out.println(r2.getLength());

        Square sq1 = (Square)r2; // Downcast to Square
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());
    }
}
