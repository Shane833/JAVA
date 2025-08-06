// Demonstrates passing objects as arguments

class Test{
	int a, b;

	Test(int i, int j){
		a = i;
		b = j;
	}

	// return true if o is equal to the invoking object
	boolean equalTo(Test o){
		return o.a == a && o.b == b;
	}
}

class PassOb{
	public static void main(String args[]){
		Test ob1 = new Test(1,1);
		Test ob2 = new Test(1,1);
		Test ob3 = new Test(0,0);

		System.out.println("ob1 == ob2 : " + ob1.equalTo(ob2));
		System.out.println("ob1 == ob3 : " + ob1.equalTo(ob3));
	} 
}