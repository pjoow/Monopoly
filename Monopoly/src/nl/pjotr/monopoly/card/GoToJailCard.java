package nl.pjotr.monopoly.card;

import nl.pjotr.monopoly.GameState;
import nl.pjotr.monopoly.Player;

public class GoToJailCard extends Card {
    @Override
    void performAction(Player player, GameState gameState) {
        player.goToJail();
    }
}
