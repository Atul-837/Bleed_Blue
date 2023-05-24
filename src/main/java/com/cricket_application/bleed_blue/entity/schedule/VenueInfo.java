package com.cricket_application.bleed_blue.entity.schedule;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class VenueInfo {
    @JsonProperty("id")
    private Integer id;

    @JsonProperty("ground")
    private String ground;

    @JsonProperty("city")
    private String city;

}
