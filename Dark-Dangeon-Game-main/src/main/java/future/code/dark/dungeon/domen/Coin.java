package future.code.dark.dungeon.domen;

import future.code.dark.dungeon.config.Configuration;

public class Coin extends GameObject{
    boolean coinCol;

    public boolean getCoinCol() {
        return this.coinCol;
    }

    public void setCoinCol(boolean coinCol) {
        this.coinCol = coinCol;
    }

    public Coin(int xPosition, int yPosition) {
        super(xPosition, yPosition, Configuration.COIN_SPRITE);
    }

}
