package Day11.Covariant ;

// we can override methods with non-premitive data types as return type of parents class into child class
// but we cannot choose a return type which is not child of or has interited prev class .


class First{

}

class Second extends First{

}

class Third extends Second{

}


class Fourth{

}

class Demo{
    First func(){
        return new First() ;
    }
}

class Covariant extends Demo{
    Third func(){
        return new Third( ) ;
    }
}

public class Main extends Demo {
    public static void main(String[] args) { 

    }
}
