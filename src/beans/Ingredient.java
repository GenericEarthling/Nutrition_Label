/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.Objects;

/**
 *
 * @author Tender
 */
public class Ingredient implements Cloneable {
    
    private String name;
    private double servingSize;
    private double calories;
    private double fat;
    private double cholesterol;
    private double sodium;
    private double carbohydrates;
    private double fiber;
    private double protein;
    private double ingredAmt;
    private String measure;

    // default construct sets the default values
    public Ingredient() {
        name = "";
        servingSize = 0;
        calories = 0;
        fat = 0;
        cholesterol = 0;
        sodium = 0;
        carbohydrates = 0; 
        fiber = 0;
        protein = 0;
        ingredAmt = 0;
        measure = "";
    }

    // constructor for Ingredient that is saved to file
    public Ingredient(String name, double servingSize, double calories, double fat, double cholesterol, double sodium, double carbohydrates, double fiber, double protein) {
        this.name = name;
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
    public Ingredient(String name, double servingSize, double calories, double fat, double cholesterol, double sodium, double carbohydrates, double fiber, double protein, double ingredAmt, String measure) {
        this.name = name;
        this.servingSize = servingSize;
        this.calories = calories;
        this.fat = fat;
        this.cholesterol = cholesterol;
        this.sodium = sodium;
        this.carbohydrates = carbohydrates;
        this.fiber = fiber;
        this.protein = protein;
        this.ingredAmt = ingredAmt;
        this.measure = measure;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getMeasure() {
        return measure;
    }

    public void setMeasure(String measure) {
        this.measure = measure;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 31 * hash + Objects.hashCode(this.name);
        hash = 31 * hash + (int) (Double.doubleToLongBits(this.servingSize) ^ (Double.doubleToLongBits(this.servingSize) >>> 32));
        hash = 31 * hash + (int) (Double.doubleToLongBits(this.calories) ^ (Double.doubleToLongBits(this.calories) >>> 32));
        hash = 31 * hash + (int) (Double.doubleToLongBits(this.fat) ^ (Double.doubleToLongBits(this.fat) >>> 32));
        hash = 31 * hash + (int) (Double.doubleToLongBits(this.cholesterol) ^ (Double.doubleToLongBits(this.cholesterol) >>> 32));
        hash = 31 * hash + (int) (Double.doubleToLongBits(this.sodium) ^ (Double.doubleToLongBits(this.sodium) >>> 32));
        hash = 31 * hash + (int) (Double.doubleToLongBits(this.carbohydrates) ^ (Double.doubleToLongBits(this.carbohydrates) >>> 32));
        hash = 31 * hash + (int) (Double.doubleToLongBits(this.fiber) ^ (Double.doubleToLongBits(this.fiber) >>> 32));
        hash = 31 * hash + (int) (Double.doubleToLongBits(this.protein) ^ (Double.doubleToLongBits(this.protein) >>> 32));
        return hash;
    }

    // Do not check if it equals ingredient amount and/or measurement type when comparing
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Ingredient other = (Ingredient) obj;
        if (Double.doubleToLongBits(this.servingSize) != Double.doubleToLongBits(other.servingSize)) {
            return false;
        }
        if (Double.doubleToLongBits(this.calories) != Double.doubleToLongBits(other.calories)) {
            return false;
        }
        if (Double.doubleToLongBits(this.fat) != Double.doubleToLongBits(other.fat)) {
            return false;
        }
        if (Double.doubleToLongBits(this.cholesterol) != Double.doubleToLongBits(other.cholesterol)) {
            return false;
        }
        if (Double.doubleToLongBits(this.sodium) != Double.doubleToLongBits(other.sodium)) {
            return false;
        }
        if (Double.doubleToLongBits(this.carbohydrates) != Double.doubleToLongBits(other.carbohydrates)) {
            return false;
        }
        if (Double.doubleToLongBits(this.fiber) != Double.doubleToLongBits(other.fiber)) {
            return false;
        }
        if (Double.doubleToLongBits(this.protein) != Double.doubleToLongBits(other.protein)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    
    
    @Override
    public String toString() {
        String ingredient;
        ingredient = name + "\t" + ingredAmt + "\t" + measure + "\t" + calories + "\t" + 
                fat + "\t" + cholesterol + "\t" + sodium + "\t" + carbohydrates + 
                "\t" + fiber + "\t" + protein;
        return ingredient;
    }
        
}
