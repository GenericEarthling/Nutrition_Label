/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

/**
 *
 * @author Tender
 */
public class Ingredient {
    
    private String iName;
    private double servingSize;
    private double calories;
    private double fat;
    private double cholesterol;
    private double sodium;
    private double carbohydrates;
    private double fiber;
    private double protein;
    private double ingredAmt;

    // default construct sets the default values
    public Ingredient() {
        iName = "";
        servingSize = 0;
        calories = 0;
        fat = 0;
        cholesterol = 0;
        sodium = 0;
        carbohydrates = 0; 
        fiber = 0;
        protein = 0;
        ingredAmt = 0;
    }

    // constructor for Ingredient that is saved to file
    public Ingredient(String iName, double servingSize, double calories, double fat, double cholesterol, double sodium, double carbohydrates, double fiber, double protein) {
        this.iName = iName;
        this.servingSize = servingSize;
        this.calories = calories;
        this.fat = fat;
        this.cholesterol = cholesterol;
        this.sodium = sodium;
        this.carbohydrates = carbohydrates;
        this.fiber = fiber;
        this.protein = protein;
    }

    // constructor for running totals
    public Ingredient(double calories, double fat, double cholesterol, double sodium, double carbohydrates, double fiber, double protein) {
        this.calories = calories;
        this.fat = fat;
        this.cholesterol = cholesterol;
        this.sodium = sodium;
        this.carbohydrates = carbohydrates;
        this.fiber = fiber;
        this.protein = protein;
    }

    // constructor for Ingredient used for sending data from MainWindow to Nutrition Window 
    public Ingredient(String iName, double servingSize, double calories, double fat, double cholesterol, double sodium, double carbohydrates, double fiber, double protein, double ingredAmt) {
        this.iName = iName;
        this.servingSize = servingSize;
        this.calories = calories;
        this.fat = fat;
        this.cholesterol = cholesterol;
        this.sodium = sodium;
        this.carbohydrates = carbohydrates;
        this.fiber = fiber;
        this.protein = protein;
        this.ingredAmt = ingredAmt;
    }
    
    // constructor for order of input for table and form (order of input and display)
    public Ingredient(double ingredAmt, String iName, double servingSize, double calories, double fat, double cholesterol, double sodium, double carbohydrates, double fiber, double protein) {
        this.iName = iName;
        this.servingSize = servingSize;
        this.calories = calories;
        this.fat = fat;
        this.cholesterol = cholesterol;
        this.sodium = sodium;
        this.carbohydrates = carbohydrates;
        this.fiber = fiber;
        this.protein = protein;
        this.ingredAmt = ingredAmt;
    }

    public String getiName() {
        return iName;
    }

    public void setiName(String iName) {
        this.iName = iName;
    }

    public double getServingSize() {
        return servingSize;
    }

    public void setServingSize(double servingSize) {
        this.servingSize = servingSize;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public double getFat() {
        return fat;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }

    public double getCholesterol() {
        return cholesterol;
    }

    public void setCholesterol(double cholesterol) {
        this.cholesterol = cholesterol;
    }

    public double getSodium() {
        return sodium;
    }

    public void setSodium(double sodium) {
        this.sodium = sodium;
    }    
    
    public double getCarbohydrates() {
        return carbohydrates;
    }

    public void setCarbohydrates(double carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    public double getFiber() {
        return fiber;
    }

    public void setFiber(double fiber) {
        this.fiber = fiber;
    }

    public double getProtein() {
        return protein;
    }

    public void setProtein(double protein) {
        this.protein = protein;
    }

    public double getIngredAmt() {
        return ingredAmt;
    }

    public void setIngredAmt(double ingredAmt) {
        this.ingredAmt = ingredAmt;
    }

    @Override
    public String toString() {
        return "Ingredient{" + "iName=" + iName + ", servingSize=" + servingSize + ", calories=" + calories + ", fat=" + fat + ", cholesterol=" + cholesterol + ", sodium=" + sodium + ", carbohydrates=" + carbohydrates + ", fiber=" + fiber + ", protein=" + protein + ", ingredAmt=" + ingredAmt + '}';
    }
        
    
}
