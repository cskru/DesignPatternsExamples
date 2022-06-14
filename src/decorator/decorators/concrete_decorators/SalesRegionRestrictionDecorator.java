package decorator.decorators.concrete_decorators;

import decorator.components.Book;
import decorator.decorators.BookDecorator;

import java.util.List;

public class SalesRegionRestrictionDecorator extends BookDecorator {
    public SalesRegionRestrictionDecorator(Book bookDocument) {
        super(bookDocument);
    }

    @Override
    public void packBook() {
        super.setProperty("SalesRestrictedIn", List.of("India", "Japan", "US", "UK"));
        super.packBook();
    }
}
