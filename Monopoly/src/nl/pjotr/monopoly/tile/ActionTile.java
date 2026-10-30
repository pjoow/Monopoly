package nl.pjotr.monopoly.tile;

import nl.pjotr.monopoly.GameState;
import nl.pjotr.monopoly.Player;

abstract class ActionTile extends Tile {

    abstract public void performAction(Player player, GameState gameState);
}
