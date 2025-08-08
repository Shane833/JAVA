// Demonstrates an inner class
class Outer{
	int outer_x = 10;

	class Inner{
		int inner_y = 20;

		void display(){
			System.out.println("Outer x : " + outer_x);
		}
	}

	void testInner(){
		Inner i = new Inner();
		i.display();
		System.out.println("Inner y : " + i.inner_y);
	}
}

class InnerClassDemo{
	public static void main(String args[]){
		Outer o = new Outer();
		o.testInner();
	}
}