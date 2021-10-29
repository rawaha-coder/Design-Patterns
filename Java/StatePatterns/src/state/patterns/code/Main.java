package state.patterns.code;

import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        DeliveryContext context = new DeliveryContext(null, "Test123");

        context.update();
        context.update();
        context.update();
        context.update();
        context.update();
    }
}




