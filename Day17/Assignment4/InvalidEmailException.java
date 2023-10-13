package Day17.Assignment4 ;
import java.util.* ; 



public class InvalidEmailException extends Exception {
    String email ;
    InvalidEmailException(){

    }
    InvalidEmailException(String email){
        this.email = email ;
    }
    public String getMessage(){
        return " \nPlease use proper email naming convention \nYour provided email does not contain '@' user seperator " ;
    }
    public boolean checkEmail(String email){
    boolean flag = false ;
        for( int i = 0 ; i < email.length() ; i++ ){
            char c = email.charAt(i) ;
            if(c == '@'){
                flag = true ;
            }
        }
        return flag ;
    }
}
