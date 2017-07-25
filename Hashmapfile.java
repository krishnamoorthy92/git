package download_file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.junit.internal.runners.model.EachTestNotifier;

public class Hashmapfile{
	

public static void main(String[] args) 
throws IOException, ClassNotFoundException { 
HashMap<String, Object> fileObj = new HashMap<String, Object>(); 
Properties prop = new Properties();
fileObj.put("1", "kkkkkk");
fileObj.put("2", "jkkjkjk");

System.out.println(fileObj.get("2"));
	
for (Map.Entry<String, Object> entry : fileObj.entrySet()) {
	
	System.out.println("keyy value" + entry.getKey());
	System.out.println("valuess " + entry.getValue());
	prop.put(entry.getKey(), entry.getValue());
	
	
}

/*File file = new File("D:\\seleniumdownloads\\kk.properties");
FileOutputStream fos = new FileOutputStream(file);
prop.store(fos, null);*/

prop.store(new FileOutputStream(new File("D:\\seleniumdownloads\\kk.properties")), null);

	
}
}



