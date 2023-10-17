package Day21.GenericAndNonGenerics  ;

class GenericMethodsDemo{
    public <T> T methd(T a) {
        return a ;
    }


                // OR


    public  <T> void metd2( T b) {
        System.out.println(b) ;
    }  


                // OR


    static <T> void print(T c){    
        System.out.println(c) ;
    }
}




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
        // Generic class
        // Demo <Integer> d = new Demo<>(10) ;
        Demo <Double,Integer> d = new Demo<>(10.2,20) ;
        System.out.println( d.getA() ) ;
        System.out.println( d.getB() ) ;
         

        // Generic methods
        GenericMethodsDemo g1 = new GenericMethodsDemo( ) ;
        int a = g1.methd(10) ;
        System.out.println(a);
        g1.metd2(40.666) ;
        g1.print(30) ;
    }
}
