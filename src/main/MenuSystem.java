import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuSystem {
    private List<Recipe> recipes;
    private static ArrayList<Recipe> newRecipesList = new ArrayList<>();


    public MenuSystem() {
        this.recipes = new ArrayList<>();

    }


//TODO "Need to update addRecipeSystem!" (It´s Updated!!!) (Updated again!)
    public void addRecipeSystem() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add a new recipe name: ");
        String addNewRecipeName = scanner.nextLine();

        System.out.println("Add a new recipe number: ");
        int addNewRecipeNumber = 0;
        while (true) {
            try {
                addNewRecipeNumber = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Enter a valid number");
            }
        }

        System.out.println("Hors D'oeuvre, Soup, Fish, Meat, Main Course, Salad, Dessert or Drink:");
        String courseType;
        Recipe newRecipeList;

        while (true) {
            courseType = scanner.nextLine().toUpperCase();
            newRecipeList = ManagingFullCourseMenu.createRecipe(addNewRecipeNumber, addNewRecipeName, courseType);
            if (newRecipeList != null) {
                break;
            } else {
                System.out.println("Invalid course type, please try again:");
            }
        }

        String addMoreIngredients;
        do {
            System.out.println("Add an ingredient (e.g., 2mg of salt): ");
            String ingredientName = scanner.nextLine();
            Ingredients ingredient = new Ingredients(ingredientName);
            newRecipeList.addIngredient(ingredient);

            System.out.println("Do you want to add another ingredient? (yes/no): ");
            addMoreIngredients = scanner.nextLine();
        } while (addMoreIngredients.equalsIgnoreCase("yes"));

        newRecipesList.add(newRecipeList);
        System.out.println("Recipe has been added to the list!");
    }


//TODO Works fine, somehow when adding a recipe it duplicate itself? (old)
    //TODO Need to update viewRecipeSystem! doesnt view the recipe correctly!
    // Updated viewRecipeSystem! (Updated again!)


    public void viewRecipeSystem() {
        if (newRecipesList.isEmpty()) {
            System.out.println("There are no recipe system available");
        } else {
            System.out.println("The recipe list:");
            for (Recipe recipe : newRecipesList) {
                System.out.println("Recipe name: " + recipe.getRecipename() + "  | ID Number: " + recipe.getIdNumber() + " | Course Type: " + recipe.getFullCourseMenu());
                System.out.println("Ingredients: ");
                for (Ingredients ingredient : recipe.getIngredients()) {
                    System.out.println("- " + ingredient.getName());
                }
                System.out.println();
            }
        }
    }


//TODO Add/Fix removeMethod! https://www.youtube.com/watch?v=4VRvHdVrd1Y (Fixed!)
    public void removeRecipeSystem() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the ID number to remove a recipe: ");
        int removeRecipeIdNumber = 0;
        while (true) {
            try {
                removeRecipeIdNumber = Integer.parseInt(input.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            }
        }
        boolean removeFound = false;

            for (int i = 0; i < newRecipesList.size(); i++) {
                if (removeRecipeIdNumber == newRecipesList.get(i).getIdNumber()) {
                    newRecipesList.remove(i);
                    removeFound = true;
                    System.out.println("Recipe with ID" + removeRecipeIdNumber + " has been removed, thank god, it tasted awful!");
                    break;
                }
               }


        if (!removeFound) {
            System.out.println("Recipe with ID" + removeRecipeIdNumber + " was not found, don´t try it again!");
        }

    }

    public List<Recipe> getRecipes() {
        return newRecipesList;

    }
}