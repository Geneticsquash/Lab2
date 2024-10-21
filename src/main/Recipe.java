import java.util.ArrayList;

//TODO inheritance https://www.youtube.com/watch?v=zbVAU7lK25Q, https://www.w3schools.com/java/java_inheritance.asp
public class Recipe extends Ingredients {
    private int idNumber;
    private String recipename;
    private ArrayList<Ingredients> ingredients; // Generics
    private FullCourseMenu fullCourseMenu;

    public Recipe(int idNumber, String recipeName, FullCourseMenu fullCourseMenu) {
        super(recipeName);
        this.recipename = recipeName;
        this.idNumber = idNumber;
    this.fullCourseMenu = fullCourseMenu;
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
    public FullCourseMenu getFullCourseMenu() {
        return fullCourseMenu;
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










