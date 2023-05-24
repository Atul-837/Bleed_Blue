package com.cricket_application.bleed_blue.controller;

import com.cricket_application.bleed_blue.entity.schedule.MatchDetailsMapSchedule;
import com.cricket_application.bleed_blue.entity.schedule.MatchInfo;
import com.cricket_application.bleed_blue.service.ScheduleService;
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
public class ScheduleController {

    private final ScheduleService scheduleService;

    @GetMapping("/update_schedule")
    public void updateScheduleDB(){
         this.scheduleService.getScheduleFromApi();
    }

    @GetMapping("/schedule")
    public List<MatchDetailsMapSchedule> getMatchesSchedules(){
       return this.scheduleService.getMatchesSchedule();
    }

}
