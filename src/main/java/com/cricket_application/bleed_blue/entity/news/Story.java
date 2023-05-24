package com.cricket_application.bleed_blue.entity.news;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Story {
    @Id
    @JsonProperty("id")
    private Integer id;

    @JsonProperty("hline")
    private String headLine;

    @JsonProperty("intro")
    private String introduction;

//    @JsonProperty("pubTime")
//    private String publishTime;

    @JsonProperty("source")
    private String source;

//    @JsonProperty("storyType")
//    private String storyType;

    @JsonProperty("context")
    private String context;

//    @JsonProperty("coverImage")
//    private CoverImage coverImage;
}
