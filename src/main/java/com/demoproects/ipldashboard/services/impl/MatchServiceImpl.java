package com.demoproects.ipldashboard.services.impl;

import com.demoproects.ipldashboard.model.Match;
import com.demoproects.ipldashboard.model.Team;
import com.demoproects.ipldashboard.repository.MatchRepository;
import com.demoproects.ipldashboard.repository.TeamRepository;
import com.demoproects.ipldashboard.services.MatchService;
import com.demoproects.ipldashboard.services.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MatchServiceImpl implements MatchService {
    @Autowired
    MatchRepository matchRepository;



    @Override
    public List<Match> findLatestMatchByTeamName(String team) {
        return matchRepository.getMatchByTeam1OrTeam2OrderByDateDesc(team,team, PageRequest.of(0,4));
    }
}
