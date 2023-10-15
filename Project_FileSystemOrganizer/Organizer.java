package Project_FileSystemOrganizer ;
import java.io.* ;
class FileHandler{
    void checkPath(String s) throws InvalidClassException,IOException {
        File f1 = new File(s) ;
        if(f1.exists()){
            
        }else{

        }
    }
}

class InvalidDirectoryPath extends Exception{ 
    
    public String toString( String s ){
        return "" ;
    }
}



public class Organizer {
    public static void main(String[] args) {
        
    }
}
