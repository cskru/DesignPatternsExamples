package prototype.notes.registry;

import prototype.notes.Prototype;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;

public class PrototypeRegistry {
    private final Map<String, Prototype> registry;

    public PrototypeRegistry() {
        this.registry = new HashMap<>();
    }
    public Prototype getPrototype(String searchCriteria) {
        return registry.get(searchCriteria);
    }

    public void addToRegistry(String key, Prototype prototype) {
        this.registry.put(key, prototype);
    }

    public Map<String, Prototype> getRegistry() {
        return registry;
    }
}
