package Day11.Casting ;

class First{

}

class Second extends First{

}
public class Main {
    public static void main(String[] args) {
        First f = new First() ;
        Second s = new Second() ;
        f = s ;
        s = (Second)f ;

    }
}
