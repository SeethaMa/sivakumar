package typesOfException;

public class NullExcep {
		public static void main(String[] args) {
			try {
				String name=null;
				System.out.println(name.charAt(2));
				
			}
			catch(NullPointerException n) {
				System.out.println(n+". Dont give the Null value");
			}
			
		}

}
