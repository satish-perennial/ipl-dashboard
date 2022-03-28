package com.demoproects.ipldashboard.repository;

import com.demoproects.ipldashboard.model.Match;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MatchRepository extends JpaRepository<Match, Long> {
    List<Match> getMatchByTeam1OrTeam2OrderByDateDesc(String teamName1, String teamName2, Pageable pageable);
}
