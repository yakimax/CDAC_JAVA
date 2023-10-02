package Day3.PAttern4 ;
import java.util.* ;
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int space = 0 ;
        scn.close() ;
        for(int i = 0 ; i < n; i++){
            for(int j = 1 ; j <= n ; j++){
                if(j<=space){
                    System.out.print(" ") ;
                }else{
                    System.out.print("*") ;
                }
            }
            space++ ;
            System.out.println();
        }
    }
}
