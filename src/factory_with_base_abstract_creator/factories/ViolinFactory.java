package factory_with_base_abstract_creator.factories;

import factory_with_base_abstract_creator.products.Instrument;
import factory_with_base_abstract_creator.products.Violin;

public class ViolinFactory implements InstrumentFactory{
    @Override
    public Instrument createInstrument() {
        return new Violin();
    }
}
