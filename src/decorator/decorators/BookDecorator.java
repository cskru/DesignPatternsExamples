package decorator.decorators;

import decorator.components.Book;

import java.util.Map;

public class BookDecorator implements Book {
    private Book bookDocument;

    public BookDecorator(Book bookDocument) {
        this.bookDocument = bookDocument;
    }

    @Override
    public void setProperty(String key, Object value) {
        bookDocument.setProperty(key, value);
    }

    @Override
    public Map<String, Object> getDetails() {
        return bookDocument.getDetails();
    }

    @Override
    public void packBook() {
        bookDocument.packBook();
    }
}
