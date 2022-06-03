package singleton;

import java.util.Objects;

public class ViolinPrototype implements Prototype {
    private final String instrumentName;

    private static ViolinPrototype prototype;

    private ViolinPrototype() {
        this.instrumentName = "VIOLIN";
    }

    private ViolinPrototype(ViolinPrototype violinPrototype) {
        this.instrumentName = violinPrototype.getInstrumentName();
    }

    public static ViolinPrototype getInstrumentPrototype() {
        if(prototype == null) {
            System.out.println("Prototype doesn't exist. Creating a Violin Prototype...");
            prototype = new ViolinPrototype();
            System.out.println("Created a Violin Prototype...");
        } else {
            System.out.println("Prototype already exists. Thus, not creating a Violin Prototype again.");
        }
        System.out.println("Prototype: "+prototype);
        return prototype;
    }

    public String getInstrumentName() {
        return instrumentName;
    }

    @Override
    public Prototype clone() {
        return new ViolinPrototype(this);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof ViolinPrototype)) return false;
        ViolinPrototype that = (ViolinPrototype) o;
        return Objects.equals(instrumentName, that.instrumentName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instrumentName);
    }
}
