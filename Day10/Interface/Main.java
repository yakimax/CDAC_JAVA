package Day10.Interface;

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
