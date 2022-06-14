package decorator;

import decorator.components.Book;
import decorator.concrete_components.BookImpl;
import decorator.decorators.concrete_decorators.ISBNRegistrationDecorator;
import decorator.decorators.concrete_decorators.SalesRegionRestrictionDecorator;

public class Run {
    public static void main(String[] args) {
        // Defining decorations required
        Book dsaBook =
                new SalesRegionRestrictionDecorator(
                    new ISBNRegistrationDecorator(
                            new BookImpl()
                    )
                );


        dsaBook.setProperty("id", (long)Math.floor(Math.random()*100000));
        dsaBook.setProperty("name", "DSA Book");
        dsaBook.setProperty("price", 500);

        System.out.println("Book before packaging: "+dsaBook.getDetails().toString()); // Before packing

        dsaBook.packBook(); // With Decoration

        System.out.println("Book after packaging: "+dsaBook.getDetails().toString()); // After packing
    }
}
