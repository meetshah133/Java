class Season{
	public static void main(String[] args) {
		System.out.prinln("Enter the month");
		int month = new java.util.Scanner(System.in).nextInt();
		switch(month){
			case(1):
			case(2):
			case(12):{
				System.out.println("Winter");
				break;
			}
			case(3):
			case(4):
			case(5): {
				System.out.println("Summer");
				break;
			}
			case(6):
			case(7):
			case(8):
			{
				System.out.println("Rainy Season");
				break;
			}

			case(9):
			case(10):
			case(11):
			{
				System.out.println("Autom Season");
				break;
			}
			default : 
					System.out.println("No such season found!!");
		}
	}
}