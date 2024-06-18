import controller.Controller;

import java.io.IOException;

public class Application {

    private static final Controller ladder = new Controller();

    public static void main(String[] args) throws IOException {
        ladder.run();
    }
}