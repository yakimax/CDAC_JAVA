package Day21.JavaExamSolutions2;


import java.io.* ;
import java.util.* ;
import java.text.* ;
import java.math.* ;
import java.util.regex.* ;

class NegativeAmountException extends Exception{
    public String getMessage() {
        return "Withdrawal amout less than 0" ;
    }
    public String toString(){
        return "NegativeAmountException " + getMessage() ;
    }
}


class AccountNotFoundException extends Exception{
    
    public String getMessage(){
        return "Account Not Found" ;
    }
    public String toString(){
        return "AccountNotFoundException " + getMessage() ;
    }
}

class Bank{
    private ArrayList<Account> acc ;
    Bank(){
        this.acc = new ArrayList<Account>() ;
    }
    public void setAccount(ArrayList<Account> acc){
        this.acc = acc ;
    }
    private int searchAcc(int num) throws AccountNotFoundException
    {
        int index ;
        for(int i = 0 ; i < acc.size( ) ; i++){
            if(acc.get(i).accountNumber == num){
                return i ;
            }
        }
        throw new AccountNotFoundException() ;
    }
    void transfer( int fromAccount , int toAccount , double amount ) throws AccountNotFoundException ,NegativeAmountException {
       try{
           int indexFrom = searchAcc(fromAccount) ;
           int indexTo = searchAcc(toAccount) ;
           if(amount<0){
               throw new NegativeAmountException() ;
           }
           else if((acc.get(indexFrom).balance-amount)>0){
                acc.get(indexFrom).withdrawal(amount);
                acc.get(indexTo).deposite(amount) ;
           }else{
                 System.out.println("Insufficient Balance") ;
           }
       }catch( AccountNotFoundException e) {
           throw new AccountNotFoundException() ;
       }catch( NegativeAmountException e){
           throw new NegativeAmountException() ;
       }
       
    }
}

class Account{
    int accountNumber ;
    String accountHolder ;
    double balance ;
    Account( int accountNumber , String accountHolder , int balance ){
        this.accountNumber = accountNumber ;
        this.accountHolder = accountHolder ;
        this.balance = balance ;
    }
    void deposite(double amount){
        this.balance = this.balance + amount ;
    }
    void withdrawal(double amount) throws NegativeAmountException{
        if(amount<0){
            throw new NegativeAmountException() ;
        }
        this.balance = this.balance - amount ;
    }
    double getbalance(){
        return this.balance ;
    }
}

public class Solution {
    public static void display(ArrayList<Account>acc){
        for(Account a : acc){
            System.out.print(a.accountNumber + " -> " + a.accountHolder + " -> " +  a.balance + "\n");
        } 
    }
    public static void main (String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner scn = new Scanner(System.in) ;
        int n = scn.nextInt() ;
        ArrayList<Account>account = new ArrayList<>() ;
        for(int i = 0 ; i < n ; i++){
            int num = scn.nextInt() ;
            scn.nextLine();
            String s = scn.nextLine() ;
            int accp = scn.nextInt() ;
            Account ac = new Account(num,s,accp) ;
             account.add(ac) ;
        }  
        Bank bank = new Bank() ; 
        bank.setAccount(account);
        display(account);
        bank.transfer(3, 1, 3000) ;
        display(account);
// 4
// 1
// ramesh
// 1000
// 2
// suresh
// 2000
// 3
// dharmesh
// 3000
// 4
// raju
// 4000
    }
}
