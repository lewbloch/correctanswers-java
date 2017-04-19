/*
 * Copyright 2017, Lewis S. Bloch.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.lewscanon.lessons.novelties;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


/**
 *
 */
public class NetworkedMachineNGTest
{
    final Logger logger = LogManager.getLogger(getClass());

    public NetworkedMachineNGTest()
    {
    }

    @BeforeClass
    public static void setUpClass()
    {
    }

    @AfterClass
    public static void tearDownClass()
    {
    }

    @BeforeMethod
    public void setUpMethod()
    {
    }

    @AfterMethod
    public void tearDownMethod()
    {
    }

    /**
     * Test of values method, of class NetworkedMachine.
     */
    @Test
    public void testValues()
    {
        logger.info("values");
        for( NetworkedMachine machine : NetworkedMachine.values()) {
            logger.info(machine + " id: " + machine.getCatalogId() 
                + ", owner: [" + machine.getOwner() + "]"
                + ", owns: " + machine.getOwns()
             );
        }
    }

    /**
     * Test of getCatalogId method, of class NetworkedMachine.
     */
    @Test
    public void testGetCatalogId()
    {
        logger.info("getCatalogId");
        for( NetworkedMachine machine : NetworkedMachine.values()) {
            logger.info(machine + " { id: " + machine.getCatalogId());
        }
    }

    /**
     * Test of getOwner method, of class NetworkedMachine.
     */
    @Test
    public void testGetOwner()
    {
        logger.info("getOwner");
        for( NetworkedMachine machine : NetworkedMachine.values()) {
            logger.info(machine + " owner: [" + machine.getOwner() + "]");
        }
    }

    /**
     * Test of getOwns method, of class NetworkedMachine.
     */
    @Test
    public void testGetOwns()
    {
        logger.info("getOwned");
        for( NetworkedMachine machine : NetworkedMachine.values()) {
            logger.info(machine + " owns: " + machine.getOwns());
        }
    }

    /**
     * Test of isOwned method, of class NetworkedMachine.
     */
    @Test
    public void testIsOwned()
    {
        logger.info("isOwned");
        for( NetworkedMachine machine : NetworkedMachine.values()) {
            logger.info(machine + " isOwned: " + machine.isOwned());
        }
    }
    
}
