import java.util.Scanner;

public class  menuSystem {

    public static int[] addRecipeSystem() {

        String name = "ok...";
        int addNewRecipeName = Integer.parseInt(name),addNewRecipeNumber = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the recipe name: ");
        addNewRecipeName = input.nextInt();
        System.out.println("Please enter the recipe number: ");
        addNewRecipeNumber = input.nextInt();


        return new int[0];
    }


    public static int[] viewRecipeSystem() {

        return new int[0];
    }

    public static int[] removeRecipeSystem() {


        return new int[0];
    }

}