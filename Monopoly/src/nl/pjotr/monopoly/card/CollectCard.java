package nl.pjotr.monopoly.card;

import nl.pjotr.monopoly.GameState;
import nl.pjotr.monopoly.Player;

public class CollectCard extends Card {
    private final int amount;

    public CollectCard(int amount) {
        this.amount = amount;
    }

    @Override
    void performAction(Player player, GameState gameState) {
        var activePlayers = gameState.getOtherActivePlayers(player);

        for(Player p : activePlayers) {
            p.subtractMoney(amount); // TODO wat als nu negatief?
        }
        player.addMoney(amount * activePlayers.size());
    }
}
