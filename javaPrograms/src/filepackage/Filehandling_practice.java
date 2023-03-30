package filepackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Filehandling_practice {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f1=new File("meghoos.jpng");
		if(!f1.exists()) {
			f1.createNewFile();
			System.out.println("created");
			}
		else {
			System.out.println("not created");
		}
		FileOutputStream fos=new FileOutputStream(f1);
		String s="hlooo this is meghana";
		fos.write(s.getBytes());
		fos.close();
		FileInputStream fis=new FileInputStream(f1);
		fis.read();
		fis.close();
		f1.delete();

	}

}
