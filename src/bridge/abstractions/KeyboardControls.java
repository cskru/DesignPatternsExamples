package bridge.abstractions;

import bridge.implementations.ComputerDisplay;

public class KeyboardControls {
    private final ComputerDisplay computerDisplay; // This is the Bridge. Make it protected if there are sub-classes

    public KeyboardControls(ComputerDisplay computerDisplay) {
        this.computerDisplay = computerDisplay;
    }

    public void keyPress(int ascii) {
        computerDisplay.keyPressed(ascii);
    }
}
