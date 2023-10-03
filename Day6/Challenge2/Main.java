package Day6.Challenge2;
import java.util.*;
public class Main {

    public static void swap(int arr[],int i,int j){
        int temp = arr[j] ;
        arr[j] = arr[i] ;
        arr[i] = temp ;
    }
    
    public static void main(String[] args) {
        // int arr[] = { -5, -2, 5, 2, 4, 7, 1, 8, 0, -8 } ;

        //user Input
        Scanner scn = new Scanner(System.in) ;
        int n = scn.nextInt() ;
        int arr[] = new int[n] ;
        for( int i = 0 ; i < n ; i++ ){
            arr[i] = scn.nextInt() ;
        }
        scn.close() ;


        //considering two pointers pointing to (current element) and (next negative/positve) .
        int mainPtr = 0 ;
        int j = 0 ;


        //while we exhaust all negatives or positives in the array .
        while( mainPtr < arr.length && j < arr.length ){
            if(mainPtr%2 == 0 && arr[mainPtr] < 0 || mainPtr%2 != 0 && arr[mainPtr] > 0){
                mainPtr++ ;
                j = mainPtr ;
            }
            else if (mainPtr%2 == 0 && arr[mainPtr] > 0 ){
                if( arr[j] < 0 ){
                    swap(arr,mainPtr,j) ;
                }else{
                    j++ ;
                }
            }else if(mainPtr%2 != 0 && arr[mainPtr] < 0){
                if(arr[j] > 0){
                    swap(arr,mainPtr,j) ;
                }else{
                    j++ ;
                }
            }
        }

        //Printing/display the resultant array .
        for( int k = 0 ; k < arr.length ; k++ ){
            System.out.print(arr[k]+ " ") ;
        }

    }
}
