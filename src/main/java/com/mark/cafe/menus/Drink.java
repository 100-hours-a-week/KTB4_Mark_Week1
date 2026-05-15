package com.mark.cafe.menus;

import com.mark.cafe.recipes.DrinkSteps;

public abstract class Drink extends MenuItem {


    protected void prepareCup() {
        System.out.println(DrinkSteps.PREPARE_CUP.displayStep());
    }

    protected void addWater(){
        System.out.println(DrinkSteps.ADD_WATER.displayStep());
    }

    protected void addMilk(){
        System.out.println(DrinkSteps.ADD_MILK.displayStep());
    }

    protected void addIce(){
        System.out.println(DrinkSteps.ADD_ICE.displayStep());
    }
}
