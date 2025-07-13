// Creating a volume method

class Box{
	double width;
	double height;
	double depth;

	// Displays the volume
	void volume(){
		System.out.print("Volume : ");
		System.out.println(width * height * depth);
	}
}

class BoxDemo3{
	public static void main(String args[]){
		Box mybox1 = new Box();
		Box mybox2 = new Box();

		// Assign values to mybox1's instance variables
		mybox1.width = 10;
		mybox1.height = 20;
		mybox1.depth = 15;

		// Assign values to mybox2's instance variables
		mybox2.width = 3;
		mybox2.height = 6;
		mybox2.depth = 9;

		// Display the volume of 1st box
		mybox1.volume();

		// Display the voluem of 2nd box
		mybox2.volume();
	}
}