package dao;

import java.util.HashMap;

/**
 * Created by Zoli on 19/05/2017.
 */
public class MockDB {


    HashMap<String, MealRecord> mealTable = new HashMap<String, MealRecord>();

    //constructor building mock table with data later it will be a real DB
    public MockDB(){
        mealTable.put("breakfast", new MealRecord("milk", "vegimite bread", "apple"));
        mealTable.put("lunch", new MealRecord("water", "sausage", "rolletti"));
    }


    // return our mock "table" 
    public HashMap<String, MealRecord> getMealTable(){
        return mealTable;
    }


}
