import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class IngredientsTest {

    @Test
    void testGetIngredientName() {
        String ingredientName = "BBQ Popcorn";
        Ingredients ingredients = new Ingredients(ingredientName);
        assertEquals("BBQ Popcorn", ingredients.getIngredientName());



    }

    @Test
    void testSetIngredientName() {

        String ingredientName = "BBQ Popcorn";
        Ingredients ingredients = new Ingredients(ingredientName);
        ingredients.setIngredientName("BBQ Mosquitoes Sausage");
        assertEquals("BBQ Mosquitoes Sausage", ingredients.getIngredientName());
    }

}