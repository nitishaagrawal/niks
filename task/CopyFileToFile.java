package task;
import java.io.*;
public class CopyFileToFile {

	public static void main(String[] args) throws IOException {
		int i;
		FileInputStream fis=new FileInputStream("D:\\Nik\\Servlet\\ref\\src\\task\\file1.txt");
		File f= new File("D:\\Nik\\Servlet\\ref\\src\\task\\file2.txt");
		 OutputStream op=System.out;
        BufferedInputStream bis=new BufferedInputStream(fis);
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(f));
       int size=fis.available();
     byte[] arr=new byte[size];
     fis.read(arr);
     op.write(arr);
     bos.write(arr);
       
        
    fis.close();
    bis.close();
    bos.close();
     
	}

}
