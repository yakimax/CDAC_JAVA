package Day18.IOStream ;
import java.io.* ;

public class Main {
    public static void main(String[] args) {
        File f1 = new File("File.txt") ;
        if(f1.exists()){
            System.out.println("File name is : " + f1.getName()) ;
        }else{
            System.out.println( "File1.txt not found" ) ;
        }
        try{
            FileInputStream s = new FileInputStream(f1) ;
            int ch ;
            while((ch = (char)s.read()) != -1 ){
                System.out.println(ch) ;
            }
        }
        catch(IOException e){
            System.err.println(e) ;
        }
        System.out.println("program run end") ;
    }
}
