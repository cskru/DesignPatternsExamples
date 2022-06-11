package composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {
    List<Component> children = new ArrayList<>();
    private double value;

    @Override
    public double getValue() {
        double value = 0;
        for(var child : this.children) {
            value += child.getValue();
        }
        return value;
    }

    @Override
    public void add(Component child) {
        children.add(child);
    }

    @Override
    public void remove(Component child) {
        // Implement later with id / other criteria
    }
}
