import java.lang.* ;

class Add<T  > {
    T a ;
    T b ;
    Add(T a,T b) {
        this.a = a ;
        this.b = b ;
    }
    public T add() {
        return (a.intValue() + b.intValue()) ;
    }
}

public class Main { 
    public static void main ( String[] args ) {
        Add<Integer> a = new Add<>(1,2) ; 
        System.out.print(a.add()) ;
        
    }
}