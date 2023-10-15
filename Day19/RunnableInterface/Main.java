package Day19.RunnableInterface ;


class MyThread implements Runnable {
    Thread t ;
    MyThread() {
        t = new Thread(this) ;
        t.start() ;
    }
    public void run() {
        System.out.println("Hello Thread") ;
    }
}

public class Main {
    public static void main(String[] args) {
        MyThread mt1 = new MyThread() ;
        MyThread mt3 = new MyThread() ;
        MyThread mt2 = new MyThread() ;
        try {
            mt1.t.join() ;
        } catch (InterruptedException e) {
            System.out.println(e.getMessage()) ;
        }
    }    
}
