import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

//TODO Trying to add preExisting recipes
class defaultRecipe {

    public defaultRecipe(int defaultRecipe) {
        this.defaultRecipe = defaultRecipe;
    }

    public int getDefaultRecipe() {
        return defaultRecipe;
    }

    public void setDefaultRecipe(int defaultRecipe) {
        this.defaultRecipe = defaultRecipe;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        defaultRecipe that = (defaultRecipe) o;
        return defaultRecipe == that.defaultRecipe;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(defaultRecipe);
    }

    int defaultRecipe;
}


