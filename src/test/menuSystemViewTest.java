import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
//
class menuSystemViewTest {
    //TODO Learning Unit Test from https://www.youtube.com/watch?v=vZm0lHciFsQ

    @Test
    void ifZeroRecipeThenInvalid(){
        var view = new menuSystem();
       assertEquals(0, view.viewRecipeSystem(0));
    }

}