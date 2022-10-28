package typesOfException;

public class NumFormatExcep {
	public static void main(String[] args) {
		String word="Seetha";
		try {
			int n1=Integer.parseInt(word);
			System.out.println(n1);
		}
		catch(NumberFormatException n) {
			//System.out.println(n);
			n.printStackTrace();
		}
		
	}

}
