package com.geek.reevon.constant;

public enum KINGDOM {
    LAND("LAND", "PANDA"),
    SPACE("SPACE", "GORILLA"),
    WATER("WATER", "OCTOPUS"),
    ICE("ICE", "MAMMOTH"),
    AIR("AIR", "OWL"),
    FIRE("FIRE", "DRAGON"),
    UNKNOWN("UNKNOWN", "NONE");

    private final String kingdom;
    private final String emblem;

    KINGDOM(String kingdom, String emblem) {
        this.kingdom = kingdom;
        this.emblem = emblem;
    }

    public String getKingdom() {
        return kingdom;
    }

    public String getEmblem() {
        return emblem;
    }

    @Override
    public String toString() {
        return "KINGDOM{" +
                "kingdom='" + kingdom + '\'' +
                ", emblem='" + emblem + '\'' +
                '}';
    }
}
