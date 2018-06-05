/*
 * Save, Edit, and Delete ingredient objects from a file.
 */
package utilities;

import beans.Ingredient;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author Tender
 */
public class FileManagement {
    private static final String DELIMITER = "|";
    private static final String NEW_LINE = "\n";
    private static final Path PATH = Paths.get("Data/ingredients.txt");

    public FileManagement() {
    }
    
    public static Boolean isDuplicate(String searchName) {
        File file = PATH.toFile();
        
        // search each line for a match        
        // if match is found, copy data into an ingredient object               
        try (BufferedReader in = new BufferedReader(
                                 new FileReader(file))) {
            String data = in.readLine();
            System.out.println("isDuplicate-first line of data read: " + data);
            while (data != null) {
                StringTokenizer t = new StringTokenizer(data, DELIMITER);
                String iName = t.nextToken();
                if (searchName.equalsIgnoreCase(iName)) {
                    System.out.println("IsDuplicate search name: " + searchName);
                    data = in.readLine();
                    return true;
                } else {
                    return false;
                }                
            } 
        } catch (IOException e) {
            System.err.println("ERROR-isDuplicate- catch exception: " + e);
        } 
        System.out.println("isDuplicate--end of try-catch");        
        return false;
    }
    
    // saves the ingredient into a file
    public static void saveIngredient(Ingredient ingredient) throws IOException {   
        File file = PATH.toFile();
        // If file does not exist, create one.
        try {
            if (Files.notExists(PATH)) {
                Files.createFile(PATH);
            }
        } catch (IOException e)  {
            System.err.println("ERROR--saveIngredient(ingredient): try-catch: " + e);
        }


            try (PrintWriter out = new PrintWriter(
                                   new BufferedWriter(
                                   new FileWriter(file, true)), true)) {
                // save each column of data in this specific order
                out.print(ingredient.getName() + DELIMITER);
                out.print(ingredient.getServingSize() + DELIMITER);
                out.print(ingredient.getCalories() + DELIMITER);
                out.print(ingredient.getFat()+ DELIMITER);
                out.print(ingredient.getCholesterol() + DELIMITER);
                out.print(ingredient.getSodium() + DELIMITER);
                out.print(ingredient.getCarbohydrates() + DELIMITER);
                out.print(ingredient.getFiber() + DELIMITER);
                out.print(ingredient.getProtein() + NEW_LINE);
            } catch (IOException e) {
                 System.err.println("ERROR--saveIngredient(ingredient): catch exception: " + e);
            }            
        
    } 
    
    // retrieve Ingredient object
    public static Ingredient fetchIngredient(String name) {

        Ingredient i = null;
        File file = PATH.toFile();
        
        // search each line for a match        
        // if match is found, copy data into an ingredient object               
        try (BufferedReader in = new BufferedReader(
                                 new FileReader(file))) {
            String data = in.readLine();
            System.out.println("Search Button-first line of data read: " + data);
            while (data != null) {
                StringTokenizer t = new StringTokenizer(data, DELIMITER);
                String iName = t.nextToken();
                if (name.equalsIgnoreCase(iName)) {
                    Double servingSize = Double.parseDouble(t.nextToken());
                    Double calories = Double.parseDouble(t.nextToken());
                    Double fat = Double.parseDouble(t.nextToken());
                    Double cholesterol = Double.parseDouble(t.nextToken());
                    Double sodium = Double.parseDouble(t.nextToken());
                    Double carbs = Double.parseDouble(t.nextToken());
                    Double fiber = Double.parseDouble(t.nextToken());
                    Double protein = Double.parseDouble(t.nextToken());
                    i = new Ingredient(iName, servingSize, calories, fat, cholesterol, sodium, carbs, fiber, protein);
                    System.out.println("Search Button-ingredient found, values are: " + i.toString());
                    return i;
                } else {
                    data = in.readLine();
                }                
            } 
        } catch (IOException e) {
            System.err.println("ERROR-fetchIngredient(ingredient): catch exception: " + e);
        } 
            System.out.println("Search Button-end of try-catch");        
        return i;
    }

}
