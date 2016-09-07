package com.thoughtworks.service;

import com.thoughtworks.model.MineField;
import com.thoughtworks.model.Player;
import com.thoughtworks.model.Point;

/**
 * Created by amarendra on 07/09/16.
 */
public interface IPlayerOperations {


    void open(MineField point, Point point1);

    void flag(MineField mineField, Point point);

    Player getPlayer();

    void setPlayer(Player player);
}
