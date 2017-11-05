package com.waisblut.mycloudlist.model;


public class HashTag {
    private String text;

    public boolean isHashTag(String s) {
        return s.startsWith("#");
    }
}
