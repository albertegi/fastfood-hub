package com.alvirg.fastfood_hub;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class FastFoodOrder {

    private String deliveryName;
    private String deliveryStreet;
    private String deliveryCity;
    private String deliveryZip;
    private String ccNumber;
    private String ccExpiration;
    private String ccCVV;

    private List<FastFood> fastFoods = new ArrayList<>();

    public void addFastFood(FastFood fastFood){
        this.fastFoods.add(fastFood);
    }

}
