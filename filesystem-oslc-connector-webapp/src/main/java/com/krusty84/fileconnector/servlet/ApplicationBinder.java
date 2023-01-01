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

package com.krusty84.fileconnector.servlet;

import java.util.ArrayList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.glassfish.hk2.api.Factory;
import org.glassfish.hk2.utilities.binding.AbstractBinder;

import javax.inject.Singleton;

import com.krusty84.fileconnector.RestDelegate;
import com.krusty84.fileconnector.services.WebService_FileExposure;
import com.krusty84.fileconnector.ResourcesFactory;

import org.apache.log4j.xml.DOMConfigurator;
import org.eclipse.lyo.oslc4j.core.OSLC4JUtils;
// Start of user code imports
// End of user code

// Start of user code pre_class_code
// End of user code

public class ApplicationBinder extends AbstractBinder {

    //*krusty84, was added for using log4j
    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(WebService_FileExposure.class.getSimpleName());

    // Start of user code class_attributes
    // End of user code

    // Start of user code class_methods
    // End of user code

    public ApplicationBinder()
    {
        //*krusty84, was added for initialize log4j
    	DOMConfigurator.configure("src/main/resources/log4j.xml");
        logger.info("HK2 contract binding init");
        //*krusty84, was added call to debug reason
        System.out.println("Was Called: "+ApplicationBinder.class);
    }

    @Override
    protected void configure() {
    	logger.info("HK2 contract binding start");
    
        bindAsContract(RestDelegate.class).in(Singleton.class);
        bindFactory(ResourcesFactoryFactory.class).to(ResourcesFactory.class).in(Singleton.class);
    
    }
    static class ResourcesFactoryFactory implements Factory<ResourcesFactory> {
        @Override
        public ResourcesFactory provide() {
            return new ResourcesFactory(OSLC4JUtils.getServletURI());
        }
    
        @Override
        public void dispose(ResourcesFactory instance) {
        }
    }
    
}
