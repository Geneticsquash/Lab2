import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FullCourseMenuTest {

    @Test
    void testGetCourseTypeDessert() {
        FullCourseMenu fullCourseMenu = new Dessert();

        assertEquals("Dessert", fullCourseMenu.getCourseType());

    }

    //TODO Create similar tests for all classes that extends FullCourseMenu, i.e. Drink, Fish, HorsDoeuvre, Meat, Salad and Soup
    @Test
    void testGetCourseTypeDrink() {
        FullCourseMenu fullCourseMenu = new Drink();

        assertEquals("Drink", fullCourseMenu.getCourseType());
    }

    @Test
    void testGetCourseTypeFish() {
        FullCourseMenu fullCourseMenu = new Fish();

        assertEquals("Fish", fullCourseMenu.getCourseType());
    }

    @Test
    void testGetCourseTypeHorsDoeuvre() {
        FullCourseMenu fullCourseMenu = new HorsDoeuvre();

        assertEquals("Hors d'oeuvre", fullCourseMenu.getCourseType());
    }

    @Test
    void testGetCourseTypeSalad() {
        FullCourseMenu fullCourseMenu = new Salad();

        assertEquals("Salad", fullCourseMenu.getCourseType());
    }

    void testGetCourseTypeSoup() {
        FullCourseMenu fullCourseMenu = new Soup();

        assertEquals("Soup", fullCourseMenu.getCourseType());
    }
}