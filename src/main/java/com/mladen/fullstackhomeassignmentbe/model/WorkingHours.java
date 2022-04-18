package com.mladen.fullstackhomeassignmentbe.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WorkingHours {

    private String start;
    private String end;
    private WorkingHoursType type;
}
