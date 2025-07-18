// Using break to exit nested loops
class BreakLoop4{
	public static void main(String args[]){
		outer: for(int i = 0; i < 3; i++){
			System.out.print("Pass " + i + ": ");
			for(int j = 0; j < 100; j++){
				if(j == 10) break outer; // break out of the outer label block/statement
				System.out.print(j + " ");						 // so basically exiting both of the loops
			}
			System.out.println("This will not print");
		}
		System.out.println("Loop complete");
	}
}