// Example of superclass variables referencing object of its subclass

// Parameterized Constructors
class Box{
	double width;
	double height;
	double depth;


	// Default Constructor is a must to have in Superclass
	// as it maybe the case that the subclass won't initialize the variables of superclass
	// so if they variables of superclass are default initialized it may lead to logical errors
	// when using the values of superclass variables as when an object of sub class is created
	// it calls the contructor of it superclass firsts
	Box(){
		width = -1;
		height = -1;
		depth = -1;
	}

	// Constructor
	Box(double w, double h, double d){
		width = w;
		height = h;
		depth = d;
	}

	// Computes volume
	double volume(){
		return width * height * depth;
	}
}

class BoxWeight extends Box
{
	double weight; // weight of the box

	BoxWeight(double w, double h, double d, double m){ // m for mass => weight
		width = w;
		height = h;
		depth = d;		
		weight = m;
	}
}

public class RefDemo
{
	public static void main(String args[]){
		// Declare, allocate and initialize box objects
		BoxWeight weightbox = new BoxWeight(10, 20, 15, 90);
		Box plainbox = new Box();

		double vol;

		// get the volume of box
		vol = weightbox.volume();
		System.out.println("Volume of box1 : " + vol);
		System.out.println("Weight of box1 : " + weightbox.weight);

		// Assign BoxWeight refernce to Box reference
		plainbox = weightbox;

		// get the volume of box
		vol = plainbox.volume(); // Ok bcz volume() is defined in Box
		System.out.println("Volume : " + vol);
		//System.out.println("Weight of box2 : " + mybox2.weight); // ERROR : As box has no knowledge of weight
	}
}