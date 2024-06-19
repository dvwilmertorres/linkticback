package org.linktic.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDto {
    private Long pkid_product;
    private String creation_date;
    private String expiration_date;
    private String name;
    private String description;
}
