package com.thoughtworks;


import com.thoughtworks.model.Mine;
import com.thoughtworks.model.MineField;
import com.thoughtworks.model.Player;
import com.thoughtworks.model.Point;
import com.thoughtworks.service.IPlayerOperations;
import com.thoughtworks.service.MineOperations;
import com.thoughtworks.service.PlayerOperations;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple MineSweeper.
 */
public class MineSweeperTest{

    MineField mineField;
    Player player;
    MineOperations mineOperations;
    IPlayerOperations playerOperations;

    @Before
    public void setup(){
        mineField = new MineField(3, 3);

        player = new Player();

        playerOperations = new PlayerOperations();

        playerOperations.setPlayer(player);

        mineOperations = new MineOperations(mineField, playerOperations);
    }

    @Test
    public void testForNoMineAndUserWins(){

        mineOperations.printMineField();

            for(int col = 0; col<mineField.getFieldArea().length; col++)
            {
                for(int row = 0 ; row<mineField.getFieldArea().length; row++)
                {
                    mineOperations.playerChance(new Point(row, col));
                }
            }

        Assert.assertFalse(mineField.won());
        Assert.assertTrue(player.won());

        mineOperations.printMineField();


    }

    @Test
    public void testForAllMineAndUserLooses(){

        mineField.addMines(new Mine(new Point(0,0)));
        boolean noFurtherChance = false;
        for(int col = 0; col<mineField.getFieldArea().length && !noFurtherChance; col++)
        {
            for(int row = 0; row<mineField.getFieldArea().length; row++)
            {
                noFurtherChance = mineOperations.playerChance(new Point(row, col));
                if(noFurtherChance){
                    break;
                }
            }
        }

        Assert.assertTrue(mineField.won());
        Assert.assertFalse(player.won());


    }
}
