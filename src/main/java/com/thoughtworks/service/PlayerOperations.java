package com.thoughtworks.service;

import com.thoughtworks.model.Player;
import com.thoughtworks.model.Point;

/**
 * Created by amarendra on 07/09/16.
 */
public class PlayerOperations implements IPlayerOperations {

    private Player player;

    public Point open(int x, int y) {
        return new Point(x,y);
    }

    public Point flag(int x, int y) {
        return new Point(x,y);
    }


    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
}
