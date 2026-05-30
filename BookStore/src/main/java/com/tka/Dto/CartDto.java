package com.tka.Dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class CartDto {

    private Long userId;

    private Long bookId;

    private int quantity;
}