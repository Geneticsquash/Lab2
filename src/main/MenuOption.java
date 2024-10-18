import java.util.Scanner;
//TODO 10-18
// Objektorienterad programmering (G5) - I´m getting there,
// Användning av Generics (G6) - It´s in the ArrayList of the other classes
// Versionshantering - I have done it from terminal, cmp and Git
// Verifiering och felsökning (G14) - Yes, I have!
// Enhetstestning (G7 +  G16) - Did not follow the correct instruction, I did the code for JUnit test before coding, Add, View and remove methods. Where to I go from here!?

class MenuOption {

//TODO
// Exception in thread "main" java.lang.NullPointerException: Cannot invoke "java.util.ArrayList.add(Object)" because "this.ingredients" is null

public MenuOption() {

        int menuChoice;
        String[] menuOption = {
                "1. Add a new recipe to the menu", "2. View all the recipes we have on the menu", "3. Remove a recipe from the menu", "0. Exit the program"
        };
         menuSystem menu = new menuSystem();


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

    /* Create a main class that handles the program´s logic and additional,
classes for recipes, ingredients, and Categories

The application should apply OOP concepts:
abstraction, encapsulation, inheritance, and polymorphism.

// Object = an instance of a class that may contain attributes and methods

https://www.youtube.com/watch?v=kd3dr39rgrk&list=PLxuuH5GnCIlcGnesYMkGQOqokyI2Fwu3g

*/
    public static void main(String[] args) {

        System.out.println("Welcome to the Menu System");
        new MenuOption();


    }
}