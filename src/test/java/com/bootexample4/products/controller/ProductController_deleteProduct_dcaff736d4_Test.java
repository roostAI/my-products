package com.bootexample4.products.controller;

import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;

import com.bootexample4.products.model.Product;
import com.bootexample4.products.repository.ProductRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import java.util.Optional;

@SpringBootTest
public class ProductController_deleteProduct_dcaff736d4_Test {

    @MockBean
    private ProductRepository productRepository;

    private ProductController productController;

    @BeforeEach
    void setUp() {
        productController = new ProductController();
    }

    @Test
    public void testDeleteProduct_success() {
        Product product = new Product();
        product.setId(1L);

        when(productRepository.findById(any(Long.class))).thenReturn(Optional.of(product));

        ResponseEntity<Object> responseEntity = productController.deleteProduct(1L);

        verify(productRepository).delete(product);

        assertEquals(ResponseEntity.ok().build(), responseEntity);
    }

    @Test
    public void testDeleteProduct_notFound() {
        when(productRepository.findById(any(Long.class))).thenReturn(Optional.empty());

        ResponseEntity<Object> responseEntity = productController.deleteProduct(1L);

        assertEquals(ResponseEntity.notFound().build(), responseEntity);
    }
}
