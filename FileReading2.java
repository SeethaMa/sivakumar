package typesOfException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReading2 {
	public static void main(String[] args) throws IOException {
		try {
		File file=new File("C:\\TextFolder\\excep.txt");
		FileReader fr=new FileReader(file);
		int temp=0;
		while((temp=fr.read())!=-1) {
			System.out.print((char)(temp));
		}
	}
		catch(FileNotFoundException fe) {
			System.out.println(fe+", No Files available in Given Path.");
		}
	}

}



