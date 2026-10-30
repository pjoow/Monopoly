package nl.pjotr.monopoly.tile;

import lombok.experimental.SuperBuilder;
import nl.pjotr.monopoly.Player;

@SuperBuilder
public class OwnableTile extends Tile {
    private Player owner;
    private int price;

    public void setOwner(Player player) {
        player.addOwnedTile(this);
        this.owner = player;
    }

    public int getMortgagePrice() {
        return this.price / 2;
    }

}
