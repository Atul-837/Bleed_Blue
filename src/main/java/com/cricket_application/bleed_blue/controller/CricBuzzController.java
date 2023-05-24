package com.cricket_application.bleed_blue.controller;

import com.cricket_application.bleed_blue.entity.list_of_teams.ListOfTeams;
import com.cricket_application.bleed_blue.entity.news.NewsLatest;
import com.cricket_application.bleed_blue.entity.players.Players;
import com.cricket_application.bleed_blue.entity.results.PreviousMatchesResults;
import com.cricket_application.bleed_blue.entity.schedule.GetSchedules;
import com.cricket_application.bleed_blue.service.CricBuzzService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("http://localhost:3000")
@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class CricBuzzController {

    private final CricBuzzService service;

    @GetMapping("/teams_international")
    public ListOfTeams getTeams(){
        return service.getTeams();
    }

    @GetMapping("/upcoming_matches")
    public GetSchedules upcomingMatches(){
        return service.upcomingMatches();
    }

    @GetMapping("/previous_results")
    public PreviousMatchesResults previousMatchesResults(){
        return service.previousMatchesResults();
    }

    @GetMapping("/news_latest")
    public NewsLatest getLatestNews(){
        return service.getLatestNews();
    }

    @GetMapping("/players")
    public Players getPlayers(){
        return service.getPlayers();
    }

}
