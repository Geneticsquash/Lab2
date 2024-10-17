import java.util.Objects;

class defaultIngredients<T>  {

    public int getDefaultIngredients() {
        return defaultIngredients;
    }

    public void setDefaultIngredients(int defaultIngredients) {
        this.defaultIngredients = defaultIngredients;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        defaultIngredients<?> that = (defaultIngredients<?>) o;
        return defaultIngredients == that.defaultIngredients;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(defaultIngredients);
    }

    int defaultIngredients;

    public defaultIngredients() {
    }
}





