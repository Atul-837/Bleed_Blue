package com.cricket_application.bleed_blue.service;

import com.cricket_application.bleed_blue.entity.players.Player;
import com.cricket_application.bleed_blue.entity.players.PlayerImage;
import com.cricket_application.bleed_blue.repository.PlayerImageRepository;
import com.cricket_application.bleed_blue.repository.PlayersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PlayerService {

    private final PlayersRepository playersRepository;
    private final PlayerImageRepository playerImageRepository;

    public List<Player> getAllPlayers(){
        return this.playersRepository.findAll();
    }

    public PlayerImage addImage(PlayerImage image){
        return this.playerImageRepository.save(image);
    }

    public List<PlayerImage> getPlayersImages(){
        return this.playerImageRepository.findAll();
    }

    public void updatePlayer(String playerName){
        Player player = this.playersRepository.findByName(playerName);
        PlayerImage image = this.playerImageRepository.findPlayerImageByPlayerName(playerName);
        player.setImageUrl(image.getImageUrl());
        this.playersRepository.save(player);
    }

}
