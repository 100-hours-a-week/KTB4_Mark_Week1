package com.mark.cafe.player;

public class Player {
    private int money;
    private int successAmount;
    private int failAmount;

    public Player(int money, int successAmount, int failAmount) {
        this.money = money;
        this.successAmount = successAmount;
        this.failAmount  = failAmount;
    }

    public void earnMoney(int price){
        money += price;
    }

    public void loseMoney(int price){
        money -= price;
    }

    public int getMoney(){
        return money;
    }

    public int getSuccessAmount(){
        return successAmount;
    }

    public int getFailAmount(){
        return failAmount;
    }

    public void checkResult(){
        System.out.println("현재 매출은 : " + money + " 입니다.");
    }
}
