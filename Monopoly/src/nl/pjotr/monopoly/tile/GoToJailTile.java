package nl.pjotr.monopoly.tile;

import nl.pjotr.monopoly.GameState;
import nl.pjotr.monopoly.Player;

public class GoToJailTile extends ActionTile {

    @Override
    public void performAction(Player player, GameState gameState) {
        System.out.println("Go to jail tile.");
        player.goToJail();
    }
}
