class defaultIngredients<T> extends defaultRecipe {
    private String ingredientName;

public defaultIngredients(String ingredientName) {
    this.ingredientName = ingredientName;
}

public String getIngredientName() {
return ingredientName;


}
// IntelliJ IDEA's code completion and inspection system is pretty good!
@Override
    public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    defaultIngredients that = (defaultIngredients) o;
    return ingredientName.equals(that.ingredientName);
}

@Override
    public int hashCode() {
    return ingredientName.hashCode();
}
}



