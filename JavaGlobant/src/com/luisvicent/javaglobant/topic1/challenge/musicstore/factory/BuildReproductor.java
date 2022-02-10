package com.luisvicent.javaglobant.topic1.challenge.musicstore.factory;

import com.luisvicent.javaglobant.topic1.challenge.musicstore.battery.Battery;
import com.luisvicent.javaglobant.topic1.challenge.musicstore.capacity.Capacity;
import com.luisvicent.javaglobant.topic1.challenge.musicstore.color.Color;

public class BuildReproductor implements Reproductive {


    @Override
    public Battery chooseBattery(Battery battery) {
        return battery;
    }

    @Override
    public Capacity chooseCapacity(Capacity capacity) {
        return capacity;
    }

    @Override
    public Color chooseColor(Color color) {
        return color;
    }

}
