package filereaders;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

//This file is 
public class ConfigFileReader {
	private Properties properties;
	private final String propertyFilePath=System.getProperty("user.dir") 
			+"/src/test/resources/config/config.properties";
	
	public ConfigFileReader()
	{
		File f= new File(this.propertyFilePath);
		FileReader fr = null;
		BufferedReader reader = null;
		try 
		{
			fr = new FileReader(f);
			reader = new BufferedReader(fr);
			properties = new Properties();
			properties.load(reader);
			reader.close();
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
			throw new RuntimeException("Properties file does not exist in the given path:"+this.propertyFilePath);
		}
		catch(IOException e) 
		{
			e.printStackTrace();
			throw new RuntimeException("Properties file could not be read.:"+this.propertyFilePath);
		}	
	}
	
	public Map<String,String> getConfigFileData()
	{
		Map<String,String> map = new HashMap<String,String>();
		for(Map.Entry<Object,Object> s:this.properties.entrySet())
		{
			map.put(s.getKey().toString(),s.getValue().toString());
		}
		return map;
	}
	
	public String getValueOfProperty(String propName)
	{
		if(this.properties.containsKey(propName))
		{
			return this.properties.getProperty(propName);
		}
		return "";
	}
	 
	 
	/*
	public static void main(String args[])
	{
		ConfigFileReaders cfg = new ConfigFileReaders();
		System.out.println(cfg.propertyFilePath);
		System.out.println(cfg.getConfigFileData());
		System.out.println(cfg.getValueOfProperty("implicitlyWait"));
	}
	*/
}

