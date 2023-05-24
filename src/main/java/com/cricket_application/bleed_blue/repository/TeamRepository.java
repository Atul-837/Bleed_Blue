package com.cricket_application.bleed_blue.repository;

import com.cricket_application.bleed_blue.entity.list_of_teams.Team;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRepository extends MongoRepository<Team, Integer> {
}
