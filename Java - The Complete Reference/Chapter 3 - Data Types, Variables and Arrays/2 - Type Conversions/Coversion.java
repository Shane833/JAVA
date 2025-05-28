// Demonstrates casts

class Conversion{
	public static void main(String args[]){
		byte b;
		int i = 257;
		double d = 323.456;
		
		System.out.println("Conversion of int to byte");
		b = (byte)i;
		System.out.println("i and b are " + i + " " + b + "\n");
		
		System.out.println("Conversion of double to int");
		i = (int)d;
		System.out.println("d and i are " + d + " " + i + "\n");
		
		System.out.println("Conversion of double to byte");
		b = (byte)d;
		System.out.println("d and b are " + d + " " + b);
	}
}