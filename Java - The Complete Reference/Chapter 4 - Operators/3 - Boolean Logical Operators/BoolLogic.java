// In C/C++

// int done;
// if(!done){}

// In Java
//! on an integer, it has to on boolean variables
// therefore use if(done == 0) or done != 0

class BoolLogic{
	public static void main(String args[]){
		boolean a = true;
		boolean b = false;
		boolean c = a | b; // true or false = true
		boolean d = a & b; // true and false = false
		boolean e = a ^ b; // true xor false = true
		boolean f = (!a & b) | (a & !b); // (false & false) | (true & true) = true
		boolean g = !a; // !true = false

		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("a | b = " + c);
		System.out.println("a & b = " + d);
		System.out.println("a ^ b = " + e);
		System.out.println("(!a & b) | (a & !b) = " + f);
		System.out.println("!a = " + g);

		// Short Circuit Logical Operator : || and &&S
		// Evaluates the left expression first and then the right
		// Eg : if (denom != 0 && num / denom > 10)
	}
}