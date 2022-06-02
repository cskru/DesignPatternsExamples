package prototype.notes;

import prototype.notes.components.Page;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Notes {
    private final int numOfPages;
    private final List<Page> pages;

    public Notes(int numOfPages, List<Page> pages) {
        this.numOfPages = numOfPages;
        this.pages = new ArrayList<>();
        for(Page page : pages) {
            this.pages.add(new Page(page.getContents()));
        }
    }

    public Notes(Notes notes) {
        this.numOfPages = notes.numOfPages;
        this.pages = new ArrayList<>();
        for(Page page : notes.pages) {
            this.pages.add(new Page(page.getContents()));
        }
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Notes)) return false;
        Notes notes = (Notes) o;
        return numOfPages == notes.numOfPages && Objects.equals(pages, notes.pages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numOfPages, pages);
    }
}
