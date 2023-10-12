package Day15.StringMethods;

import java.util.zip.CRC32;

class Main1 {
    public static void main(String[] args) {
        String str1 = "Hello world" ;
        char [] ch = new char[5] ;
        str1.getChars(0, 5, ch, 0);
        System.out.println(ch) ;
    }
}
public class Main {
    public static void main(String[] args) {
        String str1 = "Hello world" ;
        char [] ch = new char[5] ;
        str1.getChars(0, 5, ch, 0);
        System.out.println("get char : " +ch) ;
    }
}
