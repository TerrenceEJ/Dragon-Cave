import org.junit.jupiter.api.Test;
import static org.hamcrest.CoreMatchers.*;

import static org.hamcrest.MatcherAssert.assertThat;

class MainTest {
    Main main = new Main();

    @Test
    void main() {
        boolean x;
        x = run();
        System.out.println(x);
    }

    @Test
    boolean run() {
        boolean x = true;
        main.x = x;
        main.run(x);
        assertThat(x,is(true));
        return x;
    }
}