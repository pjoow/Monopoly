package nl.pjotr.monopoly;

import nl.pjotr.monopoly.tile.OwnableTile;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Player {

    private final String name;
    private double money;
    private int position = 0;
    private int inJailTurn = 0;
    private int outOfJailCards = 0;
    private boolean isPlaying = true;
    private Set<OwnableTile> ownedTiles = new HashSet<>();

    public Player (String name, double money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public double getMoney() {
        return money;
    }

    public void addMoney(double money) {
        this.money += money;
    }

    public void subtractMoney(double money) {
        this.money -= money;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public void incrementJailTurn() {
        inJailTurn++;
    }

    public int getInJailTurn() {
        return inJailTurn;
    }

    public void resetInJailTurn() {
        inJailTurn = 0;
    }

    public void goToJail() {
        position = Board.JAIL_POSITION;
        incrementJailTurn();
    }

    public void addOutOfJailCard() {
        outOfJailCards++;
    }

    public boolean isPlaying() {
        return this.isPlaying;
    }

    public void addOwnedTile(OwnableTile tile) {
        this.ownedTiles.add(tile);
    }
}
