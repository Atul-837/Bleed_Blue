package com.cricket_application.bleed_blue.controller;

import com.cricket_application.bleed_blue.entity.players.Player;
import com.cricket_application.bleed_blue.entity.players.PlayerImage;
import com.cricket_application.bleed_blue.service.PlayerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("http://localhost:3000")
@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class PlayerController {

    private final PlayerService playerService;

    @GetMapping("/our_active_squad")
    public List<Player> getAllPlayers(){
        return this.playerService.getAllPlayers();
    }

    @PostMapping("/add_player_image")
    public PlayerImage addImage(@RequestBody PlayerImage image){
        return this.playerService.addImage(image);
    }

    @GetMapping("/player_images")
    public List<PlayerImage> getPlayersImages(){
        return this.playerService.getPlayersImages();
    }

    @PutMapping("/update_players")
    public void updatePlayer(){
        List<PlayerImage> playersImages = this.playerService.getPlayersImages();
         playersImages.forEach(image -> {
             this.playerService.updatePlayer(image.getPlayerName());
         });
    }

}
