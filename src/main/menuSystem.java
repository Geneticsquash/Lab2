import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class menuSystem {
    private List<Recipe> recipes;
    private static ArrayList<Recipe> newRecipesList = new ArrayList<>();


    public menuSystem() {
        this.recipes = new ArrayList<>();
        assignAddRecipeSystem();
    }
    //TODO Recipe in class cannot be applied to given types (new)
    // Need to fix it, so it can be applied to the given types
    private void assignAddRecipeSystem() {
        FullCourseMenu fullCourseMenu = FullCourseMenu.MAIN_COURSE;
        Recipe recipe1 = new Recipe(1,"Mineral Earthworm", fullCourseMenu);
        recipe1.addIngredient(new Ingredients("Earthworm"));
        newRecipesList.add(recipe1);

        Recipe recipe2 = new Recipe(2,"Lily Oyster Fried Rice", fullCourseMenu);
        recipe2.addIngredient(new Ingredients("Lily Flower"));
        recipe2.addIngredient(new Ingredients("Oyster"));
        recipe2.addIngredient(new Ingredients("Rice"));
        newRecipesList.add(recipe2);

    }


//TODO "Need to update addRecipeSystem!" (It´s Updated!!!)
    public void addRecipeSystem() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Add a new recipe name: ");
        String addNewRecipeName = scanner.nextLine();
        System.out.println("Add a new recipe number: ");
        int addNewRecipeNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter course type (HorsD'oeuvre, Soup, Fish, Meat, Main Course, Salad, Dessert or Drink):");
        String courseType = scanner.nextLine().toUpperCase();
        Recipe newRecipeList = ManagingFullCourseMenu.createRecipe(addNewRecipeNumber, addNewRecipeName, courseType);
        if (newRecipeList == null) {
            System.out.println("Invalid course type");
            return;
        }
        String addMoreIngredients;
        do {
            System.out.println("Add an ingredient name: ");
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


//TODO Add/Fix removeMethod! https://www.youtube.com/watch?v=4VRvHdVrd1Y
    public void removeRecipeSystem() {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name to remove a recipe: ");
        int removeRecipeIdNumber = Integer.parseInt(input.nextLine());
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

}