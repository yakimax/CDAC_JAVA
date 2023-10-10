package Day14.ExceptionHandling ;

public class Main {
    public static void main(String[] args) {
        int result = 0 ;
        int a = 10 ;
        int b = 0 ;
        try{
            result = a/b ;
        }catch( ArithmeticException ae ){
            System.err.println(ae) ;
        }
        System.out.println(result) ;
    }
}
