package Day15.ExceptionHandling;

public class StackTrace {
    static void fun(){
        int result = myFun() ;
    }
    static int myFun(){
        int a = 10 ;
        return a/0 ;
    }
    public static void main(String[] args) {
        try{
            fun() ;
        }catch(Exception e){
            e.printStackTrace();
            System.out.println(e.getMessage()) ;
        }finally{
            System.out.println("finally successully executed");
        }
    }
}
