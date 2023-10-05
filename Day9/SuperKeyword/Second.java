package Day9.SuperKeyword;
import Day9.SuperKeyword.* ;
public class Second extends First{
    int b ;
    Second(){        
        System.out.println("Second Zero constructor called :");
        this.b = 3 ;
    }
    Second(int b){
        super() ;
        System.out.println("Second one constructor called :");
        this.b = b ;   
    }
    public void fun() {
        System.out.println("Second Fun() b =" + " " + a + " " + b) ;
        super.fun() ;
    }
}
