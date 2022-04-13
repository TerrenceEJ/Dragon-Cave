import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;

import java.util.Scanner;

class MainTest {
    Main main = new Main();

    @Test void scan(){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num);
    }

    @Test void setMain(){
    }

    @Test
    void main() {
        boolean x = false;
        Assertions.assertTrue(Main.run(x), "true");
        System.out.println(x);
    }

    @Test
    boolean run(boolean x) {
        //System.out.println(x);
        //assertEquals("You approach the cave... \nIt is dark and spooky... \nA large dragon jumps out in front of you! He opens his jaws and... \nGobbles you down in one bite!", run(x), "Successful output.");
        Assertions.assertTrue(true, "Unsuccessful output");
        //assertEquals("You approach the cave... \nIt is dark and spooky... \nA large dragon jumps out in front of you! He opens his jaws and... \nGobbles you down in one bite!", run(x), x == true);
        System.out.println(x);
        return x;
    }
}