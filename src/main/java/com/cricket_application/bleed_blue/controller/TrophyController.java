package com.cricket_application.bleed_blue.controller;

import com.cricket_application.bleed_blue.entity.trophies.Trophy;
import com.cricket_application.bleed_blue.service.TrophyService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("http://localhost:3000")
@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class TrophyController {

    private final TrophyService service;

    @PostMapping("/add_new_trophy")
    public void addNew(@RequestBody Trophy trophy){
         this.service.addTrophy(trophy);
    }

    @GetMapping("/trophies")
    public List<Trophy> getAllTrophies(){
        return this.service.getAllTrophies();
    }

}
