import java.util.Scanner;
class MenuOption {

//TODO
// Exception in thread "main" java.lang.NullPointerException: Cannot invoke "java.util.ArrayList.add(Object)" because "this.ingredients" is null
// Combine MenuOption, MenuSystem and ManagingFullCourseClass
public MenuOption() {


    int menuChoice;
        String[] menuOption = {
                "1. Add a new recipe to the menu", "2. View all the recipes we have on the menu", "3. Remove a recipe from the menu", "0. Exit the program"
        };
         MenuSystem menu = new MenuSystem();


        do {
            System.out.println("Choose an option");

            for (String option : menuOption) {
                System.out.println(option);
            }
            System.out.println("Enter your choice");
            Scanner scanner = new Scanner(System.in);
            menuChoice = scanner.nextInt();
            scanner.nextLine();

            switch (menuChoice) {
                // TODO: Create a system where you can create a recipe, while adding ingredient
                case 1 -> {
                    System.out.println("1. Add a new recipe to the menu ");
                    menu.addRecipeSystem();
                }
                case 2 -> {
                    // TODO: Create a system where you can view a recipe with the following ingredient
                    System.out.println("2. View all the recipes we have on the menu");
                    menu.viewRecipeSystem();
                }

                case 3 -> {
                    // TODO: Create a system where you can remove a recipe, and remove the ingredient within said recipe.
                    System.out.println("Remove the recipes from the menu");
                    menu.removeRecipeSystem();
                }
                case 0 -> {
                    System.out.println("Exit the program");


                }
                default -> {
                    System.out.println("Invalid choice, please try again");
                }
            }

        } while (menuChoice != 0);


    }

    public static void main(String[] args) {

        System.out.println("Welcome to the Menu System");
        new MenuOption();


    }
}