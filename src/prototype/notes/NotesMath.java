package prototype.notes;

import prototype.notes.components.Page;

import java.util.List;

public class NotesMath extends Notes implements Prototype {

    public NotesMath(int numOfPages, List<Page> pages) {
        super(numOfPages, pages);
    }

    public NotesMath(Notes notes) {
        super(notes);
    }

    @Override
    public Prototype clone() {
        return new NotesMath(this);
    }
}
