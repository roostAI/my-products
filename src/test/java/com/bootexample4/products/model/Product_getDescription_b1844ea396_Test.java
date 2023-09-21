// Test generated by RoostGPT for test JavaUnitTest using AI Type Open AI and AI Model gpt-4

package com.bootexample4.products.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

public class Product_getDescription_b1844ea396_Test {

    @InjectMocks
    Product product;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetDescriptionSuccess() {
        String expectedDescription = "This is a test product description";
        product.setDescription(expectedDescription);
        String actualDescription = product.getDescription();
        Assertions.assertEquals(expectedDescription, actualDescription, "The expected description does not match the actual description");
    }

    @Test
    public void testGetDescriptionNull() {
        String expectedDescription = null;
        product.setDescription(expectedDescription);
        String actualDescription = product.getDescription();
        Assertions.assertNull(actualDescription, "The expected description is not null");
    }
}