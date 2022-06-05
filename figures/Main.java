package homework.figures;

import java.util.Arrays;



public class Main {
    public static void main(String[] args) {

        Rectangle r1= new Rectangle(7,3);
        System.out.println(r1.getArea());

        Figure f1= new Figure();
        System.out.println(f1.getArea());

        System.out.println(r1 instanceof Figure);
        System.out.println(f1 instanceof Figure);
        System.out.println(f1 instanceof Rectangle);
        System.out.println(r1 instanceof Object);

        System.out.println(r1.getArea(5,15));

    }



}


