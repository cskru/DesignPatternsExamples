package decorator.components;

import java.util.Map;

public interface Book {
    void setProperty(String key, Object value);
    Map<String, Object> getDetails();
    void packBook();
}
