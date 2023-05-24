package com.cricket_application.bleed_blue.service;

import com.cricket_application.bleed_blue.entity.schedule.GetSchedules;
import com.cricket_application.bleed_blue.entity.schedule.MatchDetailsMapSchedule;
import com.cricket_application.bleed_blue.entity.schedule.TeamMatchesData;
import com.cricket_application.bleed_blue.repository.ScheduleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ScheduleService {

    private final ScheduleRepository scheduleRepository;
    private final CricBuzzService cricBuzzService;

    public List<MatchDetailsMapSchedule> getScheduleFromApi(){
        GetSchedules getSchedules = this.cricBuzzService.upcomingMatches();
        List<TeamMatchesData> teamMatchesData = getSchedules.getTeamMatchesData();
        this.scheduleRepository.deleteAll();
        List<MatchDetailsMapSchedule> matchDetailsMapList = new ArrayList<>();
        teamMatchesData.forEach(data -> {
            if(data.getMatchDetailsMapSchedule() != null) matchDetailsMapList.add(data.getMatchDetailsMapSchedule());
        });
        scheduleRepository.saveAll(matchDetailsMapList);
        return matchDetailsMapList;

    }

    public List<MatchDetailsMapSchedule> getMatchesSchedule(){
        return this.scheduleRepository.findAll();
    }

}
