package nl.pjotr.monopoly.tile;

import nl.pjotr.monopoly.GameState;
import nl.pjotr.monopoly.Player;

import static nl.pjotr.monopoly.Consants.LAND_START_MONEY;

public class StartTile extends ActionTile {

    @Override
    public void performAction(Player player, GameState gameState) {
        System.out.println("Start tile. Paying salary.");
        player.addMoney(LAND_START_MONEY);
    }
}
