// Shows the different type of method overloading!
class OverloadDemo{
	void test(){
		System.out.println("No Parameters!");
	}

	// overload test for one integer parameter
	void test(int a){
		System.out.println("a : " + a);
	}

	// overload test for two integer parameter
	void test(int a, int b){
		System.out.println("a and b : " + a + " " + b);
	}

	// overload test for a double parameter
	double test(double a){
		System.out.println("double a : " + a);
		return a * a;
	} 
}

class Overload{
	public static void main(String args[]){
		OverloadDemo od = new OverloadDemo();
		double result;

		od.test();
		od.test(2);
		od.test(1,2);
		result = od.test(1.5);
		System.out.println("Result of od.test(1.5) : " + result);
	}	
}