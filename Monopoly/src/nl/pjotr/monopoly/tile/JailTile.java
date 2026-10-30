package nl.pjotr.monopoly.tile;

import nl.pjotr.monopoly.Board;
import nl.pjotr.monopoly.GameState;
import nl.pjotr.monopoly.Player;

public class JailTile extends ActionTile {

    @Override
    public void performAction(Player player, GameState gameState) {
        System.out.println("Jail tile. No action, just visiting.");
    }
}
