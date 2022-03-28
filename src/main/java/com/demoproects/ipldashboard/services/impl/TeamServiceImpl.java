package com.demoproects.ipldashboard.services.impl;

import com.demoproects.ipldashboard.model.Team;
import com.demoproects.ipldashboard.repository.TeamRepository;
import com.demoproects.ipldashboard.services.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TeamServiceImpl implements TeamService {
    @Autowired
    TeamRepository teamRepository;

    @Override
    public Team findByTeamName(String teamName) {
        Optional<Team> byTeamName = teamRepository.findByTeamName(teamName);
        return byTeamName.orElse(new Team());
    }
}
