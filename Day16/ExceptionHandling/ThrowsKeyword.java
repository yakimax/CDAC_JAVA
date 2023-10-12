package Day16.ExceptionHandling ;

import java.io.IOException;

public class ThrowsKeyword {

    static int myFun() throws ArithmeticException {
        int a = 0 ;
        int b = 10 ;
        return b/a ;
    }
    public static void main(String[] args) {
        try{
            myFun() ;
        }catch(ArithmeticException ae){
            System.err.println(ae) ;
        }
    }
}
