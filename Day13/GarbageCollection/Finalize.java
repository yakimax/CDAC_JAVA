package Day13.GarbageCollection;
// package Day13.GarbageCollection ;


class First {
    int a = 0;

    First() {
    }

    First(int a) {
        this.a = a;
    }

    // public void finalize() {
    //     System.out.println("Finalize called for: " + this.a);
    // }
}



public class Finalize {
    public static void main(String[] args) {
        First f1 = new First(1) ;
        First f2 = new First(2) ;
        First f3 = new First(3) ;
        System.out.println(f1.a );
        Runtime.getRuntime().gc() ;
        System.out.println(f1.a );
    }
}
