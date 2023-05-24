package com.cricket_application.bleed_blue.service;

import com.cricket_application.bleed_blue.entity.results.PreviousMatchesResults;
import com.cricket_application.bleed_blue.entity.results.MatchDetailsMap;
import com.cricket_application.bleed_blue.entity.results.TeamMatchesData;
import com.cricket_application.bleed_blue.repository.PreviousMatchesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
@RequiredArgsConstructor
public class PreviousMatchesService {

    private final PreviousMatchesRepository previousMatchesRepository;
    private final CricBuzzService cricBuzzService;

    public List<MatchDetailsMap> savePreviousMatchesInfoToDb(){
        PreviousMatchesResults previousMatchesResults = this.cricBuzzService.previousMatchesResults();
        assert previousMatchesResults != null;
        List<TeamMatchesData> teamMatchesData = previousMatchesResults.getTeamMatchesData();
        this.previousMatchesRepository.deleteAll();
        List<MatchDetailsMap> matchDetailsMapList = new ArrayList<>();
        teamMatchesData.forEach(matchData -> {
            if(matchData.getMatchDetailsMap() != null) matchDetailsMapList.add(matchData.getMatchDetailsMap());
        });
        this.previousMatchesRepository.saveAll(matchDetailsMapList);

        return matchDetailsMapList;

    }

    public List<MatchDetailsMap> getPreviousMatchesResults(){
        return this.previousMatchesRepository.findAll();
    }


}
