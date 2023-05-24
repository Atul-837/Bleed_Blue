package com.cricket_application.bleed_blue.service;

import com.cricket_application.bleed_blue.entity.news.NewsLatest;
import com.cricket_application.bleed_blue.entity.news.Story;
import com.cricket_application.bleed_blue.entity.news.StoryList;
import com.cricket_application.bleed_blue.repository.NewsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class NewsService {

    private final NewsRepository newsRepository;
    private final CricBuzzService cricBuzzService;

    public List<Story> getAllNews(){
        NewsLatest latestNews = this.cricBuzzService.getLatestNews();
        List<StoryList> storyList = latestNews.getStoryList();
        List<Story> newsStories = new ArrayList<>();
        this.newsRepository.deleteAll();
        storyList.forEach(story -> {
            if(story.getStories() !=null) newsStories.add(story.getStories());
        });

        this.newsRepository.saveAll(newsStories);
        return newsStories;
    }

    public List<Story> getAllNewsStoriesFromDb(){
      return   this.newsRepository.findAll();
    }

}
