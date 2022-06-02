package prototype.notes.registry;

import prototype.notes.*;
import prototype.notes.components.Page;

import java.util.ArrayList;
import java.util.List;

public class Run {
    public static void main(String[] args) {
        PrototypeRegistry registry = new PrototypeRegistry();

        NotesAlgo algoNotes = new NotesAlgo(1, List.of(new Page("Page1 Algo content")));
        NotesDSA dsaNotes = new NotesDSA(2, List.of(new Page("Page1 DSA content"), new Page("Page2 DSA content")));
        NotesCN cnNotes = new NotesCN(5, List.of(new Page("Page1 CN content"), new Page("Page2 CN content"), new Page("Page3 CN content"), new Page("Page4 CN content"), new Page("Page5 CN content")));
        NotesMath mathNotes = new NotesMath(3, List.of(new Page("Page1 Math content"), new Page("Page2 Math content"), new Page("Page3 Math content")));

        registry.addToRegistry(algoNotes.getClass().getSimpleName(), algoNotes);
        registry.addToRegistry(dsaNotes.getClass().getSimpleName(), dsaNotes);
        registry.addToRegistry(cnNotes.getClass().getSimpleName(), cnNotes);
        registry.addToRegistry(mathNotes.getClass().getSimpleName(), mathNotes);

        System.out.println("Xerox Shop contains the following prototypes in its shelf (registry):");
        System.out.println(registry.getRegistry().keySet());
        System.out.println();

        // Student requests for 50 copies of Algo Notes
        Prototype algoNotesPrototype = registry.getPrototype("NotesAlgo");
        int numOfCopiesNeeded = 50;
        List<Prototype> algoNotes50Pieces = new ArrayList<>();

        for(int i = 0; i < numOfCopiesNeeded; i++) {
            algoNotes50Pieces.add(algoNotesPrototype.clone());
        }

        compare(algoNotesPrototype, algoNotes50Pieces);

        System.out.println("Xerox successful!");
    }

    private static void compare(Prototype original, List<Prototype> algoNotesClonedPieces) {
        int successCount = 0;
        for(var clone : algoNotesClonedPieces) {
            if (original != clone) {
                //System.out.println(original.getClass().getSimpleName() + ": Notes are different objects");
                if (original.equals(clone)) {
                    successCount++;
                    //System.out.println(original.getClass().getSimpleName() + ": Notes are identical");
                } else {
                    throw new RuntimeException(original.getClass().getSimpleName() + ": Notes are not identical");
                }
            } else {
                throw new RuntimeException(original.getClass().getSimpleName() + ": Notes are the same");
            }
            //System.out.println("==============================");
        }

        System.out.println("Successfully cloned "+successCount+" copies of "+original.getClass().getSimpleName());
        System.out.println("==============================");
    }
}
