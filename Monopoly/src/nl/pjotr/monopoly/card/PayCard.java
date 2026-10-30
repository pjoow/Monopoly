package nl.pjotr.monopoly.card;

import nl.pjotr.monopoly.GameState;
import nl.pjotr.monopoly.Player;

public class PayCard extends Card {
    private final double collectAmount;
    
    public PayCard(double collectAmount) {
        this.collectAmount = collectAmount;
    }
    
    @Override
    void performAction(Player player, GameState gameState) {
        player.subtractMoney(collectAmount); // TODO handel negatieve balance
    }
}