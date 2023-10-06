package Day10.Casting ;

class First{
    int data ;
    void print(){                                               //overRidden function
        System.out.print("Inside First Class") ;
    }
}

class Second extends First{
    int val ;
    void print(){                                               //override print function
        System.out.print("Inside Second Class") ;
    }
}

public class Main {
    public static void main(String[] args) {
        First f = new Second() ;
        f.print() ; 
    }
}
