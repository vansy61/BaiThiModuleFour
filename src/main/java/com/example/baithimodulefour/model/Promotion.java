package com.example.baithimodulefour.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;
import lombok.Data;

import java.sql.Date;

@Entity
@Data
public class Promotion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "Tên khuyến mãi không được để trống")
    private String title;
    @NotBlank(message = "Mô tả khuyến mãi không được để trống")
    private String description;
    @NotNull(message = "Mức giảm giá không được để trống")
    @Min(value = 10000, message = "Mức giảm giá phải lớn hơn 10,000")
    private Double discountRate;
    @Future
    private Date endDate;
    @NotNull
    @FutureOrPresent
    private Date startDate;
}
