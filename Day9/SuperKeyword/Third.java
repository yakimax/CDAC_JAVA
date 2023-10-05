package Day9.SuperKeyword ;
import Day9.SuperKeyword.* ;

public class Third extends Second{
    int c ;
    Third(){
        super() ;
        System.out.println("Third Zero constructor called :") ;
        this.c = 2 ;
    }
    Third(int c){
        super(1) ;
        System.out.println("Third one constructor called :") ;
        this.c = c ;
        this.a = c ;
        this.b = c ;
    }
    public void fun() {
        System.out.println("Third Fun() c = " + c + " " + a + " " + b) ;
        super.fun() ;
    }
    public void print(){
        System.out.println("Inside print fun Third class") ;
        super.print();
    }
}
