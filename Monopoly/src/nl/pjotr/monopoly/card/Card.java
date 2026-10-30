package nl.pjotr.monopoly.card;

import nl.pjotr.monopoly.GameState;
import nl.pjotr.monopoly.Player;

abstract public class Card {
    abstract void performAction(Player player, GameState gameState);
}
