/* A program that uses Box Class */

class Box{
	double width;
	double height;
	double depth;
}

// This class declares an object of type Box
class BoxDemo{ // We named this file BoxDemo.java bcz that is the class which contains the main method
	public static void main(String args[]){
		Box mybox = new Box();
		double vol;

		// Assign values to mybox instance variable
		mybox.width = 10;
		mybox.height = 20;
		mybox.depth = 15;

		// Compute the volume of box
		vol = mybox.width * mybox.height * mybox.depth;

		System.out.println("Volume : " + vol);
	}
}