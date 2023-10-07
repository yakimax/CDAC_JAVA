package MotherObjectClass;

class First{
    int a ;
    int b ;
}

class Second{
    int a ;
}

public class EqualsMethod {
    public static void main(String[] args) {
        First f1 = new First() ;
        First f2 = new First() ;
        boolean b = f1.equals(f2) ;
        System.out.println(b) ;
    }
}
