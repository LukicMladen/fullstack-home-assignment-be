package com.mladen.fullstackhomeassignmentbe.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Day {

    private String name;
    private List<WorkingHours> workingHours;

    public Day(String name, List<WorkingHours> workingHours) {
        this.name = name;
        this.workingHours = workingHours;
    }

    public Day(String name) {
        this.name = name;
    }
}
