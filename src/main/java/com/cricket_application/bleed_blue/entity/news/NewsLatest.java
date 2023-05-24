package com.cricket_application.bleed_blue.entity.news;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class NewsLatest {

    @JsonProperty("storyList")
    private List<StoryList> storyList;

}
