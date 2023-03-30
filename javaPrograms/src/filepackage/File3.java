package filepackage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class File3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f1=new File("meghus.txt");
		FileOutputStream fos=new FileOutputStream(f1);
		String s="hlo hiii bye";
		fos.write(s.getBytes());
		fos.close();
		FileInputStream fis=new FileInputStream(f1);
	/*	for(int i=0;i<s.length();i++) {
			
			System.out.print((char)fis.read());
		}*/
		int i=fis.read();
		while(i!=-1) {
			System.out.print((char)i);
			i=fis.read();
		}
		fis.close();
		f1.delete();
		
		
		}

}
