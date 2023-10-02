package Day5.SoebPatterns;

public class Main {
    public static void main(String[] args) {
        for(int i = 0 ; i < 10  ; i++){
            for(int j = 0 ; j < 10 ; j++){
                if(j > i-(10/2)-1 && j < 10-j){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
