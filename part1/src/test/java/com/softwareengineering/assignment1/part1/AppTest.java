package com.softwareengineering.assignment1.part1;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.joda.time.*;


/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
    	 DateTime DOB = new DateTime(1995, 8, 18, 0,0,0);
         String name ="Annie Duffy";
         String age = "22";
         Student student = new Student(name, age, DOB, "14903113");
         Assert.assertEquals(name+age, student.getUsername());
    }
}
