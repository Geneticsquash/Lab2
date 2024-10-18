import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DefaultRecipeTest {

    @Test
    void getRecipename() {
        int addNewRecipeNumber = 1;
        String addNewRecipeName = "Chirashi Sushi Rock";
        ArrayList<Recipe> newRecipesList = new ArrayList<>();
        Recipe newRecipeList = new Recipe(addNewRecipeNumber, addNewRecipeName);
        newRecipesList.add(newRecipeList);
        assertEquals(addNewRecipeName, newRecipeList.getRecipename());
    }

    @Test
    void getIngredients() {
        int addNewRecipeNumber = 1;
        String addNewRecipeName = "Chirashi Sushi Rock";
        Recipe newRecipeList = new Recipe(addNewRecipeNumber, addNewRecipeName);
        Ingredients rice = new Ingredients("Rice");
        newRecipeList.addIngredient(rice);
        assertEquals(1, newRecipeList.getIngredients().size());
        assertEquals("Rice", newRecipeList.getIngredients().get(0).getName());
    }

    @Test
    void addIngredient() {
    }
}