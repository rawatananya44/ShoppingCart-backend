package com.shoppingCartbackend.ShoppingCartbackend.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto {
    private Long prodID;
    private String name;
    private String category;
    private double price;
    private String description;
    private Integer stockCount;
    private Boolean inStock;

}
