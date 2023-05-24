package com.cricket_application.bleed_blue.controller;

import com.cricket_application.bleed_blue.entity.results.MatchDetailsMap;
import com.cricket_application.bleed_blue.service.PreviousMatchesService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin("http://localhost:3000")
@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class PreviousMatchesController {

    private final PreviousMatchesService previousMatchesService;

    @GetMapping("/update_previous_matches_results")
    public List<MatchDetailsMap> savePreviousMatchesResultsToDb(){
        return this.previousMatchesService.savePreviousMatchesInfoToDb();
    }

    @GetMapping("/previous_matches_results")
    public List<MatchDetailsMap> getPreviousMatchesResults(){
        return this.previousMatchesService.getPreviousMatchesResults();
    }

}
