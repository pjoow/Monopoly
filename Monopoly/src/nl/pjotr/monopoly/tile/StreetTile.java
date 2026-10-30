package nl.pjotr.monopoly.tile;

import lombok.experimental.SuperBuilder;
import nl.pjotr.monopoly.StreetColor;

@SuperBuilder
public class StreetTile extends OwnableTile {

    private StreetColor color;
    private int houses = 0;
    private boolean hotel = false;
    private int baseRent;
    private int rent1House;
    private int rent2House;
    private int rent3House;
    private int rent4House;
    private int rentHotel;
    private int houseCost;
}


