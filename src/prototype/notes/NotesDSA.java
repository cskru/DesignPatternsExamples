package prototype.notes;

import prototype.notes.components.Page;

import java.util.List;

public class NotesDSA extends Notes implements Prototype {

    public NotesDSA(int numOfPages, List<Page> pages) {
        super(numOfPages, pages);
    }

    public NotesDSA(Notes notes) {
        super(notes);
    }

    @Override
    public Prototype clone() {
        return new NotesDSA(this);
    }
}
