package factory_with_base_abstract_creator.factories;

import factory_with_base_abstract_creator.products.Flute;
import factory_with_base_abstract_creator.products.Instrument;

public class FluteFactory implements InstrumentFactory{
    @Override
    public Instrument createInstrument() {
        return new Flute();
    }
}
