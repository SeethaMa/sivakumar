package typesOfException;

public class ArrIndexOfBoundExcep {
	public static void main(String[] args) {
		
	int []nums= {1,3,5};
	try {
		System.out.println(nums[9]);
	}
	catch(ArrayIndexOutOfBoundsException a) {
		System.out.println(a);
	}
}
}

