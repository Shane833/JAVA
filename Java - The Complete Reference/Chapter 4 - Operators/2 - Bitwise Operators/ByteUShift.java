class ByteUShift{
	public static void main(String args[]){
		// First I want to check the sign from a -ve byte gets extended to an int
		// Yes it does, also remember that all integers types are promoted to 32bit int in expressions
		byte a = -15; // 1111 0001
		byte x = (byte)(a >>> 4);
		System.out.println("x : " + x);
		
		char hex[] = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
		
		byte b = (byte) 0xf1; 
		byte c = (byte) (b >> 4); // Actually it gets promoted to 11111111 11111111 11111111 11110001 >> 4 = 11111111 11111111 11111111 11111111
								  // and when you convert it back to byte we get 11111111 i.e -1
		byte d = (byte) (b >>> 4); // Also here 11111111 11111111 11111111 11110001 >>> 4 = 00001111 11111111 11111111 11111111
								   // Still when converted back to a byte we 11111111 i.e. -1 again
		byte e = (byte) ( (b & 0xff) >> 4); // In this case however 11111111 11111111 11111111 11110001 & 00000000 00000000 00000000 11111111
											// = 00000000 00000000 00000000 11110001 >> 4 = 00000000 00000000 00000000 00001111
											// and when you convert it back to a byte we get 00001111 i.e. 15
		System.out.println("b = 0x" + hex[(b >> 4 & 0x0f)] + hex[b & 0x0f]); 
		System.out.println("b >> 4 = 0x" + hex[(c >> 4 & 0x0f)] + hex[c & 0x0f]); 
		System.out.println("b >>> 4 = 0x" + hex[(d >> 4 & 0x0f)] + hex[d & 0x0f]); 
		System.out.println("(b & 0xff) >> 4 = 0x" + hex[(e >> 4 & 0x0f)] + hex[e & 0x0f]); 
		
	}
}