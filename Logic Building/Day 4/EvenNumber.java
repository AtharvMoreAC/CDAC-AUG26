class EvenNumbers{
	void printEvenNumbers(){
		int n = 0;
		while(n <= 50){
			if(n % 2 == 0){
				System.out.println(n);
			}
		n++;
		}
		
		
	}
	public static void main(String[] args){
		EvenNumbers obj = new EvenNumbers();
		obj.printEvenNumbers();
		
	}
	
}