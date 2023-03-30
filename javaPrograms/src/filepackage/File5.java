package filepackage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class File5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f1=new File("meghss.txt");
		if(!f1.exists()) {
			f1.createNewFile();
			System.out.println("create file");
		}
		else {
			System.out.println("not created");
		}
			FileOutputStream fos=new FileOutputStream(f1);
			String s="meghanaaaaaaaaaa";
			fos.write(s.getBytes());
			fos.close();
			FileInputStream fis=new FileInputStream(f1);
			fis.read();
			fis.close();
			f1.delete();
		}

	}


