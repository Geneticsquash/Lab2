import java.util.ArrayList;
import java.util.Scanner;

public class  menuSystem {
    public menuSystem() {



    }   // https://www.youtube.com/watch?v=K1iu1kXkVoA // https://www.youtube.com/watch?v=k_SJOnVa_G0
    //TODO
    // I will use Arraylist because it has a built-in methods for sorting, searching etc!

    public String getAddNewRecipeName() {
        return addNewRecipeName;
    }

    public void setAddNewRecipeName(String addNewRecipeName) {
        this.addNewRecipeName = addNewRecipeName;
    }

    private String addNewRecipeName;

    public int getAddNewRecipeNumber() {
        return addNewRecipeNumber;
    }

    public void setAddNewRecipeNumber(int addNewRecipeNumber) {
        this.addNewRecipeNumber = addNewRecipeNumber;
    }

    private int addNewRecipeNumber;

    private static ArrayList<menuSystem> newRecipeList = new ArrayList<>();


    public menuSystem(String addNewRecipeName, int addNewRecipeNumber) {
        this.addNewRecipeName = addNewRecipeName;
        this.addNewRecipeNumber = addNewRecipeNumber;
        newRecipeList.add(this);

    }

//TODO Need to update addRecipeSystem!
    public static void addRecipeSystem() {


        String addNewRecipeName;
        int addNewRecipeNumber;
        Scanner input = new Scanner(System.in);
        System.out.println("Add a new recipe name: ");
        addNewRecipeName = input.nextLine();


        do {
            System.out.println("Please enter the recipe number: ");
            addNewRecipeNumber = input.nextInt();
            input.nextLine();

            if (addNewRecipeNumber <= 0) {
                System.out.println(" Invalid recipe number, try again: ");
            }
        }
        while (addNewRecipeNumber <= 0);

        newRecipeList.add(new menuSystem(addNewRecipeName, addNewRecipeNumber));


    }

//TODO Works fine, somehow when adding a recipe it duplicate?

    public static int[] viewRecipeSystem(int i) {
        if (newRecipeList.isEmpty()) {
            System.out.println("There are no recipe system available");
        } else {
            System.out.println("The recipe list:");
            for(menuSystem s : newRecipeList) {
                System.out.println(s.getAddNewRecipeName());
            }
        }

        return new int[0];
    }
//TODO Add/Fix removeMethod! https://www.youtube.com/watch?v=4VRvHdVrd1Y
    public static int[] removeRecipeSystem() {
        // ask the user which to remove
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name to remove a recipe: ");
        String removeRecipeName = input.nextLine();
// List of all the recipes in viewMethod // Relearning Boolean https://www.youtube.com/watch?v=Jlv_fdB4cTY
        boolean removeFound = false;
        for(int j = 0; j < newRecipeList.size(); j++) {
            if (newRecipeList.get(j).getAddNewRecipeName().equals(removeRecipeName)) {
                newRecipeList.remove(j);
                removeFound = true;
                break;
                // What, Intellj wrote from "int j etc to "break;"
            }
        }
        if (removeFound) {
            System.out.println("There are no recipe system available");
        }


        // Type number to remove




        return new int[0];
    }

}