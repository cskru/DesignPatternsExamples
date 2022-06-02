package prototype.notes;

import prototype.notes.components.Page;

import java.util.List;

public class NotesAlgo extends Notes implements Prototype {

    public NotesAlgo(int numOfPages, List<Page> pages) {
        super(numOfPages, pages);
    }

    public NotesAlgo(Notes notes) {
        super(notes);
    }


    @Override
    public Prototype clone() {
        return new NotesAlgo(this);
    }
}
