 package Day11.Covariant ;



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
    Second func(){
        return new Second( ) ;
    }
}

public class Main extends Demo {
    public static void main(String[] args) { 

    }
}
