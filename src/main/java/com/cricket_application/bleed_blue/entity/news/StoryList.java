package com.cricket_application.bleed_blue.entity.news;

import com.cricket_application.bleed_blue.entity.news.Story;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class StoryList {

    @JsonProperty("story")
    private Story stories;

}
