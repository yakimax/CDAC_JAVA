package Day5.Pattern8 ;
import java.util.* ;
public class Main {
        public static void main(String[] args) {
        Scanner scn = new Scanner(System.in) ;
        int n = scn.nextInt() ;
        int star = 1 ;
        scn.close();
        for( int i = 0 ; i < n*2-1 ; i++ ){
            int tempStar = star ;
            for(int j = 0 ; j < n ; j++){ 
                if(tempStar > 0){
                    System.out.print("*") ;
                    tempStar-- ;
                }
            }
            if( i < (n/2)-1 ){
                star++ ;
            }else{
                star-- ;
            }                    
            System.out.println() ;
        }
    }
}
