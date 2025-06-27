// Masking Sign Extension
class HexByte{
	public static void main(String args[]){
		char hex[] = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
		
		byte b = (byte) 0xf1; // Equivalent of 241 or 1111 0001
							  // However, since Java doesn't support unsigned i.e. +ve only data types
							  // This would suggest that that signed bit is on and hence the value is
							  // actually -15
		
		// >> and << operators work on the values and not the operands themselves
		// Hence when we apply b>>4, it will just give us a value of -1, instead of
		// changing the underlying value of the variable which is -15

		System.out.println("b = 0x" + hex[b>>4 & 0x0f] + hex[b & 0x0f]);
		
		// Explanation : b>>4 gives 1111 1111 & 0000 1111 gives 15 i.e. 'f'
		// b is 1111 0001 & 0000 1111 gives 1 i.e. '1'
		// hence we get 0xf1
	}
}