package com.demoproects.ipldashboard.controller;

import com.demoproects.ipldashboard.model.Match;
import com.demoproects.ipldashboard.model.Team;
import com.demoproects.ipldashboard.services.MatchService;
import com.demoproects.ipldashboard.services.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TeamController {
    @Autowired
    TeamService teamService;
    @Autowired
    MatchService matchService;

    @GetMapping("/team/{teamName}")
    public Team getTeam(@PathVariable String teamName) {
        Team team = teamService.findByTeamName(teamName);
        List<Match> allMatchByTeamName = matchService.findLatestMatchByTeamName(teamName);
        team.setMatches(allMatchByTeamName);
        return team;
    }

}
