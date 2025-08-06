class Test{
	int a, b;

	Test(int i, int j){
		a = i;
		b = j;
	}

	// Function to call by val
	void callByVal(int i, int j){
		i *= 2;
		j /= 2;
	}

	// Function to call by ref (All objects are passed by reference)
	void callByRef(Test o){
		o.a *= 2;
		o.b /= 2;
	}
}

class CallbyValandRef{
	public static void main(String args[]){
		int a = 15, b = 20;
		Test ob = new Test(15, 20);

		ob.callByVal(a, b);
		ob.callByRef(ob);

		System.out.println("a and b : " + a + " " + b);
		System.out.println("Test a and b : " + ob.a + " " + ob.b);
	}

}