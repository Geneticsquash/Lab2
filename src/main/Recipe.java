import java.util.ArrayList;
import java.util.List;

//TODO Trying to add preExisting recipes
class defaultRecipe {
    private int idNumber;
    private String recipename;
    private ArrayList<defaultIngredients> ingredients;

    public defaultRecipe(int idNumber, String recipename, ArrayList<defaultIngredients> ingredients) {
    this.idNumber = idNumber;
    this.recipename = recipename;
    this.ingredients = new ArrayList<>();

    }

    public defaultRecipe(int idNumber, String mineralEarthworm) {
    }

    public int getIdNumber() {
        return idNumber;
    }
    public String getRecipename() {
        return recipename;
    }
    public ArrayList<defaultIngredients> getIngredients() {
        return ingredients;
    }
    public void addIngredient(defaultIngredients ingredient) {
        ingredients.add(ingredient);
    }
    // Completion and inspection system broken
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        defaultRecipe that = (defaultRecipe) o;
        return idNumber == that.idNumber;
    }
@Override
public int hashCode() {
    return idNumber;
    }
}










