package Day21.GenericAndNonGenerics  ;

class Demo<T,K>{
    T a ;
    K b ;
    Demo( ) {
        this.a = null ; 
        this.b = null ;
    }
    Demo( T a, K b ) {
        this.a = a ;
        this.b = b ;
    }
    T getA(){
        return this.a ;
    }
    K getB(){
        return this.b ;
    }
}
/* 
class Demo<T>{
    T a ;
    T b ;
    Demo( ) {
        this.a = null ; 
        this.b = null ;
    }
    Demo( T a, T b ) {
        this.a = a ;
        this.b = b ;
    }
    T getA(){
        return this.a ;
    }
    T getB(){
        return this.b ;
    }
}
*/

public class Generic {
    public static void main(String[] args) {
        // Demo <Integer> d = new Demo<>(10) ;
        Demo <Double,Integer> d = new Demo<>(10.2,20) ;
        System.out.println( d.getA() ) ;
        System.out.println( d.getB() ) ;

    }
}
