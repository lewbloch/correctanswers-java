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
package com.lewscanon.lessons.algorithms.graphs;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

/**
 * Binary tree test.
 */
public class BinaryTreeNGTest
{

    @BeforeMethod
    public void setUpMethod()
    {
    }

    @AfterMethod
    public void tearDownMethod()
            throws Exception
    {
    }

    /**
     * Test of getRoot method, of class BinaryTree.
     */
    @Test
    public void testGetRoot()
    {
        System.out.println("getRoot");
        BinaryTree<String, String> instance = new BinaryTree<>() ;
        Node<String, String> expResult = null;
        Node<String, String> result = instance.getRoot();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRoot method, of class BinaryTree.
     */
    @Test
    public void testSetRoot()
    {
        System.out.println("setRoot");
        Node<String, String> root = null;
        BinaryTree<String, String> instance = new BinaryTree<>() ;
        instance.setRoot(root);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    private static final String EG_KEY = "example";

    /**
     * Test of remove method, of class BinaryTree.
     */
    @Test
    public void testRemove()
    {
        System.out.println("remove");
        Node<String, String> node = null;
        BinaryTree<String, String> instance = new BinaryTree<>() ;
        Node<String, String> expResult = null;
        Node<String, String> result = instance.remove(EG_KEY);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class BinaryTree.
     */
    @Test
    public void testRemoveNode()
    {
        System.out.println("remove");
        Node<String, String> probe = null;
        Node<String, String> node = null;
        BinaryTree<String, String> instance = new BinaryTree<>() ;
        Node<String, String> expResult = null;
        Node<String, String> result = instance.remove(probe, EG_KEY);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retrieve method, of class BinaryTree.
     */
    @Test
    public void testGet()
    {
        System.out.println("retrieve");
        Node<String, String> query = null;
        BinaryTree<String, String> instance = new BinaryTree<>() ;
        Node<String, String> expResult = null;
        Node<String, String> result = instance.get(EG_KEY);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retrieve method, of class BinaryTree.
     */
    @Test
    public void testRetrieveNode()
    {
        System.out.println("retrieve");
        Node<String, String> probe = null;
        Node<String, String> query = null;
        BinaryTree<String, String> instance = new BinaryTree<>() ;
        Node<String, String> expResult = null;
        Node<String, String> result = instance.retrieve(probe, EG_KEY);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insert method, of class BinaryTree.
     */
    @Test
    public void testPut()
    {
        System.out.println("insert");
        BinaryTree<String, String> instance = new BinaryTree<>() ;

        Node<String, String> fresh = new Node<>("Jones", "Bibber");
        Node<String, String> expResult = fresh;
        Node<String, String> result = instance.put(fresh.getKey(), fresh.getPayload());
        assertEquals(result, expResult, "Got " + result + " expected " + expResult);

         fresh = new Node<>("Billy", "Xerographer");
         expResult = fresh;
         result = instance.put(fresh.getKey(), fresh.getPayload());
         assertEquals(result, expResult, "Got " + result + " expected " + expResult);

         fresh = new Node<>("Ganesh", "Luckbringer");
         expResult = fresh;
         result = instance.put(fresh.getKey(), fresh.getPayload());
         assertEquals(result, expResult, "Got " + result + " expected " + expResult);

         fresh = new Node<>("Ganesh", "Luckbringer");
         result = instance.put(fresh.getKey(), fresh.getPayload());
         assertEquals(result, expResult, "Got " + result + " expected " + expResult);
    }

    /**
     * Test of maximum method, of class BinaryTree.
     */
    @Test
    public void testMaximum()
    {
        System.out.println("maximum");
        Node<String, String> node = null;
        BinaryTree<String, String> instance = new BinaryTree<>() ;
        Node<String, String> expResult = null;
        Node<String, String> result = instance.maximum(node);
        assertEquals(result, expResult);
    }

    /**
     * Test of minimum method, of class BinaryTree.
     */
    @Test
    public void testMinimum()
    {
        System.out.println("minimum");
        Node<String, String> node = null;
        BinaryTree<String, String> instance = new BinaryTree<>() ;
        Node<String, String> expResult = null;
        Node<String, String> result = instance.minimum(node);
        assertEquals(result, expResult);
    }

    /**
     * Test of predecessor method, of class BinaryTree.
     */
    @Test
    public void testPredecessor()
    {
        System.out.println("predecessor");
        Node<String, String> node = null;
        BinaryTree<String, String> instance = new BinaryTree<>() ;
        Node<String, String> expResult = null;
        Node<String, String> result = instance.predecessor(node);
        assertEquals(result, expResult);
    }

    /**
     * Test of successor method, of class BinaryTree.
     */
    @Test
    public void testSuccessor()
    {
        System.out.println("successor");
        Node<String, String> node = null;
        BinaryTree<String, String> instance = new BinaryTree<>() ;
        Node<String, String> expResult = null;
        Node<String, String> result = instance.successor(node);
        assertEquals(result, expResult);
    }
    
}
