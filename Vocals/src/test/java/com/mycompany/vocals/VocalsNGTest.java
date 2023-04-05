/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package com.mycompany.vocals;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author alumno
 */
public class VocalsNGTest {
    
    public VocalsNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of esVocal method, of class Vocals.
     */
    @Test
    public void testEsVocal() {
        System.out.println("esVocal");
        String lletra = "A";
        Vocals instance = new Vocals();
        boolean expResult = true;
        boolean result = instance.esVocal(lletra);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testEsVocal2() {
        System.out.println("esVocal");
        String lletra = "a";
        Vocals instance = new Vocals();
        boolean expResult = true;
        boolean result = instance.esVocal(lletra);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testEsVocal3() {
        System.out.println("esVocal");
        String lletra = "C";
        Vocals instance = new Vocals();
        boolean expResult = false;
        boolean result = instance.esVocal(lletra);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testEsVocal4() {
        System.out.println("esVocal");
        String lletra = "-";
        Vocals instance = new Vocals();
        boolean expResult = false;
        boolean result = instance.esVocal(lletra);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testEsVocal5() {
        System.out.println("esVocal");
        String lletra = " ";
        Vocals instance = new Vocals();
        boolean expResult = false;
        boolean result = instance.esVocal(lletra);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testEsVocal6() {
        System.out.println("esVocal");
        String lletra = "á";
        Vocals instance = new Vocals();
        boolean expResult = false;
        boolean result = instance.esVocal(lletra);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
