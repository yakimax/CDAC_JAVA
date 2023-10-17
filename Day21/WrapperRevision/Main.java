package Day21.WrapperRevision;

/*

Methods to remember
-----------------------true
Integer.parseInt(str)		//String to primitive int

Integer.valueOf(str)		//String to wrapper object
new Integer(str)		//String to Wrapper object

iobj.intValue();		//Wrapper to primitive

iobj.toString();		//Wrapper to String object

new Integer(25)			//primitive to Wrapper object

iobj -> object of Integer wrapper class
str -> object of String class

*/

public class Main { 
    public static void main ( String[] args ) { 
        Integer obj = new Integer(100) ;
        Integer obj1 = 100 ;
        Integer obj2 = 200 ;
        System.out.println(obj);
        System.out.println(obj1);
        System.out.println(obj2);
    }
}
