// Using a do-while to process a menu selection
class Menu{
	public static void main(String args[]) throws java.io.IOException{
		char choice;

		do{
			System.out.println("Help on: ");
			System.out.println("1. if");
			System.out.println("2. switch");
			System.out.println("3. while");
			System.out.println("4. do-while");
			System.out.println("5. for\n");

			System.out.println("Choose one: ");
			choice = (char)System.in.read();
		}while(choice < '1' || choice > '5'); // even though the condition is false, the body will still run once

		System.out.println("\n");

		switch(choice){
			case '1':
				System.out.println("The if : \n");
				System.out.println("if(condition) statement;");
				System.out.println("else statement;");
				break;
		}
	}
}