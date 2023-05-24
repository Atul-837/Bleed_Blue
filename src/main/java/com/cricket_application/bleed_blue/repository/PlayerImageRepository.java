package com.cricket_application.bleed_blue.repository;

import com.cricket_application.bleed_blue.entity.players.PlayerImage;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PlayerImageRepository extends MongoRepository<PlayerImage, String> {

    PlayerImage findPlayerImageByPlayerName(String playerName);
}
