package tcs_coding;

import java.util.*;

class Food {
    private int foodId;
    private String foodName;
    private String foodCategory;
    private int foodCost;
    public Food(int foodId, String foodName, String foodCategory, int foodCost) {
        this.foodId = foodId;
        this.foodName = foodName;
        this.foodCategory = foodCategory;
        this.foodCost = foodCost;
    }
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
    public void setFoodId(int foodId) {
    this.foodId = foodId;
    }
    public void setFoodName(String foodName) {
        this.foodName = foodName;
        }
        public void setFoodCategory(String foodCategory) {
        this.foodCategory = foodCategory;
        }
        public void setFoodCost(int foodCost) {
        this.foodCost = foodCost;
        }
        @Override
        public String toString() {
        return foodId + "\n" + foodName + "\n" + foodCategory + "\n" + foodCost;
        }
       }
       public class Solution {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Read the number of Food objects
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        // Array to store Food objects
        Food[] foods = new Food[n];
        // Read Food objects
        for (int i = 0; i < n; i++) {
        int foodId = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        String foodName = scanner.nextLine();
        String foodCategory = scanner.nextLine();
        int foodCost = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        foods[i] = new Food(foodId, foodName, foodCategory, foodCost);
        scanner.close();
    }
    // Read the food category for counting
    String category = scanner.nextLine();
    // Call the countFoodByGivenCategory method and print the result
    int count = countFoodByGivenCategory(foods, category);
    if (count > 0) {
        System.out.println(count);
    } else {
        System.out.println("No Food with the given category are found");
    }
    // Call the getFoodWithMinCost method and print the result
    Food minCostFood = getFoodWithMinCost(foods);
    if (minCostFood != null) {
        System.out.println(minCostFood);
    } else {
        System.out.println("No Food is found");
    }
 }
 public static int countFoodByGivenCategory(Food[] foods, String category) {
    int count = 0;
    for (Food food : foods) {
        if(normalizeCategory(food.getFoodCategory()).equalsIgnoreCase(normalizeCategory(category))) {
            count++;
        }
    }
    return count;
 }
 public static Food getFoodWithMinCost(Food[] foods) {
    if (foods.length == 0) {
        return null;
    }
    Food minCostFood = foods[0];
    for (Food food : foods) {
        if(food.getFoodCost() < minCostFood.getFoodCost()) {
            minCostFood = food;
        }
    }
    return minCostFood;
 }
 private static String normalizeCategory(String category) {
    // Normalize similar categories to a common form
    if (category.equalsIgnoreCase("vegan")) {
        return "veg";
    }
    return category.toLowerCase();
    }
}