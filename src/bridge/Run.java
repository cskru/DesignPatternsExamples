package bridge;

import bridge.abstractions.KeyboardControls;
import bridge.implementations.ComputerDisplay;
import bridge.implementations.DellDisplay;

import java.awt.event.MouseListener;
import java.io.IOException;

public class Run {
    public static void main(String[] args) {
        ComputerDisplay dellDisplay = new DellDisplay();
        KeyboardControls keyboard = new KeyboardControls(dellDisplay);

        System.out.println("Initial State");
        dellDisplay.printDisplayStatus();

        System.out.println("Press a readable key on keyboard...");
        try {
            var keyPressed = System.in.read();
            keyboard.keyPress(keyPressed);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("State of display after key press");
        dellDisplay.printDisplayStatus();
    }
}
