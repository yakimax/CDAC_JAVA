package Day6.Challenge2;
import java.util.*;
public class Main {

    public static void swap(int arr[],int i,int j){
        int temp = arr[j] ;
        arr[j] = arr[i] ;
        arr[i] = temp ;
    }
    
    public static void main(String[] args) {
        int arr[] = { -12, 11, -13, -5, 6, -7, 5, -3, -6} ;

        //user Input
        // Scanner scn = new Scanner(System.in) ;
        // int n = scn.nextInt() ;
        // int arr[] = new int[n] ;
        // for( int i = 0 ; i < n ; i++ ){
        //     arr[i] = scn.nextInt() ;
        // }
        // scn.close() ;


        //considering two pointers pointing to (current element) and (next negative/positve) .
        int mainPtr = 0 ;
        int j = 0 ;


        //while we exhaust all negatives or positives in the array .
        while( mainPtr < arr.length && j < arr.length ){
            if( arr[mainPtr] > 0 && arr[j] < 0){ 
                    swap(arr,mainPtr,j) ; 
            }else if(arr[mainPtr] < 0 ){
                mainPtr++ ;
                j = mainPtr ;
            }
            else if  ( arr[mainPtr] > 0 ){ 
                j++ ;
            } 
        }

        //Printing/display the resultant array .
        for( int k = 0 ; k < arr.length ; k++ ){
            System.out.print(arr[k]+ " ") ;
        }

    }
}
// -12, 11, -13, -5, 6, -7, 5, -3, -6