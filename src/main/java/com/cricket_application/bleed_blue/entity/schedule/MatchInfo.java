package com.cricket_application.bleed_blue.entity.schedule;

import com.cricket_application.bleed_blue.entity.list_of_teams.Team;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.data.annotation.Id;

// Will fetch the upcoming match information of the particular series
@Data
public class MatchInfo {
    @Id
    @JsonProperty("matchId")
    private Integer matchId;

    @JsonProperty("seriesId")
    private int seriesId;

    @JsonProperty("seriesName")
    private String seriesName;

    @JsonProperty("matchDesc")
    private String matchDesc;

    @JsonProperty("matchFormat")
    private String matchFormat;

    @JsonProperty("state")
    private String matchStatus;

    @JsonProperty("startDate")
    @JsonFormat(pattern = "DD-MM-YYYY")
    private String startDate;

    @JsonProperty("team1")
    private Team team1;

    @JsonProperty("team2")
    private Team team2;

    @JsonProperty("venueInfo")
    private VenueInfo venue;

    @JsonProperty("seriesStartDt")
    private String seriesStartDate;

    @JsonProperty("seriesEndDt")
    private String seriesEndDate;
}
