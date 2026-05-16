package com.mark.cafe.menus;

import com.mark.cafe.actions.Recipes;
import com.mark.cafe.recipes.DessertSteps;

import java.util.List;

public abstract class Dessert extends MenuItem {

    protected Dessert(String name, int price, List<Recipes> recipeSteps){
        super(name, price, recipeSteps);
    }

    protected void bake(){
        System.out.println(DessertSteps.BAKE.getStep());
    }

    protected void prep(){
        System.out.println(DessertSteps.PREP.getStep());
    }

    protected void mix(){
        System.out.println(DessertSteps.MIX.getStep());
    }

    public abstract void addCream();

    public abstract void decorator();

}
