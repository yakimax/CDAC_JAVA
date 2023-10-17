package Day21.GenericAndNonGenerics;

// class MyGen<T>
// {
// 	T a;
// 	T b;
// 	static T c;		//error
	
// 	static void myFun(T x)	//error	
// 	{
// 	}
	
// 	static <T1> void print(T x)	//OK
// 	{
// 	} 
// }

class MyGenDemo<T> {
	T a ;
	MyGenDemo(){
		this.a = null ;
	}

	void myFun(MyGenDemo<T> obj){
		System.out.println(obj) ;
	}


}

public class MYgen {
    public static void main(String[] args) {
        MyGenDemo d = new MyGenDemo() ;
        MyGenDemo d1 = new MyGenDemo() ;
		d.myFun(10) ;
		d.myFun(d1) ;
    }
}
