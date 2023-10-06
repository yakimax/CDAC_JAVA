package Day10.Polymorphism;

// runtime polymorphism 

class Shape{
    void print(){
        System.out.println("Shape class") ;
    }
}

class Rectangle extends Shape{
    void print(){
        System.out.println("Rectangle class") ;
    }
}
class Circle extends Shape{
    void print(){
        System.out.println("Circle class") ;
    }
}
class Trialgle extends Shape{
    void print(){
        System.out.println("Trialgle class") ;
    }
}


public class Main {
    public static void main(String[] args) {
        Shape []shp = new Shape[3] ;
        shp[0] = new Rectangle() ;
        shp[1] = new Circle() ;
        shp[2] = new Trialgle() ;
        for( int i = 0 ; i < shp.length ; i++ ){
            shp[i].print() ;
        }
    }
}
