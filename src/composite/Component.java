package composite;

public interface Component {
    double getValue();
    void add(Component child);
    void remove(Component child);
}
