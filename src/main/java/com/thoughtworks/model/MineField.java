package com.thoughtworks.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by amarendra on 07/09/16.
 *
 * Acts as model for Mine Field
 */
public class MineField {


    private String[][] fieldArea;

    private boolean status;

    private Set<Mine> mines;

    public MineField(int x, int y) {
        this.fieldArea = new String[x][y];
        mines = new HashSet();
        initializeField(x,y);
    }

    private void initializeField(int x, int y) {

        for(int col = 0; col < x; col++)
        {
            for(int row = 0 ; row < y; row++)
            {
                fieldArea[row][col] = "x";
            }
        }


    }

    public boolean won() {
        return status;
    }

    public Set<Mine> getMines() {
        return mines;
    }

    public void addMines(Mine mine) {
        this.mines.add(mine);
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String[][] getFieldArea() {
        return fieldArea;
    }
}
