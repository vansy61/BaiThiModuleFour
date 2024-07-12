package com.example.baithimodulefour.repository;

import com.example.baithimodulefour.model.Promotion;
import com.example.baithimodulefour.model.PromotionDTO;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface IPromotionRepo extends CrudRepository<Promotion, Long> {
    @Query("SELECT p FROM Promotion p WHERE " +
            "(:minRate IS NULL OR p.discountRate >= :minRate) AND " +
            "(:maxRate IS NULL OR p.discountRate <= :maxRate) AND " +
            "(:startDate IS NULL OR :startDate = '' OR p.startDate >= Date(:startDate)) AND " +
            "(:endDate IS NULL OR :endDate = '' OR p.endDate <= Date(:endDate))")
    Iterable<PromotionDTO> getPromotionsWithSearch(
            @Param("minRate") Double minRate,
            @Param("maxRate") Double maxRate,
            @Param("startDate") String startDate,
            @Param("endDate") String endDate
    );
}
