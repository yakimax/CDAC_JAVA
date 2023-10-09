package Day13.Misc ;

import java.lang.management.OperatingSystemMXBean;

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

    public static void getInfo(OperatingSystem obj){
        obj.designer() ;
    }

    public static void main(String[] args) {
        Windows os1 = new Windows() ;
        getInfo(os1) ;
        MacOs os2 = new MacOs() ;
        getInfo(os2) ;
        // MacOs m = new OperatingSystem() ;        //error 
    }
}
