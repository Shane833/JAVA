class OpBitEquals{
	public static void main(String args[]){
		int a = 1, b = 2, c = 3;
		
		a |= 4; // a = 0000 0001 | 0000 0100 = 0000 0101 i.e a = 5
		b >>= 1; // b = 0000 0010 >> 1 = 0000 0001, i.e. b = 1
		c <<= 1; // b = 0000 0011 << 1 = 0000 0110, i.e c = 6
		a ^= c; // a = 0000 0101 ^ 0000 0110 = 0000 0011, i.e. a = 3
		
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("c : " + c);
	}
}