// package Day20.Regex; 
import java.util.* ;

public class Main {
    public static void main(String[] args) { 
        Scanner scn = new Scanner(System.in) ;
        // String regex = "[2-7]{2}" ; 
        String regex = "5[2-7]+5" ; 
        // String regex = "[^0-9][a-z]+@(gmail.com)" ;
        String input[] = {"23","11","42","77","4","72","82","94","20","30","8","83","55","10","01","82","48","7","72","96"} ;
        for( String s : input ){
            // String s = scn.nextLine() ;
            if(s.matches(regex)){
                System.out.println("Valid");
            }else{ 
                System.out.println("IN Valid");
            }
        }
        scn.close();
    }
}
