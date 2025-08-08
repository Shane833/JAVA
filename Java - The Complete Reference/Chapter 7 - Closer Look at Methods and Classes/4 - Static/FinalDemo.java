// Using the keyword final to create constants

class FinalClass{
	// You can declare a final variable then initialize it in the constructor as well
	final int FILE;

	FinalClass(){
		FILE = 1;
	}
}

class FinalDemo{
	public static void main(String argsp[]){
		final int CODE = 10;

		FinalClass ob = new FinalClass();
		System.out.println("FILE : " + ob.FILE);
		System.out.println("CODE : " + CODE);
	}
}