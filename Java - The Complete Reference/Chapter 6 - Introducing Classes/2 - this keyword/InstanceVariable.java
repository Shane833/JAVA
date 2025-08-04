// Parameterized Constructors
class Box{
	double width;
	double height;
	double depth;

	// Constructor
	// Using formal parameters with the same name as the instance variables
	// If we don't use this keyword then there will be collision in namespace
	// as within the scope of this function the formal parameters will be given
	// more preference and the instance variables will be hidden but using
	// this keyword overrides this behaviour
	Box(double width, double height, double depth){
		this.width = width;
		this.height = height;
		this.depth = depth;
	}

	// Computes volume
	double volume(){
		return width * height * depth;
	}
}

class InstanceVariable{
	public static void main(String args[]){
		// Declare, allocate and initialize box objects
		Box mybox1 = new Box(10, 20, 15);
		Box mybox2 = new Box(3, 6, 9);

		double vol;

		// get the volume of 1st box
		vol = mybox1.volume();
		System.out.println("Volume : " + vol);

		// get the voluem of 2nd box
		vol = mybox2.volume();
		System.out.println("Volume : " + vol);
	}
}