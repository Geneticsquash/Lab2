import java.util.Scanner;


//TODO: Create a system where you can create a recipe, while adding ingredient,

public class ManagingFullCourseMenu {

    public static Recipe createRecipe(int idNumber, String recipeName, String courseType) {
        FullCourseMenu fullCourseMenu;
        switch (courseType.toUpperCase()) {
            case "HORS D'OEUVRE":
                fullCourseMenu = new HorsDoeuvre();
                break;
            case "SOUP":
                fullCourseMenu = new Soup();
                break;
            case "FISH":
                fullCourseMenu = new Fish();
                break;
            case "MEAT":
                fullCourseMenu = new Meat();
                break;
            case "MAIN COURSE":
                fullCourseMenu = new MainCourse();
                break;
            case "SALAD":
                fullCourseMenu = new Salad();
                break;
            case "DESSERT":
                fullCourseMenu = new Dessert();
                break;
            case "DRINK":
                fullCourseMenu = new Drink();
                break;
            default:
                return null;
        }
        return new Recipe(idNumber, recipeName, fullCourseMenu);
    }
}
