package typesOfException;

public class ArithExcep {
	public static void main(String[] args) {
		System.out.println("Welcome");
		int n1=10;
		int n2=0;
		try {
			int div=n1/n2;
			System.out.println(div);
		}
		catch(ArithmeticException a) {
			System.out.println(a+". Don't give the number as divisible by 0");
			//a.printStackTrace();										//java throws defalut exception
			
		}
		finally {
			
			System.out.println("Thank you");
		}
	}

}
