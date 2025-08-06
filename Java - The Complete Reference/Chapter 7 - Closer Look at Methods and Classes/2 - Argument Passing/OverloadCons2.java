// Example of overloading constructors such that it is copy of an existing object
class Box{
	double width, height, depth;

	// If no parameters provided all are initialized to -1
	Box(){
		width = height = depth = -1;
	}

	// Copies values from an existing object
	Box(Box b){
		width = b.width;
		height = b.height;
		depth = b.depth;
	}

	// All are initialized to the same value
	Box(double len){
		width = height = depth = len;
	}

	// All are specified to their specific values
	Box(double w, double h, double d){
		width = w;
		height = h;
		depth = d;
	}

	double volume(){
		return width * height * depth;
	}
}

class OverloadCons2{
	public static void main(String args[]){
		Box b1 = new Box();
		Box b2 = new Box(5);
		Box b3 = new Box(3,4,5);
		Box b4 = new Box(b3);

		// Print the volume of boxes
		System.out.println("b1 volume : " + b1.volume());
		System.out.println("b2 volume : " + b2.volume());
		System.out.println("b3 volume : " + b3.volume());
		System.out.println("b4 volume : " + b4.volume());
	}
}