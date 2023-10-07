package Day11.ObjectClassMethods ;

// overRiding .equals() methods 

class First{
    int a ;
    int b ;
    public boolean equals(Object obj) {
        First f = (First)obj ;
        

        if(this.a == f.a){
            return true ;
        }else{
            return false ;
        }
    }
}



public class Main {
    public static void main(String[] args) {
        First f1 = new First() ;
        First f2 = new First() ;
        if(f1.equals(f2)){
            System.out.println("Equal") ;
        }else{
            System.out.println("UnEqual") ;
        }
    }
}
