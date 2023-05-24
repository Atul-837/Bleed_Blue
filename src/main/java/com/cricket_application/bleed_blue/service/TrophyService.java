package com.cricket_application.bleed_blue.service;

import com.cricket_application.bleed_blue.entity.trophies.Trophy;
import com.cricket_application.bleed_blue.repository.TrophyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TrophyService {

    private final TrophyRepository trophyRepository;

    public void addTrophy(Trophy trophy){
        this.trophyRepository.save(trophy);
    }

    public List<Trophy> getAllTrophies(){
        return this.trophyRepository.findAll();
    }
}
