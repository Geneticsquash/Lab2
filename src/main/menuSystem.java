import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class  menuSystem {
    private List<defaultRecipe> recipes;
    private static ArrayList<defaultRecipe> newRecipesList = new ArrayList<>();


    public menuSystem() {
        this.recipes = new ArrayList<>();
        assignAddRecipeSystem();
    }
    private void assignAddRecipeSystem() {
        defaultRecipe recipe1 = new defaultRecipe(1,"Mineral Earthworm");
        recipe1.addIngredient(new defaultIngredients("Earthworm"));
        newRecipesList.add(recipe1);

        defaultRecipe recipe2 = new defaultRecipe(2,"Lily Oyster Fried Rice");
        recipe2.addIngredient(new defaultIngredients("Lily Flower"));
        recipe2.addIngredient(new defaultIngredients("Oyster"));
        recipe2.addIngredient(new defaultIngredients("Rice"));
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

        defaultRecipe newRecipeList = new defaultRecipe(addNewRecipeNumber, addNewRecipeName);
        newRecipesList.add(newRecipeList);
        System.out.println("You added a new recipe, hope it doest taste as horrible as last time...");
}


//TODO Works fine, somehow when adding a recipe it duplicate itself? (Fixed)

    public void viewRecipeSystem() {
        if (newRecipesList.isEmpty()) {
            System.out.println("There are no recipe system available");
        } else {
            System.out.println("The recipe list:");
            for (defaultRecipe recipe : newRecipesList) {
                System.out.println(recipe.toString() + "ID: " + recipe.getIdNumber() + ": ");
                for(defaultIngredients ingredient : recipe.getIngredients()) {
                    System.out.println(ingredient.toString());
                }
                System.out.println();
            }
            }
        }


//TODO Add/Fix removeMethod! https://www.youtube.com/watch?v=4VRvHdVrd1Y
    public void removeRecipeSystem() {
/*


        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name to remove a recipe: ");
        String removeRecipeName = input.nextLine();
        boolean removeFound = false;

            for (int i = 0; i < newRecipesList.size(); i++) {
                if (removeRecipeName.equals(newRecipesList.get(i).toString())) {
                    removeFound = true;
                    newRecipesList.remove(i);
                    break;
                }
               }


        if (!removeFound) {
            System.out.println("There are no recipe system available");
        }
 */
    }

}