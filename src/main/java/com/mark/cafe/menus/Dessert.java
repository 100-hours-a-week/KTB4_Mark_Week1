package com.mark.cafe.menus;

import com.mark.cafe.recipes.DessertSteps;

public abstract class Dessert extends MenuItem {

    protected void bake(){
        System.out.println(DessertSteps.BAKE.getDisplay());
    }

    protected void prep(){
        System.out.println(DessertSteps.PREP.getDisplay());
    }

    protected void mix(){
        System.out.println(DessertSteps.MIX.getDisplay());
    }

    public abstract void addCream();

    public abstract void decorator();

}
