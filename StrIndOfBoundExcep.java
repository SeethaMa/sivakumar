package typesOfException;

public class StrIndOfBoundExcep {
	public static void main(String[] args) {
		String name="Seetha";
		try {
			System.out.println(name.charAt(8));
		}
//		catch(StringIndexOutOfBoundsException s) {
//			System.out.println(s);
//		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
