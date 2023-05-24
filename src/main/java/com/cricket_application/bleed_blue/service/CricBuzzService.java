package com.cricket_application.bleed_blue.service;

import com.cricket_application.bleed_blue.entity.list_of_teams.ListOfTeams;
import com.cricket_application.bleed_blue.entity.news.NewsLatest;
import com.cricket_application.bleed_blue.entity.players.Player;
import com.cricket_application.bleed_blue.entity.players.Players;
import com.cricket_application.bleed_blue.entity.results.PreviousMatchesResults;
import com.cricket_application.bleed_blue.entity.schedule.GetSchedules;
import com.cricket_application.bleed_blue.repository.PlayersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;


import java.util.List;

import static com.cricket_application.bleed_blue.constants.URIConstants.*;

@Service
@RequiredArgsConstructor
public class CricBuzzService {

    private final PlayersRepository playersRepository;
    private final WebClient webClient = WebClient.create();

    public ListOfTeams getTeams(){

        return webClient.get().uri(GET_TEAMS_URI)
               .header("X-RapidAPI-Key", "b9dd44a9cdmshb9b39aefc1dfe83p11d73ejsnca5066f82bdc")
               .header("X-RapidAPI-Host", "cricbuzz-cricket.p.rapidapi.com")
               .retrieve()
               .bodyToMono(ListOfTeams.class)
               .block();

    }

    public GetSchedules upcomingMatches(){

        return webClient.get().uri(GET_UPCOMING_MATCHES)
                .header("X-RapidAPI-Key", "b9dd44a9cdmshb9b39aefc1dfe83p11d73ejsnca5066f82bdc")
                .header("X-RapidAPI-Host", "cricbuzz-cricket.p.rapidapi.com")
                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .retrieve()
                .bodyToMono(GetSchedules.class)
                .block();

    }

    public PreviousMatchesResults previousMatchesResults(){

        return webClient.get().uri(PREVIOUS_MATCHES_RESULTS)
                .header("X-RapidAPI-Key", "b9dd44a9cdmshb9b39aefc1dfe83p11d73ejsnca5066f82bdc")
                .header("X-RapidAPI-Host", "cricbuzz-cricket.p.rapidapi.com")
                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .retrieve()
                .bodyToMono(PreviousMatchesResults.class)
                .block();
    }


    public NewsLatest getLatestNews(){
        return webClient.get().uri(NEWS_LATEST_INDIA)
                .header("X-RapidAPI-Key", "b9dd44a9cdmshb9b39aefc1dfe83p11d73ejsnca5066f82bdc")
                .header("X-RapidAPI-Host", "cricbuzz-cricket.p.rapidapi.com")
                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .retrieve()
                .bodyToMono(NewsLatest.class)
                .block();
    }


    public Players getPlayers(){

        Players result = new Players();

        result = webClient.get().uri(GET_PLAYERS)
                .header("X-RapidAPI-Key", "b9dd44a9cdmshb9b39aefc1dfe83p11d73ejsnca5066f82bdc")
                .header("X-RapidAPI-Host", "cricbuzz-cricket.p.rapidapi.com")
                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .retrieve()
                .bodyToMono(Players.class)
                .block();

        List<Player> players = result.getPlayer();
        this.playersRepository.saveAll(players);

        return result;
    }


}
