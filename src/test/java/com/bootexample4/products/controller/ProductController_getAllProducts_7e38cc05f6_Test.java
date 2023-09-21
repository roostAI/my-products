package com.bootexample4.products.controller;

import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import com.bootexample4.products.model.Product;
import com.bootexample4.products.repository.ProductRepository;

public class ProductController_getAllProducts_7e38cc05f6_Test {

    @InjectMocks
    ProductController productController;

    @Mock
    ProductRepository productRepository;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetAllProducts() {
        Product product1 = new Product();
        product1.setId(1L);  // changed from int to Long
        product1.setName("Product1");
        product1.setDescription("Description1");
        product1.setPrice(100.0);

        Product product2 = new Product();
        product2.setId(2L);  // changed from int to Long
        product2.setName("Product2");
        product2.setDescription("Description2");
        product2.setPrice(200.0);

        List<Product> expectedProducts = Arrays.asList(product1, product2);

        when(productRepository.findAll()).thenReturn(expectedProducts);

        List<Product> actualProducts = productController.getAllProducts();

        assertEquals(expectedProducts, actualProducts);
    }

    @Test
    public void testGetAllProductsEmpty() {
        List<Product> expectedProducts = Arrays.asList();

        when(productRepository.findAll()).thenReturn(expectedProducts);

        List<Product> actualProducts = productController.getAllProducts();

        assertEquals(expectedProducts, actualProducts);
    }
}
