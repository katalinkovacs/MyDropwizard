package dao;

import java.util.HashMap;


public class MockDB {


    HashMap<String, MealRecord> mealTable = new HashMap<String, MealRecord>();

    //constructor building mock table with data later it will be a real DB
    public MockDB(){
        mealTable.put("breakfast", new MealRecord("milk", "vegemite bread", "apple"));
        mealTable.put("lunch", new MealRecord("apple juice", "sausage", "rolletti"));
        mealTable.put("dinner", new MealRecord("water", "lamb", "waffle"));
    }


    // return our mock "table" 
    public HashMap<String, MealRecord> getMealTable(){
        return mealTable;
    }


}
