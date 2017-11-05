package com.waisblut.mycloudlist.model;

public class CloudCardFactory {
    public static CloudCard getCloudCard(CloudCardType type) {
        switch (type) {
            case Text:
                return new CloudCardText();

            case Check:
                return new CloudCardCheck();

            default:
                return null;
        }
    }
}
