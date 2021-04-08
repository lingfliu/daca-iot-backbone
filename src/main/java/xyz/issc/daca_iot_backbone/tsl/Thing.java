package xyz.issc.daca_iot_backbone.tsl;

import xyz.issc.daca_iot_backbone.tsl.gis.Dimension;
import xyz.issc.daca_iot_backbone.tsl.gis.Position;

import java.util.List;
import java.util.Map;

public class Thing {
    String id;
    String name;

    Position pos;

    Dimension dimens;

    Map<Dimension, List<Sensable>> senables;

    Map<Dimension, List<Sensable>> controllables;
}
