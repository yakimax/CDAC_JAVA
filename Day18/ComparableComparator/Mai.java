package Day18.ComparableComparator ;

import java.util.* ;

class Pair <K,V> implements Comparable{
    K s ;
    V i ;
    Pair(K s,V i){
        this.s = s ;
        this.i = i ;
    }
    public int compareTo(Object other){
        Pair<K,V> p = (Pair<K,V>) other ;
        return this.s - p.s ;
    }
}



public class Mai {
    static void display( List<Pair<String,Integer>> al){ 
        for( Pair<String,Integer> p : al ) {
            System.out.println(p.s + " " + p.i) ;
        }
    }
    public static void main(String[] args) {
        List<Pair<String ,Integer>>list = new ArrayList<>() ; 
        list.add(new Pair("Raju",2) ) ;
        list.add(new Pair("kaju",5) ) ;
        list.add(new Pair("daju",4) ) ;
        list.add(new Pair("iju",6) ) ;
        list.add(new Pair("biju",1) ) ;
        Collection.sort(list) ;
        display(list);
     }
}
