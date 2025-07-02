// Demonstrates the for-each loop
class ForEach{
	public static void main (String args[]){
		int nums[] = {1,2,3,4,5,6,7,8,9,10};
		int sum = 0;

		for(int x : nums){
			System.out.println("Current num : " + x);
			sum += x;
		}

		System.out.println("Sum : " + sum);
	}
}