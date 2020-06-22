class Fibonacci {
	public static void main(String[] args){
		System.out.print("Enter the range of  Fibonacci: ");
		int range = new java.util.Scanner(System.in).nextInt();
		int a=0,b=1,c;
		for(int i=0;i<range;i++){
			System.out.print(a+"\t");
			c=a+b;
			a=b;
			b=c;

		}


	}
}