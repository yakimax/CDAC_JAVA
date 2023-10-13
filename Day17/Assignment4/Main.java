package Day17.Assignment4 ;
import java.util.* ; 

public class Main{

    public static void check(String str) throws InvalidEmailException {
        InvalidEmailException exc = new InvalidEmailException() ;
        boolean bool = exc.checkEmail(str) ;
        if(!bool){
            throw exc ;
        }
    }
        public static void main(String[] args) {
        Scanner scn = new Scanner(System.in) ;
        String str = scn.next() ;
        try{
            check(str) ;
            System.out.println("Your email is : " + str) ;
        }catch(InvalidEmailException e){
            System.err.println(e) ;
        }
    }
}