package com.vicky.pazar.fileutil;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

import org.springframework.web.multipart.MultipartFile;

public class Fileupload {

	public static void upload(String path,MultipartFile file,String Filename)
	{
		
		if(!file.isEmpty())
		{
			
			
			try{
				byte[] bytes=file.getBytes();
				System.out.println(bytes.length);
				System.out.println(bytes);
				//create directory to store file
				File dir=new File(path);
				System.out.println(dir);
				if(!dir.exists())
				{
					dir.mkdirs();
				}
                    //create file onserver
					File  serverfile=new File(dir.getAbsolutePath()+File.separator+Filename);//separator will help us to work on any OS.
					System.out.println("this is in server"+serverfile);
					BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(serverfile));
					System.out.println(bos);
					bos.write(bytes);
					System.out.println("File Uploaded Successfully");
					bos.close();
					
				}
			
				catch (Exception e) {
					// TODO: handle exception
					System.out.println("File is Empty not Uploaded");
					e.printStackTrace();
				}
			
			
			}
		
		
	}
}
