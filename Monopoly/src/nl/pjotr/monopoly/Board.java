package nl.pjotr.monopoly;

import nl.pjotr.monopoly.tile.*;

import java.util.List;

public class Board {
    public final static int START_POSITION = 0;
    public final static int JAIL_POSITION = 10;
    public final static int FREE_PARKING_POSITION = 20;
    public final static int GO_TO_JAIL_POSITION = 30;

    private final List<Tile> tiles;

    public Board() {
        this.tiles = createTiles();
    }

    private List<Tile> createTiles() {
        return List.of(
                // 0
                StartTile.builder()
                        .name("GO")
                        .build(),

                // 1
                StreetTile.builder()
                        .name("Mediterranean Avenue")
                        .color(StreetColor.BROWN)
                        .price(60)
                        .baseRent(2)
                        .rent1House(10)
                        .rent2House(30)
                        .rent3House(90)
                        .rent4House(160)
                        .rentHotel(250)
                        .houseCost(50)
                        .build(),

                // 2
                ChestTile.builder()
                        .name("Community Chest")
                        .build(),

                // 3
                StreetTile.builder()
                        .name("Baltic Avenue")
                        .color(StreetColor.BROWN)
                        .price(60)
                        .baseRent(4)
                        .rent1House(20)
                        .rent2House(60)
                        .rent3House(180)
                        .rent4House(320)
                        .rentHotel(450)
                        .houseCost(50)
                        .build(),

                // 4
                ActionTile.builder()
                        .name("Income Tax")
                        .build(),

                // 5
                OwnableTile.builder()
                        .name("Reading Railroad")
                        .price(200)
                        .build(),

                // 6
                StreetTile.builder()
                        .name("Oriental Avenue")
                        .color(StreetColor.LIGHT_BLUE)
                        .price(100)
                        .baseRent(6)
                        .rent1House(30)
                        .rent2House(90)
                        .rent3House(270)
                        .rent4House(400)
                        .rentHotel(550)
                        .houseCost(50)
                        .build(),

                // 7
                ActionTile.builder()
                        .name("Chance")
                        .build(),

                // 8
                StreetTile.builder()
                        .name("Vermont Avenue")
                        .color(StreetColor.LIGHT_BLUE)
                        .price(100)
                        .baseRent(6)
                        .rent1House(30)
                        .rent2House(90)
                        .rent3House(270)
                        .rent4House(400)
                        .rentHotel(550)
                        .houseCost(50)
                        .build(),

                // 9
                StreetTile.builder()
                        .name("Connecticut Avenue")
                        .color(StreetColor.LIGHT_BLUE)
                        .price(120)
                        .baseRent(8)
                        .rent1House(40)
                        .rent2House(100)
                        .rent3House(300)
                        .rent4House(450)
                        .rentHotel(600)
                        .houseCost(50)
                        .build(),

                // 10
                JailTile.builder()
                        .name("Jail")
                        .build(),

                // 11
                StreetTile.builder()
                        .name("St. Charles Place")
                        .color(StreetColor.PINK)
                        .price(140)
                        .baseRent(10)
                        .rent1House(50)
                        .rent2House(150)
                        .rent3House(450)
                        .rent4House(625)
                        .rentHotel(750)
                        .houseCost(100)
                        .build(),

                // 12
                OwnableTile.builder()
                        .name("Electric Company")
                        .price(150)
                        .build(),

                // 13
                StreetTile.builder()
                        .name("States Avenue")
                        .color(StreetColor.PINK)
                        .price(140)
                        .baseRent(10)
                        .rent1House(50)
                        .rent2House(150)
                        .rent3House(450)
                        .rent4House(625)
                        .rentHotel(750)
                        .houseCost(100)
                        .build(),

                // 14
                StreetTile.builder()
                        .name("Virginia Avenue")
                        .color(StreetColor.PINK)
                        .price(160)
                        .baseRent(12)
                        .rent1House(60)
                        .rent2House(180)
                        .rent3House(500)
                        .rent4House(700)
                        .rentHotel(900)
                        .houseCost(100)
                        .build(),

                // 15
                OwnableTile.builder()
                        .name("Pennsylvania Railroad")
                        .price(200)
                        .build(),

                // 16
                StreetTile.builder()
                        .name("St. James Place")
                        .color(StreetColor.ORANGE)
                        .price(180)
                        .baseRent(14)
                        .rent1House(70)
                        .rent2House(200)
                        .rent3House(550)
                        .rent4House(750)
                        .rentHotel(950)
                        .houseCost(100)
                        .build(),

                // 17
                ChestTile.builder()
                        .name("Community Chest")
                        .build(),

                // 18
                StreetTile.builder()
                        .name("Tennessee Avenue")
                        .color(StreetColor.ORANGE)
                        .price(180)
                        .baseRent(14)
                        .rent1House(70)
                        .rent2House(200)
                        .rent3House(550)
                        .rent4House(750)
                        .rentHotel(950)
                        .houseCost(100)
                        .build(),

                // 19
                StreetTile.builder()
                        .name("New York Avenue")
                        .color(StreetColor.ORANGE)
                        .price(200)
                        .baseRent(16)
                        .rent1House(80)
                        .rent2House(220)
                        .rent3House(600)
                        .rent4House(800)
                        .rentHotel(1000)
                        .houseCost(100)
                        .build(),

                // 20
                FreeParkingTile.builder()
                        .name("Free Parking")
                        .build(),

                // 21
                StreetTile.builder()
                        .name("Kentucky Avenue")
                        .color(StreetColor.RED)
                        .price(220)
                        .baseRent(18)
                        .rent1House(90)
                        .rent2House(250)
                        .rent3House(700)
                        .rent4House(875)
                        .rentHotel(1050)
                        .houseCost(150)
                        .build(),

                // 22
                ActionTile.builder()
                        .name("Chance")
                        .build(),

                // 23
                StreetTile.builder()
                        .name("Indiana Avenue")
                        .color(StreetColor.RED)
                        .price(220)
                        .baseRent(18)
                        .rent1House(90)
                        .rent2House(250)
                        .rent3House(700)
                        .rent4House(875)
                        .rentHotel(1050)
                        .houseCost(150)
                        .build(),

                // 24
                StreetTile.builder()
                        .name("Illinois Avenue")
                        .color(StreetColor.RED)
                        .price(240)
                        .baseRent(20)
                        .rent1House(100)
                        .rent2House(300)
                        .rent3House(750)
                        .rent4House(925)
                        .rentHotel(1100)
                        .houseCost(150)
                        .build(),

                // 25
                OwnableTile.builder()
                        .name("B. & O. Railroad")
                        .price(200)
                        .build(),

                // 26
                StreetTile.builder()
                        .name("Atlantic Avenue")
                        .color(StreetColor.YELLOW)
                        .price(260)
                        .baseRent(22)
                        .rent1House(110)
                        .rent2House(330)
                        .rent3House(800)
                        .rent4House(975)
                        .rentHotel(1150)
                        .houseCost(150)
                        .build(),

                // 27
                StreetTile.builder()
                        .name("Ventnor Avenue")
                        .color(StreetColor.YELLOW)
                        .price(260)
                        .baseRent(22)
                        .rent1House(110)
                        .rent2House(330)
                        .rent3House(800)
                        .rent4House(975)
                        .rentHotel(1150)
                        .houseCost(150)
                        .build(),

                // 28
                OwnableTile.builder()
                        .name("Water Works")
                        .price(150)
                        .build(),

                // 29
                StreetTile.builder()
                        .name("Marvin Gardens")
                        .color(StreetColor.YELLOW)
                        .price(280)
                        .baseRent(24)
                        .rent1House(120)
                        .rent2House(360)
                        .rent3House(850)
                        .rent4House(1025)
                        .rentHotel(1200)
                        .houseCost(150)
                        .build(),

                // 30
                GoToJailTile.builder()
                        .name("Go To Jail")
                        .build(),

                // 31
                StreetTile.builder()
                        .name("Pacific Avenue")
                        .color(StreetColor.GREEN)
                        .price(300)
                        .baseRent(26)
                        .rent1House(130)
                        .rent2House(390)
                        .rent3House(900)
                        .rent4House(1100)
                        .rentHotel(1275)
                        .houseCost(200)
                        .build(),

                // 32
                StreetTile.builder()
                        .name("North Carolina Avenue")
                        .color(StreetColor.GREEN)
                        .price(300)
                        .baseRent(26)
                        .rent1House(130)
                        .rent2House(390)
                        .rent3House(900)
                        .rent4House(1100)
                        .rentHotel(1275)
                        .houseCost(200)
                        .build(),

                // 33
                ChestTile.builder()
                        .name("Community Chest")
                        .build(),

                // 34
                StreetTile.builder()
                        .name("Pennsylvania Avenue")
                        .color(StreetColor.GREEN)
                        .price(320)
                        .baseRent(28)
                        .rent1House(150)
                        .rent2House(450)
                        .rent3House(1000)
                        .rent4House(1200)
                        .rentHotel(1400)
                        .houseCost(200)
                        .build(),

                // 35
                OwnableTile.builder()
                        .name("Short Line Railroad")
                        .price(200)
                        .build(),

                // 36
                ActionTile.builder()
                        .name("Chance")
                        .build(),

                // 37
                StreetTile.builder()
                        .name("Park Place")
                        .color(StreetColor.DARK_BLUE)
                        .price(350)
                        .baseRent(35)
                        .rent1House(175)
                        .rent2House(500)
                        .rent3House(1100)
                        .rent4House(1300)
                        .rentHotel(1500)
                        .houseCost(200)
                        .build(),

                // 38
                ActionTile.builder()
                        .name("Luxury Tax")
                        .build(),

                // 39
                StreetTile.builder()
                        .name("Boardwalk")
                        .color(StreetColor.DARK_BLUE)
                        .price(400)
                        .baseRent(50)
                        .rent1House(200)
                        .rent2House(600)
                        .rent3House(1400)
                        .rent4House(1700)
                        .rentHotel(2000)
                        .houseCost(200)
                        .build()
        );
    }
}
