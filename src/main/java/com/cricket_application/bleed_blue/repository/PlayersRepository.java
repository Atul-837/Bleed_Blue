package com.cricket_application.bleed_blue.repository;

import com.cricket_application.bleed_blue.entity.players.Player;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayersRepository extends MongoRepository<Player, String> {
    Player findByName(String name);
}
