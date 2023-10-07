package Day10.Binding ;

//  Topic - Dynamic and Static Binding

class First{
    int first ;
}

class Second extends First{
    int Second ;
}


public class Main {
    public static void main(String[] args) {
        First f = new Second() ;
        // System.out.println(f.second) ;
    }
}
