package composite;

public class Leaf implements Component {
    private final double value;

    public Leaf(double value) {
        this.value = value;
    }

    @Override
    public double getValue() {
        return value;
    }

    @Override
    public void add(Component child) {
        throw new RuntimeException("Cannot add children to leaf");
    }

    @Override
    public void remove(Component child) {
        throw new RuntimeException("Cannot remove children from leaf");
    }
}
