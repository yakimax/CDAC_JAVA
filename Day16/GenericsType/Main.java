package Day16.GenericsType; 

class GenericDemo<T>{
    T a ;
    T b ;
    GenericDemo(){
        
    }
    GenericDemo(T a,T b ){
        this.a = a ;
        this.b = b ;
    }
    T getA(){
        return a ;
    }
}

class First{
    public String toString(){
        return "Your object reference is : "+ this.getClass().getSimpleName() + " @ " +this.hashCode() ;
    }
} 

public class Main {
    public static void main(String[] args) {
        GenericDemo<Integer> val = new GenericDemo(1,2) ;
        System.out.println(val.getA()) ;
        GenericDemo<Double> val1 = new GenericDemo(1.10,2.4) ;
        System.out.println(val1.getA()) ;
        GenericDemo<Integer> val2 = new GenericDemo(new First(),new First()) ;
        System.out.println(val2.getA()) ;
    }
}
