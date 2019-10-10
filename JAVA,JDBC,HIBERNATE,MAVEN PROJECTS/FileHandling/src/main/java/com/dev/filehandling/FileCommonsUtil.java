package com.dev.filehandling;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class FileCommonsUtil {

	public static void main(String[] args) throws IOException {
		File file=new File("D:/text.txt");
		FileUtils.touch(file);
		
		if(file.exists()) {
			System.out.println("File exist");
		}else {
			System.out.println("File does not  exist");
		}
		
		FileUtils.deleteQuietly(file);
		
		if(file.exists()) {
			System.out.println("File exist");
		}else {
			System.out.println("File does not exist");
		}
	}

}
