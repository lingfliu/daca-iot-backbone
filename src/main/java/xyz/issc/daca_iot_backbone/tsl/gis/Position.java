package xyz.issc.daca_iot_backbone.tsl.gis;

public class Position {
    double latitude;
    double longtitude;

    public CartPosition toCartesian(Position pivot) {
        return new CartPosition();
    }
}
