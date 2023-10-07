 package Day11.Covariant;

import Day9.SuperKeyword.Third;

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
    Fourth func(){
        return new Fourth( ) ;
    }
}

public class Main extends Demo {
    public static void main(String[] args) { 

    }
}
