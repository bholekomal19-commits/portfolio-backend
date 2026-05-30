package com.tka.Dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class BookDto {

    private String title;

    private String author;

    private double price;

    private String description;

    private String imageUrl;

    private Long categoryId;
}