package com.example.baithimodulefour.model;

import java.sql.Date;

public interface PromotionDTO {
    Long getId();
    String getTitle();
    Double getDiscountRate();
    String getDescription();
    Date getStartDate();
    Date getEndDate();
}
