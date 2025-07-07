package com.mardixx.angularShop.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Article {
    @Id
    @GeneratedValue
    private Long id;

    @NotBlank
    private String name;

    @NotBlank
    private String shortDescription;

    @NotBlank
    private String longDescription;

    @Enumerated(EnumType.STRING)
    private TypesEnum typeOfObject;

    private Long price;
}
