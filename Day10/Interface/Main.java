package Day10.Interface;

// interfaces defines what to do .
// by default all data members in interface are public static final . 
// by default all methods in interface are public abstract .

interface DBCOnnections{
    int data = 10  ;
    void print() ;
}

class Connection{
    public void print(){
        System.out.println("Connections") ;
    }
}

public class Main {
    public static void main(String[] args) {
        Connection c = new Connection() ;
        c.print() ;
    }
}
