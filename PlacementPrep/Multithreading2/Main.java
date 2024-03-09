package Adform.Multithreading2 ;

class Temp extends Thread {
    public void run() {
        stop();
        System.out.println(getName()) ;
    }
}


public class Main {
    public static void main( String[] args ) {
        Temp t1 = new Temp() ;
        Temp t2 = new Temp() ;
        t1.start() ;
        t2.start() ;

    }
}
