package com.mytaxi.core.services;

import de.gfred.core.services.StringServiceImpl;
import de.gfred.shared.services.StringService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ExampleUnitTest
{
    protected StringService service;


    @Before
    public void setUp()
    {
        service = new StringServiceImpl();
    }


    @After
    public void tearDown()
    {
        service = null;
    }


    @Test
    public void hasNoInitialStringValue()
    {
        assertFalse(service.hasString());
    }


    @Test
    public void hasStringValueNotAvailable()
    {
        service.setString("");
        assertFalse(service.hasString());
    }


    @Test
    public void hasStringValueAvailable()
    {
        service.setString("Test");
        assertTrue(service.hasString());
    }
}