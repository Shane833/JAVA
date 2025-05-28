// Demonstrates a two dimensional array
class TwoDArray{
	public static void main(String args[]){
		int twoD[][] = new int[4][5];
		int i, j, k = 0;
		
		// Assign values to the 2D array elements
		for(i = 0;i < 4;i++){
			for(j = 0;j < 5;j++){
				twoD[i][j] = k;
				k++;
			}
		}
		
		// Display the value of 2D array elements
		for(i = 0;i < 4;i++){
			for(j = 0;j < 5;j++){
				System.out.print(twoD[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}
}