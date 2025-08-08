// Using static members directly
class StaticDemo{
	static int a = 40;
	static int b = 30;

	static void callme(){
		System.out.println("a : " + a);
	}
}

class StaticByName{
	public static void main(String args[]){
		// You can use static member as : classname.staticmember;
		StaticDemo.callme();
		System.out.println("b : " + StaticDemo.b);
	}
}