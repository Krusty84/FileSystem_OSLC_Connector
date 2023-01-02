package com.krusty84.fileconnector.resources;

import java.util.Date;
import java.util.Map;
import java.util.Random;

import com.krusty84.fileconnector.ResourcesFactory;
import com.krusty84.fileconnector.ServiceProviderInfo;


/*krusty84, was added after generate boilerplate code
 some helpers for interacting with File System
*/
public class FileSystemConnect_Helper {
	
	private static int folderWalkerCounter;
	private static ServiceProviderInfo services[];
	

	 private static File filledFile(String countId, String fileName, Date fileLastModDate, String fileDesc) {
		 File file=null;
		 file=ResourcesFactory.createFile(countId);
		 file.setFileName(fileName);
		 file.setLastModifiedTime(fileLastModDate);
		 file.setFileDescription(fileDesc);
		 return file;
	 }
	 
	public static void getFoldersContent(String rootFolderPath,String specificFolder, Map files) {
		files.clear();
		folderWalkerCounter=0;
		
		java.io.File startFolder = new java.io.File (rootFolderPath+"\\"+specificFolder);
		java.io.File[] folderContents = startFolder.listFiles();
		
		for(int i=0;i<folderContents.length;i++) {
			/*Dummy data*/
			Random rand = new Random(); 
		  	String[] someWords = {"Son", "Of", "Beach", "Give", "Me", "Drink", "Whiskey","Beer"}; // array of animals
		  	//
			folderWalkerCounter++;
			String countId = Integer.toString(folderWalkerCounter);
			Date lastModDate = new Date(folderContents[i].lastModified());
			File file = filledFile(countId, folderContents[i].getName(),lastModDate, someWords[rand.nextInt(someWords.length)].toString());
			System.out.println("QWERT_"+someWords[rand.nextInt(someWords.length)].toString());
			files.put(countId, file);
		}
	}
	
	public static ServiceProviderInfo[] filledServiceProviders(String rootFolderPath) {
		ServiceProviderInfo[] serviceProviderInfo = {};
		java.io.File[] folderContents = new java.io.File(rootFolderPath).listFiles(java.io.File::isDirectory);
		services=new ServiceProviderInfo[folderContents.length];
		for(int i=0;i<services.length;i++) {
			services[i]=new ServiceProviderInfo();
			services[i].serviceProviderId=Integer.toString(i);
			services[i].name=folderContents[i].getName();	
		}
		serviceProviderInfo= new ServiceProviderInfo[services.length];
		for(int i=0;i<services.length;i++) {
			serviceProviderInfo[i]=services[i];
		}
		return serviceProviderInfo;
	}

}
