package com.shoppingCartbackend.ShoppingCartbackend.service;

import com.shoppingCartbackend.ShoppingCartbackend.dto.ProductDto;

import java.util.List;

public interface ProductService {
    ProductDto createProduct(ProductDto productDto);
    ProductDto getProductById(Long prodId);
    List<ProductDto> getAllProduct();
    ProductDto updateProduct(Long prodId, ProductDto updatedProduct);
    void deleteProduct(Long prodId);



}
