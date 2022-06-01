package factory;

import java.util.List;

public class Violin implements Instrument{
    @Override
    public void play() {
        System.out.println("Playing Violin");
    }

    @Override
    public List<String> getComponents() {
        return List.of("Violin", "Bow", "Bow-Wax", "Lubricant", "Box");
    }
}
