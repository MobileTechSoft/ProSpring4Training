package com.apress.prospring4.ch4.profiles.kindergarten;

import java.util.ArrayList;
import java.util.List;

import com.apress.prospring4.ch4.profiles.Food;
import com.apress.prospring4.ch4.profiles.FoodProviderService;

public class FoodProviderServiceImpl implements FoodProviderService {
	
    public List<Food> provideLunchSet() {
        List<Food> lunchSet = new ArrayList<Food>();
        lunchSet.add(new Food("Milk"));
        lunchSet.add(new Food("Biscuits"));

        return lunchSet;
    }
}
