package com.example.player_combat;


import com.example.player_combat.model.Dice;
import com.example.player_combat.model.Player;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import org.junit.jupiter.api.Assertions;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
public class MatchTest {

    @Mock
    Dice dice;

    @Autowired
    Match match;

    @BeforeEach
    public void setUp() {
        Mockito.when(dice.getRandom()).thenReturn(4);
    }

    @Test
    public void PlayerAWinning(){
        Player player1 = new Player(40,40,1000,1);
        Player player2 = new Player(1,1,500,2);

        int res = match.combatPlayer(player1,player2);
        Assertions.assertEquals(res,1);
    }
    @Test
    public void PlayerBWinning(){
        Player player2 = new Player(40,40,1000,2);
        Player player1 = new Player(1,1,500,1);

        int res = match.combatPlayer(player1,player2);
        Assertions.assertEquals(res,2);
    }
}
