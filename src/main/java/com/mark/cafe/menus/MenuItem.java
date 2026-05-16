package com.mark.cafe.menus;

import com.mark.cafe.actions.Recipes;

import java.util.ArrayList;
import java.util.List;

public abstract class MenuItem {
    protected String name;
    protected int price;
    protected List<Recipes> recipeSteps;

    public void showRecipe(){
        for(Recipes step : recipeSteps){
            System.out.println(step.getStep());
        }
    }
    public List<Recipes> getRecipeSteps(){
        return recipeSteps;
    }

    public boolean checkSteps(Recipes choice, int idx){
        if(recipeSteps.get(idx) == choice) {
            return true;
        } else{
            return false;
        }
    }

    public abstract void excuteStep(int idx);

    public String getName(){
        return name;
    }
    public int getPrice(){
        return price;
    }
}
