package week11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Copy {

	public static void main(String[] args) throws IOException {
		byte[] buffer = new byte[1024];
		try {
			InputStream lenna = new FileInputStream("lenna.png");
			OutputStream copy = new FileOutputStream("lenna_copy.png");
	        int c = -1;
	        while((c = lenna.read(buffer))!=-1) {
	        	copy.write(buffer, 0, c);
	        }
	        lenna.close();
	        copy.close();
		} catch(IOException e){
			e.printStackTrace();
		}

	}

}
