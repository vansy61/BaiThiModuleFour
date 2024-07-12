package com.example.baithimodulefour.service;

import com.example.baithimodulefour.model.Promotion;
import com.example.baithimodulefour.model.PromotionDTO;

public interface IPromotionService {
    Iterable<PromotionDTO> getPromotions(Double minRate, Double maxRate, String startDate, String endDate);

    void save(Promotion promotion);

    void deleteById(Long id);
}
