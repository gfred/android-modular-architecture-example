package com.mytaxi.core.services;

import de.gfred.core.services.StringServiceImpl;
import de.gfred.shared.models.services.StringService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
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
    public void hasStringValueNotAvailable()
    {
        service.setString("Robin");
        assertTrue(service.hasString());
    }


    @Test
    public void hasStringValueAvailable()
    {
        service.setString("Robin");
        assertTrue(service.hasString());
    }


    @Test
    public void hasInitialStringValue()
    {
        assertTrue(service.hasString());
        assertEquals("Batman", service.getString());
    }
}