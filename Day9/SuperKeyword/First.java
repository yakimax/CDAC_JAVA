package Day9.SuperKeyword ;

public class First {
    int a ;
    First(){
        System.out.println("First Zero constructor called :");
        this.a = 1 ;
    }
    First(int a){
        System.out.println("First one constructor called :");
        this.a = a ;
    }
    public void fun(){
        System.out.println("First Fun() a ="+ a) ;
    }
}
