package com.demoproects.ipldashboard.services;

import com.demoproects.ipldashboard.model.Match;
import com.demoproects.ipldashboard.model.Team;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class MatchServiceTest {

    @Autowired
    MatchService matchService;

    @Test
    void findLatestMatchByTeamNameTest() {

        List<Match> allMatchByTeamName = matchService.findLatestMatchByTeamName("team");
        Assertions.assertNotNull(allMatchByTeamName);
    }
}