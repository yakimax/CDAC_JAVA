package Day8;
import Day8.package1.* ;
import Day8.package1.subPackage.* ;
import Day8.package2.Package2 ;
import Day8.package2.subpackage.* ;

public class Main {
    public static void main(String args[]){
        First f = new First() ;
        f.fun() ;
        SubFirst s = new SubFirst();
        s.fun() ;
        Package2 p = new Package2() ;
        p.fun() ;
        SubPackage2 sb = new SubPackage2();
        sb.fun() ;
    }
}
