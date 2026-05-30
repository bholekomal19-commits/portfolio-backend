package com.tka.Dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter

public class OrderDto {

    private Long userId;

    private List<Long> bookIds;

    private double totalPrice;

    private LocalDate orderDate;

    private String status;
}