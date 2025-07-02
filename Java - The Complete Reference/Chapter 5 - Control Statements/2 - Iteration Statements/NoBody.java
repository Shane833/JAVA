// Loops can no body, i.e. a single ; is valid
class NoBody{
	public static void main(String args[]){
		// program to find the mid point
		int i = 100;
		int j = 200;

		while(++i < --j); // No body for this loop

		System.out.println("MidPoint is " + i);

		int n = 10;
		
		do{
			System.out.println("Tick : " + n);
		}while(n-- > 0);
	}
} 