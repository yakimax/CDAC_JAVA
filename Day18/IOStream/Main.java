import java.io.* ;

public class Main {
    public static void main(String[] args) throws IOException {
        File f1 = new File("File.txt") ;
        File f2 = new File("myFile.txt") ;
        if(f1.exists()){
            System.out.println("File name is : " + f1.getName()) ;
            try{
                FileInputStream fis = new FileInputStream(f1) ;
                FileOutputStream fos = new FileOutputStream(f2, true) ;
                int ch ;
                while((ch = fis.read()) != -1 ){
                    fos.write(ch) ;
                    System.out.print((char)ch) ;
                } 
            }
            catch(IOException e){
                System.err.println(e.getMessage()) ;
            }
        }else{
            System.out.println( "File.txt not found" ) ;
        }
        System.out.println("program end") ;
    }
}
