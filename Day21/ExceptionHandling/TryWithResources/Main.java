package Day21.ExceptionHandling.TryWithResources ;

import java.io.* ;

class Excp {
    
}

public class Main {
    public static void main(String[] args) { 
        int a = 1/0 ;
        try{
        // try( FileReader f1 = new FileReader("File.txt") ; PrintWriter p1 = new PrintWriter("File.txt") ) {
        //     System.out.println("Hello") ;
        // }
        }catch(Exception e){
            System.out.println(e.getMessage()) ;
        }
    }
}
