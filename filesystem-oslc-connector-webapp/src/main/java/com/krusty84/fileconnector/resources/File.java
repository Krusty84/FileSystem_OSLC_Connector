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
 *
 * This file is generated by Lyo Designer (https://www.eclipse.org/lyo/)
 */
// End of user code

package com.krusty84.fileconnector.resources;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;

import org.eclipse.lyo.oslc4j.core.OSLC4JUtils;
import org.eclipse.lyo.oslc4j.core.exception.OslcCoreApplicationException;
import org.eclipse.lyo.oslc4j.core.annotation.OslcAllowedValue;
import org.eclipse.lyo.oslc4j.core.annotation.OslcDescription;
import org.eclipse.lyo.oslc4j.core.annotation.OslcMemberProperty;
import org.eclipse.lyo.oslc4j.core.annotation.OslcName;
import org.eclipse.lyo.oslc4j.core.annotation.OslcNamespace;
import org.eclipse.lyo.oslc4j.core.annotation.OslcOccurs;
import org.eclipse.lyo.oslc4j.core.annotation.OslcPropertyDefinition;
import org.eclipse.lyo.oslc4j.core.annotation.OslcRdfCollectionType;
import org.eclipse.lyo.oslc4j.core.annotation.OslcRange;
import org.eclipse.lyo.oslc4j.core.annotation.OslcReadOnly;
import org.eclipse.lyo.oslc4j.core.annotation.OslcRepresentation;
import org.eclipse.lyo.oslc4j.core.annotation.OslcResourceShape;
import org.eclipse.lyo.oslc4j.core.annotation.OslcTitle;
import org.eclipse.lyo.oslc4j.core.annotation.OslcValueType;
import org.eclipse.lyo.oslc4j.core.model.AbstractResource;
import org.eclipse.lyo.oslc4j.core.model.Link;
import org.eclipse.lyo.oslc4j.core.model.Occurs;
import org.eclipse.lyo.oslc4j.core.model.OslcConstants;
import org.eclipse.lyo.oslc4j.core.model.Representation;
import org.eclipse.lyo.oslc4j.core.model.ValueType;
import org.eclipse.lyo.oslc4j.core.model.ResourceShape;
import org.eclipse.lyo.oslc4j.core.model.ResourceShapeFactory;

import com.krusty84.fileconnector.resources.Oslc_fsnspDomainConstants;

import com.krusty84.fileconnector.resources.Oslc_fsnspDomainConstants;
// Start of user code imports
// End of user code

// Start of user code preClassCode
// End of user code

// Start of user code classAnnotations
// End of user code
@OslcNamespace(Oslc_fsnspDomainConstants.FILE_NAMESPACE)
@OslcName(Oslc_fsnspDomainConstants.FILE_LOCALNAME)
@OslcResourceShape(title = "File Shape", description = "The resource represents real file(-s) on file system", describes = Oslc_fsnspDomainConstants.FILE_TYPE)
public class File
    extends AbstractResource
    implements IFile
{
    // Start of user code attributeAnnotation:fileName
    // End of user code
    private String fileName;
    // Start of user code attributeAnnotation:lastModifiedTime
    // End of user code
    private Date lastModifiedTime;
    
    // Start of user code classAttributes
    // End of user code
    // Start of user code classMethods
    // End of user code
    public File()
    {
        super();
    
        // Start of user code constructor1
        // End of user code
    }
    
    public File(final URI about)
    {
        super(about);
    
        // Start of user code constructor2
        // End of user code
    }
    
    public static ResourceShape createResourceShape() throws OslcCoreApplicationException, URISyntaxException {
        return ResourceShapeFactory.createResourceShape(OSLC4JUtils.getServletURI(),
        OslcConstants.PATH_RESOURCE_SHAPES,
        Oslc_fsnspDomainConstants.FILE_PATH,
        File.class);
    }
    
    
    public String toString()
    {
        return toString(false);
    }
    
    public String toString(boolean asLocalResource)
    {
        String result = "";
        // Start of user code toString_init
        // End of user code
    
        if (asLocalResource) {
            result = result + "{a Local File Resource} - update File.toString() to present resource as desired.";
            // Start of user code toString_bodyForLocalResource
            // End of user code
        }
        else {
            result = String.valueOf(getAbout());
        }
    
        // Start of user code toString_finalize
        // End of user code
    
        return result;
    }
    
    
    // Start of user code getterAnnotation:fileName
    // End of user code
    @OslcName("FileName")
    @OslcPropertyDefinition(Oslc_fsnspDomainConstants.FILE_SYSTEM_NAMSPACE + "FileName")
    @OslcOccurs(Occurs.ExactlyOne)
    @OslcValueType(ValueType.String)
    @OslcReadOnly(false)
    public String getFileName()
    {
        // Start of user code getterInit:fileName
        // End of user code
        return fileName;
    }

    // Start of user code getterAnnotation:lastModifiedTime
    // End of user code
    @OslcName("LastModifiedTime")
    @OslcPropertyDefinition(Oslc_fsnspDomainConstants.FILE_SYSTEM_NAMSPACE + "LastModifiedTime")
    @OslcOccurs(Occurs.ExactlyOne)
    @OslcValueType(ValueType.DateTime)
    @OslcReadOnly(false)
    public Date getLastModifiedTime()
    {
        // Start of user code getterInit:lastModifiedTime
        // End of user code
        return lastModifiedTime;
    }

    // Start of user code setterAnnotation:fileName
    // End of user code
    public void setFileName(final String fileName )
    {
        // Start of user code setterInit:fileName
        // End of user code
        this.fileName = fileName;
        // Start of user code setterFinalize:fileName
        // End of user code
    }

    // Start of user code setterAnnotation:lastModifiedTime
    // End of user code
    public void setLastModifiedTime(final Date lastModifiedTime )
    {
        // Start of user code setterInit:lastModifiedTime
        // End of user code
        this.lastModifiedTime = lastModifiedTime;
        // Start of user code setterFinalize:lastModifiedTime
        // End of user code
    }

}