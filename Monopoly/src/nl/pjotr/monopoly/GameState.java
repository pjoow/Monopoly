package nl.pjotr.monopoly;

import java.util.ArrayList;
import java.util.List;

public class GameState {

    private double freeParkingFund = 0;
    private List<Player> players = new ArrayList<>();

    public double claimFreeParkingFund() {
        var fund = freeParkingFund;
        this.freeParkingFund = 0;
        return fund;
    }

    public List<Player> getOtherActivePlayers(Player reference) {
        return players.stream().filter(p -> !p.getName().equals(reference.getName()) && p.isPlaying()).toList();
    }
}
