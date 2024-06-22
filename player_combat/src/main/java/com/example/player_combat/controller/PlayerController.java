package com.example.player_combat.controller;

import com.example.player_combat.Match;
import com.example.player_combat.model.Player;

import java.util.Scanner;


public class PlayerController {

    public void set()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter details for Player 1");
        int attack1 = sc.nextInt();
        int health1 = sc.nextInt();
        int stregth1 = sc.nextInt();

        Player player1 = new Player(attack1,stregth1,health1,1);

        System.out.println("Enter details for Player 2");
        int attack2 = sc.nextInt();
        int health2 = sc.nextInt();
        int stregth2 = sc.nextInt();

        Player player2 = new Player(attack2,stregth2,health2,2);

        Match match = new Match();

        int player = match.combatPlayer(player1,player2);
        System.out.println(player);
    }
}
