package download_file;

import java.io.File;

public class Verifyfile {

	static String path = null;
	static String filename = null;
	
	public static void main(String[] args){
		
		path = "D:\\seleniumdownloads\\";
		filename = "mailmerge";
		
		File file = new File(path);
		
		System.out.println(file.getName());
		File[] files = file.listFiles();
		System.out.println(files.length);
		for (File file2 : files) {
			System.out.println(file2);
			if(file2.getName().contains(filename)){
				System.out.println(file2.getName());
			System.out.println(" file found  " +filename);
			}else
			{
				System.out.println("not found");
			}
		}
		
		
		
	}
	
	
}
