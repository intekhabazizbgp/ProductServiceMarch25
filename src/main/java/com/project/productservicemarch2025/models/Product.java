package com.project.productservicemarch2025.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product extends BaseModel{

    private String description;
    private Double price;
    private Category category;
    private String image;
}
