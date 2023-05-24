package com.cricket_application.bleed_blue.controller;

import com.cricket_application.bleed_blue.entity.news.Story;
import com.cricket_application.bleed_blue.service.NewsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin("http://localhost:3000")
@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class NewsController {

    private final NewsService newsService;

    @GetMapping("/news_latest_from_api")
    public List<Story> getAllNews(){
        return this.newsService.getAllNews();
    }

    @GetMapping("/all_latest_news")
    public List<Story> getAllNewsStoriesFromDb(){
        return this.newsService.getAllNewsStoriesFromDb();
    }

}
