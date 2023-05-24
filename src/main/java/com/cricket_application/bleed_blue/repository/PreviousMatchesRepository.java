package com.cricket_application.bleed_blue.repository;

import com.cricket_application.bleed_blue.entity.results.MatchDetailsMap;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PreviousMatchesRepository extends MongoRepository<MatchDetailsMap, Integer> {
}
