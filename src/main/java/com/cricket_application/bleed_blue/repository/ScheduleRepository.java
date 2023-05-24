package com.cricket_application.bleed_blue.repository;

import com.cricket_application.bleed_blue.entity.schedule.MatchDetailsMapSchedule;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScheduleRepository extends MongoRepository<MatchDetailsMapSchedule, Integer> {
}
