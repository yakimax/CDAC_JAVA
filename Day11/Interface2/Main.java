package Day11.Interface2 ;





// multiple inheritance in interfaces 
// necessary to implement all abstract methods in implemeted class

interface DBconnections{
    int MAXIMUM_CONNECTIONS_ALLOWED = 10 ;
    void getConnection();
    void creatConnection();
    void closeConnection();
}

interface  Utils extends DBconnections{
    void print() ;
    void backupConnections() ;
}

interface Protocols {
    void safetuGuidelines() ;
}

class First{
    void Hello(){};
    void HelloWOrld(){

    };
}
public class Main extends First implements Protocols,Utils{

    void Hello(){

    }
    public void getConnection(){

    }
    public void creatConnection(){
        
    }
    public void closeConnection(){
        
    }
    public void print(){
        
    }
    public void backupConnections(){
        
    }
    public void safetuGuidelines(){
        
    }
    public static void main(String[] args) {
        
    }
}
