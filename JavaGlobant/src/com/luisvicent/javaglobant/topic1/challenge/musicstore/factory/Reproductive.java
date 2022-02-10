package com.luisvicent.javaglobant.topic1.challenge.musicstore.factory;

import com.luisvicent.javaglobant.topic1.challenge.musicstore.battery.Battery;
import com.luisvicent.javaglobant.topic1.challenge.musicstore.capacity.Capacity;
import com.luisvicent.javaglobant.topic1.challenge.musicstore.color.Color;

public interface Reproductive {
    Battery chooseBattery(Battery battery);
    Capacity chooseCapacity(Capacity capacity);
    Color chooseColor(Color color);
}
