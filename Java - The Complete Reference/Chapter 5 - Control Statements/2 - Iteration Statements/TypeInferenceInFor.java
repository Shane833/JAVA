// Use type inference in a for loop
class TypeInferenceInFor{
	public static void main(String args[]){
		// Use type inference with the loop controlled variable
		System.out.print("Value of x: ");
		for(var x = 2.5; x < 100.0; x = x * 2){ // x is double
			System.out.print(x + " ");
		}
		System.out.println();

		// User type inference with the iteration variable
		int[] nums = {1, 2, 3, 4, 5, 6};

		System.out.print("Values in nums array : ");
		for(var v : nums){ // v is integer
			System.out.print(v + " ");
		}
		System.out.println();
	}
}