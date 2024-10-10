
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    /* Create a main class that handles the program´s logic and additional,
classes for recipes, ingredients, and Categories

The application should apply OOP concepts:
abstraction, encapsulation, inheritance, and polymorphism.

// Object = an instance of a class that may contain attributes and methods

https://www.youtube.com/watch?v=kd3dr39rgrk&list=PLxuuH5GnCIlcGnesYMkGQOqokyI2Fwu3g

*/
    public static void main(String[] args) {

        Menu m = new Menu();
        Scanner in = new Scanner(System.in);
        ArrayList<Recipe> recipes = new ArrayList<>();
        recipes.add(new Recipe());


        Recipe myRecipe = recipes.get(0);

    }
       // Placeholder
      //  Ingredients<String> i  = new Ingredients<String>();
      //  Recipe<String> r  = new Recipe<>("Meatballs," 1);
       // r.display()
      //  Categories c  = new Categories();


        /*
Use generics to manage lists of objects in the program,
for example, to store recipes and ingredients in a generic list.
 https://www.youtube.com/watch?v=K1iu1kXkVoA
 https://www.youtube.com/watch?v=zBWw-LJTyZ4
 */

/*        // Generic class example https://www.youtube.com/watch?v=zBWw-LJTyZ4
Ingredients<String> s = new Ingredients<String>("Cat", "Dog");
s.display();
Ingredients<Integer> k = new Ingredients<Integer> (123,324);
k.display();

class Ing {
String name
int mark
public ing(Sting name, int ma {
this. name = name;
this.mark = mark;*/


    }



