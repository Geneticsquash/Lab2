import java.util.ArrayList;

//TODO Trying to add preExisting recipes
class Recipe {
    private int idNumber;
    private String recipename;
    private ArrayList<Ingredients> ingredients; // Generics

    public Recipe(int idNumber, String recipeName, ArrayList<Ingredients> ingredients) {
    this.idNumber = idNumber;
    this.recipename = recipeName;
    this.ingredients = new ArrayList<>(); // Generics

    }

    public Recipe(int idNumber, String recipeName) {
        this.idNumber = idNumber;
        this.recipename = recipeName;
        this.ingredients = new ArrayList<>(); // Generics
    }

    public int getIdNumber() {
        return idNumber;
    }
    public String getRecipename() {
        return recipename;
    }
    public ArrayList<Ingredients> getIngredients() {
        return ingredients;
    }
    public void addIngredient(Ingredients ingredient) {
        ingredients.add(ingredient);
    }
    // Completion and inspection system broken!!
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe that = (Recipe) o;
        return idNumber == that.idNumber;
    }
@Override
public int hashCode() {
    return idNumber;
    }
}










