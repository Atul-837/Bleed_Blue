package com.cricket_application.bleed_blue.entity.results;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class TeamMatchesData {

    @JsonProperty("matchDetailsMap")
    private MatchDetailsMap matchDetailsMap;
}
