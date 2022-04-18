package com.mladen.fullstackhomeassignmentbe.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BusinessEntryDto {

    private String displayedWhat;
    private String displayedWhere;
    private OpeningHoursDto openingHours;
}
