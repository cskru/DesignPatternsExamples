package prototype.notes;

import prototype.notes.components.Page;

import java.util.List;

public class NotesCN extends Notes implements Prototype {

    public NotesCN(int numOfPages, List<Page> pages) {
        super(numOfPages, pages);
    }

    public NotesCN(Notes notes) {
        super(notes);
    }

    @Override
    public Prototype clone() {
        return new NotesCN(this);
    }
}
