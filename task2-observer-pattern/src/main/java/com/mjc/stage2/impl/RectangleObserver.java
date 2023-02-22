package com.mjc.stage2.impl;

import com.mjc.stage2.Observer;
import com.mjc.stage2.entity.RectangleValues;
import com.mjc.stage2.event.RectangleEvent;
import com.mjc.stage2.warehouse.RectangleWarehouse;

public class RectangleObserver implements Observer {
    // Write your code here!
    RectangleWarehouse rectangleWarehouse = RectangleWarehouse.getInstance();

    @Override
    public void handleEvent(RectangleEvent event) {
        int id = event.getSource().getId();
        RectangleValues rectangleValues = rectangleWarehouse.get(id);
        double sideA = event.getSource().getSideA();
        double sideB = event.getSource().getSideB();
        rectangleValues.setPerimeter((sideA + sideB) * 2);
        rectangleValues.setSquare(sideA * sideB);
        rectangleWarehouse.put(id, rectangleValues);
    }
}
