package com.thoughtworks.model;

import com.thoughtworks.service.IPlayerOperations;

/**
 * Model for Player
 * Created by amarendra on 07/09/16.
 */
public class Player {

    private boolean status;

    public boolean won() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
