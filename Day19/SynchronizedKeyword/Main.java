package Day19.SynchronizedKeyword ;


// synchronized methods and 
// synchronized block
// synchronized( common object for locking ){

// }
// sunchronized void fun(){}


class PrintString{

    synchronized void print( String s )  {                  //try removing synchronized keyword
        try {
            System.out.print( "[" ) ;
            Thread.sleep(2000);
            System.out.print( s ) ;
            Thread.sleep(2000);
            System.out.print( "]" ) ;
        } catch (Exception e) {
            System.out.println(e.getMessage()) ;
        }
    }

}

class MyThread implements Runnable{
    Thread t ;
    PrintString ps ;
    String str ;
    MyThread(String str,PrintString ps){
        this.str = str ;
        this.ps = ps ;
        t = new Thread(this) ;
        t.start();
    }
    public void run(){
        // synchronized(ps){                              //Synchronized block 
        //     this.ps.print(str);
        // }
        this.ps.print(str);
    }
}



public class Main {
      static public void   fun(){

    }
    public static void main(String[] args) {
        PrintString p = new PrintString() ;
        MyThread m1 = new MyThread("array",p) ;
        MyThread m2 = new MyThread("arjun",p) ;
        MyThread m3 = new MyThread("pandya",p) ;
    }
}
