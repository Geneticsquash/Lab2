import java.util.ArrayList;
import java.util.Scanner;


class menuOption {
    // Reusing the code from the 1st assignment with minor changes Lab 1
    Scanner scanner = new Scanner(System.in);

    public menuOption() {
        int menuChoice;
        String[] menuOption = {
                "1. Add a new recipe to the menu", "2. View all the recipes we have on the menu", "3. Remove a recipe from the menu", "0. Exit the program"
        };

        do {
            System.out.println("Choose an option");

            for (String option : menuOption) {
                System.out.println(option);
            }
            System.out.println("Enter your choice");
            menuChoice = scanner.nextInt();
            scanner.nextLine();

            switch (menuChoice) {
                // TODO: Create a system where you can create a recipe, while adding ingredient
                case 1 -> {
                    System.out.println("1. Add a new recipe to the menu ");
                    menuSystem.addRecipeSystem();
                }
                case 2 -> {
                    // TODO: Create a system where you can view a recipe with the following ingredient
                    System.out.println("2. View all the recipes we have on the menu");
                    menuSystem.viewRecipeSystem(0);
                }

                case 3 -> {
                    // TODO: Create a system where you can remove a recipe, and remove the ingredient within said recipe.
                    System.out.println("Remove the recipes from the menu");
                    menuSystem.removeRecipeSystem();
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

    /* Create a main class that handles the program´s logic and additional,
classes for recipes, ingredients, and Categories

The application should apply OOP concepts:
abstraction, encapsulation, inheritance, and polymorphism.

// Object = an instance of a class that may contain attributes and methods

https://www.youtube.com/watch?v=kd3dr39rgrk&list=PLxuuH5GnCIlcGnesYMkGQOqokyI2Fwu3g

*/
    public static void main(String[] args) {


        new menuOption();
        System.out.println("Welcome to the Menu System");


        Scanner in = new Scanner(System.in);


    }
}