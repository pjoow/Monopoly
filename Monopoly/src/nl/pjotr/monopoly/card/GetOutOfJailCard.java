package nl.pjotr.monopoly.card;

import nl.pjotr.monopoly.GameState;
import nl.pjotr.monopoly.Player;

public class GetOutOfJailCard extends Card {
    @Override
    void performAction(Player player, GameState gameState) {
        player.addOutOfJailCard();
    }
}
