package Datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class SampleDatadriventesting {
	public static void main(String[] args) throws Throwable   {
		//get the java representation object of the physical file
		FileInputStream fis=new FileInputStream("‪‪D:\\SELENIUM\\commondata.properties");
		
		//using properties class, load all the keys
		Properties pobj=new Properties();
		pobj.load(fis);
		
		//get the value based on key
		System.out.println(pobj.getProperty("browser"));
	}
}
