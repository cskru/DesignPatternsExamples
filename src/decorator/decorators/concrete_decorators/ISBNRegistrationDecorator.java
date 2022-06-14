package decorator.decorators.concrete_decorators;

import decorator.components.Book;
import decorator.decorators.BookDecorator;

public class ISBNRegistrationDecorator extends BookDecorator {
    public ISBNRegistrationDecorator(Book bookDocument) {
        super(bookDocument);
    }

    @Override
    public void packBook() {
        super.setProperty("ISBN", getISBN((super.getDetails().get("id")).toString()));
        super.packBook();
    }

    private String getISBN(String id) {
        return "ISBN_"+id; // make a rest call
    }
}
