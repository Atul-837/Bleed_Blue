package com.cricket_application.bleed_blue.entity.news;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CoverImage {

    @JsonProperty("id")
    private String id;

    @JsonProperty("caption")
    private String caption;

    @JsonProperty("source")
    private String source;

}
