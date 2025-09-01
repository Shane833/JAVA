// Simple example of inheritance

// A is the superclass
class A
{
	int i, j;

	void showij(){
		System.out.println("i and j : " + i + " " + j);
	}
}

// B is a subclass
class B extends A
{
	int k;

	void showk(){
		System.out.println("k :" + k);
	}

	void sum(){
		System.out.println("i + j + k : " + (i + j + k)); // parenthesized the expression bcz + is overloaded
	}

}

class SimpleInheritance
{
	public static void main(String args[]){
		A superOb = new A();
		B subOb = new B();

		// The super class may be used by itself
		superOb.i = 20;
		superOb.j = 30;
		System.out.println("The contents of super class : ");
		superOb.showij();

		// The sub class has access to all the public members of its superclass
		subOb.i = 10;
		subOb.j = 20;
		subOb.k = 30;
		System.out.println("The content of sub class : ");
		subOb.showij();
		subOb.showk();
		// Sum
		System.out.println("Sum of i, j and k in subOb : ");
		subOb.sum();
	}

}