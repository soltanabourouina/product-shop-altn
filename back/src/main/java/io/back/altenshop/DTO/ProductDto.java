package io.back.altenshop.DTO;

import lombok.Data;

@Data

public class ProductDto {
    private String name;
    private String description;
    private Double price;
    private Number quantity;
    private String inventoryStatus;
    private String category;
    private String image;
    private Number rating;
}
