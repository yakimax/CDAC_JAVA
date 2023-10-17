package Day21.GenericAndNonGenerics ;




class DemoNonGen{
    Object obj ;
    DemoNonGen() {
        this.obj = null ;
    }
    DemoNonGen(Object obj) {
        this.obj = obj ;
    }
    Object getObj(){
        return this.obj ;
    }
}

class First {

}
 

public class NonGeneric {
    public static void main(String[] args) { 
        DemoNonGen d = new DemoNonGen(10) ;         // passing int val = 10 by autoboxing to Integer .
        int i = (Integer)d.getObj() ;       // achieving polymorphism and autoUnBoxing at the same time .
        System.out.println(i) ;                
    }
}
