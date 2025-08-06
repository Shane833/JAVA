class Test{
	int a;

	Test(int i){
		a = i;
	}

	// return a new object whose value is 10 greater than current invoking object
	Test incrByTen(){
		Test temp = new Test(a + 10);
		return temp;
	}
}

class RetObj{
	public static void main(String args[]){
		Test ob1 = new Test(20);
		System.out.println("ob1 a : " + ob1.a);

		Test ob2 = ob1.incrByTen();
		System.out.println("ob2 a : " + ob2.a);
	}
}