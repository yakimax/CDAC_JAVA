package Day6.Challenge2;

public class Main {
    public static void main(String[] args) {
        int arr[] = { -5, -2, 5, 2, 4, 7, 1, 8, 0, -8 };
        int mainPtr = 0 ;
        int j = 0 ;
        while( mainPtr < arr.length && j < arr.length ){
            if(mainPtr%2 == 0 && arr[mainPtr] < 0 || mainPtr%2 != 0 && arr[mainPtr] > 0){
                mainPtr++ ;
                j = mainPtr ;
            }else if (mainPtr%2 == 0 && arr[mainPtr] < 0 ){
                mainPtr++ ;
            }else if(){
                
            }
        }
    }
}
