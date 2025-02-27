package com.project.productservicemarch2025.models;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BaseModel {

    private Integer id;
    private String name;
    private Boolean isDeleted = false;
}
