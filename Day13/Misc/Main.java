package Day13.Misc ;

class OperatingSystem{
    void designer(){
        System.out.println("Hey i was designed by general  motors") ;
    }
    void getInfo(OperatingSystem obj){
        obj.designer() ;
    }
}

class MacOs extends OperatingSystem{
    void designer(){
        System.out.println("Hey i was  designed by Apple") ;
    }
}

class Windows extends OperatingSystem{
    void designer(){
        System.out.println("Hey i was  designed by Microsoft") ;
    }
}


public class Main {


    public static void main(String[] args) {
        OperatingSystem os = new Windows() ;
        os.getInfo(os) ;
        os = new MacOs() ;
        os.getInfo(os) ;
    }
}
