package Day19.Threading ;

class ThreadDemo extends Thread {
    // String s ;
    ThreadDemo( String s ) {
        super(s) ;
    }
    public void run() { 
        System.out.println(this.getName() + "is executing" ) ;
        System.out.println(this.getName() + "is Terminated" ) ;
    }
}


public class Main {
    public static void main(String[] args) {
        ThreadDemo t1 = new ThreadDemo("Demo1") ;
        ThreadDemo t2 = new ThreadDemo("Demo2") ;
        ThreadDemo t3 = new ThreadDemo("Demo3") ;
        t1.start() ;
        t2.start() ;
        t3.start() ;
    }
}
