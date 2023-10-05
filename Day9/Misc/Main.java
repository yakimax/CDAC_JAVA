package Day9.Misc ;
//we creat two objects on one Reference of an object

class Helper{
    int a ;
    int b ;
    Helper(){
        a = 0 ;
        b = 0 ;
    }
    Helper(int a ,int b){
        this.a = a ;
        this.b = b ;
    }
}

// class Helper2{
//     int c ;
//     int d ;    
// }

public class Main {
    public static void main(String[] args) {
        Helper h = new Helper() ;
        System.out.println(h) ;
        h = new Helper(10,20) ;
        System.out.println(h) ;

    }   
}
