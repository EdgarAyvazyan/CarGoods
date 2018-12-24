package com.ayv.cargoods.domain;


import com.ayv.cargoods.common.ProductType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    private Long id;
    private String brand;
    private String description;
    private Integer price;
    private ProductType productType;

}
