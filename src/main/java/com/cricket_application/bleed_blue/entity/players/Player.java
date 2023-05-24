package com.cricket_application.bleed_blue.entity.players;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Player {

    @JsonProperty("id")
    private String id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("imageId")
    private int  imageId;

    @JsonProperty("battingStyle")
    private String battingStyle;

    @JsonProperty("bowlingStyle")
    private String bowlingStyle;

    private String imageUrl;
}
