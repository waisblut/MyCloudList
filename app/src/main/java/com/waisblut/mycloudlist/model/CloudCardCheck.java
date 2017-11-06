package com.waisblut.mycloudlist.model;

import java.util.List;

public class CloudCardCheck extends CloudCard {
    private List<String> lstItems;

    public CloudCardCheck() {
        setType(CloudCardType.Check);
    }
}
