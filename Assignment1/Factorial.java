import java.util.Scanner;
class Factorial {
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int fact=1,dup;
		dup = num;
		while(num>0){
			fact = fact*num;
			num--;

		}
		System.out.println("Factorial of " + dup + " is " + fact);
		

	}
}