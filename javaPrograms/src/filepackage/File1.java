package filepackage;
import java.io.File;
import java.io.IOException;
public class File1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f1=new File("meghana.jpeg");
		if(!f1.exists()) {
			f1.createNewFile();
			System.out.println("file created");
		}
		else {
			System.out.println("file not created");
		}
	}

}
