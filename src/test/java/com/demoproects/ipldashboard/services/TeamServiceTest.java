package com.demoproects.ipldashboard.services;

import com.demoproects.ipldashboard.model.Team;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TeamServiceTest {
    @Autowired
    TeamService teamService;

    @Test
    void findByTeamNameTest() {
        Team byTeamName = teamService.findByTeamName("hello");
        Assertions.assertNotNull(byTeamName);

    }
}