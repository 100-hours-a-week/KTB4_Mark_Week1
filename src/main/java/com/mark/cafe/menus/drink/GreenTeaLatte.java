package com.mark.cafe.menus.drink;

import com.mark.cafe.actions.AddGreenTeaPowder;
import com.mark.cafe.menus.Drink;
import com.mark.cafe.recipes.DrinkSteps;

import java.util.ArrayList;
import java.util.Arrays;

public class GreenTeaLatte extends Drink implements AddGreenTeaPowder {


    public GreenTeaLatte(){
        name = "그린티 라떼";
        price = 4000;
        recipeSteps = new ArrayList<>(Arrays.asList(
                DrinkSteps.PREPARE_CUP.displayStep(),
                DrinkSteps.ADD_MILK.displayStep(),
                DrinkSteps.ADD_GREEN_TEA_POWDER.displayStep()
                )) {
        };
    }


    @Override
    public void excuteStep(int idx) {
        switch(idx){
            case 0:
                prepareCup();
                break;
            case 1:
                addMilk();
                break;
            case 2:
                addGreenTeaPowder();
                break;
        }
    }

    @Override
    public void addGreenTeaPowder(){
        System.out.println("그린티 파우더를 넣었습니다.");
    }

}
