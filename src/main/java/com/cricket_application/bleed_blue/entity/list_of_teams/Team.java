package com.cricket_application.bleed_blue.entity.list_of_teams;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Team {
    @Id
    @JsonProperty("teamId")
    private Integer teamId;

    @JsonProperty("teamName")
    private String teamName;

    @JsonProperty("teamSName")
    private String teamSName;

    @JsonProperty("imageId")
    private int imageId;

    @JsonProperty("countryName")
    private String countryName;
}
