package factory;

public class InstrumentFactory {
    public Instrument createInstrument(String name) {
        switch (name) {
            case "VIOLIN": return new Violin();
            case "FLUTE": return new Flute();
            default:
                throw new RuntimeException(name + " is not manufactured in our instrument factory!");
        }
    }
}
