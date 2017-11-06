package com.waisblut.mycloudlist.model;

import java.util.ArrayList;
import java.util.HashSet;

public class CloudCard {
    private String title;
    private int backgroundColor;
    private CloudCardType type;
    private CloudCardState state;

    private ArrayList<HashTag> lstHashTags;
    private HashSet<String> contacts;


    public CloudCardState getState() {
        return state;
    }

    public CloudCardType getType() {
        return type;
    }

    public void setState(CloudCardState state) {
        this.state = state;
    }

    public void setType(CloudCardType type) {
        this.type = type;
    }
}