// package Day11.Casting ;

class First{
    void myFun(){
        System.out.println("First myFun" ) ;
    }
}

class Second extends First {
    void anotherFun(){
        System.out.println("Second antherFun" ) ;
    }
}

public class Main {
    public static void main(String[] args) {
        First f = new First() ;
        Second s = new Second() ;
        f = s ;
        // s = (Second)f ;
        ((Second)f).anotherFun() ;
        // s.myFun() ;
        
        System.out.println("Working successfully" ) ;
    }
    
}