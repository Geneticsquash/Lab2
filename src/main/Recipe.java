public class Recipe extends Categories {
    // https://www.youtube.com/watch?v=K1iu1kXkVoA
    // https://www.youtube.com/watch?v=k_SJOnVa_G0


    private String recipeName;
    private int recipeNumber;

    public Recipe(int recipeNumber, String recipeName) {
        this.recipeNumber = recipeNumber;
        this.recipeName = recipeName;
    }

    public Recipe() {

    }

    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public int getRecipeNumber() {
        return recipeNumber;
    }

    public void setRecipeNumber(int recipeNumber) {
        this.recipeNumber = recipeNumber;
    }
    public class Demo
    {

        public static void demoSetRecipeNumber(String[] args)
        {  Recipe obj= new Recipe();
            obj.setRecipeNumber(1);
            obj.setRecipeName("Spicy Swedish Meatballs");

            System.out.println(obj.getRecipeName() + " " + obj.getRecipeNumber());

        }
    }
}