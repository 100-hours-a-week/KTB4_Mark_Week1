package com.mark.cafe.menus;

import com.mark.cafe.actions.Recipes;
import com.mark.cafe.recipes.DrinkSteps;

import java.util.List;

public abstract class Drink extends MenuItem {

    protected Drink(String name, int price, List<Recipes> recipeSteps){
        super(name, price, recipeSteps);
    }

    protected void prepareCup() {
        System.out.println(DrinkSteps.PREPARE_CUP.getStep());
    }

    protected void addWater(){
        System.out.println(DrinkSteps.ADD_WATER.getStep());
    }

    protected void addMilk(){
        System.out.println(DrinkSteps.ADD_MILK.getStep());
    }

    protected void addIce(){
        System.out.println(DrinkSteps.ADD_ICE.getStep());
    }
}
