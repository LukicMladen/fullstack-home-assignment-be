package com.mladen.fullstackhomeassignmentbe.dto;

import com.mladen.fullstackhomeassignmentbe.model.WorkingHoursType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WorkingHoursDto {

    private String start;
    private String end;
    private WorkingHoursType type;
}
