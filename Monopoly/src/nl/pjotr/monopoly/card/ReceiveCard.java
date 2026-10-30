package nl.pjotr.monopoly.card;

import nl.pjotr.monopoly.GameState;
import nl.pjotr.monopoly.Player;

public class ReceiveCard extends Card {
    private final double receiveAmount;

    public ReceiveCard(double receiveAmount) {
        this.receiveAmount = receiveAmount;
    }

    @Override
    void performAction(Player player, GameState gameState) {
        player.addMoney(receiveAmount);
    }
}
