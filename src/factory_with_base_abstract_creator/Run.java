package factory_with_base_abstract_creator;

import factory_with_base_abstract_creator.factories.FluteFactory;
import factory_with_base_abstract_creator.factories.InstrumentFactory;
import factory_with_base_abstract_creator.factories.ViolinFactory;
import factory_with_base_abstract_creator.products.Instrument;

import java.util.List;

public class Run {

    public static void main(String[] args) {
        String input = "FLUTE";

        // Create factory
        InstrumentFactory factory;
        switch(input) {
            case "VIOLIN":
                factory = new ViolinFactory();
                break;
            case "FLUTE":
                factory = new FluteFactory();
                break;
            default:
                throw new RuntimeException(input + " is not manufactured in our instrument factory!");
        }

        // Create product
        Instrument instrument = factory.createInstrument();

        // Business logic wrt created product
        instrument.play();
        List<String> components = instrument.getComponents();
        System.out.println(components);
    }
}
