

public class Example1{
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread1 t2 = new Thread1();
        Thread1 t3 = new Thread1();
        try{ 
        t1.start() ;
        // t1.join() ;
        t2.start() ;
        // t2.join() ;
        t3.start() ;
        // t3.join() ;
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}


class Thread1 extends Thread {
    public void run(){ 
        for(int i = 0 ; i < 5 ; i++)
        {
            try{    
                Thread.sleep(1000) ;
                System.out.println(i) ;
            }catch ( Exception e ) {
                e.printStackTrace() ;
            }
        }
        System.out.println("Hello world "+ currentThread() ) ;
    }
}
