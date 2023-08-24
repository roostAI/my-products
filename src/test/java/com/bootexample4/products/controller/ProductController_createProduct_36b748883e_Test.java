// Test generated by RoostGPT for test Weavr-test using AI Type Open AI and AI Model gpt-4

package com.bootexample4.products.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import com.bootexample4.products.model.Product;
import com.bootexample4.products.repository.ProductRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class ProductController_createProduct_36b748883e_Test {

    @InjectMocks
    private ProductController productController;

    @Mock
    private ProductRepository productRepository;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testCreateProductSuccess() {
        Product product = new Product();
        product.setId(1);
        product.setName("Test Product");

        when(productRepository.save(product)).thenReturn(product);

        Product createdProduct = productController.createProduct(product);

        assertEquals(product.getId(), createdProduct.getId());
        assertEquals(product.getName(), createdProduct.getName());
    }

    @Test
    public void testCreateProductFailure() {
        Product product = new Product();
        product.setId(1);
        product.setName("Test Product");

        when(productRepository.save(product)).thenReturn(null);

        Product createdProduct = productController.createProduct(product);

        assertEquals(null, createdProduct);
    }
}