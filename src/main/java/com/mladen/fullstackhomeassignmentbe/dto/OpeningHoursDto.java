package com.mladen.fullstackhomeassignmentbe.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class OpeningHoursDto {

    private List<DayDto> listOfDays;
}
