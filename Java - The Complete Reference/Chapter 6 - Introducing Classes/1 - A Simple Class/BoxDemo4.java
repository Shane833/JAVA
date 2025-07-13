// Using methods to return values
class Box{
	double width;
	double height;
	double depth;

	// Displays the volume
	double volume(){
		return width * height * depth;
	}
}

class BoxDemo4{
	public static void main(String args[]){
		Box mybox1 = new Box();
		Box mybox2 = new Box();
		double vol; // variable to store the computed volume

		// Assign values to mybox1's instance variables
		mybox1.width = 10;
		mybox1.height = 20;
		mybox1.depth = 15;

		// Assign values to mybox2's instance variables
		mybox2.width = 3;
		mybox2.height = 6;
		mybox2.depth = 9;

		// get the volume of 1st box
		vol = mybox1.volume();
		System.out.println("Volume : " + vol);

		// get the voluem of 2nd box
		vol = mybox2.volume();
		System.out.println("Volume : " + vol);
	}
}