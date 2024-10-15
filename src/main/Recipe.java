import java.util.ArrayList;
import java.util.List;
//TODO Trying to add preExisting recipes
class addDefaultRecipe {
    public class adddefaultrecipe<Thing> extends Ingredients {
        private List<Thing> defaultRecipe;

        public adddefaultrecipe() {
            this.defaultRecipe = new ArrayList<>();
           // defaultRecipe.add();

        }

        private void addedDefaultRecipe() {
            defaultRecipe.add((Thing) "Swedeish Meatballs");
        }

    }

}
