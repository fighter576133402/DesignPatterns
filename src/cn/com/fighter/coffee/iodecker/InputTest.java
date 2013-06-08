package cn.com.fighter.coffee.iodecker;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputTest {
	public static void main(String [] args) throws IOException{
		int c ;
		System.out.println(new File(".").getAbsolutePath());
		InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("test.txt")));
		while((c = in.read())>=0){
			System.out.print((char)c);
		}
		in.close();
	}
}
