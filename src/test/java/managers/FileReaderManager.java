package managers;

import filereaders.ConfigFileReader;

public class FileReaderManager {
	/*
	 * The FileReaderManager class maintains a static reference to its own instance
	 */
	private static FileReaderManager fileReaderManager = new FileReaderManager();
	private static ConfigFileReader configFileReader = new ConfigFileReader();
	
	/*
	 * FileReaderManager implements a private constructor so clients cannot instantiate FileReaderManager instances.
	 */
	private FileReaderManager() {}
	
	/*
	 * The FileReaderManager class maintains a static reference to its own instance
	 * and returns that reference from the static getInstance() method.
	 */
	public static FileReaderManager getInstance()
	{
		return fileReaderManager;
	}
	
	/*
	 * getConfigReader() method returns the instance of the ConfigFileReader but this method is not static. 
	 * So that client has to use the getInstance() method to access other public methods of the FileReaderManager 
	 * like FileReaderManager.getInstance().getConfigReader()
	 */
	public ConfigFileReader getConfigReader() 
	{
		 return (configFileReader == null) ? new ConfigFileReader() : configFileReader;
	}
}
