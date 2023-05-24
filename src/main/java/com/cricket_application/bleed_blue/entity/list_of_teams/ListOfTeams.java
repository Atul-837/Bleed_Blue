package com.cricket_application.bleed_blue.entity.list_of_teams;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class ListOfTeams {

    @JsonProperty("list")
    private List<Team> teams;
}
