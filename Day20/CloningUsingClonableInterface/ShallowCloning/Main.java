package Day20.CloningUsingClonableInterface.ShallowCloning; 


class First{
    int a ;
    First() {
        this.a = 0 ;
    }
    First(int a) {
        this.a = a ;
    }
}



class DemoShallowCloning implements Cloneable{
    int b ; 
    First f ;
    DemoShallowCloning(int b ,First f){
        this.b = b ;
        this.f = f ; 
    }
    

}


public class Main {
    public static void main(String[] args) {
        
    }
}
