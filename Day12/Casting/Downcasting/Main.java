package Day12.Casting.Downcasting ;

// in Downcasting we try to achieve type casting of parent type object to child class object .
// we can achieve it as follows :
// Parent p = new Child() ;
// Child c = (parent)p ;
// c.a ;                    //parent class data members Accessible
// c.b ;                    //parent class data members Accessible
// c.c ;                    //child class data members Also Accessible
// both child class members are available to downcasted reference



class First{
    int a ;
    int b ;
}

class Second extends First{
    int c ;
}

public class Main{
    public static void main(String[] args) {
        First f = new Second() ;
        Second s = (Second)f ;
        System.out.println(s.a) ;
        System.out.println(s.b) ;
        System.out.println(s.c) ;
    }
}