package nl.pjotr.monopoly.tile;

import nl.pjotr.monopoly.GameState;
import nl.pjotr.monopoly.Player;

public class FreeParkingTile extends ActionTile {

    @Override
    public void performAction(Player player, GameState gameState) {
        System.out.println("Free parking. Collecting funds.");
        player.addMoney(gameState.claimFreeParkingFund());
    }
}
