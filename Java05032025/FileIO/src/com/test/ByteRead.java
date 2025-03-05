package com.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.BufferedInputStream;

public class ByteRead {
	public static void main(String[] args) {
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		try {
			fis = new FileInputStream("src/bytetest.txt");
			
			bis = new BufferedInputStream(fis);
			
			byte[] br = new byte[1024];
			int x = 0;
			
			while((x=bis.read(br)) != -1){
				System.out.println(new String(br, 0));
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();		
		}
		finally
		{
			try {
				fis.close();
				bis.close();
			}
			catch(Exception e) {
				e.printStackTrace()
;			}
		}
	}
}
