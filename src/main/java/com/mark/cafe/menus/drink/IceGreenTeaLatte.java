package com.mark.cafe.menus.drink;

import com.mark.cafe.actions.AddGreenTeaPowder;
import com.mark.cafe.menus.Drink;
import com.mark.cafe.recipes.DrinkSteps;

import java.util.ArrayList;
import java.util.Arrays;

public class IceGreenTeaLatte extends Drink implements AddGreenTeaPowder {


    public IceGreenTeaLatte(){
        name = "그린티 라떼";
        price = 4000;
        recipeSteps = new ArrayList<>(Arrays.asList(
                DrinkSteps.PREPARE_CUP.displayStep(),
                DrinkSteps.ADD_ICE.displayStep(),
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
                addIce();
                break;
            case 2:
                addMilk();
                break;
            case 3:
                addGreenTeaPowder();
                break;
        }
    }

    @Override
    public void addGreenTeaPowder(){
        System.out.println("그린티 파우더를 넣었습니다.");
    }

}
