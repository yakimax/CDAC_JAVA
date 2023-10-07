package Day10.AbstractDemo;

abstract class Shape{
    double area ;
    abstract void area() ;                      //abstract method -------> abstract methods cannot be defined 
    void print(){                               //concrete method
        System.out.println(area) ;
    }
}

class Rectangle extends Shape{
    int l = 10 ;
    int b = 20 ;
    void area(){
        area = l*b ;
    }
}

class Circle extends Shape{
    int r = 5 ;
    void area(){
        area = (22/7) * r * r ;
    }
}

public class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle() ;
        r.area();
        r.print();
        Circle c = new Circle() ;
        c.area() ;
        c.print() ;
    }
}
