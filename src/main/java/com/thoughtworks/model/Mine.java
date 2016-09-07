package com.thoughtworks.model;

/**
 * Created by amarendra on 07/09/16.
 *
 * This is a model for Mine
 */
public class Mine {

    private Point point;

    public Mine(Point point) {
        this.point = point;
    }

    public Point getPoint() {
        return point;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Mine mine = (Mine) o;

        return point != null ? point.equals(mine.point) : mine.point == null;

    }

    @Override
    public int hashCode() {
        return point != null ? point.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Mine{" +
                "point=" + point +
                '}';
    }
}
