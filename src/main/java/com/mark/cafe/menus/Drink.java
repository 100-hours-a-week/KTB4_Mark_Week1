package com.mark.cafe.menus;

import com.mark.cafe.recipes.DrinkSteps;

public abstract class Drink extends MenuItem {


    protected void prepareCup() {
        System.out.println(DrinkSteps.PREPARE_CUP);
    }

    protected void addWater(){
        System.out.println(DrinkSteps.ADD_WATER);
    }

    protected void addMilk(){
        System.out.println(DrinkSteps.ADD_MILK);
    }

    protected void addIce(){
        System.out.println(DrinkSteps.ADD_ICE);
    }
}
