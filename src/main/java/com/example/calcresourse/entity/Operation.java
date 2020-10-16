package com.example.calcresourse.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Operation {
    private double num1;
    private double num2;
    private String operationType;
    private double result;
}
