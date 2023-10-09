package Day13.ObjectisolationIsland;


class First{
    int a ;
    Second s ;
}

class Second{
    int x ;
    First f ;
}


public class Main {
    public static void main(String[] args) {
        First f1 = new First() ;
        Second s1 = new Second() ;
        f1.s = s1 ;
        s1.f = f1 ;
        f1 = new First() ;
        s1 = new Second() ;
        // f1 and s1 are not assign new object references 
        // older references are now lost 
        // this condition in which refrence of two objects are shared between them but 
        // actuall no one holds their reference in program this condition is called 
        // Object isolation Isaland
    }
}
