package prototype;

import prototype.notes.*;
import prototype.notes.components.Page;

import java.util.ArrayList;
import java.util.List;

public class Run {
    public static void main(String[] args) {
        List<Prototype> myNotes = new ArrayList<>();
        List<Prototype> notesXeroxCopies = new ArrayList<>();

        // Bring in some prototypes - notes to xerox shop
        myNotes.add(new NotesAlgo(1, List.of(new Page("Page1 Algo content"))));
        myNotes.add(new NotesDSA(2, List.of(new Page("Page1 DSA content"), new Page("Page2 DSA content"))));
        myNotes.add(new NotesCN(5, List.of(new Page("Page1 CN content"), new Page("Page2 CN content"), new Page("Page3 CN content"), new Page("Page4 CN content"), new Page("Page5 CN content"))));
        myNotes.add(new NotesMath(3, List.of(new Page("Page1 Math content"), new Page("Page2 Math content"), new Page("Page3 Math content"))));

        // Clone all the above notes - Request from a student
        for(Prototype notes : myNotes) {
            notesXeroxCopies.add(notes.clone());
        }

        // Compare original prototype and clone - they must be different objects
        compare(myNotes, notesXeroxCopies);
    }

    private static void compare(List<Prototype> notesInXeroxShop, List<Prototype> notesInXeroxShopClone) {
        for (int i = 0; i < notesInXeroxShop.size(); i++) {
            var original = notesInXeroxShop.get(i);
            var clone = notesInXeroxShopClone.get(i);
            if (original != clone) {
                System.out.println(original.getClass().getSimpleName() + ": Notes are different objects");
                if (original.equals(clone)) {
                    System.out.println(original.getClass().getSimpleName() + ": Notes are identical");
                } else {
                    throw new RuntimeException(original.getClass().getSimpleName() + ": Notes are not identical");
                }
            } else {
                throw new RuntimeException(original.getClass().getSimpleName() + ": Notes are the same");
            }
            System.out.println("==============================");
        }
    }
}
