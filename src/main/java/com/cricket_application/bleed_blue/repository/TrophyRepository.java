package com.cricket_application.bleed_blue.repository;

import com.cricket_application.bleed_blue.entity.trophies.Trophy;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TrophyRepository extends MongoRepository<Trophy, Integer> {
}
