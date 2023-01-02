// Start of user code Copyright
/*
 * Copyright (c) 2020 Contributors to the Eclipse Foundation
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Distribution License 1.0 which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: BSD-3-Simple
 */
// End of user code

package com.krusty84.fileconnector;


import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import org.slf4j.LoggerFactory;

import com.krusty84.fileconnector.resources.File;
import com.krusty84.fileconnector.resources.FileSystemConnect_Helper;
import com.krusty84.fileconnector.resources.GlobalConstantsVariables;

import org.apache.log4j.xml.DOMConfigurator;



// Start of user code imports
// End of user code

// Start of user code pre_class_code
// End of user code

public class RestDelegate {

	//*krusty84, was added for using log4j
	private static final org.slf4j.Logger logger = LoggerFactory.getLogger(RestDelegate.class.getSimpleName());
    //*krusty84, was added pathToRootFolder variable for specified path to the root of exposing folder
    public static String pathToRootFolder="C:\\Temp\\basicmass";
    public static Map<String,File> files = new HashMap<String, File>();
    private static ServiceProviderInfo services[];
    
    @Inject ResourcesFactory resourcesFactory;
    // Start of user code class_attributes
    // End of user code
    
    public RestDelegate() {
    	//*krusty84, was added for initialize log4j
        DOMConfigurator.configure("src/main/resources/log4j.xml");
        logger.trace("Delegate is initialized");
    }
    
    
    // Start of user code class_methods
    // End of user code

    //The methods contextInitializeServletListener() and contextDestroyServletListener() no longer exits
    //Migrate any user-specific code blocks to the class com.krusty84.fileconnector.servlet.ServletListener
    //Any user-specific code should be found in *.lost files.

    public static ServiceProviderInfo[] getServiceProviderInfos(HttpServletRequest httpServletRequest)
    {
        ServiceProviderInfo[] serviceProviderInfos = {};
        
        //*krusty84, was added call the static method which filling service provider based on folder contents
        return FileSystemConnect_Helper.filledServiceProviders(pathToRootFolder);
    }

    public List<File> queryFiles(HttpServletRequest httpServletRequest, String where, String prefix, boolean paging, int page, int limit)
    {
        List<File> resources = null;
        
        
        // Start of user code queryFiles
        // TODO Implement code to return a set of resources.
        //*krusty84, was added call to get Array of found files in folder (aka ServiceProvider)
        resources= new ArrayList<File>(files.values()).stream().skip((page) * limit).limit(limit + 1).collect(Collectors.toList());
        // An empty List should imply that no resources where found.
        // If you encounter problems, consider throwing the runtime exception WebApplicationException(message, cause, final httpStatus)
        // End of user code
        return resources;
    }
    
    public List<File> FileSelector(HttpServletRequest httpServletRequest, String terms)
    {
         List<File> resources = null;    
         // Start of user code FileSelector
         // TODO Implement code to return a set of resources, based on search criteria
         //*krusty84, was added code to search for a file in serviceProvider by  file name
         resources= new ArrayList<File>(files.values());
         Iterator<File> filteredFiles = resources.iterator();
         while (filteredFiles.hasNext()) {
        	 File fileTemp = filteredFiles.next();
        	 if (fileTemp.getFileName().contains(terms)!=true) {
            	 filteredFiles.remove();
             }
         }
        // An empty List should imply that no resources where found.
        // If you encounter problems, consider throwing the runtime exception WebApplicationException(message, cause, final httpStatus)
        // End of user code
        return resources;
    }
    
    public File createFile(HttpServletRequest httpServletRequest, final File aResource)
    {
        File newResource = null;
        
        
        // Start of user code createFile
        // TODO Implement code to create a resource
        // If you encounter problems, consider throwing the runtime exception WebApplicationException(message, cause, final httpStatus)
        // End of user code
        return newResource;
    }



    
    public File getFile(HttpServletRequest httpServletRequest, final String file_id)
    {
        File aResource = null;
        // Start of user code getFile 
        // TODO Implement code to return a resource
        //*krusty84, was added call to get specific file in folder (aka ServiceProvider)
        System.out.println("Direct access at the specific resource via URL");
        /*krusty84, was added call for getting folder contents during direct call of resource via URL:
         * http://localhost:8181/filesystem-connector/oslc/files/6
         */
        FileSystemConnect_Helper.getFoldersContent(RestDelegate.pathToRootFolder, GlobalConstantsVariables.currentServiceProvider, RestDelegate.files);
        aResource= files.get(file_id);
        //System.out.println("Resource ID: "+file_id+" in Fact this is the file: "+aResource.getFileName());
        logger.info("Resource ID: "+file_id);
        logger.info("In Fact this is the file: "+aResource.getFileName());
        // return 'null' if the resource was not found.
        // If you encounter problems, consider throwing the runtime exception WebApplicationException(message, cause, final httpStatus)
        // End of user code
        return aResource;
    }



    public String getETagFromFile(final File aResource)
    {
        String eTag = null;
        // Start of user code getETagFromFile
        // TODO Implement code to return an ETag for a particular resource
        // If you encounter problems, consider throwing the runtime exception WebApplicationException(message, cause, final httpStatus)
        // End of user code
        return eTag;
    }

}
