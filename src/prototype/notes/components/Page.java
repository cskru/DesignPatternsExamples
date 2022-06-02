package prototype.notes.components;

import java.util.Objects;

public class Page {
    private final String contents;

    public Page(String contents) {
        this.contents = contents;
    }

    public String getContents() {
        return this.contents;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Page)) return false;
        Page page = (Page) o;
        return Objects.equals(contents, page.contents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contents);
    }
}
