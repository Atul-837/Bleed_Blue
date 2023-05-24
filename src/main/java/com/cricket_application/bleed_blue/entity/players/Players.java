package com.cricket_application.bleed_blue.entity.players;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class Players {

    @JsonProperty("player")
    private List<Player> player;

}
