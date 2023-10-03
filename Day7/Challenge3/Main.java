package Day7.Challenge3 ;
import java.util.* ;
public class Main {
    public static void main(String args[]){
        // int arr[] = { 1,2,4,5,6,7 } ;
        int arr[] = {-8,-1,1,2,3,4,-7,-5,-6,-2,-3,0} ;
        int n = 12 ;
        /*
        for(int i = 0 ; i < 6 ; i++){
            arr[i]-= i+1 ;
        }
        for(int i = 0 ; i < 6 ; i++){
            if(arr[i]>0){
                System.out.println(i+1) ;
                break ;
            }
        }
        */


        // Using dataStructure HashSet
        /*
        HashSet<Integer>hs = new HashSet<>() ;
        int min = Integer.MAX_VALUE ;
        for( int i = 0 ; i < 12 ; i++ ){
            if(arr[i] < min){
                min = arr[i] ;
            }
            hs.add(arr[i]) ;
        }
        while(hs.contains(min+1)){
            min++ ;
        }
        System.out.println(min+1) ;
        */

        //using simple Bubble Sorting and searching
        for( int i = 0 ; i < n ; i++ ){
            for( int j = i+1 ; j < n ; j++ ){
                if(arr[j]<arr[i]){
                    int temp = arr[i] ;
                    arr[i] = arr[j] ;
                    arr[j] = temp ;
                }
            }
            if(i>0 && (arr[i]-1) != arr[i-1]){
                System.out.println(arr[i-1]+1) ;
                break ;
            }
        }








    }
}
