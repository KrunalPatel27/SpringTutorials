package org.krunal.spring;

public class Tea implements IHotDrink {
    @Override
    public void prepareHotDrink() {
        System.out.println("Dear customer we are preparing you Hot Drink");
    }
}
