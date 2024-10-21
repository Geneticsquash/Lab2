import java.util.Scanner;

public class ManagingFullCourseMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter recipe ID number");
        int idNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter recipe name");
        String recipeName = scanner.nextLine();

        System.out.println("Enter course type (HorsDoeuvre, Soup, Fish, Meat, MainCourse, Salad, Dessert, Drink):");
        String courseType = scanner.nextLine().toUpperCase();

        Recipe recipe = createRecipe(idNumber, recipeName, courseType);

        if (recipe != null) {
            System.out.println("Recipe created: " + recipe.getRecipename() + " (" + courseType + ")");
        } else {
            System.out.println("Invalid course type");
        }

        scanner.close();
    }
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
