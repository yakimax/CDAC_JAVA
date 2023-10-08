package Day12.Casting.Upcasting ;

// Upcasting 
// Upcasting is the process of type casting Child class object to parent class Object 
// we acn achieve upcasting as follow :
// Parent p = new Child() ;
//          or
// Parent p = new parent() ;
// Child c = new Child() ;
// p = c ;
// p.a                  // Accessible
// p.b                  // Accessible 
// p.c                  // Not Accessible (parent cannot access child class members)
// even after upcasting parent class cannot access child class members 


class First{
    int a ;
    int b ;
}


class Second extends First{
    int c ;
}



public class Main {
    public static void main(String[] args) {
        First f = new Second() ;
        System.out.println(f.a) ;
        System.out.println(f.b) ;
    }
}
