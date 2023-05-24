package com.cricket_application.bleed_blue.entity.players;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class PlayerImage {
    @Id
    private String id;
    private String imageUrl;
    private String playerName;
}
