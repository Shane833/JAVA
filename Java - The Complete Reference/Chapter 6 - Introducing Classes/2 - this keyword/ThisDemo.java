// Parameterized Constructors
class Box{
	double width;
	double height;
	double depth;

	// Constructor
	Box(double w, double h, double d){
		this.width = w;
		this.height = h;
		this.depth = d;
	}

	// Computes volume
	double volume(){
		return width * height * depth;
	}
}

class ThisDemo{
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