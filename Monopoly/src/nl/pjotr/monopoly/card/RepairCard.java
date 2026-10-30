package nl.pjotr.monopoly.card;

import nl.pjotr.monopoly.GameState;
import nl.pjotr.monopoly.Player;

public class RepairCard extends Card {
    private static final int COST_PER_HOUSE = 40;
    private static final int COST_PER_HOTEL = 115;

    @Override
    void performAction(Player player, GameState gameState) {
        // TODO check ownable tiles. And then also amount of houses and hotels
    }
}
