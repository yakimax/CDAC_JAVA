package Day12.Casting.Downcasting ;

// in Downcasting we try to achieve type casting of parent type object to child class object .
// we can achieve it as follows :
// Parent p = new Child() ;
// Child c = (parent)p ;
// c.a ;                    //parent class data members Accessible
// c.b ;                    //parent class data members Accessible
// c.c ;                    //child class data members Also Accessible
// both child class members are available to downcasted reference
// it is nessacary to uncast if you wan to achive downcasting
// without specifying(Child) compile will give you ClassCastError



class First{
    int a ;
    int b ;
    void print(){
        System.out.println("First");
    }
}

class Second extends First{
    int c ;
    void print(){
        System.out.println("Second");
    }
    void displayRecords(){
        System.out.println("Display Second");
    }
}

public class Main{
    public static void main(String[] args) {
        First f = new Second() ;
        Second s = (Second)f ;
        System.out.println(s.a) ;
        System.out.println(s.b) ;
        System.out.println(s.c) ;
        s.print();
        s.displayRecords();
    }
}