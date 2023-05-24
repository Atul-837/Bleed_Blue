package com.cricket_application.bleed_blue.entity.schedule;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class GetSchedules {

    @JsonProperty("teamMatchesData")
    private List<TeamMatchesData> teamMatchesData;
}
