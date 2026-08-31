package tcs_coding;

import java.util.*;

class food {
    private int foodId;
    private String foodName;
    private String foodCategory;
    private int foodCost;

    //constructor
    food(int foodId, String foodName, String foodCategory, int foodCost) {
        this.foodId = foodId;
        this.foodName = foodName;
        this.foodCategory = foodCategory;
        this.foodCost = foodCost;
    }

    //getters
    public int getFoodId() {
        return foodId;
    }
    public String getFoodName() {
        return foodName;
    }
    public String getFoodCategory() {
        return foodCategory;
    }
    public int getFoodCost() {
        return foodCost;
    }

    //setters

    //override default String output
    @Override
    public String toString() {
        return foodId+"\n"+foodName+"\n"+foodCategory+"\n"+foodCost;
    }
}

public class foodList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        food[] foodArr = new food[n];
        for(int i=0 ; i<n ; i++) {
            int foodId = sc.nextInt();
            String foodName = sc.nextLine();
            String foodCategory = sc.nextLine();
            sc.nextLine();
            int foodCost = sc.nextInt();
            sc.nextLine();
            foodArr[i] = new food(foodId, foodName, foodCategory, foodCost);
        }

        sc.nextLine();
        String searchFoodCategory = sc.nextLine();
        
        int countOfFood = countFoodByGivenCategory(foodArr, searchFoodCategory);
        if(countOfFood == 0)
            System.out.println("No food present in the specified category.");
        else
            System.out.println(countOfFood);

        food minCostFood = getFoodWithMinCost(foodArr);

        if(minCostFood == null)
            System.out.println("No Food is found.");
        else    
            System.out.println(minCostFood);

            sc.close();
    }

    public static int countFoodByGivenCategory(food[] foodArr, String searchFoodCategory) {
        int count = 0;

        for(food foods: foodArr) {
            if(foods.getFoodCategory().equalsIgnoreCase(searchFoodCategory))
                count++;
        }

        return count;
    }

    public static food getFoodWithMinCost(food[] foodArr) {
        
        if(foodArr.length == 0)
            return null;

        food foodWithMinCost = foodArr[0];

        for(food foods: foodArr) {
            if(foods.getFoodCost() < foodWithMinCost.getFoodCost())
                foodWithMinCost = foods;
        }
        return foodWithMinCost;
    }

    // public static String normalizeCategory(String category) {
    //     if(category.equals)
    // }
}
