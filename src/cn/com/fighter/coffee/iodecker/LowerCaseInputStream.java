package cn.com.fighter.coffee.iodecker;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerCaseInputStream extends FilterInputStream {

	public LowerCaseInputStream(InputStream arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}
	
	public int read() throws IOException{
		int c = super.read();
		return (c == -1?c:Character.toLowerCase((char)c));
	}

	@Override
	public int read(byte[] b, int off, int len) throws IOException {
		// TODO Auto-generated method stub
		int result = super.read(b, off, len);
		for(int i = off;i<off+result;i++){
			b[i] = (byte)Character.toLowerCase((char)b[i]);
		}
		return result;
	}
	
	

}
