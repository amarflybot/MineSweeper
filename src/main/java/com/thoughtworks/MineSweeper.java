package com.thoughtworks;

import com.thoughtworks.model.Mine;
import com.thoughtworks.model.MineField;
import com.thoughtworks.model.Player;
import com.thoughtworks.model.Point;
import com.thoughtworks.service.MineOperations;
import com.thoughtworks.service.PlayerOperations;

import java.util.Observable;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class MineSweeper
{
    public static void main( String[] args )
    {
        System.out.println( "Start MineSweeper game !! " );

        String comment = "Enter a field size in number";

        String sizeOfField = getUserInput(comment);

        MineField mineField = new MineField(Integer.valueOf(sizeOfField), Integer.valueOf(sizeOfField));

        Player player = new Player();

        PlayerOperations playerOperations = new PlayerOperations();

        playerOperations.setPlayer(player);

        MineOperations mineOperations = new MineOperations(mineField, playerOperations);

        while (true){
            comment = "Enter a mine location in format 0,0" + "\n" + "Enter q to proceed";
            String mineLocation = getUserInput(comment);
            if("q".equalsIgnoreCase(mineLocation)){
                break;
            }
            String[] strings = mineLocation.split(",");
            mineField.addMines(new Mine(new Point(strings[0],strings[1])));
        }

        System.out.println("The Game starts from here");

        comment = "Enter a selected location in format 0,0";

        boolean noFurtherChance = false;
        while (!noFurtherChance) {
            String selectedLocation = getUserInput(comment);
            String[] strings = selectedLocation.split(",");
            noFurtherChance = mineOperations.playerChance(new Point(strings[0], strings[1]));
            if (noFurtherChance) {
                break;
            }
        }

        if(mineField.won()){
            System.out.println("Player looses'");
        }
        else if(player.won()){
            System.out.println("Player wins");
        }
    }

    private static String getUserInput(String comment) {
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println(comment);
        return reader.next();
    }
}
