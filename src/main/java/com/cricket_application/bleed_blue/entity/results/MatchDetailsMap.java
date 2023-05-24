package com.cricket_application.bleed_blue.entity.results;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.List;

@Data
public class MatchDetailsMap {

    @JsonProperty("key")
    private String seriesName;

    @JsonProperty("match")
    private List<Match> matches;

    @Id
    @JsonProperty("seriesId")
    private Integer seriesId;

}
