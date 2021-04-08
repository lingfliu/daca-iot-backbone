package xyz.issc.daca_iot_backbone.tsl.gis;

import lombok.Data;

import java.io.Serializable;

/**
 * Units in meters
 */
@Data
public class Dimension implements Serializable {
    double h;
    double w;
    double l;

    int sector_h;
    int sector_w;
    int sector_l;

    public boolean isInside(double h, double w, double l) {
        return h >= 0 && h <= this.h
                && w >= 0 && w <= this.w
                && l >= 0 && l <= this.l;
    }

    public boolean isInside(int h, int w, int l) {
        return h >= 0 && h <= this.sector_h
                && w >= 0 && w <= this.sector_w
                && l >= 0 && l <= this.sector_l;
    }

}
