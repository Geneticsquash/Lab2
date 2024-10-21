import java.util.Scanner;

public class ManagingFullCourseMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter recipe ID number");
        int idNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter recipe name");
        String recipeName = scanner.nextLine();

        System.out.println("Enter course type (HorsD'oeuvre, Soup, Fish, Meat, Main Course, Salad, Dessert or Drink):");
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
        FullCourseMenu fullCourseMenu = FullCourseMenu.valueOf(courseType);
        switch (courseType) {
            case "HorsD'oeuvre":
                return new HorsDoeuvre(idNumber, recipeName,fullCourseMenu );
            case "Soup":
                return new Soup(idNumber, recipeName, fullCourseMenu);
            case "Fish":
                return new Fish(idNumber, recipeName, fullCourseMenu);
            case "Meat":
                return new Meat(idNumber, recipeName, fullCourseMenu);
            case "Main Course":
                return new MainCourse(idNumber, recipeName, fullCourseMenu);
            case "Salad":
                return new Salad(idNumber, recipeName, fullCourseMenu);
            case "Dessert":
                return new Dessert(idNumber, recipeName, fullCourseMenu);
            case "Drink":
                return new Drink(idNumber, recipeName, fullCourseMenu);
            default:
                return null;
        }
        }
    }