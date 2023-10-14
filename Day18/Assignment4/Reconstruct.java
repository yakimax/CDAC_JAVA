package Day18.Assignment4 ;
import java.util.* ;


public class Reconstruct {

    public static String removeVowels ( String str ) {
        StringBuilder sb = new StringBuilder() ;
        for ( int i = 0 ; i < str.length() ; i++ ) {
            char ch = str.charAt(i) ;
            if( !(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') ){ 
                sb.append(ch) ;
            }
        }
        return sb.toString() ;
    }


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in) ;
        String sentence = scn.nextLine() ;
        String arr[] =  sentence.split(" ") ;
        for(int i = 0 ; i < arr.length ; i++ ){
            arr[i] = removeVowels(arr[i]) ;
        }
        for(String s : arr){
            System.out.print(s + "  ") ;
        }
    }
}
