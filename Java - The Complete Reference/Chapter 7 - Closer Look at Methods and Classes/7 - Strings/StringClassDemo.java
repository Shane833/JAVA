// Demonstrates cmd line args using String class features
class StringClassDemo{
	public static void main(String args[]){
		// You can use length(), equals() and charAt() methods for string class
		// Even String literals are string object

		for(int i = 0;i < args.length ;i++){
			System.out.println("Arg[" + i + "] : " + args[i].charAt(0));
		}
	}
}