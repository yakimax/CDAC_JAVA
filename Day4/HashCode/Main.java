package Day4.HashCode ;
// import java.util.* ;
public class Main {
    class Inner{
        int n = 10 ;
        Inner(){
            this.n = 10 ;
        }
    }
    public static void main(String[] args) {
        Main.Inner i = new Main().new Inner() ;
        System.out.println(i.hashCode()) ;
    }
}
