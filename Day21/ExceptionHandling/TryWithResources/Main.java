package Day21.ExceptionHandling.TryWithResources ;

import java.io.* ;

 // In try-with-resources we can create object of those class only which implelemnts auto-closable

 // This is the special case that with i.e try-with-resources we can write try without catch or finally block .
 // However if we wnat we can add catch and finally block here .

class Excp {
    static void  methd() throws IOException{
        return ;
    }
}

public class Main {
    public static void main(String[] args) {  
        // try{
        //     Excp.methd() ;                         // this gives compilation error 
        // } 
 




        // try( FileReader f1 = new FileReader("File.txt") ; PrintWriter p1 = new PrintWriter("File.txt") ) {
        //     System.out.println("Hello") ;
        // }                                             // this compiles successfull but give runtime unhandled exception 
        





        try {
            try( FileReader f1 = new FileReader("File.txt") ; PrintWriter p1 = new PrintWriter("File.txt") ) {
                System.out.println("Hello") ;
            }                                         // only way to write try block without catch block
        } catch (Exception e) {
            System.err.println(e.getMessage()) ;
        }
     
        

    }
}
