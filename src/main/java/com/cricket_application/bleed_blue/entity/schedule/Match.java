package com.cricket_application.bleed_blue.entity.schedule;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Match {

    @JsonProperty("matchInfo")
    private MatchInfo matchInfo;
}
