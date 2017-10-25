package com.apress.prospring4.ch4.profiles.highschool;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Profile;

import com.apress.prospring4.ch4.profiles.Food;
import com.apress.prospring4.ch4.profiles.FoodProviderService;

public class FoodProviderServiceImpl implements FoodProviderService {
	
    public List<Food> provideLunchSet() {
        List<Food> lunchSet = new ArrayList<Food>();
        lunchSet.add(new Food("Coke"));
        lunchSet.add(new Food("Hamburger"));
        lunchSet.add(new Food("French Fries"));

        return lunchSet;
    }
}
