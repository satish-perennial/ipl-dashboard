package com.demoproects.ipldashboard.services;

import com.demoproects.ipldashboard.model.Team;

import java.util.Optional;

public interface TeamService {
    Team findByTeamName(String teamName);
}
