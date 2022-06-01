package factory_with_base_abstract_creator.factories;

import factory_with_base_abstract_creator.products.Instrument;

// Abstract factory
public interface InstrumentFactory {
    Instrument createInstrument();
}
