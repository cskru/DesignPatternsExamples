package decorator.concrete_components;

import decorator.components.Book;

import java.util.HashMap;
import java.util.Map;

public class BookImpl implements Book {
    private Map<String, Object> bookDocument = new HashMap<>();

    @Override
    public void setProperty(String key, Object value) {
        bookDocument.put(key, value);
    }

    @Override
    public Map<String, Object> getDetails() {
        return bookDocument;
    }

    @Override
    public void packBook() {
        if(bookDocument.containsKey("bookPacked")) {
            throw new RuntimeException("Book is already packed!");
        }
        bookDocument.put("bookPacked", true);
    }
}
