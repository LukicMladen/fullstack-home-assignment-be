package com.mladen.fullstackhomeassignmentbe.dto;

import com.mladen.fullstackhomeassignmentbe.model.WorkingHours;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class DayDto {

    private String name;
    private List<WorkingHours> workingHours;
}
