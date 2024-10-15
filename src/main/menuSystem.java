import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class  menuSystem <Thing> {
    private List<Thing> recipes;


    public menuSystem() {
        this.recipes = new ArrayList<>();
        addRecipeSystem();
    }


    private String addNewRecipeName;
    private int addNewRecipeNumber;


    //TODO  https://www.youtube.com/watch?v=K1iu1kXkVoA // https://www.youtube.com/watch?v=k_SJOnVa_G0
    // I will use Arraylist because it has a built-in methods for sorting, searching etc!

    public String getAddNewRecipeName() {
        return addNewRecipeName;
    }

    public void setAddNewRecipeName(String addNewRecipeName) {
        this.addNewRecipeName = addNewRecipeName;
    }

    public int getAddNewRecipeNumber() {
        return addNewRecipeNumber;
    }

    public void setAddNewRecipeNumber(int addNewRecipeNumber) {
        this.addNewRecipeNumber = addNewRecipeNumber;
    }


    private static ArrayList<menuSystem> newRecipeList = new ArrayList<>();


    public menuSystem(String addNewRecipeName, int addNewRecipeNumber) {
        this.addNewRecipeName = addNewRecipeName;
        this.addNewRecipeNumber = addNewRecipeNumber;

    }

//TODO Need to update addRecipeSystem!
    public static void addRecipeSystem() {

        String addNewRecipeName;
        int addNewRecipeNumber;
        Scanner input = new Scanner(System.in);
        System.out.println("Add a new recipe name: ");
        addNewRecipeName = input.nextLine();
        System.out.println("Add a new recipe number: ");
        addNewRecipeNumber = input.nextInt();

        if (newRecipeList.isEmpty()) {
            newRecipeList.add(new menuSystem("Mineral Earthworm", 1));
            newRecipeList.add(new menuSystem("Lily Oyster Fried Rice", 2));
            newRecipeList.add(new menuSystem("Leafburg Steak Tree", 3));
            newRecipeList.add(new menuSystem("Air", 4));
        }

        else {
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



//TODO Works fine, somehow when adding a recipe it duplicate itself?

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
            }
        }
        if (removeFound) {
            System.out.println("There are no recipe system available");
        }

        return new int[0];
    }

}