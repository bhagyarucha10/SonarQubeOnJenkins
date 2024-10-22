package com.demo.SonarQubeOnMaven;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void testAdd()
    {
    	App obj=new App();
    int exp=obj.add(4, 5);
    	assertEquals(exp,9);
    }
    @Test
    public void testSub()
    {
    	App obj=new App();
    int exp=obj.sub(10, 5);
    	assertEquals(exp,5);
    }
}
