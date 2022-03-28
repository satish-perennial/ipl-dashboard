package com.demoproects.ipldashboard.services;

import com.demoproects.ipldashboard.model.Match;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface MatchService {

    List<Match> findLatestMatchByTeamName(String team);
}
