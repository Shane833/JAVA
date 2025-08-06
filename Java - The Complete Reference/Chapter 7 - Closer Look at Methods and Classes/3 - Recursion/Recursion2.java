class Recurse{
	int values[];

	Recurse(int i){
		values = new int[i];
	}

	void printArray(int i){
		if(i == 0) return;
		else printArray(i - 1);
		System.out.println((i - 1) + " : " + values[i - 1]);
	}
}

class Recursion2{
	public static void main(String args[]){
		Recurse r = new Recurse(10);

		for(int i = 0;i < 10;i++) r.values[i] = i;

		r.printArray(10);
	}
}