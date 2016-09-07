package com.thoughtworks.service;

import com.thoughtworks.model.Player;
import com.thoughtworks.model.Point;

/**
 * Created by amarendra on 07/09/16.
 */
public interface IPlayerOperations {


    Point open(int x, int y);

    Point flag (int x, int y);

    Player getPlayer();

    void setPlayer(Player player);
}
