package com.thoughtworks.service;

import com.thoughtworks.model.MineField;
import com.thoughtworks.model.Player;
import com.thoughtworks.model.Point;

/**
 * Created by amarendra on 07/09/16.
 */
public class PlayerOperations implements IPlayerOperations {

    private Player player;

    public void open(MineField mineField, Point point) {
        mineField.getFieldArea()[point.getX()][ point.getY()] = "o";
    }

    public void flag(MineField mineField, Point point) {
        mineField.getFieldArea()[point.getX()][ point.getY()] = "f";
    }


    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
}
