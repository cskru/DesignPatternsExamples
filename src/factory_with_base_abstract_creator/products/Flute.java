package factory_with_base_abstract_creator.products;

import java.util.List;

public class Flute implements Instrument {
    @Override
    public void play() {
        System.out.println("Playing Flute");
    }

    @Override
    public List<String> getComponents() {
        return List.of("Flute", "Box");
    }
}
