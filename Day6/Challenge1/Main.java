package Day6.Challenge1;
import java.util.* ;
public class Main {
    public static void main(String[] args) {
        System.out.println() ;
        Scanner scn = new Scanner(System.in) ;
        int n = scn.nextInt() ;
        int []arr = new int[n]  ;
        for(int i = 0 ; i  < n ; i++){
            arr[i] = scn.nextInt() ;
        }
        scn.close();
        int i = 0 ;
        int j = arr.length-1 ;
        while(i<j){
            int temp = arr[i] ;
            arr[i++] = arr[j] ;
            arr[j--] = temp ;
        }
        for( i = 0 ; i < n ; i++){
            System.out.print(arr[i] + "  ," ) ;
        }
    }
}
