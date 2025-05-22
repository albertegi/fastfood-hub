package com.alvirg.fastfood_hub;

import lombok.Data;

import java.util.List;

@Data
public class FastFood {

    private String name;

    private List<Ingredient> ingredients;
}
