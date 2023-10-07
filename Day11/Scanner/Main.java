
package Day11.Scanner;
import java.util.* ;

// if you use scn.next() then use scn.nextLine()  method of scanner class to clear the buffer
// as scn.next() does not clear the buffer on leaving
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in) ;
        String str = scn.nextLine() ;
        scn.nextLine() ;
        String sentence = scn.nextLine() ;
        String sen = scn.nextLine() ;
        int n = scn.nextInt() ; 
        System.out.println(str) ;
        System.out.println(sentence) ;
        System.out.println(n) ;
        System.out.println(sen) ;
        scn.close() ;
    }
}