package com.mark.cafe.menus.drink;

import com.mark.cafe.menus.Drink;
import com.mark.cafe.recipes.DrinkSteps;
import com.mark.cafe.actions.ExtractShot;

import java.util.ArrayList;
import java.util.Arrays;

public class IceAmericano extends Drink implements ExtractShot {


    public IceAmericano(){
        name = "아이스 아메리카노";
        price = 4000;
        recipeSteps = new ArrayList<>(Arrays.asList(
                DrinkSteps.PREPARE_CUP.displayStep(),
                DrinkSteps.ADD_ICE.displayStep(),
                DrinkSteps.ADD_WATER.displayStep(),
                DrinkSteps.EXTRACT_SHOT.displayStep())) {
        };
    }

    @Override
    public void extractShot() {
        System.out.println("샷 추가 했습니다");
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
                addWater();
                break;
            case 3:
                extractShot();
                break;
        }
    }


}
