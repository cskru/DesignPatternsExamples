package factory;

import java.util.List;

public class Run {

    public static void main(String[] args) {
	    InstrumentFactory factory = new InstrumentFactory();
        Instrument instrument = factory.createInstrument("VIOLIN");

        // Business login wrt the factory product
        instrument.play();

        List<String> components = instrument.getComponents();
        System.out.println(components);
    }
}
