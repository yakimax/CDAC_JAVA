package Day15.ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 10 ;
        int b = 0 ;
        int result = 0 ;
        try{
            result = a/b ;
        }catch(Exception e){
            System.err.println(e) ;
        }
        finally{
            System.out.println("finally block executed") ;
        }
    }
}
