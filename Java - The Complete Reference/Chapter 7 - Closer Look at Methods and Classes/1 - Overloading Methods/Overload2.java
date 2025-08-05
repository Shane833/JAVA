// Shows the different type of method overloading!
class OverloadDemo{
	void test(){
		System.out.println("No Parameters!");
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

class Overload2{
	public static void main(String args[]){
		OverloadDemo od = new OverloadDemo();
		double result;

		od.test();
		System.out.println(od.test(2)); // This calls the test(double) method as int gets promoted to float
										// since no method of the type test(int) was found
		od.test(1,2);
		result = od.test(1.5);
		System.out.println("Result of od.test(1.5) : " + result);
	}	
}