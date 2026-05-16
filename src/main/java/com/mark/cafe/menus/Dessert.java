package com.mark.cafe.menus;

import com.mark.cafe.recipes.DessertSteps;

public abstract class Dessert extends MenuItem {

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
