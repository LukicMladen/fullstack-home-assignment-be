package com.mladen.fullstackhomeassignmentbe.model;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

@Getter
@Setter
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class OpeningHours {

    private static final List<String> validDays =
        List.of("monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday");

    private List<Day> listOfDays;
    private boolean closedOnHolidays;
    private boolean openByArrangement;

    @JsonAnySetter
    public void setDay(String key, Object value) {
        if (key.equals("days")) {
            if (listOfDays == null) {
                listOfDays = getDefaultListOfDays();
            }
            ((LinkedHashMap) value).forEach((k, v) -> listOfDays.stream()
                                                                .filter(day -> day.getName() == k)
                                                                .findFirst()
                                                                .ifPresent(day1 -> day1.setWorkingHours((List<WorkingHours>) v)));

        }
    }

    private List<Day> getDefaultListOfDays() {
        List<Day> days = new ArrayList<>();
        validDays.forEach(validDay -> days.add(new Day(validDay)));
        return days;
    }
}
