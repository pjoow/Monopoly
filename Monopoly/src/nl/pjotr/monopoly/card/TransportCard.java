package nl.pjotr.monopoly.card;

import nl.pjotr.monopoly.Board;
import nl.pjotr.monopoly.GameState;
import nl.pjotr.monopoly.Player;

import static nl.pjotr.monopoly.Consants.LAND_START_MONEY;
import static nl.pjotr.monopoly.Consants.PASS_START_MONEY;

public class TransportCard extends Card {
    private final int toPosition;

    public TransportCard(int toPosition) {
        this.toPosition = toPosition;
    }

    @Override
    void performAction(Player player, GameState gameState) {
        int currentPosition = player.getPosition();

        if (toPosition == Board.START_POSITION) {
            player.addMoney(LAND_START_MONEY);
        } else if ((toPosition - currentPosition) < 0) {
            // Passed GO
            player.addMoney(PASS_START_MONEY);
        }

        player.setPosition(toPosition);
    }
}
