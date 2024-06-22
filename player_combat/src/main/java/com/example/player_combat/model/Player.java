package com.example.player_combat.model;


public class Player {

    private Integer PlayerId ;
    private Integer attack;
    private Integer strength;
    private Integer health;

    public Player(Integer attack, Integer strength, Integer health,Integer PlayerId) {
        this.attack = attack;
        this.strength = strength;
        this.health = health;
        this.PlayerId = PlayerId;
    }

    public Integer getPlayerId()
    {
        return PlayerId;
    }
    public Integer getAttack() {
        return attack;
    }

    public void setAttack(Integer attack) {
        this.attack = attack;
    }

    public Integer getStrength() {
        return strength;
    }

    public void setStrength(Integer strength) {
        this.strength = strength;
    }

    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    public boolean isAlive()
    {
        return health>0;
    }

}
