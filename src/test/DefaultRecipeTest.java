import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DefaultRecipeTest {

    @Test
    void getRecipename() {
        int addNewRecipeNumber = 1;
        String addNewRecipeName = "Chirashi Sushi Rock";
        FullCourseMenu fullCourseMenu = new MainCourse();
        Recipe newRecipeList = new Recipe(addNewRecipeNumber, addNewRecipeName, fullCourseMenu);
        assertEquals("Chirashi Sushi Rock", newRecipeList.getRecipename());
    }

    @Test
    void getIngredients() {
        int addNewRecipeNumber = 1;
        String addNewRecipeName = "Chirashi Sushi Rock";
        FullCourseMenu fullCourseMenu = new MainCourse();
        Recipe newRecipeList = new Recipe(addNewRecipeNumber, addNewRecipeName, fullCourseMenu);
        Ingredients rice = new Ingredients("Sushi Rice");
        newRecipeList.addIngredient(rice);
        assertEquals(1, newRecipeList.getIngredients().size());
    }

    @Test
    void addIngredient() {
        int addNewRecipeNumber = 1;
        String addNewRecipeName = "Chirashi Sushi Rock";
        FullCourseMenu fullCourseMenu = new MainCourse();
        Recipe newRecipeList = new Recipe(addNewRecipeNumber, addNewRecipeName,fullCourseMenu);
        Ingredients rice = new Ingredients("Sushi Rice");
        newRecipeList.addIngredient(rice);
        assertEquals("Sushi Rice", newRecipeList.getIngredients().get(0).getName());
    }

    @Test
}

