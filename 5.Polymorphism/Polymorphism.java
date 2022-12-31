import java.util.Scanner;


abstract class Shape{
   abstract int numberofsides();
}

class Rectangle extends Shape{
    int numberofsides(){
        return 4;
    }
}

class Triangle extends Shape{
    int numberofsides(){
        return 3;
    }
}

class Hexagon extends Shape{
    int numberofsides(){
        return 6;
    }
}


public class Polymorphism {

    public static void main(String[] args) {
         Shape sc;
        sc=new Rectangle();
        System.out.println("Rectangle:"+sc.numberofsides());
        
        sc=new Triangle();
        System.out.println("Triangle:"+sc.numberofsides());
         
        sc=new Hexagon();
        System.out.println("hexagon:"+sc.numberofsides());   
    }
    
}
