package genericutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
public String readCommonData(String key) throws IOException
{
	String address = "D:\\masai\\Unit4\\Automation-Testing\\Tutoraial-Ninja\\resources\\config.properties";
	FileInputStream fis = new FileInputStream(address);
	Properties pobj = new Properties();
	pobj.load(fis);
	String value = pobj.getProperty(key);
	return value;
	
}
}
