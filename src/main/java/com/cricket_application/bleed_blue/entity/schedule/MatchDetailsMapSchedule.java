package com.cricket_application.bleed_blue.entity.schedule;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.List;

@Data
public class MatchDetailsMapSchedule {

    @JsonProperty("key")
    private String seriesName;

    @JsonProperty("match")
    private List<Match> matches;

    @Id
    @JsonProperty("seriesId")
    private Integer seriesId;

}
