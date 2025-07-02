// It's not a good idea to use string switches since they can
// degrade the performance of you program.
class StringSwitch{
	public static void main(String args[]){

		String str = "two";

		switch(str){
			case "one":
				System.out.println("One");
				break;
			case "two":
				System.out.println("two");
				break;
			case "three":
				System.out.println("three");
				break;
			default:
				System.out.println("No Match!");
		}
	}
}