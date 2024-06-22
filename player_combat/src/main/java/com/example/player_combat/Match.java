package com.example.player_combat;

import com.example.player_combat.controller.PlayerController;
import com.example.player_combat.model.Dice;
import com.example.player_combat.model.Player;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Match {

    Dice dice;
    public Match() {
        dice = new Dice();
    }

    public Integer combatPlayer(Player player1, Player player2) {

        Player attacker = (player1.getHealth() < player2.getHealth()) ? player1:player2;
        Player defender = (attacker == player1)? player2: player1;
        attack(attacker, defender);

        return attacker.isAlive()? attacker.getPlayerId():defender.getPlayerId();
    }

    private void attack(Player attacker, Player defender) {
        int attackDamage = attacker.getAttack() * dice.getRandom();
        int defendDamage = defender.getStrength() * dice.getRandom();
        int totalDamage = Math.max(0,attackDamage - defendDamage);

        defender.setHealth(defender.getHealth() - totalDamage);

        if (defender.getHealth() <= 0)
        {
            System.out.println("Player won = " + attacker.getPlayerId());
            return;
        }
        attack(defender, attacker);

    }
    public static void main(String[] args) {
        PlayerController playerController = new PlayerController();
        playerController.set();
    }
}
