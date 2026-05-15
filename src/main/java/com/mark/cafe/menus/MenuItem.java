package com.mark.cafe.menus;

import java.util.ArrayList;

public abstract class MenuItem {
    protected String name;
    protected int price;
    protected ArrayList<String> recipeSteps;

    public void showRecipe(){
        for(String step : recipeSteps){
            System.out.println(step);
        }
    }
    public ArrayList<String> getRecipeSteps(){
        return recipeSteps;
    }

    public boolean checkSteps(String choice, int idx){
        if(recipeSteps.get(idx).equals(choice)) {
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
