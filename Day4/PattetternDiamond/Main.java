package Day4.PattetternDiamond ;
import java.util.* ;
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in) ;
        int n = scn.nextInt() ;
        scn.close() ;            
        int star = 1 ;
        int space = n-1 ;
        for(int i = 0 ; i < n*2 ; i ++){
            int tempSpace = space ;
            int tempStar = star ;
            for(int j = 0 ; j < n+i ; j++){
                if(tempSpace>0){
                    System.out.print(" ") ;
                    tempSpace-- ;
                }else if(tempStar > 0){
                    System.out.print("*") ;
                    tempStar-- ;
                }
            }          
            if(i < n-1){
                space-- ;
                star+=2 ;
            }else{
                space++ ;
                star-=2 ;
            }
            System.out.println() ;
        }
    }
}
