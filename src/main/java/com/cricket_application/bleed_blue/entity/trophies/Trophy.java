package com.cricket_application.bleed_blue.entity.trophies;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class Trophy {
    @Id
    private Integer id;
    private String trophyName;
    private String winningYear;
    private String imageUrl;

}
