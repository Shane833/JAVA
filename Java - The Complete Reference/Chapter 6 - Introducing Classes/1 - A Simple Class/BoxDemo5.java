// Using parameterized methods for setting values to instance variables
class Box{
	double width;
	double height;
	double depth;

	// Displays the volume
	double volume(){
		return width * height * depth;
	}

	// Sets dimensions of the box
	void setDim(double w, double h, double d){
		width = w;
		height = h;
		depth = d;
	}
}

class BoxDemo5{
	public static void main(String args[]){
		Box mybox1 = new Box();
		Box mybox2 = new Box();
		double vol; // variable to store the computed volume

		// Initialize each box
		mybox1.setDim(10,20,15);
		mybox2.setDim(3, 6, 9);

		// get the volume of 1st box
		vol = mybox1.volume();
		System.out.println("Volume : " + vol);

		// get the voluem of 2nd box
		vol = mybox2.volume();
		System.out.println("Volume : " + vol);
	}
}