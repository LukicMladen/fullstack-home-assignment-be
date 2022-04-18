package com.mladen.fullstackhomeassignmentbe.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class BusinessEntry {

    private String displayedWhat;
    private String displayedWhere;
    private OpeningHours openingHours;
}
