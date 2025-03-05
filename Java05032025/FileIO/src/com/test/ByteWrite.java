package com.test;

import java.io.File;
import java.io.FileOutputStream;

class ByteWrite {
	public static void main(String[] args) {
		try {
			File file = new File("src/bytetest.txt");
			FileOutputStream fout = new FileOutputStream(file);
			String msg = "This is simple byte stram write and read example";
			
			fout.write(msg.getBytes());
			System.out.println("Done");
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally {
			try {
				fout.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
