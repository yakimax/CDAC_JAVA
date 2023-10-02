package Day6.Challenge1;
import java.util.* ;
public class Main {

    public void reverseArr(int arr[]){

    }
    public static void main(String[] args) {
        System.out.println() ;
        Scanner scn = new Scanner(System.in) ;
        int n = scn.nextInt() ;
        int []arr = new int[n]  ;
        for(int i = 0 ; i  < n ; i++){
            arr[i] = scn.nextInt() ;
        }
        scn.close() ;
        for(int i = 0 ; i  < n ; i++){
            for(int j = 0 ; j < n-i ; j++){
                int temp = arr[i] ;
                arr[i] = arr[i+1] ;
                arr[i+1] = temp ;
                i++ ;
            }
        }
        for(int i = 0 ; i < n ; i++){
            System.out.print(arr[i] + "  " ) ;
        }
    }
}
