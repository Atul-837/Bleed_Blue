package com.cricket_application.bleed_blue.entity.results;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class PreviousMatchesResults {

    @JsonProperty("teamMatchesData")
    private List<TeamMatchesData> teamMatchesData;
}
