package bridge.implementations;

import java.util.Arrays;

public class DellDisplay implements ComputerDisplay {
    char cursorAt;
    int[][] mousePointer = new int[1][2];


    @Override
    public void keyPressed(int ascii) {
        cursorAt = ((char)ascii);
        // System.out.println("Displaying on Dell Display : "+((char)ascii));
    }

    public void printDisplayStatus() {
        System.out.println("================== Dell Display ===================");
        System.out.println("cursorAt: "+this.cursorAt);
        System.out.println("mousePointer : "+ Arrays.deepToString(this.mousePointer));
        System.out.println("====================================================");
    }
}
