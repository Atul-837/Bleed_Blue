package com.cricket_application.bleed_blue.repository;

import com.cricket_application.bleed_blue.entity.news.NewsLatest;
import com.cricket_application.bleed_blue.entity.news.Story;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface NewsRepository extends MongoRepository<Story, Integer> {
}
