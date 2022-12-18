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


import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import javax.ws.rs.core.UriBuilder;

import org.eclipse.lyo.oslc4j.core.model.Link;
import org.eclipse.lyo.oslc4j.core.OSLC4JUtils;
import com.krusty84.fileconnector.resources.File;

// Start of user code imports
// End of user code

// Start of user code pre_class_code
// End of user code

public class ResourcesFactory {

    private static String basePath;

    // Start of user code class_attributes
    // End of user code

    public ResourcesFactory(String basePath) {
        this.basePath = basePath;
    }

    // Start of user code class_methods
    // End of user code

    //methods for File resource
    
    public static File createFile(final String file_id) {
        return new File(constructURIForFile(file_id));
    }
    
    public static URI constructURIForFile(final String file_id) {
        Map<String, Object> pathParameters = new HashMap<String, Object>();
        pathParameters.put("file_id", file_id);
        String instanceURI = "files/{file_id}";
    
        final UriBuilder builder = UriBuilder.fromUri(basePath);
        return builder.path(instanceURI).buildFromMap(pathParameters);
    }
    
    public Link constructLinkForFile(final String file_id , final String label) {
        return new Link(constructURIForFile(file_id), label);
    }
    
    public Link constructLinkForFile(final String file_id) {
        return new Link(constructURIForFile(file_id));
    }
    

}
